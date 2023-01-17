package Ninja.coder.Ghostemane.code;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class ExrtaFab extends ExtendedFloatingActionButton {
	public ExrtaFab(Context c) {
		super(c);
	}
	
	public ExrtaFab(Context c, AttributeSet v) {
		super(c, v);
		init();
	}
	
	public ExrtaFab(Context c, AttributeSet v, int i) {
		super(c, v, i);
		init();
	}
	
	public ExrtaFab(Context c, AttributeSet v, int i, View view) {
		super(c, v, i);
		init();
	}
	
	protected ExrtaFab init() {
		shrink();
		return this;
	}
	
}
