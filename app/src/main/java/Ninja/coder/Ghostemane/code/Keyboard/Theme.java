package Ninja.coder.Ghostemane.code.Keyboard;

import android.app.Activity;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;
import androidx.appcompat.app.*;
import Ninja.coder.Ghostemane.code.R;

public class Theme extends AppCompatActivity {
	public static int[] ThumbId = new int[]{Integer.valueOf(R.mipmap.theme_1).intValue(), Integer.valueOf(R.mipmap.theme_2).intValue(), Integer.valueOf(R.mipmap.theme_3).intValue(), Integer.valueOf(R.mipmap.theme_4).intValue(), Integer.valueOf(R.mipmap.theme_5).intValue(), Integer.valueOf(R.mipmap.theme_6).intValue(), Integer.valueOf(R.mipmap.theme_7).intValue(), Integer.valueOf(R.mipmap.theme_8).intValue(), Integer.valueOf(R.mipmap.theme_9).intValue(), Integer.valueOf(R.mipmap.theme_10).intValue(),Integer.valueOf(R.mipmap.theme_11).intValue(),Integer.valueOf(R.mipmap.theme_12).intValue()};
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.theme_activity);
		GridView gridView = (GridView) findViewById(R.id.gridview);
		gridView.setAdapter(new GridAdapter(this, ThumbId));
		gridView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
				switch (position) {
					case 0:
					Theme.this.saveTheme("Theme", "1");
					Toast.makeText(Theme.this, "تم کیبورد تغییر کرد.", 0).show();
					return;
					case 1:
					Theme.this.saveTheme("Theme", "2");
					Toast.makeText(Theme.this, "تم کیبورد تغییر کرد.", 0).show();
					return;
					case 2:
					Theme.this.saveTheme("Theme", "3");
					Toast.makeText(Theme.this, "تم کیبورد تغییر کرد.", 0).show();
					return;
					case 3:
					Theme.this.saveTheme("Theme", "4");
					Toast.makeText(Theme.this, "تم کیبورد تغییر کرد.", 0).show();
					return;
					case 4:
					Theme.this.saveTheme("Theme", "5");
					Toast.makeText(Theme.this, "تم کیبورد تغییر کرد.", 0).show();
					return;
					case 5:
					Theme.this.saveTheme("Theme", "6");
					Toast.makeText(Theme.this, "تم کیبورد تغییر کرد.", 0).show();
					return;
					case 6:
					Theme.this.saveTheme("Theme", "7");
					Toast.makeText(Theme.this, "تم کیبورد تغییر کرد.", 0).show();
					return;
					case 7:
					Theme.this.saveTheme("Theme", "8");
					Toast.makeText(Theme.this, "تم کیبورد تغییر کرد.", 0).show();
					return;
					case 8:
					Theme.this.saveTheme("Theme", "9");
					Toast.makeText(Theme.this, "تم کیبورد تغییر کرد.", 0).show();
					return;
					case 9:
					Theme.this.saveTheme("Theme", "10");
					Toast.makeText(Theme.this, "تم کیبورد تغییر کرد.", 0).show();
					return;
					case 10:
					Theme.this.saveTheme("Theme", "11");
					Toast.makeText(Theme.this, "تم کیبورد تغییر کرد.", 0).show();
					return;
					case 11:
					Theme.this.saveTheme("Theme", "12");
					Toast.makeText(Theme.this, "تم کیبورد تغییر کرد.", 0).show();
					return;
					default:
					return;
				}
			}
		});
	}
	
	public void saveTheme(String str, String str2) {
		Editor edit = PreferenceManager.getDefaultSharedPreferences(this).edit();
		edit.putString(str, str2);
		edit.commit();
	}
	
	
}
