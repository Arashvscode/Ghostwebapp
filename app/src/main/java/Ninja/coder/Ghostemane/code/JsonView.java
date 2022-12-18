package Ninja.coder.Ghostemane.code;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.RippleDrawable;

import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;

/*
*Fix all bug by Ninja coder .ir
* این کتابخونه برای گوست وب است
* In library for ghost web app 
*/

public class JsonView extends LinearLayout {
	private ImageView imageview;
	private TextView keyTV, valueTV, commandTV;
	private View contentView;
	private Context mContext;

	public JsonView(Context context) {
		super(context);
		this.mContext = context;
		initView();
	}

	public JsonView(Context context, @Nullable AttributeSet attrs) {
		super(context, attrs);
		this.mContext = context;
		initView();
	}

	public JsonView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		this.mContext = context;
		initView();
	}

	private void initView() {
		setOrientation(VERTICAL);
		LayoutInflater.from(mContext).inflate(R.layout.item_view_jsonview_layout, this, true);
		imageview = (ImageView) findViewById(R.id.icon);
		keyTV = (TextView) findViewById(R.id.key);
		valueTV = (TextView) findViewById(R.id.value);
		commandTV = (TextView) findViewById(R.id.command);
		contentView = findViewById(R.id.content);
		contentView.setBackgroundColor(Color.TRANSPARENT);
		setImageEffect(true, "#FFFF8F60", imageview);
		imageview.setVisibility(GONE);
		keyTV.setVisibility(GONE);
		valueTV.setVisibility(GONE);
		setTextSize(JsonViewLayout.TEXT_SIZE_DP);
	}

	public void setTextSize(float textSizeDp) {
		JsonViewLayout.TEXT_SIZE_DP = (int) textSizeDp;
		keyTV.setTextSize(JsonViewLayout.TEXT_SIZE_DP);
		valueTV.setTextSize(JsonViewLayout.TEXT_SIZE_DP);
		commandTV.setTextSize(JsonViewLayout.TEXT_SIZE_DP);
		int textSize = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, JsonViewLayout.TEXT_SIZE_DP,
				getResources().getDisplayMetrics());
		LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageview.getLayoutParams();
		layoutParams.height = textSize;
		layoutParams.width = textSize;
		setImageEffect(true, "#FFFF8F60", imageview);
		int rightMargin = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, JsonViewLayout.TEXT_SIZE_DP / 4,
				getResources().getDisplayMetrics());
		layoutParams.rightMargin = rightMargin;
		layoutParams.gravity = Gravity.CENTER_VERTICAL;
		imageview.setLayoutParams(layoutParams);
	}

	public void setCommand(CharSequence sequence) {
		commandTV.setText(sequence);
	}

	public void hideIcon() {
		imageview.setVisibility(GONE);
	}

	public void showIcon(boolean canExpand) {
		imageview.setVisibility(VISIBLE);
		imageview.setImageResource(canExpand ? R.drawable.mr : R.drawable.md);

	}

	public void hideValue() {
		valueTV.setVisibility(GONE);
	}

	public void showValue(CharSequence s) {
		valueTV.setVisibility(VISIBLE);
		valueTV.setText(s);
		valueTV.setBackgroundColor(Color.TRANSPARENT);
	}

	public void showArrayLength(int resId) {
		valueTV.setBackgroundResource(resId);
	}

	public void showKey(CharSequence s) {
		keyTV.setVisibility(VISIBLE);
		keyTV.setText(s);
	}

	public void setIconClickListener(View.OnClickListener listener) {
		imageview.setOnClickListener(listener);
	}

	public void expand() {
		imageview.setTag(false);
		imageview.callOnClick();
	}

	public void collapse() {
		imageview.setTag(true);
		imageview.callOnClick();
	}

	public void addViewNoInvalidate(View child) {
		try {

			ViewGroup.LayoutParams params = child.getLayoutParams();
			if (params == null) {
				params = generateDefaultLayoutParams();
				if (params == null) {

				}
			}
			addViewInLayout(child, -1, params);
		} catch (IllegalArgumentException exception) {
			exception.printStackTrace();

		}
	}

	public void setImageEffect(boolean s, String colors, View view) {

		ColorStateList colorStateList = new ColorStateList(new int[][] { new int[] {} },
				new int[] { Color.parseColor(colors) });
		RippleDrawable rippleDrawable = new RippleDrawable(colorStateList, null, null);
		view.setBackground(rippleDrawable);

	}

}
