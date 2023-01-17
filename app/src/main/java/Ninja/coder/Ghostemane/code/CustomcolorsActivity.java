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
import androidx.recyclerview.widget.*;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
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
	private RecyclerView recyclerview1;
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
		recyclerview1 = findViewById(R.id.recyclerview1);
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
				
				recyclerview1.setAdapter(new Recyclerview1Adapter(mp));
				
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
		recyclerview1.setAdapter(new Recyclerview1Adapter(mp));
		recyclerview1.setHasFixedSize(true);
		recyclerview1.setLayoutManager(new LinearLayoutManager(this));
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =CustomcolorsActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF2B2121);
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
		input.setBoxBackgroundColor(0xFF2B2121);
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
	
	public class Recyclerview1Adapter extends RecyclerView.Adapter<Recyclerview1Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Recyclerview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getLayoutInflater();
			View _v = _inflater.inflate(R.layout.getcolors, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final LinearLayout linear6 = _view.findViewById(R.id.linear6);
			final com.google.android.material.divider.MaterialDivider diver = _view.findViewById(R.id.diver);
			final LinearLayout colorviews = _view.findViewById(R.id.colorviews);
			final LinearLayout linear9 = _view.findViewById(R.id.linear9);
			final LinearLayout linear12 = _view.findViewById(R.id.linear12);
			final TextView name = _view.findViewById(R.id.name);
			final TextView idcolor = _view.findViewById(R.id.idcolor);
			final ImageView viewcolor = _view.findViewById(R.id.viewcolor);
			final ImageView imageview2 = _view.findViewById(R.id.imageview2);
			
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
				_view.setLayoutParams(_lp);
			colorviews.setBackgroundColor(Color.parseColor(mp.get((int)_position).get("mycolors").toString()));
			name.setText("color name : ".concat(mp.get((int)_position).get("ColorName").toString()));
			idcolor.setText("id color : ".concat(mp.get((int)_position).get("mycolors").toString()));
			///result code By Ninja coder.ir my love java
			
			
			GradientDrawable vp = new GradientDrawable();
					vp.setColor(Color.parseColor(mp.get((int)_position).get("mycolors").toString()));
					vp.setCornerRadius(19);
					vp.setStroke(0, Color.TRANSPARENT);
			_clickAnimation(linear6);
			viewcolor.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					var di = new com.google.android.material.dialog.MaterialAlertDialogBuilder(CustomcolorsActivity.this);
					    di.setTitle(mp.get((int)_position).get("mycolors").toString());
					di.setMessage(mp.get((int)_position).get("ColorName").toString());
					di.setBackground(vp);
					di.setNeutralButton("ok", (p, d) -> {
						
						          
						
									});
					di.show();
					
					
					
					
				}
			});
			imageview2.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					SketchwareUtil.CustomToast(getApplicationContext(), "copy Color : ".concat(mp.get((int)_position).get("mycolors").toString()), 0xFFF5F5F5, 16, Color.parseColor(mp.get((int)_position).get("mycolors").toString()), 10, SketchwareUtil.CENTER);
					((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mp.get((int)_position).get("mycolors").toString()));
				}
			});
		}
		
		@Override
		public int getItemCount() {
			return _data.size();
		}
		
		public class ViewHolder extends RecyclerView.ViewHolder {
			public ViewHolder(View v) {
				super(v);
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