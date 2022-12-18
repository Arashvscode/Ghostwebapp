package mod.hey.studios.util;

import static com.besome.sketch.SketchApplication.getContext;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import a.a.a.xB;
import mod.SketchwareUtil;
import mod.agus.jcoderz.lib.FileUtil;

public class Helper {

    public static Type TYPE_MAP = new TypeToken<HashMap<String, Object>>() {
    }.getType();
    public static Type TYPE_MAP_LIST = new TypeToken<ArrayList<HashMap<String, Object>>>() {
    }.getType();
    public static Type TYPE_STRING = new TypeToken<ArrayList<String>>() {
    }.getType();
    public static Type TYPE_STRING_MAP = new TypeToken<HashMap<String, String>>() {
    }.getType();

    private Helper() {
    }

    public static void fixFileprovider() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                StrictMode.class.getMethod("disableDeathOnFileUriExposure").invoke(null);
            } catch (Exception e) {
                Log.e("Helper", "An error occurred while trying to fix death on file URI exposure: " + e.getMessage(), e);
            }
        }
    }

    public static void setViewsVisibility(boolean hide, View... views) {
        for (View view : views) {
            view.setVisibility(hide ? View.GONE : View.VISIBLE);
        }
    }

    public static String getResString(int resId) {
        return xB.b().a(getContext(), resId);
    }

    public static String getResString(int resId, Object... formatArgs) {
        return String.format(getResString(resId), formatArgs);
    }

    public static View.OnClickListener getBackPressedClickListener(final Activity activity) {
        return v -> activity.onBackPressed();
    }

    public static DialogDismissListener getDialogDismissListener(final Dialog dialog) {
        return new DialogDismissListener(dialog);
    }

    /**
     * @return A {@link DialogInterface.OnDismissListener} that hides the keyboard
     */
    public static DialogDismissListener getDialogOnDismissKeyboardHider() {
        return new DialogDismissListener();
    }

    /**
     * @return A {@link DialogInterface.OnCancelListener} that hides the keyboard
     */
    public static DialogDismissListener getDialogOnCancelKeyboardHider() {
        return new DialogDismissListener();
    }

    public static void applyRipple(Context context, View view) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue, true);

        view.setBackgroundResource(typedValue.resourceId);
        view.setClickable(true);
    }

    public static void applyRippleToToolbarView(View view) {
        GradientDrawable content = new GradientDrawable();
        content.setColor(Color.parseColor("#008dcd"));
        content.setCornerRadius(90);

        view.setBackground(
                new RippleDrawable(
                        new ColorStateList(
                                new int[][]{new int[]{0}},
                                new int[]{Color.parseColor("#64b5f6")}
                        ),
                        content,
                        null
                )
        );
    }

    /**
     * Applies a boxy ripple effect to a view.
     *
     * @param target        The view to apply the effect on
     * @param rippleColor   The effect's color
     * @param standardColor The view's color when untouched
     */
    public static void applyRippleEffect(final View target, final int rippleColor, int standardColor) {
        if (!target.isClickable()) {
            target.setClickable(true);
        }

        target.setBackground(
                new RippleDrawable(
                        new ColorStateList(
                                new int[][]{new int[]{}},
                                new int[]{rippleColor}
                        ),
                        new ColorDrawable(standardColor),
                        null
                )
        );
    }

    public static String trimPath(String path) {
        return path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
    }

    public static void sortPaths(ArrayList<String> paths) {
        ArrayList<String> directories = new ArrayList<>();
        ArrayList<String> files = new ArrayList<>();

        for (String str : paths) {
            if (FileUtil.isDirectory(str)) {
                directories.add(str);
            } else {
                files.add(str);
            }
        }

        // ignore the warnings, we need this for compatibility with pre-API level 24
        Collections.sort(directories, String.CASE_INSENSITIVE_ORDER);
        Collections.sort(files, String.CASE_INSENSITIVE_ORDER);
        paths.clear();
        paths.addAll(directories);
        paths.addAll(files);
    }

    /**
     * A listener class for dismissing {@link Dialog}s.
     */
    public static class DialogDismissListener implements View.OnClickListener,
            DialogInterface.OnDismissListener, DialogInterface.OnCancelListener {

        private Dialog dialog;
        private boolean hideKeyboard = false;
        private View hideKeyboardView;

        /**
         * Constructor for {@link Helper#getDialogDismissListener(Dialog)}.
         */
        private DialogDismissListener(Dialog dialog) {
            this.dialog = dialog;
        }

        /**
         * Constructor for {@link Helper#getDialogOnDismissKeyboardHider()}
         * or {@link Helper#getDialogOnCancelKeyboardHider()
         */
        private DialogDismissListener() {
        }

        @Override
        public void onClick(View v) {
            Log.d("Helper", "onClick!");
            dialog.dismiss();

            hideKeyboard();
        }

        /**
         * Makes the {@link View.OnClickListener} also hide the keyboard when clicked.
         *
         * @param hide        Whether the keyboard should be hidden or not
         * @param visibleView A {@link View} which should be visible and "connected"
         *                    to the currently focused View.
         *                    Can be <code>null</code> if <code>hide</code> is <code>false</code>.
         *                    If <code>null</code>, the listener will call {@link SketchwareUtil#hideKeyboard()}
         *                    instead of {@link SketchwareUtil#hideKeyboard(View)}
         * @return The current {@link DialogDismissListener} object
         */
        public DialogDismissListener setHideKeyboard(boolean hide, View visibleView) {
            hideKeyboard = hide;
            hideKeyboardView = visibleView;
            return this;
        }

        @Override
        public void onDismiss(DialogInterface dialog) {
            Log.d("Helper", "onDismiss!");
            hideKeyboard();
        }

        @Override
        public void onCancel(DialogInterface dialog) {
            Log.d("Helper", "onCancel!");
            hideKeyboard();
        }

        private void hideKeyboard() {
            if (hideKeyboard) {
                if (hideKeyboardView == null) {
                    SketchwareUtil.hideKeyboard();
                } else {
                    SketchwareUtil.hideKeyboard(hideKeyboardView);
                }
            }
        }
    }
}
