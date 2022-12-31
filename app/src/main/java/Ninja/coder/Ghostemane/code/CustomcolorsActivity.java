package Ninja.coder.Ghostemane.code;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.webkit.*;
import arabware.file.*;
import com.allenliu.badgeview.*;
import com.android.tools.r8.*;
import com.caverock.androidsvg.*;
import com.github.angads25.filepicker.*;
import com.github.junrar.*;
import com.google.android.material.*;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.textfield.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lxj.xpopup.*;
import com.mukesh.*;
import com.neo.highlight.*;
import com.tapadoo.alerter.*;
import com.zip4j.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;
import meorg.jsoup.*;
import org.antlr.v4.runtime.*;
import org.benf.cfr.reader.*;
import org.beyka.tiffbitmapfactory.*;
import org.json.*;
import storage.sdcard.*;
import xyz.doikki.videoplayer.*;
import xyz.doikki.videoplayer.exo.*;
import xyz.doikki.videoplayer.ijk.*;
import androidx.core.widget.NestedScrollView;

public class CustomcolorsActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private String data = "";
	
	private ArrayList<HashMap<String, Object>> mp = new ArrayList<>();
	
	private LinearLayout linear1;
	private TextInputLayout input;
	private GridView gridview1;
	private TextView textview1;
	private ImageView imageview1;
	private TextInputEditText edittext1;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.customcolors);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_app_bar = findViewById(R.id._app_bar);
		_coordinator = findViewById(R.id._coordinator);
		_toolbar = findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		linear1 = findViewById(R.id.linear1);
		input = findViewById(R.id.input);
		gridview1 = findViewById(R.id.gridview1);
		textview1 = findViewById(R.id.textview1);
		imageview1 = findViewById(R.id.imageview1);
		edittext1 = findViewById(R.id.edittext1);
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				onBackPressed();
			}
		});
		
		edittext1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				mp = new Gson().fromJson(data, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
				final double length = mp.size();
				 
				d = mp.size() - 1;
				 for(int i = 0; i < (int)(length); i++) {
					  final String serching = mp.get((int)d).get("ColorName").toString();
					  if (serching.toLowerCase().contains(_charSeq.toLowerCase())) {
						   
						  }else {
						   mp.remove((int)(d));
						  }
					  d--;
					 }
				
				gridview1.setNumColumns((int)2);
				gridview1.setAdapter(new Gridview1Adapter(mp));
				gridview1.setStretchMode(GridView.STRETCH_COLUMN_WIDTH);
				
			}
			private double d;
			{
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
	}
	
	private void initializeLogic() {
		try{
			java.io.InputStream inputstream1 = getAssets().open("m33");
			data = SketchwareUtil.copyFromInputStream(inputstream1);
			mp = new Gson().fromJson(data, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
		}catch(Exception e){
			 
		}
		gridview1.setAdapter(new Gridview1Adapter(mp));
		gridview1.setNumColumns((int)2);
		gridview1.setStretchMode(GridView.STRETCH_COLUMN_WIDTH);
		_toolbar.setBackgroundColor(Color.TRANSPARENT);
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =CustomcolorsActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF1F1B1C);
		}
		///input.setEndIconTintMode(PorterDuff.Mode.MULTIPLY);
		//input.setEndIconTintList(ColorStateList.valueOf(0xFFFFDCB9));
		input.setEndIconDrawable(R.drawable.closehsi);
		input.setEndIconOnClickListener(v ->{
				edittext1.setText("");
		});
		
		input.setBoxStrokeColor(0xFFFDA893);
		input.setBoxCornerRadii((float)5, (float)5, (float)5, (float)5);
		input.setCounterEnabled(true);
		input.setBoxBackgroundMode(TextInputLayout.BOX_BACKGROUND_FILLED);
		var gradientDrawable  = new GradientDrawable();
		gradientDrawable.setColor(0xFF1F1B1C);
		CustomcolorsActivity.this.getWindow().setBackgroundDrawable(gradientDrawable);
		input.setBoxBackgroundColor(0xFF151213);
		_toolbar.setElevation((float)0);
		_toolbar.setVisibility(View.GONE);
	}
	
	@Override
	public void onStart() {
		super.onStart();
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFF1F1B1C".replace("0xFF" , "#")));
		}
	}
	
	public void _clickAnimation(final View _view) {
		ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
		fade_in.setDuration(300);
		fade_in.setFillAfter(true);
		_view.startAnimation(fade_in);
	}
	
	public class Gridview1Adapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Gridview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = getLayoutInflater();
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.getcolors, null);
			}
			
			final LinearLayout linear5 = _view.findViewById(R.id.linear5);
			final androidx.cardview.widget.CardView cardview1 = _view.findViewById(R.id.cardview1);
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final LinearLayout linear2 = _view.findViewById(R.id.linear2);
			final LinearLayout linear3 = _view.findViewById(R.id.linear3);
			final LinearLayout linear4 = _view.findViewById(R.id.linear4);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final TextView colorNames = _view.findViewById(R.id.colorNames);
			final TextView colorshexs = _view.findViewById(R.id.colorshexs);
			
			int[] colors = { Color.parseColor("#FFFFFFFF"), Color.parseColor(mp.get((int)_position).get("mycolors").toString())
				
				 };
			    GradientDrawable gd = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, colors);
			   gd.setCornerRadius(15);
			linear1 .setBackground(gd);
			colorNames.setText(Html.fromHtml("<b>".concat("hex : ".concat(mp.get((int)_position).get("ColorName").toString().concat("</b>")))));
			colorshexs.setText(Html.fromHtml("<i>".concat("name : ".concat(mp.get((int)_position).get("mycolors").toString().concat("</i>")))));
			linear1.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mp.get((int)_position).get("mycolors").toString()));
					SketchwareUtil.CustomToast(getApplicationContext(), "hex : ".concat(mp.get((int)_position).get("ColorName").toString()), 0xFFFFFFFF, 14, Color.parseColor(mp.get((int)_position).get("mycolors").toString()), 16, SketchwareUtil.CENTER);
					if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) { 
							Window ninjacoder = CustomcolorsActivity.this.getWindow();
							ninjacoder.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
							ninjacoder.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
							
							ninjacoder.setStatusBarColor(Color.parseColor(mp.get((int)_position).get("mycolors").toString()));
						    ninjacoder.setNavigationBarColor(Color.parseColor(mp.get((int)_position).get("mycolors").toString()));
					}
					
					_toolbar.setBackgroundColor(Color.parseColor(mp.get((int)_position).get("mycolors").toString()));
				}
			});
			_clickAnimation(linear5);
			_clickAnimation(cardview1);
			
			return _view;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}