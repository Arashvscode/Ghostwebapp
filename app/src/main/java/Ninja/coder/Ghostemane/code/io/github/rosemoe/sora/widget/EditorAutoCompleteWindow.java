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

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import io.github.rosemoe.sora.data.CompletionItem;
import io.github.rosemoe.sora.interfaces.AutoCompleteProvider;
import io.github.rosemoe.sora.text.CharPosition;
import io.github.rosemoe.sora.text.Cursor;
import io.github.rosemoe.sora.text.TextAnalyzeResult;

/**
 * Auto complete window for editing code quicker
 *
 * @author Rose
 */
public class EditorAutoCompleteWindow extends EditorPopupWindow {
    private final CodeEditor mEditor;
    private final ListView mListView;
    private final ProgressBar mPb;
    private final GradientDrawable mBg;
    protected boolean mCancelShowUp = false;
    private int mCurrent = 0;
    private long mRequestTime;
    private String mLastPrefix;
    private AutoCompleteProvider mProvider;
    private boolean mLoading;
    private int mMaxHeight;
    private EditorCompletionAdapter mAdapter;

    /**
     * Create a panel instance for the given editor
     *
     * @param editor Target editor
     */
    public EditorAutoCompleteWindow(CodeEditor editor) {
        super(editor, FEATURE_HIDE_WHEN_FAST_SCROLL | FEATURE_SCROLL_AS_CONTENT);
        mEditor = editor;
        mAdapter = new CustomAdGhostWeb();
        RelativeLayout layout = new RelativeLayout(mEditor.getContext());
        mListView = new ListView(mEditor.getContext());
        layout.addView(mListView, new LinearLayout.LayoutParams(-1, -1));
        mPb = new ProgressBar(editor.getContext());
        layout.addView(mPb);
        ((RelativeLayout.LayoutParams) mPb.getLayoutParams()).addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        setContentView(layout);
        GradientDrawable gd = new GradientDrawable();
        gd.setCornerRadius(editor.getDpUnit() * 8);
        layout.setBackground(gd);
        mBg = gd;
        applyColorScheme();
        mListView.setDividerHeight(0);
        setLoading(true);
        mListView.setOnItemClickListener((parent, view, position, id) -> {
            try {
                select(position);
            } catch (Exception e) {
                Toast.makeText(mEditor.getContext(), e.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    protected void setAdapter(EditorCompletionAdapter adapter) {
        mAdapter = adapter;
        if (adapter == null) {
            mAdapter = new CustomAdGhostWeb();
        }
    }

    private long requestShow = 0;
    private long requestHide = -1;

    @Override
    public void show() {
        if (mCancelShowUp) {
            return;
        }
        requestShow = System.currentTimeMillis();
        final var requireRequest = mRequestTime;
        mEditor.postDelayed(() -> {
            if (requestHide < requestShow && mRequestTime == requireRequest) {
                super.show();
            }
        }, 70);
    }

    public void hide() {
        super.dismiss();
        requestHide = System.currentTimeMillis();
    }

    public Context getContext() {
        return mEditor.getContext();
    }

    public int getCurrentPosition() {
        return mCurrent;
    }

    /**
     * Set a auto completion items provider
     *
     * @param provider New provider.can not be null
     */
    public void setProvider(AutoCompleteProvider provider) {
        mProvider = provider;
    }

    /**
     * Apply colors for self
     */
    public void applyColorScheme() {
        EditorColorScheme colors = mEditor.getColorScheme();
        mBg.setStroke(1, colors.getColor(EditorColorScheme.AUTO_COMP_PANEL_CORNER));
        mBg.setColor(colors.getColor(EditorColorScheme.AUTO_COMP_PANEL_BG));
    }

    /**
     * Change layout to loading/idle
     *
     * @param state Whether loading
     */
    public void setLoading(boolean state) {
        mLoading = state;
        if (state) {
            mEditor.postDelayed(() -> {
                if (mLoading) {
                    mPb.setVisibility(View.VISIBLE);
                }
            }, 300);
        } else {
            mPb.setVisibility(View.GONE);
        }
    }

    /**
     * Move selection down
     */
    public void moveDown() {
        if (mCurrent + 1 >= mListView.getAdapter().getCount()) {
            return;
        }
        mCurrent++;
        ((EditorCompletionAdapter) mListView.getAdapter()).notifyDataSetChanged();
        ensurePosition();
    }

    /**
     * Move selection up
     */
    public void moveUp() {
        if (mCurrent - 1 < 0) {
            return;
        }
        mCurrent--;
        ((EditorCompletionAdapter) mListView.getAdapter()).notifyDataSetChanged();
        ensurePosition();
    }

    /**
     * Perform motion events
     */
    private void performScrollList(int offset) {
        long down = SystemClock.uptimeMillis();
        var ev = MotionEvent.obtain(down, down, MotionEvent.ACTION_DOWN, 0, 0, 0);
        mListView.onTouchEvent(ev);
        ev.recycle();

        ev = MotionEvent.obtain(down, down, MotionEvent.ACTION_MOVE, 0, offset, 0);
        mListView.onTouchEvent(ev);
        ev.recycle();

        ev = MotionEvent.obtain(down, down, MotionEvent.ACTION_CANCEL, 0, offset, 0);
        mListView.onTouchEvent(ev);
        ev.recycle();
    }

    /**
     * Make current selection visible
     */
    private void ensurePosition() {
        mListView.post(() -> {
            while (mListView.getFirstVisiblePosition() + 1 > mCurrent && mListView.canScrollList(-1)) {
                performScrollList(mAdapter.getItemHeight() / 2);
            }
            while (mListView.getLastVisiblePosition() - 1 < mCurrent && mListView.canScrollList(1)) {
                performScrollList(-mAdapter.getItemHeight() / 2);
            }
        });
    }

    /**
     * Select current position
     */
    public void select() {
        select(mCurrent);
    }

    /**
     * Select the given position
     *
     * @param pos Index of auto complete item
     */
    public void select(int pos) {
        if (pos == -1) {
            mEditor.getCursor().onCommitText("\n");
            return;
        }
        CompletionItem item = ((EditorCompletionAdapter) mListView.getAdapter()).getItem(pos);
        Cursor cursor = mEditor.getCursor();
        if (!cursor.isSelected()) {
            mCancelShowUp = true;
            mEditor.getText().delete(cursor.getLeftLine(), cursor.getLeftColumn() - mLastPrefix.length(), cursor.getLeftLine(), cursor.getLeftColumn());
            cursor.onCommitText(item.commit);
            if (item.cursorOffset != item.commit.length()) {
                int delta = (item.commit.length() - item.cursorOffset);
                int newSel = Math.max(mEditor.getCursor().getLeft() - delta, 0);
                CharPosition charPosition = mEditor.getCursor().getIndexer().getCharPosition(newSel);
                mEditor.setSelection(charPosition.line, charPosition.column);
            }
            mCancelShowUp = false;
        }
        mEditor.hideCompletionWindow();
    }

    /**
     * Get prefix set
     *
     * @return The previous prefix
     */
    public String getPrefix() {
        return mLastPrefix;
    }

    /**
     * Set prefix for auto complete analysis
     *
     * @param prefix The user's input code's prefix
     */
    public void setPrefix(String prefix) {
        if (mCancelShowUp) {
            return;
        }
        setLoading(true);
        mLastPrefix = prefix;
        mRequestTime = System.currentTimeMillis();
        new MatchThread(mRequestTime, prefix).start();
    }

    public void setMaxHeight(int height) {
        mMaxHeight = height;
    }

    /**
     * Display result of analysis
     *
     * @param results     Items of analysis
     * @param requestTime The time that this thread starts
     */
    private synchronized void displayResults(final List<CompletionItem> results, long requestTime) {
        if (mRequestTime != requestTime) {
            return;
        }
        mEditor.post(() -> {
            setLoading(false);
            if (results == null || results.isEmpty()) {
                hide();
                return;
            }
            mAdapter.attachValues(this, results);
            mListView.setAdapter(mAdapter);
            mCurrent = -1;
            float newHeight = mAdapter.getItemHeight() * results.size();
            setSize(getWidth(), (int) Math.min(newHeight, mMaxHeight));
        });
    }

    /**
     * Analysis thread
     *
     * @author Rose
     */
    private class MatchThread extends Thread {

        private final long mTime;
        private final String mPrefix;
        private final TextAnalyzeResult mColors;
        private final int mLine;
        private final int mColumn;
        private final AutoCompleteProvider mLocalProvider = mProvider;

        public MatchThread(long requestTime, String prefix) {
            mTime = requestTime;
            mPrefix = prefix;
            mColors = mEditor.getTextAnalyzeResult();
            mLine = mEditor.getCursor().getLeftLine();
            mColumn = mEditor.getCursor().getLeftColumn();
        }

        @Override
        public void run() {
            try {
                displayResults(mLocalProvider.getAutoCompleteItems(mPrefix, mColors, mLine, mColumn), mTime);
            } catch (Exception e) {
                e.printStackTrace();
                displayResults(new ArrayList<>(), mTime);
            }
        }


    }

}

