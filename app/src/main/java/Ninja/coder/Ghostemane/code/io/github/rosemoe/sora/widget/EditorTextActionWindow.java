/*
*    sora-editor - the awesome code editor for Android
*    https://github.com/Rosemoe/sora-editor
*    Copyright (C) 2020-2022  Rosemoe
*
*     This library is free software; you can redistribute it and/or
*     modify it under the terms of the GNU Lesser General Public
*     License as published by the Free Software Foundation; either
*     version 2.1 of the License, or (at your option) any later version.
*
*     This library is distributed in the hope that it will be useful,
*     but WITHOUT ANY WARRANTY; without even the implied warranty of
*     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
*     Lesser General Public License for more details.
*
*     You should have received a copy of the GNU Lesser General Public
*     License along with this library; if not, write to the Free Software
*     Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301
*     USA
*
*     Please contact Rosemoe by email 2073412493@qq.com if you need
*     additional information or have any questions
*/
package io.github.rosemoe.sora.widget;

import android.annotation.SuppressLint;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.*;
import android.animation.LayoutTransition;
import Ninja.coder.Ghostemane.code.R;
import io.github.rosemoe.sora.event.EventReceiver;
import io.github.rosemoe.sora.event.HandleStateChangeEvent;
import io.github.rosemoe.sora.event.ScrollEvent;
import io.github.rosemoe.sora.event.SelectionChangeEvent;
import io.github.rosemoe.sora.event.Unsubscribe;
import io.github.rosemoe.sora.util.IntPair;
import io.github.rosemoe.sora.widget.*;
/**
* This will show when selecting text
*
* @author Rosemoe
*/
class EditorTextActionWindow extends EditorPopupWindow implements View.OnClickListener, EventReceiver<SelectionChangeEvent> {
	private final CodeEditor mEditor;
	private final ImageButton mPasteBtn;
	private final ImageButton mCopyBtn;
	private final ImageButton mCutBtn;
	private GradientDrawable mBg;
	private final View mRootView;
    private final LinearLayout mpost;
	private final EditorTouchEventHandler mHandler;
	private final static long DELAY = 200;
	private long mLastScroll;
	private int mLastPosition;
	
	/**
	* Create a panel for the given editor
	*
	* @param editor Target editor
	*/
	public EditorTextActionWindow(CodeEditor editor) {
		super(editor, FEATURE_SHOW_OUTSIDE_VIEW_ALLOWED);
		mEditor = editor;
		mHandler = editor.getEventHandler();
		// Since popup window does provide decor view, we have to pass null to this method
		@SuppressLint("InflateParams")
		View root = LayoutInflater.from(editor.getContext()).inflate(R.layout.text_compose_panel1, null);
		ImageButton selectAll = root.findViewById(R.id.panel_btn_select_all);
		ImageButton cut = root.findViewById(R.id.panel_btn_cut);
		ImageButton copy = root.findViewById(R.id.panel_btn_copy);
		mPasteBtn = root.findViewById(R.id.panel_btn_paste);
        mpost = root.findViewById(R.id.mpost);
		mCopyBtn = copy;
		mCutBtn = cut;
		selectAll.setOnClickListener(this);
		cut.setOnClickListener(this);
		copy.setOnClickListener(this);
		mPasteBtn.setOnClickListener(this);
		AnimUtils.Worker(cut);
		AnimUtils.Worker(copy);
		AnimUtils.Amin01(root);
		AnimUtils.Worker(selectAll);
		AnimUtils.Worker(mPasteBtn);
		GradientDrawable gd = new GradientDrawable();
		gd.setCornerRadius(30 * editor.getDpUnit());
        gd.setColor(0xFF2B2121);
		gd.setStroke(1,0xFFFFB49D);
		root.setBackground(gd);
		setContentView(root);
        getPopup().setAnimationStyle(R.style.hso);
		setSize(0, (int) (mEditor.getDpUnit() * 50));
		mRootView = root;
		editor.subscribeEvent(SelectionChangeEvent.class, this);
		editor.subscribeEvent(ScrollEvent.class, ((event, unsubscribe) -> {
			var last = mLastScroll;
			mLastScroll = System.currentTimeMillis();
			if (mLastScroll - last < DELAY) {
				postDisplay();
			}
		}));
		editor.subscribeEvent(HandleStateChangeEvent.class, ((event, unsubscribe) -> {
			if (event.isHeld()) {
				postDisplay();
			}
		}));
	}
	

