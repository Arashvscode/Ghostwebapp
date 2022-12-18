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

import java.util.Locale;
import io.github.rosemoe.sora.widget.EditorColorScheme;
import Ninja.coder.Ghostemane.code.R;
import io.github.rosemoe.sora.data.CompletionItem;
import java.util.*;
import java.util.HashMap;

@SuppressWarnings("CanBeFinal")
class CustomAdGhostWeb extends EditorCompletionAdapter {
	private HashMap<String, Object> imap = new HashMap<>();
	
	@Override
	public int getItemHeight() {
		// 45 dp
		return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 60,
		getContext().getResources().getDisplayMetrics());
	}
	
	@Override
	public View getView(int pos, View view, ViewGroup parent, boolean isCurrentCursorPosition) {
		if (view == null) {
			view = LayoutInflater.from(getContext()).inflate(R.layout.autotextruner, parent, false);
		}
		CompletionItem item = getItem(pos);
		TextView tv = view.findViewById(R.id.res);
		TextView tv1 = view.findViewById(R.id.tv1);
		
		LinearLayout mob = view.findViewById(R.id.mob);
		LinearLayout Ninjaback = view.findViewById(R.id.Ninjaback);
		imap = new HashMap<>();
		var label = Spannable.Factory.getInstance().newSpannable(item.label);
		var prefix = getPrefix();
		
		var index = TextUtils.indexOf(item.label.toLowerCase(Locale.ROOT), prefix.toLowerCase(Locale.ROOT));
		if (index != -1) {
			label.setSpan(new ForegroundColorSpan(0xFFFF9193), index, index + prefix.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
			
		} else {
			
			
			
		}
		tv.setText(label);
		
		//	view.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)3, 0xFF171717));
		//	mob.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)3, 0xFF171717));
		tv = view.findViewById(R.id.iogore);
		tv.setText(item.desc);
		
		
		tv1.setText(item.desc.subSequence(0, 1));
		
		view.setTag(pos);
		if (isCurrentCursorPosition) {
			
			Ninjaback.setBackground(new GradientDrawable() {
				public GradientDrawable getIns(int a, int b) {
					this.setCornerRadius(a);
					this.setColor(b);
					return this;
				}
			}.getIns((int) 16, 0xFF181822));
			
		} else {
			
			Ninjaback.setBackground(new GradientDrawable() {
				public GradientDrawable getIns(int a, int b) {
					this.setCornerRadius(a);
					this.setColor(b);
					return this;
				}
			}.getIns((int) 15, 0xFF181822));
			
		}
		return view;
	}
	
}
