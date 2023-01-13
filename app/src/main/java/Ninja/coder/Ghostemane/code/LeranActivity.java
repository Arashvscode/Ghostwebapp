package Ninja.coder.Ghostemane.code;

import android.Manifest;
import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
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

public class LeranActivity extends AppCompatActivity {
	
	private ArrayList<HashMap<String, Object>> mmap = new ArrayList<>();
	
	private LinearLayout main;
	private LinearLayout linear2;
	private ListView mlistview;
	private TextView textview1;
	private ImageView imageview1;
	
	private ProgressDialog pv;
	private Intent intent = new Intent();
	private Intent mjava = new Intent();
	private Intent mandroid = new Intent();
	private Intent mcss = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.leran);
		initialize(_savedInstanceState);
		
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1000);
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
		main = findViewById(R.id.main);
		linear2 = findViewById(R.id.linear2);
		mlistview = findViewById(R.id.mlistview);
		textview1 = findViewById(R.id.textview1);
		imageview1 = findViewById(R.id.imageview1);
		
		mlistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (_position == 0) {
					mjava.setClass(getApplicationContext(), LeranpdfActivity.class);
					mjava.putExtra("java", "/sdcard/GhostwebIde/.lp/finaljavabook.pdf");
					startActivity(mjava);
				}
				if (_position == 1) {
					mandroid.setClass(getApplicationContext(), LeranpdfActivity.class);
					mandroid.putExtra("android", "/sdcard/GhostwebIde/.lp/Androidlearning.pdf");
					startActivity(mandroid);
				}
				if (_position == 2) {
					mcss.setClass(getApplicationContext(), LeranpdfActivity.class);
					mcss.putExtra("css", "/sdcard/GhostwebIde/.lp/css.pdf");
					startActivity(mcss);
				}
				if (_position == 3) {
					intent.setClass(getApplicationContext(), GouidhtmlActivity.class);
					startActivity(intent);
				}
			}
		});
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				onBackPressed();
			}
		});
	}
	
	private void initializeLogic() {
		  pv = new ProgressDialog(LeranActivity.this ,ProgressDialog.THEME_DEVICE_DEFAULT_DARK);
		///result code By Ninja coder.ir my love java
		
		
		GradientDrawable g = new GradientDrawable();
				g.setColor(0xFF1F1B1C);
				g.setCornerRadius(15);
				g.setStroke(1, 0xFFFDA893);
		pv.getWindow().setBackgroundDrawable(g);
		FileUtil.makeDir("/sdcard/GhostwebIde/.lp/");
		if (!(FileUtil.isExistFile("/sdcard/GhostwebIde/.lp/Androidlearning.pdf") || (FileUtil.isExistFile("/sdcard/GhostwebIde/.lp/css.pdf") || FileUtil.isExistFile("/sdcard/GhostwebIde/.lp/finaljavabook.pdf")))) {
			new AsyncTask<String, String, String>() {
				@Override
				protected void onPreExecute() {
					pv.setTitle("در حال نصب");
					pv.setMessage("صبر کنید....");
					pv.show();
				}
				@Override
				protected String doInBackground(String... params) {
					String _param = params[0];
					
					AssetsSoft assetsSoft = new AssetsSoft();
							assetsSoft.unzipFromAssets(LeranActivity.this,"le.zip","/sdcard/GhostwebIde/.lp/");
					return "";
				}
				@Override
				protected void onPostExecute(String _result) {
					pv.setMessage("انجام شد");
					pv.dismiss();
				}
			}.execute("");
		}
		for (int mmm = 0; mmm < (int)(4); mmm++) {
			{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put("p", "");
				mmap.add(_item);
			}
			
		}
		mlistview.setAdapter(new MlistviewAdapter(mmap));
		((BaseAdapter)mlistview.getAdapter()).notifyDataSetChanged();
	}
	
	public class MlistviewAdapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public MlistviewAdapter(ArrayList<HashMap<String, Object>> _arr) {
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
				_view = _inflater.inflate(R.layout.helper, null);
			}
			
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			
			if (_position == 0) {
				textview1.setText("دوره حرفه ای جاوا");
				imageview1.setImageResource(R.drawable.alcs_2);
			}
			if (_position == 1) {
				imageview1.setImageResource(R.drawable.ale);
				textview1.setText("دوره حرفه ای متخصص اندروید شو");
			}
			if (_position == 2) {
				imageview1.setImageResource(R.drawable.alcs_1);
				textview1.setText("دوره تخصصی css3 ");
			}
			if (_position == 3) {
				imageview1.setImageResource(R.drawable.alht);
				textview1.setText("دوره تخصصی html5 ");
			}
			
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