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

import android.view.Gravity;
import android.widget.PopupWindow;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/**
 * Editor base panel class
 *
 * @author Rose
 */
class EditorBasePopupWindow extends PopupWindow {
    private final CodeEditor mEditor;
    private final int[] mLocation;
    private int mTop;
    private int mLeft;

    /**
     * Create a panel for editor
     *
     * @param editor Target editor
     */
    public EditorBasePopupWindow(CodeEditor editor) {
        if (editor == null) {
            throw new IllegalArgumentException();
        }
        mLocation = new int[2];
        mEditor = editor;
        super.setTouchable(true);
        setElevation(0 * editor.getDpUnit());
        GradientDrawable gradientDrawable = new GradientDrawable();
		
		gradientDrawable.setCornerRadius(13f);
		setBackgroundDrawable(gradientDrawable);
    }

    /**
     * Set the left position on the editor rect
     *
     * @param x X on editor
     */
    public void setExtendedX(float x) {
        mLeft = (int) x;
    }

    /**
     * Set the top position on the editor rect
     *
     * @param y Y on editor
     */
    public void setExtendedY(float y) {
        mTop = (int) y;
    }

    public void updatePosition() {
        int width = mEditor.getWidth();
        if (mLeft > width - getWidth()) {
            mLeft = width - getWidth();
        }
        int height = mEditor.getHeight();
        if (mTop > height - getHeight()) {
            mTop = height - getHeight();
        }
        if (mTop < 0) {
            mTop = 0;
        }
        if (mLeft < 0) {
            mLeft = 0;
        }
        mEditor.getLocationInWindow(mLocation);
        if (isShowing()) {
            update(mLocation[0] + mLeft, mLocation[1] + mTop, getWidth(), getHeight());
        }
    }

    /**
     * Show the panel or update its position(If already shown)
     */
    public void show() {
        int width = mEditor.getWidth();
        if (mLeft > width - getWidth()) {
            mLeft = width - getWidth();
        }
        int height = mEditor.getHeight();
        if (mTop > height - getHeight()) {
            mTop = height - getHeight();
        }
        if (mTop < 0) {
            mTop = 0;
        }
        if (mLeft < 0) {
            mLeft = 0;
        }
        mEditor.getLocationInWindow(mLocation);
        if (isShowing()) {
            update(mLocation[0] + mLeft, mLocation[1] + mTop, getWidth(), getHeight());
            return;
        }
        super.showAtLocation(mEditor,
                Gravity.START | Gravity.TOP,
                mLocation[0] + mLeft, mLocation[1] + mTop);
    }

    /**
     * Hide the panel (If shown)
     */
    public void hide() {
        if (isShowing()) {
            super.dismiss();
        }
    }

}

