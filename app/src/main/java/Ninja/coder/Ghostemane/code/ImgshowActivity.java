package Ninja.coder.Ghostemane.code;

import android.Manifest;
import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.pm.PackageManager;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
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
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.OnAdapterChangeListener;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import androidx.webkit.*;
import arabware.file.*;
import com.allenliu.badgeview.*;
import com.android.tools.r8.*;
import com.bumptech.glide.*;
import com.caverock.androidsvg.*;
import com.github.angads25.filepicker.*;
import com.github.junrar.*;
import com.google.android.material.*;
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

public class ImgshowActivity extends AppCompatActivity {
	
	private double Token = 0;
	private String post = "";
	
	private ArrayList<HashMap<String, Object>> msp = new ArrayList<>();
	
	private PraramnetLayoutNinja linear2;
	private LinearLayout linear1;
	private ViewPager viewpager1;
	private TextView textview1;
	private ImageView imageview1;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.imgshow);
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
		linear2 = findViewById(R.id.linear2);
		linear1 = findViewById(R.id.linear1);
		viewpager1 = findViewById(R.id.viewpager1);
		textview1 = findViewById(R.id.textview1);
		imageview1 = findViewById(R.id.imageview1);
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				onBackPressed();
			}
		});
	}
	
	private void initializeLogic() {
		msp =  (ArrayList<HashMap<String, Object>>)getIntent().getSerializableExtra("img");
		viewpager1.setAdapter(new Viewpager1Adapter(msp));
		viewpager1.setCurrentItem((int)Double.parseDouble(getIntent().getStringExtra("pos")));
		Naitivae.init(this);
	}
	
	public void _imagePost(final ImageView _img, final double _post) {
		try{
			Glide.with(getApplicationContext())
			.load(msp.get((int)_post).get("path").toString())
			.transition(com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade((int)600))
			.transition(GenericTransitionOptions.with(R.anim.anim_text_action_popup_exit))
			.error(R.drawable.close)
			.thumbnail((float)0.1d)
			.diskCacheStrategy(com.bumptech.glide.load.engine.DiskCacheStrategy.ALL)
			.priority(Priority.HIGH)
			.into(_img);
		}catch(Exception e){
			 
		}
	}
	
	
	public void _gogo(final String _input, final ImageView _img, final TextView _tv) {
		try{
			SvgShow.GetFileSvg(_input,_img,this,_tv);
		}catch(Exception e){
			 
		}
	}
	
	public class Viewpager1Adapter extends PagerAdapter {
		
		Context _context;
		ArrayList<HashMap<String, Object>> _data;
		
		public Viewpager1Adapter(Context _ctx, ArrayList<HashMap<String, Object>> _arr) {
			_context = _ctx;
			_data = _arr;
		}
		
		public Viewpager1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_context = getApplicationContext();
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public boolean isViewFromObject(View _view, Object _object) {
			return _view == _object;
		}
		
		@Override
		public void destroyItem(ViewGroup _container, int _position, Object _object) {
			_container.removeView((View) _object);
		}
		
		@Override
		public int getItemPosition(Object _object) {
			return super.getItemPosition(_object);
		}
		
		@Override
		public CharSequence getPageTitle(int pos) {
			// Use the Activity Event (onTabLayoutNewTabAdded) in order to use this method
			return "page " + String.valueOf(pos);
		}
		
		@Override
		public Object instantiateItem(ViewGroup _container,  final int _position) {
			View _view = LayoutInflater.from(_context).inflate(R.layout.show, _container, false);
			
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			
			post = _data.get((int)_position).get("path").toString();
			if (FileUtil.isDirectory(_data.get((int)_position).get("path").toString())) {
				
			}
			else {
				if (_data.get((int)_position).get("path").toString().endsWith(".png")) {
					_imagePost(imageview1, _position);
				}
				else {
					if (_data.get((int)_position).get("path").toString().endsWith(".jpg")) {
						_imagePost(imageview1, _position);
					}
					else {
						if (_data.get((int)_position).get("path").toString().endsWith(".jpeg")) {
							_imagePost(imageview1, _position);
						}
						else {
							if (_data.get((int)_position).get("path").toString().endsWith(".svg")) {
								try{
									_gogo(_data.get((int)_position).get("path").toString(), imageview1, textview1);
								}catch(Exception e){
									imageview1.setImageResource(R.drawable.close);
								}
							}
							else {
								if (_data.get((int)_position).get("path").toString().endsWith(".tiff") || _data.get((int)_position).get("path").toString().endsWith(".tif")) {
									try{
										Bitmap bitmap = org.beyka.tiffbitmapfactory.TiffBitmapFactory.decodePath(_data.get((int)_position).get("path").toString());
										final GradientDrawable gradientDrawable = new GradientDrawable();
												gradientDrawable.setColor(0xFF1F1B1C);
												gradientDrawable.setStroke(1,ColorStateList.valueOf(Color.parseColor("#FFFFB49D")));
												gradientDrawable.setCornerRadius(20);
												Glide.with(getApplicationContext())
														.load(bitmap)
														.placeholder(gradientDrawable)
														.error(gradientDrawable)
														.into(imageview1);
										
									}catch(Exception e){
										imageview1.setImageResource(R.drawable.close);
									}
								}
								else {
									if (_data.get((int)_position).get("path").toString().endsWith(".webp")) {
										_imagePost(imageview1, _position);
									}
									else {
										if (_data.get((int)_position).get("path").toString().endsWith(".bmp")) {
											_imagePost(imageview1, _position);
										}
										else {
											if (_data.get((int)_position).get("path").toString().endsWith(".gif")) {
												_imagePost(imageview1, _position);
											}
											else {
												imageview1.setImageResource(R.drawable.keyboardlisnertalluserpost_3);
											}
										}
									}
								}
							}
						}
					}
				}
			}
			
			_container.addView(_view);
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