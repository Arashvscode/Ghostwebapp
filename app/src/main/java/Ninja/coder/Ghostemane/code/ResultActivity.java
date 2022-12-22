package Ninja.coder.Ghostemane.code;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
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
import org.antlr.v4.runtime.*;
import org.benf.cfr.reader.*;
import org.beyka.tiffbitmapfactory.*;
import org.json.*;
import storage.sdcard.*;
import xyz.doikki.videoplayer.*;
import xyz.doikki.videoplayer.exo.*;
import xyz.doikki.videoplayer.ijk.*;

public class ResultActivity extends AppCompatActivity {
	
	private ArrayList<HashMap<String, Object>> cdMapResu = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private ListView listview1;
	private TextView textview1;
	private ImageView imageview1;
	
	private Intent i1 = new Intent();
	private Intent i2 = new Intent();
	private Intent i3 = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.result);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		listview1 = findViewById(R.id.listview1);
		textview1 = findViewById(R.id.textview1);
		imageview1 = findViewById(R.id.imageview1);
		
		listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (_position == 0) {
					i3.setClass(getApplicationContext(), Ninja.coder.Ghostemane.code.Keyboard.Theme.class);
					startActivity(i3);
				}
				if (_position == 1) {
					i1.setClass(getApplicationContext(), Ninja.coder.Ghostemane.code.Keyboard.Background.class);
					startActivity(i1);
				}
				if (_position == 2) {
					///result code By Ninja coder.ir my love java
					
					
					GradientDrawable b = new GradientDrawable();
							b.setColor(0xFF1F1B1C);
							b.setCornerRadius(25);
							b.setStroke(1, 0xFFFDA893);
					var di = new com.google.android.material.dialog.MaterialAlertDialogBuilder(ResultActivity.this);
					    di.setTitle("ذخیره و بازیابی");
					di.setMessage("با انتخاب یکی از گزینه ها ذخیره یا ریست کردن داده های کیبورد برنامه از اول اجرا میشود ولی همچنان تنظیمات برنامه ثابت است فقط تنظیمات کیبورد قابل تغییر است");
					di.setNeutralButton("ذخیره", (p, d) -> {
						
						         i2.setClass(getApplicationContext(), Ninja.coder.Ghostemane.code.Keyboard.Save.class);
						startActivity(i2);
						
									});
					di.setPositiveButton("ریست", (p1, d2) -> {
						
						         i2.setClass(getApplicationContext(), Ninja.coder.Ghostemane.code.Keyboard.Reset.class);
						startActivity(i2);
						
									});
					di.setBackground(b);
					di.show();
					
					
					
					
				}
				if (_position == 3) {
					i3.setClass(getApplicationContext(), Ninja.coder.Ghostemane.code.Keyboard.Setting.class);
					startActivity(i3);
				}
			}
		});
	}
	
	private void initializeLogic() {
		for (int v = 0; v < (int)(4); v++) {
			{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put("p", "");
				cdMapResu.add(_item);
			}
			
		}
		listview1.setAdapter(new Listview1Adapter(cdMapResu));
		((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
	}
	
	public class Listview1Adapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Listview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
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
				_view = _inflater.inflate(R.layout.anifie, null);
			}
			
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			
			imageview1.setColorFilter(0xFFFDA893, PorterDuff.Mode.MULTIPLY);
			if (_position == 0) {
				imageview1.setImageResource(R.drawable.keyboardlisnertalluserpost_2);
				textview1.setText("تغییر تم");
			}
			if (_position == 1) {
				textview1.setText("پس زمینه شخصی");
				imageview1.setImageResource(R.drawable.keyboardlisnertalluserpost_3);
			}
			if (_position == 2) {
				imageview1.setImageResource(R.drawable.keyboardlisnertalluserpost_1);
				textview1.setText("ذخیره و بازیابی");
			}
			if (_position == 3) {
				imageview1.setImageResource(R.drawable.keyboardlisnertalluserpost_4);
				textview1.setText("بیشتر");
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