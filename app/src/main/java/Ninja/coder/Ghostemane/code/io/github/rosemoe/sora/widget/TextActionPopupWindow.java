/*
*    sora-editor - the awesome code editor for Android
*    https://github.com/Rosemoe/CodeEditor
*    Copyright (C) 2020-2021  Rosemoe
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

import Ninja.coder.Ghostemane.code.FileUtil;
import android.animation.AnimatorListenerAdapter;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.graphics.*;
import android.graphics.drawable.*;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.Log;
import android.widget.*;
import android.widget.ImageView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import com.google.gson.reflect.TypeToken;
import org.json.*;
import com.google.gson.Gson;
import android.view.View;

import android.widget.LinearLayout;

import com.google.android.material.button.MaterialButton;
//import aa.aa.aa.R;
import Ninja.coder.Ghostemane.code.R;
import io.github.rosemoe.sora.interfaces.EditorTextActionPresenter;
import io.github.rosemoe.sora.widget.EditorColorScheme;
import java.util.HashMap;

public class TextActionPopupWindow extends TextComposeBasePopup
		implements View.OnClickListener, EditorTextActionPresenter {
	private final CodeEditor mEditor;
	private final LinearLayout mPasteBtn;
	private final LinearLayout mSelectAll;
	private final LinearLayout mCutBtn;
	private final LinearLayout mContainer;
	private final LinearLayout msetColors;

	private final String types = "soon....";
	private boolean pos;
	private final boolean vv = true;
	private float mDpUnit;
	private ImageView imgcopy;
	private ImageView imgall;
	private ImageView imgcut;
	private ImageView imgpast;
	private HashMap<String, Object> imap = new HashMap<>();
	private ImageView imgcolor;
	private LinearLayout panelGoneAndShow;
	private LinearLayout actionPost;
	private ImageView imagePanelShow;

	/**
	* Create a panel for editor
	*
	* @param editor Target editor
	*/
	public TextActionPopupWindow(CodeEditor editor) {
		super(editor);
		mEditor = editor;
		mDpUnit = mEditor.getDpUnit();
		int popupHeightInDp = 60;
		popHeightPx = (int) (popupHeightInDp * mDpUnit);

		// Since popup window does provide decor view, we have to pass null to this method
		@SuppressLint("InflateParams")
		View root = LayoutInflater.from(editor.getContext()).inflate(R.layout.text_compose_popup_window, null);
		mSelectAll = root.findViewById(R.id.tcpw_material_button_select_all);
		mContainer = root.findViewById(R.id.liner1);
		msetColors = root.findViewById(R.id.co);
		mCutBtn = root.findViewById(R.id.tcpw_material_button_cut);
		imgcut = root.findViewById(R.id.imgcut);
		imgall = root.findViewById(R.id.imgall);
		imgpast = root.findViewById(R.id.imgpast);
		imgcolor = root.findViewById(R.id.imgcolor);
		imgcopy = root.findViewById(R.id.imgcopy);
		actionPost = root.findViewById(R.id.actionPost);
		imagePanelShow = root.findViewById(R.id.imagePanelShow);
		panelGoneAndShow = root.findViewById(R.id.panelGoneAndShow);
		LinearLayout copy = root.findViewById(R.id.tcpw_material_button_copy);
		mPasteBtn = root.findViewById(R.id.tcpw_material_button_paste);
		mSelectAll.setOnClickListener(this);
		mCutBtn.setOnClickListener(this);
		copy.setOnClickListener(this);
		mPasteBtn.setOnClickListener(this);
		msetColors.setOnClickListener(this);
		imgall.setOnClickListener(this);
		imgcolor.setOnClickListener(this);
		imgcopy.setOnClickListener(this);
		imgcut.setOnClickListener(this);
		imgpast.setOnClickListener(this);
		imap = new HashMap<>();

		panelGoneAndShow.setVisibility(View.GONE);
		mp(imgall);
		mp(imgcolor);
		mp(imgcopy);
		mp(imgcut);
		mp(imgall);
		mp(imgpast);
		AnimUtils.O(root);

		try {
			imap = new Gson().fromJson(FileUtil.readFile("/storage/emulated/0/GhostWebIDE/theme/GhostThemeapp.ghost"),
					new TypeToken<HashMap<String, Object>>() {
					}.getType());
		} catch (Exception e) {
			Log.i("error", e.toString());
			e.printStackTrace();
		}
		//	imagePanelShow.setImageResource(R.drawable.finalarrowleft);
		//	EditorColorScheme editorColorScheme3 = mEditor.getColorScheme();
		mContainer.setBackground(new GradientDrawable() {
			public GradientDrawable getIns(int a, int b, int c, int d) {
				this.setCornerRadius(a);
				this.setStroke(b, c);
				this.setColor(d);
				return this;
			}
		}.getIns((int) 15, (int) 1, 0xFFF8B09A, 0xFF1F1B1C));

		setContentView(root);
		imagePanelShow.setOnClickListener(vvvvv -> {
			h1();
		});

	}

	@Override
	public void onClick(View view) {
		int id = view.getId();
		if (id == R.id.tcpw_material_button_select_all || id == R.id.imgall) {
			mEditor.selectAll();
			h1();

			if (mEditor != null) {

				mEditor.setNonPrintablePaintingFlags(
						CodeEditor.FLAG_DRAW_WHITESPACE_LEADING | CodeEditor.FLAG_DRAW_LINE_SEPARATOR);

			}

		} else if (id == R.id.tcpw_material_button_cut || id == R.id.imgcut) {
			mEditor.copyText();
			ps();
			if (mEditor.getCursor().isSelected() && mEditor.isEditable()) {
				mEditor.getCursor().onDeleteKeyPressed();
			} else {
				mEditor.setSelection(mEditor.getCursor().getRightLine(), mEditor.getCursor().getRightColumn());
			}
		} else if (id == R.id.tcpw_material_button_paste || id == R.id.imgpast) {
			if (mEditor.isEditable())
				mEditor.pasteText();

			ps();
			mEditor.setSelection(mEditor.getCursor().getRightLine(), mEditor.getCursor().getRightColumn());
		} else if (id == R.id.tcpw_material_button_copy || id == R.id.imgcopy) {
			mEditor.copyText();
			ps();
			mEditor.setSelection(mEditor.getCursor().getRightLine(), mEditor.getCursor().getRightColumn());
		} else if (id == R.id.co || id == R.id.imgcolor) {
			mEditor.setText("");
			ps();

		}
		hide(DISMISS);
	}

	@Override
	public void onSelectedTextClicked(MotionEvent event) {

	}

	@Deprecated
	@Override
	public void onUpdate() {

	}

	@Override
	public void show() {
		mCutBtn.setVisibility(mEditor.isEditable() ? View.VISIBLE : View.GONE);
		mPasteBtn.setVisibility(mEditor.isEditable() ? View.VISIBLE : View.GONE);
		super.show();
	}

	@Override
	public void onUpdate(int updateReason) {
		hide(updateReason);
	}

	@Override
	public void onBeginTextSelect() {
		setHeight((int) (LinearLayout.LayoutParams.WRAP_CONTENT));
		setWidth((int) (LinearLayout.LayoutParams.WRAP_CONTENT));
	}

	@Override
	public boolean onExit() {
		boolean result = isShowing();
		hide(DISMISS);
		if (mEditor.getCursor().isSelected()) {
			mEditor.setSelection(mEditor.getCursor().getRightLine(), mEditor.getCursor().getRightColumn());
		}
		return result && !isShowing();
	}

	@Override
	public boolean shouldShowCursor() {
		// this will show handler along with popup
		return true;
	}

	@Override
	public void onTextSelectionEnd() {
		TextActionPopupWindow panel = this;
		if (panel.isShowing()) {
			panel.hide(DISMISS);
		} else {
			int first = mEditor.getFirstVisibleRow();
			int last = mEditor.getLastVisibleRow();
			int left = mEditor.getCursor().getLeftLine();
			int right = mEditor.getCursor().getRightLine();
			int toLineBottom;
			if (right <= first) {
				toLineBottom = first;
			} else if (right > last) {
				if (left <= first) {
					toLineBottom = (first + last) / 2;
				} else if (left >= last) {
					toLineBottom = last - 2;
				} else {
					if (left + 3 >= last) {
						toLineBottom = left - 2;
					} else {
						toLineBottom = left + 1;
					}
				}
			} else {
				if (left <= first) {
					if (right + 3 >= last) {
						toLineBottom = right - 2;
					} else {
						toLineBottom = right + 1;
					}
				} else {
					if (left + 5 >= right) {
						toLineBottom = right + 1;
					} else {
						toLineBottom = (left + right) / 2;
					}
				}
			}
			toLineBottom = Math.max(0, toLineBottom);
			int panelY = mEditor.getRowBottom(toLineBottom) - mEditor.getOffsetY();
			float handleLeftX = mEditor.getOffset(left, mEditor.getCursor().getLeftColumn());
			float handleRightX = mEditor.getOffset(right, mEditor.getCursor().getRightColumn());
			int panelX = (int) ((handleLeftX + handleRightX) / 2f);
			panel.setExtendedX(panelX);
			panel.setExtendedY(panelY);
			panel.show();
			mContainer.requestFocus();
		}
	}

	private boolean vf() {

		System.out.println("");
		return false;
	}

	protected void mp(ImageView v) {

		try {
			v.setColorFilter(Color.parseColor(imap.get("ImageColor").toString()), PorterDuff.Mode.MULTIPLY);
		} catch (Exception pis) {
			v.setColorFilter(0xFFE0E0E0, PorterDuff.Mode.MULTIPLY);
		}
	}

	public void h1() {
		if (!pos) {
			pos = true;

			panelGoneAndShow.setVisibility(View.VISIBLE);
			//imagePanelShow.setVisibility(View.GONE);
			ShowIn(panelGoneAndShow);
			imagePanelShow.setImageResource(R.drawable.finalarrowdown);
			AnimUtils.Worker(imagePanelShow);

		} else {
			imagePanelShow.setImageResource(R.drawable.finalarrowleft);
			panelGoneAndShow.setVisibility(View.GONE);
			ShowOut(panelGoneAndShow);
			AnimUtils.Worker(imagePanelShow);
			pos = false;
		}
	}

	public void ShowIn(View _v) {
		_v.setVisibility(View.VISIBLE);
		_v.setTranslationY((float) (_v.getHeight()));
		_v.setAlpha((float) (0));
		_v.animate().setDuration(200).translationY(0).setListener(new AnimatorListenerAdapter() {
			@Override
			public void onAnimationEnd(Animator animation) {
				super.onAnimationEnd(animation);
			}
		}).alpha(1f).start();
	}

	public void ShowOut(View _v) {
		_v.setVisibility(View.VISIBLE);
		_v.setTranslationY((float) (0));
		_v.setAlpha((float) (1));
		_v.animate().setDuration(200).translationY(_v.getHeight()).setListener(new AnimatorListenerAdapter() {
			@Override
			public void onAnimationEnd(Animator animation) {
				_v.setVisibility(View.GONE);
				super.onAnimationEnd(animation);
			}
		}).alpha(0f).start();

	}

	public void ps() {
		imagePanelShow.setImageResource(R.drawable.finalarrowdown);
		panelGoneAndShow.setVisibility(View.GONE);
		ShowOut(panelGoneAndShow);
		AnimUtils.Worker(imagePanelShow);
		pos = false;
	}

	public void RoadjsonFilE() {

	}

}