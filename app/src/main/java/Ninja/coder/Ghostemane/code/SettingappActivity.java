package Ninja.coder.Ghostemane.code;

import android.Manifest;
import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.ClipData;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
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
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
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
import java.util.ArrayList;
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
	
	public final int REQ_CD_FILE = 101;
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private String path = "";
	
	private ArrayList<String> string = new ArrayList<>();
	
	private NestedScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear6;
	private TextView textview6;
	private LinearLayout linear7;
	private LinearLayout linear12;
	private LinearLayout linear14;
	private LinearLayout linear15;
	private LinearLayout linear16;
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
	private TextView textview4;
	private MaterialCheckBox checkbox4;
	private TextView textview5;
	private MaterialCheckBox checkbox5;
	private TextView textview12;
	private MaterialCheckBox checkbox8;
	private TextView textview15;
	private MaterialCheckBox checkbox9;
	private TextView textview16;
	private ImageView imageview4;
	private TextView textview17;
	private ImageView imageview5;
	
	private SharedPreferences word;
	private SharedPreferences line;
	private SharedPreferences mfs;
	private SharedPreferences getvb;
	private SharedPreferences getDrak;
	private SharedPreferences re;
	private Intent intent = new Intent();
	private SharedPreferences war;
	private SharedPreferences kos;
	private SharedPreferences tab100;
	private Intent file = new Intent(Intent.ACTION_GET_CONTENT);
	private SharedPreferences setfont;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.settingapp);
		initialize(_savedInstanceState);
		
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE}, 1000);
		} else {
			initializeLogic();
		}
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
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
		linear6 = findViewById(R.id.linear6);
		textview6 = findViewById(R.id.textview6);
		linear7 = findViewById(R.id.linear7);
		linear12 = findViewById(R.id.linear12);
		linear14 = findViewById(R.id.linear14);
		linear15 = findViewById(R.id.linear15);
		linear16 = findViewById(R.id.linear16);
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
		textview4 = findViewById(R.id.textview4);
		checkbox4 = findViewById(R.id.checkbox4);
		textview5 = findViewById(R.id.textview5);
		checkbox5 = findViewById(R.id.checkbox5);
		textview12 = findViewById(R.id.textview12);
		checkbox8 = findViewById(R.id.checkbox8);
		textview15 = findViewById(R.id.textview15);
		checkbox9 = findViewById(R.id.checkbox9);
		textview16 = findViewById(R.id.textview16);
		imageview4 = findViewById(R.id.imageview4);
		textview17 = findViewById(R.id.textview17);
		imageview5 = findViewById(R.id.imageview5);
		word = getSharedPreferences("word", Activity.MODE_PRIVATE);
		line = getSharedPreferences("line", Activity.MODE_PRIVATE);
		mfs = getSharedPreferences("mfs", Activity.MODE_PRIVATE);
		getvb = getSharedPreferences("getvb", Activity.MODE_PRIVATE);
		getDrak = getSharedPreferences("getDrak", Activity.MODE_PRIVATE);
		re = getSharedPreferences("re", Activity.MODE_PRIVATE);
		war = getSharedPreferences("war", Activity.MODE_PRIVATE);
		kos = getSharedPreferences("kos", Activity.MODE_PRIVATE);
		tab100 = getSharedPreferences("tab100", Activity.MODE_PRIVATE);
		file.setType("*/*");
		file.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
		setfont = getSharedPreferences("setfont", Activity.MODE_PRIVATE);
		
		linear15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				{
					final String[] array = string.toArray(new String[0]);
					final String[] chosen = {""};
					com.google.android.material.dialog.MaterialAlertDialogBuilder builder = new com.google.android.material.dialog.MaterialAlertDialogBuilder(SettingappActivity.this);
					builder.setCancelable(false);
					        //builder.setIcon(R.drawable.icon);
					        builder.setTitle("Select");
					        builder.setSingleChoiceItems(array, -1, new DialogInterface
					                .OnClickListener() {
						            public void onClick(DialogInterface dialog, int item) {
							              
							              chosen[0] = array[item];
							              
							            }
						        });
					        
					        builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog, int _which) {
							
							
									
							}
					});
					
					builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
							
							
									
							}
					});
					
					        final androidx.appcompat.app.AlertDialog alert = builder.create();
					        alert.show();
					
					alert.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener()
					 { 
							 @Override
							 public void onClick(View v)
							 {
									 Boolean wantToCloseDialog = false;
							
							
							String item = chosen[0];
							if (item.isEmpty()){
								
							} else {
								////YourCodeType
								_editortabsize(item);
								alert.dismiss();
							}
									 if(wantToCloseDialog) {
											 
											 }
									 }
							 });
					
				}
			}
		});
		
		linear16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				var di = new com.google.android.material.dialog.MaterialAlertDialogBuilder(SettingappActivity.this);
				    ViewGroup viewGroup = findViewById(android.R.id.content);
						View dialogview = getLayoutInflater().inflate(R.layout.fontsetlector, viewGroup, false);
				com.google.android.material.textfield.TextInputLayout input = dialogview.findViewById(R.id.input);
				EditText edit = dialogview.findViewById(R.id.edit);
				di.setTitle("فونت شخصی");
				di.setMessage("لطفا دقت کنید که حتمان باید فرمت فونت .ttf باشد در غیر این صورت با خطا برنامه متوجه میشوید");
				input.setErrorIconDrawable(R.drawable.mfont);
				input.setEndIconVisible(true);
				input.setEndIconCheckable(true);
				input.setErrorIconOnClickListener(v ->{
								
					      startActivityForResult(file, REQ_CD_FILE);
					
						});
				edit.setText(path);
				di.setPositiveButton("تایید", (p1, d2) -> {
					
					         setfont.edit().putString("mfont", edit.getText().toString()).commit();
					
								});
				di.setNegativeButton("پیشفرض", (p3, d3) -> {
					
					         setfont.edit().remove("mfont").commit();
					
								});
				di.setView(dialogview);
				di.show();
				
				
				
				
			}
		});
		
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
		string.add("4");
		string.add("6");
		string.add("8");
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
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			case REQ_CD_FILE:
			if (_resultCode == Activity.RESULT_OK) {
				ArrayList<String> _filePath = new ArrayList<>();
				if (_data != null) {
					if (_data.getClipData() != null) {
						for (int _index = 0; _index < _data.getClipData().getItemCount(); _index++) {
							ClipData.Item _item = _data.getClipData().getItemAt(_index);
							_filePath.add(FileUtil.convertUriToFilePath(getApplicationContext(), _item.getUri()));
						}
					}
					else {
						_filePath.add(FileUtil.convertUriToFilePath(getApplicationContext(), _data.getData()));
					}
				}
				if (path.endsWith(".ttf")) {
					path = _filePath.get((int)(0));
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "Error not File ttf File");
				}
			}
			else {
				
			}
			break;
			default:
			break;
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
	
	
	public void _editortabsize(final String _post) {
		if (_post.equals("4")) {
			tab100.edit().putString("mpcnullgogo", "4").commit();
		}
		else {
			if (_post.equals("6")) {
				tab100.edit().putString("mpcnullgogo", "6").commit();
			}
			else {
				if (_post.equals("8")) {
					tab100.edit().putString("mpcnullgogo", "8").commit();
				}
			}
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