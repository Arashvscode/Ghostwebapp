package io.github.rosemoe.sora.widget;

import android.text.Spannable;
import android.app.*;
import android.content.*;
import android.content.res.*;
import android.content.res.AssetManager;
import android.graphics.*;
import android.graphics.Typeface;
import android.graphics.drawable.*;
import android.os.*;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.*;
import android.view.View.*;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.textview.MaterialTextView;
import java.util.Locale;
import io.github.rosemoe.sora.widget.EditorColorScheme;
import Ninja.coder.Ghostemane.code.R;
import io.github.rosemoe.sora.data.CompletionItem;
import java.util.*;
import java.util.HashMap;

@SuppressWarnings("CanBeFinal")
class CustomAdGhostWeb extends EditorCompletionAdapter {
	
	@Override
	public int getItemHeight() {
		// 45 dp
		return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 45,
		getContext().getResources().getDisplayMetrics());
	}
	
	@Override
	public View getView(int pos, View view, ViewGroup parent, boolean isCurrentCursorPosition) {
		if (view == null) {
			view = LayoutInflater.from(getContext()).inflate(R.layout.oneui, parent, false);
		}
		CompletionItem item = getItem(pos);
		MaterialTextView tv = view.findViewById(R.id.res);
		MaterialTextView tv1 = view.findViewById(R.id.tv1);
		LinearLayout display = view.findViewById(R.id.display);
		LinearLayout mob = view.findViewById(R.id.mob);
		var label = Spannable.Factory.getInstance().newSpannable(item.label);
		var prefix = getPrefix();
		var index = TextUtils.indexOf(item.label.toLowerCase(Locale.ROOT), prefix.toLowerCase(Locale.ROOT));
		if (index != -1) {
			label.setSpan(new ForegroundColorSpan(0xFFFF9193), index, index + prefix.length(),
			Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		}
		tv.setText(label);
		AnimUtils.O(view);
		tv = view.findViewById(R.id.iogore);
		tv1.setTextColor(Color.WHITE);
		tv.setText(item.desc);
		tv1.setText(item.desc.subSequence(0, 1));
		String lastItemPost = tv1.getText().toString();
        String lastItemPost2 = tv.getText().toString();
		if (lastItemPost.endsWith("H")) {
			SetBackgroundItem(Color.parseColor("#FF6CF550"), display);
		} else if (lastItemPost.endsWith("Q")) {
		} else if (lastItemPost.endsWith("C")) {
			SetBackgroundItem(Color.parseColor("#FFFF6F15"), display);
		} else if (lastItemPost.endsWith("K")) {
			SetBackgroundItem(Color.parseColor("#FFB1014D"), display);
		} else if (lastItemPost.endsWith("P")) {
			SetBackgroundItem(Color.parseColor("#FFA614FB"), display);
		} else if (lastItemPost.endsWith("J")) {
			SetBackgroundItem(Color.parseColor("#FFFF4D5A"), display);
		}else if(lastItemPost.endsWith("K") || lastItemPost.endsWith("k")){
			SetBackgroundItem(Color.parseColor("#FF6D2FBD"),display);
		}else if(lastItemPost.endsWith("D")|| lastItemPost.endsWith("d") || lastItemPost.endsWith("I")){
			SetBackgroundItem(Color.parseColor("#FFBF2E2E"),display);
		}else if(lastItemPost2.endsWith("green") || lastItemPost2.equals("green")){
			SetBackgroundItem(Color.GREEN,display);
		}else if (lastItemPost2.startsWith("red") || lastItemPost2.equals("red")){
			SetBackgroundItem(Color.RED,display);
		}else{
            SetBackgroundItem(Color.BLACK,display);
        }
		view.setTag(pos);
		return view;
	}
	
	protected void SetBackgroundItem(int colors, View view) {
		GradientDrawable pos = new GradientDrawable();
		pos.setColor(colors);
		pos.setCornerRadius((float) 18);
		view.setBackground(pos);
	}
}