	private void postDisplay() {
		if (!isShowing()) {
			return;
		}
		dismiss();
		if (!mEditor.getCursor().isSelected()) {
			return;
		}
		mEditor.postDelayed(new Runnable() {
			@Override
			public void run() {
				if (!mHandler.hasAnyHeldHandle() && System.currentTimeMillis() - mLastScroll > DELAY
				&& mEditor.getScroller().isFinished()) {
					displayWindow();
				} else {
					mEditor.postDelayed(this, DELAY);
				}
			}
		}, DELAY);
	}
	
	@Override
	public void onReceive(SelectionChangeEvent event, Unsubscribe unsubscribe) {
		if (mHandler.hasAnyHeldHandle()) {
			return;
		}
		if (event.isSelected()) {
			if (!isShowing()) {
				mEditor.post(this::displayWindow);
			}
			mLastPosition = -1;
		} else {
			if (event.getLeft().index == mLastPosition && !isShowing()) {
				mEditor.post(this::displayWindow);
			} else {
				dismiss();
			}
			mLastPosition = event.getLeft().index;
		}
	}
	
	private int selectTop(RectF rect) {
		var rowHeight = mEditor.getRowHeight();
		if (rect.top - rowHeight * 3 / 2F > getHeight()) {
			return (int) (rect.top - rowHeight * 3 / 2 - getHeight());
		} else {
			return (int) (rect.bottom + rowHeight / 2);
		}
	}
	
	public void displayWindow() {
		int top;
		var cursor = mEditor.getCursor();
		if (cursor.isSelected()) {
			var leftRect = mEditor.getLeftHandleDescriptor().position;
			var rightRect = mEditor.getRightHandleDescriptor().position;
			var top1 = selectTop(leftRect);
			var top2 = selectTop(rightRect);
			top = Math.min(top1, top2);
		} else {
			top = selectTop(mEditor.getInsertHandleDescriptor().position);
		}
		top = Math.max(0, Math.min(top, mEditor.getHeight() - getHeight() - 5));
		float handleLeftX = mEditor.getOffset(mEditor.getCursor().getLeftLine(), mEditor.getCursor().getLeftColumn());
		float handleRightX = mEditor.getOffset(mEditor.getCursor().getRightLine(), mEditor.getCursor().getRightColumn());
		int panelX = (int) ((handleLeftX + handleRightX) / 2f);
		setLocationAbsolutely(panelX, top);
		show();
	}
	
	/**
	* Update the state of paste button
	*/
	private void updateBtnState() {
		mPasteBtn.setEnabled(mEditor.hasClip() && mEditor.isEditable());
		mCopyBtn.setVisibility(mEditor.getCursor().isSelected() ? View.VISIBLE : View.GONE);
		mCutBtn.setVisibility(mEditor.getCursor().isSelected() && mEditor.isEditable() ? View.VISIBLE : View.GONE);
		mRootView.measure(View.MeasureSpec.makeMeasureSpec(1000000, View.MeasureSpec.AT_MOST), View.MeasureSpec.makeMeasureSpec(100000, View.MeasureSpec.AT_MOST));
		setSize(Math.min(mRootView.getMeasuredWidth(), (int) (mEditor.getDpUnit() * 230)), getHeight());
	}
	
	@Override
	public void show() {
		updateBtnState();
		super.show();
	}
	
	@Override
	public void onClick(View p1) {
		int id = p1.getId();
		if (id == R.id.panel_btn_select_all) {
			mEditor.selectAll();
			return;
		} else if (id == R.id.panel_btn_cut) {
			mEditor.copyText();
			if (mEditor.getCursor().isSelected()) {
				mEditor.getCursor().onDeleteKeyPressed();
			}
		} else if (id == R.id.panel_btn_paste) {
			mEditor.pasteText();
			mEditor.setSelection(mEditor.getCursor().getRightLine(), mEditor.getCursor().getRightColumn());
		} else if (id == R.id.panel_btn_copy) {
			mEditor.copyText();
			mEditor.setSelection(mEditor.getCursor().getRightLine(), mEditor.getCursor().getRightColumn());
		}
		dismiss();
	}
	
}
