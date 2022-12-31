package Ninja.coder.Ghostemane.code;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Bundle;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.CompoundButton;
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
import com.lxj.xpopup.*;
import com.mukesh.*;
import com.neo.highlight.*;
import com.tapadoo.alerter.*;
import com.zip4j.*;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
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
import com.google.android.material.checkbox.MaterialCheckBox;
import androidx.core.widget.NestedScrollView;

public class SettingappActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private NestedScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private TextView textview6;
	private LinearLayout linear7;
	private LinearLayout linear12;
	private LinearLayout linear14;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private LinearLayout themes;
	private TextView textview13;
	private LinearLayout linear13;
	private TextView textview1;
	private TextView textview9;
	private ImageView imageview1;
	private TextView textview10;
	private TextView textview11;
	private ImageView imageview2;
	private TextView textview14;
	private ImageView imageview3;
	private TextView tvword;
	private MaterialCheckBox checkbox1;
	private TextView textview2;
	private MaterialCheckBox checkbox2;
	private TextView textview3;
	private MaterialCheckBox checkbox3;
	private TextView textview4;
	private MaterialCheckBox checkbox4;
	private TextView textview5;
	private MaterialCheckBox checkbox5;
	private TextView textview12;
	private MaterialCheckBox checkbox8;
	private TextView textview15;
	private MaterialCheckBox checkbox9;
	
	private SharedPreferences word;
	private SharedPreferences line;
	private SharedPreferences mfs;
	private SharedPreferences at;
	private SharedPreferences getvb;
	private SharedPreferences getDrak;
	private SharedPreferences re;
	private Intent intent = new Intent();
	private SharedPreferences war;
	private SharedPreferences kos;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.settingapp);
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
		vscroll1 = findViewById(R.id.vscroll1);
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		linear4 = findViewById(R.id.linear4);
		linear5 = findViewById(R.id.linear5);
		linear6 = findViewById(R.id.linear6);
		textview6 = findViewById(R.id.textview6);
		linear7 = findViewById(R.id.linear7);
		linear12 = findViewById(R.id.linear12);
		linear14 = findViewById(R.id.linear14);
		linear10 = findViewById(R.id.linear10);
		linear11 = findViewById(R.id.linear11);
		themes = findViewById(R.id.themes);
		textview13 = findViewById(R.id.textview13);
		linear13 = findViewById(R.id.linear13);
		textview1 = findViewById(R.id.textview1);
		textview9 = findViewById(R.id.textview9);
		imageview1 = findViewById(R.id.imageview1);
		textview10 = findViewById(R.id.textview10);
		textview11 = findViewById(R.id.textview11);
		imageview2 = findViewById(R.id.imageview2);
		textview14 = findViewById(R.id.textview14);
		imageview3 = findViewById(R.id.imageview3);
		tvword = findViewById(R.id.tvword);
		checkbox1 = findViewById(R.id.checkbox1);
		textview2 = findViewById(R.id.textview2);
		checkbox2 = findViewById(R.id.checkbox2);
		textview3 = findViewById(R.id.textview3);
		checkbox3 = findViewById(R.id.checkbox3);
		textview4 = findViewById(R.id.textview4);
		checkbox4 = findViewById(R.id.checkbox4);
		textview5 = findViewById(R.id.textview5);
		checkbox5 = findViewById(R.id.checkbox5);
		textview12 = findViewById(R.id.textview12);
		checkbox8 = findViewById(R.id.checkbox8);
		textview15 = findViewById(R.id.textview15);
		checkbox9 = findViewById(R.id.checkbox9);
		word = getSharedPreferences("word", Activity.MODE_PRIVATE);
		line = getSharedPreferences("line", Activity.MODE_PRIVATE);
		mfs = getSharedPreferences("mfs", Activity.MODE_PRIVATE);
		at = getSharedPreferences("at", Activity.MODE_PRIVATE);
		getvb = getSharedPreferences("getvb", Activity.MODE_PRIVATE);
		getDrak = getSharedPreferences("getDrak", Activity.MODE_PRIVATE);
		re = getSharedPreferences("re", Activity.MODE_PRIVATE);
		war = getSharedPreferences("war", Activity.MODE_PRIVATE);
		kos = getSharedPreferences("kos", Activity.MODE_PRIVATE);
		
		themes.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), AnjctorcolorActivity.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
				startActivity(intent);
			}
		});
		
		linear13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), ResultActivity.class);
				startActivity(intent);
			}
		});
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				onBackPressed();
			}
		});
		
		textview11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), AnjctorcolorActivity.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
				startActivity(intent);
			}
		});
		
		checkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					word.edit().putString("getword", "true").commit();
					_ShowIn(checkbox1);
				}
				else {
					word.edit().putString("getword", "false").commit();
					_ShowOut(checkbox1);
				}
			}
		});
		
		checkbox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					line.edit().putString("getline", "true").commit();
					_ShowIn(checkbox2);
				}
				else {
					_ShowOut(checkbox2);
					line.edit().remove("getline").commit();
				}
			}
		});
		
		checkbox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					at.edit().putString("v1", "true").commit();
					_ShowIn(checkbox3);
					SketchwareUtil.showMessage(getApplicationContext(), "ذخیره سازی خودکار فعال شد");
				}
				else {
					_ShowOut(checkbox3);
					at.edit().remove("v1").commit();
				}
			}
		});
		
		checkbox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					getvb.edit().putString("HsiGamer", "true").commit();
					_ShowIn(checkbox4);
				}
				else {
					getvb.edit().putString("HsiGamer", "false").commit();
					_ShowOut(checkbox4);
				}
			}
		});
		
		checkbox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					re.edit().putString("f380", "true").commit();
					_ShowIn(checkbox5);
				}
				else {
					_ShowOut(checkbox5);
					re.edit().remove("f380").commit();
				}
			}
		});
		
		checkbox8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					
						Drawable drawable = WallpaperManager.getInstance(SettingappActivity.this).getDrawable();
						if (drawable != null) {
								vscroll1.setBackgroundDrawable(drawable);
						}
					
					
					war.edit().putString("val", "true").commit();
					_ShowIn(checkbox8);
					SketchwareUtil.showMessage(getApplicationContext(), "اعمال شد دوباره وارد برنامه شوید");
				}
				else {
					war.edit().putString("val", "false").commit();
					vscroll1.setBackgroundColor(0xFF1F1B1C);
					SketchwareUtil.showMessage(getApplicationContext(), "خاموش شد دوباره وارد برنامه شوید");
					_ShowOut(checkbox8);
				}
			}
		});
		
		checkbox9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					_ShowIn(checkbox9);
					kos.edit().putString("vop", "true").commit();
				}
				else {
					kos.edit().putString("vop", "false").commit();
					_ShowOut(checkbox9);
				}
			}
		});
	}
	
	private void initializeLogic() {
		_seechackswich();
		_toolbar.setBackgroundColor(0xFF1C1B20);
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) { 
				   Window Hsi = this.getWindow();
			 Hsi.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			 Hsi.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			
				   Hsi.setStatusBarColor(Color.parseColor("#1F1B1C")); Hsi.setNavigationBarColor(Color.parseColor("#1F1B1C"));
		}
		_toolbar.setVisibility(View.GONE);
		if (war.getString("val", "").equals("true")) {
			
				Drawable drawable = WallpaperManager.getInstance(SettingappActivity.this).getDrawable();
				if (drawable != null) {
						vscroll1.setBackgroundDrawable(drawable);
				}
			
			
		}
		else {
			if (war.getString("val", "").equals("false")) {
				vscroll1.setBackgroundColor(0xFF1F1B1C);
			}
			else {
				
			}
		}
	}
	
	public void _seechackswich() {
		if (word.getString("getword", "").equals("true")) {
			checkbox1.setChecked(true);
		}
		else {
			checkbox1.setChecked(false);
		}
		if (line.getString("getline", "").equals("true")) {
			checkbox2.setChecked(true);
		}
		else {
			checkbox2.setChecked(false);
		}
		if (at.getString("v1", "").equals("true")) {
			checkbox3.setChecked(true);
		}
		else {
			checkbox3.setChecked(false);
		}
		if (getvb.getString("HsiGamer", "").equals("true")) {
			checkbox4.setChecked(true);
		}
		else {
			checkbox4.setChecked(false);
		}
		if (re.getString("f380", "").equals("true")) {
			checkbox5.setChecked(true);
		}
		else {
			checkbox5.setChecked(false);
		}
		if (war.getString("val", "").equals("true")) {
			checkbox8.setChecked(true);
		}
		else {
			checkbox8.setChecked(false);
		}
		if (kos.getString("vop", "").equals("true")) {
			checkbox9.setChecked(true);
		}
		else {
			checkbox9.setChecked(false);
		}
	}
	
	
	public void _ShowIn(final View _v) {
		
	}
	
	
	public void _ShowOut(final View _v) {
		
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