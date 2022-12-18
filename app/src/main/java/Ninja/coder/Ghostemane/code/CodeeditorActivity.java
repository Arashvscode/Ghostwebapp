package Ninja.coder.Ghostemane.code;

import android.Manifest;
import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
import android.content.Context;
import android.content.DialogInterface;
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
import android.os.Vibrator;
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
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
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
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lxj.xpopup.*;
import com.mukesh.*;
import com.neo.highlight.*;
import com.tapadoo.alerter.*;
import com.zip4j.*;
import io.github.rosemoe.sora.langs.base.*;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.antlr.v4.runtime.*;
import org.benf.cfr.reader.*;
import org.beyka.tiffbitmapfactory.*;
import org.json.*;
import storage.sdcard.*;
import xyz.doikki.videoplayer.*;
import xyz.doikki.videoplayer.exo.*;
import xyz.doikki.videoplayer.ijk.*;
import io.github.rosemoe.sora.widget.CodeEditor;
import io.github.rosemoe.sora.widget.*;
import io.github.rosemoe.sora.widget.EditorColorScheme;
import io.github.rosemoe.sora.langs.html.*;
import io.github.rosemoe.sora.langs.html.HTMLLanguage;
import io.github.rosemoe.sora.langs.universal.*;
import io.github.rosemoe.sora.langs.desc.CssDescription;
import io.github.rosemoe.sora.langs.desc.JavaScriptDescription;
import io.github.rosemoe.sora.widget.schemes.HTMLScheme;
import io.github.rosemoe.sora.widget.schemes.SchemeDarcula;
import io.github.rosemoe.sora.widget.schemes.SchemeEclipse;
import io.github.rosemoe.sora.widget.schemes.SchemeGitHub;
import io.github.rosemoe.sora.widget.schemes.SchemeNotepadXX;
import io.github.rosemoe.sora.widget.schemes.SchemeVS2019;
import com.flask.colorpicker.builder.ColorPickerDialogBuilder;
import com.flask.colorpicker.OnColorSelectedListener;
import com.flask.colorpicker.builder.ColorPickerClickListener;
import io.github.rosemoe.sora.langs.python.*;
import io.github.rosemoe.sora.langs.python.PythonLanguage;
import Ninjacoder.CodeFormater.HtmlCodeFormat.HtmlFormatter;
import io.github.rosemoe.sora.langs.xml.*;
import io.github.rosemoe.sora.langs.xml.XMLLanguage;
import com.flask.colorpicker.*;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import android.content.ClipData;
import android.content.ClipboardManager;
import Ninja.coder.Ghostemane.code.EditorSearch.CodeEditorSearch;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.progressindicator.CircularProgressIndicator;

public class CodeeditorActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private ExtendedFloatingActionButton _fab;
	private String savetojson = "";
	private String currentWord = "";
	private HashMap<String, Object> hsi = new HashMap<>();
	private HashMap<String, Object> imap = new HashMap<>();
	private double numberDoube = 0;
	private boolean errorsArePresent = false;
	private String input = "";
	private boolean pas = false;
	private double n = 0;
	private String pos = "";
	
	private ArrayList<HashMap<String, Object>> dexter = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> tabs_listmap = new ArrayList<>();
	private ArrayList<String> indifier = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> tags = new ArrayList<>();
	
	private LinearLayout Mainlinear;
	private LinearLayout multytab;
	private FrameLayout FrameLayout01;
	private LinearLayout panelSattinges;
	private LinearLayout showPanelSearch;
	private LinearLayout newLayoutSymbolBar;
	private LinearLayout CustomToolbar;
	private ProgressBar progressbar1;
	private RecyclerView recyclerview1;
	private LinearLayout stopIntarsenl;
	private LinearLayout fileinfo;
	private LinearLayout backgroundPressBack;
	private LinearLayout linear1;
	private LinearLayout linear2;
	private TextView tvtitle;
	private TextView typeVl;
	private TextView themenotfound;
	private ImageView imageview1;
	private ImageView imageRagexHtmlFormat;
	private ImageView amber;
	private CodeEditor editor;
	private FrameLayout FrameLayout02;
	private ProgressBar proanjctor;
	private TextView textview14;
	private TextView bar1;
	private TextView bar2;
	private TextView textview3;
	private TextView textview4;
	private TextView textview5;
	private TextView textview6;
	private TextView textview11;
	private TextView textview12;
	private TextView textview13;
	private TextView textview8;
	private TextView textview7;
	private TextView textview9;
	private TextView textview10;
	
	private Intent intentaddFile = new Intent();
	private Intent htmlrus = new Intent();
	private SharedPreferences word;
	private SharedPreferences line;
	private SharedPreferences shp;
	private SharedPreferences qo;
	private RequestNetwork constreust;
	private RequestNetwork.RequestListener _constreust_request_listener;
	private AlertDialog.Builder myDialog;
	private Intent res = new Intent();
	private SharedPreferences at;
	private TimerTask ask;
	private AlertDialog.Builder di;
	private Intent jsonview = new Intent();
	private Intent getmd = new Intent();
	private Vibrator vb;
	private SharedPreferences getvb;
	private Intent further = new Intent();
	private SharedPreferences re;
	private SharedPreferences war;
	private SharedPreferences kos;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.codeeditor);
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
		_fab = findViewById(R.id._fab);
		
		Mainlinear = findViewById(R.id.Mainlinear);
		multytab = findViewById(R.id.multytab);
		FrameLayout01 = findViewById(R.id.FrameLayout01);
		panelSattinges = findViewById(R.id.panelSattinges);
		showPanelSearch = findViewById(R.id.showPanelSearch);
		newLayoutSymbolBar = findViewById(R.id.newLayoutSymbolBar);
		CustomToolbar = findViewById(R.id.CustomToolbar);
		progressbar1 = findViewById(R.id.progressbar1);
		recyclerview1 = findViewById(R.id.recyclerview1);
		stopIntarsenl = findViewById(R.id.stopIntarsenl);
		fileinfo = findViewById(R.id.fileinfo);
		backgroundPressBack = findViewById(R.id.backgroundPressBack);
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		tvtitle = findViewById(R.id.tvtitle);
		typeVl = findViewById(R.id.typeVl);
		themenotfound = findViewById(R.id.themenotfound);
		imageview1 = findViewById(R.id.imageview1);
		imageRagexHtmlFormat = findViewById(R.id.imageRagexHtmlFormat);
		amber = findViewById(R.id.amber);
		editor = findViewById(R.id.editor);
		FrameLayout02 = findViewById(R.id.FrameLayout02);
		proanjctor = findViewById(R.id.proanjctor);
		textview14 = findViewById(R.id.textview14);
		bar1 = findViewById(R.id.bar1);
		bar2 = findViewById(R.id.bar2);
		textview3 = findViewById(R.id.textview3);
		textview4 = findViewById(R.id.textview4);
		textview5 = findViewById(R.id.textview5);
		textview6 = findViewById(R.id.textview6);
		textview11 = findViewById(R.id.textview11);
		textview12 = findViewById(R.id.textview12);
		textview13 = findViewById(R.id.textview13);
		textview8 = findViewById(R.id.textview8);
		textview7 = findViewById(R.id.textview7);
		textview9 = findViewById(R.id.textview9);
		textview10 = findViewById(R.id.textview10);
		word = getSharedPreferences("word", Activity.MODE_PRIVATE);
		line = getSharedPreferences("line", Activity.MODE_PRIVATE);
		shp = getSharedPreferences("shp", Activity.MODE_PRIVATE);
		qo = getSharedPreferences("qo", Activity.MODE_PRIVATE);
		constreust = new RequestNetwork(this);
		myDialog = new AlertDialog.Builder(this);
		at = getSharedPreferences("at", Activity.MODE_PRIVATE);
		di = new AlertDialog.Builder(this);
		vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		getvb = getSharedPreferences("getvb", Activity.MODE_PRIVATE);
		re = getSharedPreferences("re", Activity.MODE_PRIVATE);
		war = getSharedPreferences("war", Activity.MODE_PRIVATE);
		kos = getSharedPreferences("kos", Activity.MODE_PRIVATE);
		
		stopIntarsenl.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				new com.google.android.material.dialog.MaterialAlertDialogBuilder(CodeeditorActivity.this)
				    .setTitle("بستن")
				.setMessage("ایا میخواهید فعالیت را پایان دهید؟")
				.setPositiveButton("لغو", (p1, d2) -> {
					
					          
					
								})
				.setNeutralButton("بله", (p, d) -> {
					
					         finish();
					
								})
				.setCancelable(false)
				.show();
				
				
				
				
			}
		});
		
		fileinfo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				new com.google.android.material.dialog.MaterialAlertDialogBuilder(CodeeditorActivity.this)
				    .setTitle("file path")
				.setMessage("info file : ".concat(shp.getString("pos_path", "")))
				.setNeutralButton("ok", (p, d) -> {
					
					          
					
								})
				.show();
				
				
				
				
			}
		});
		
		backgroundPressBack.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				onBackPressed();
			}
		});
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_logcat();
			}
		});
		
		imageRagexHtmlFormat.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_datako();
			}
		});
		
		amber.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				further.setClass(getApplicationContext(), CustomcolorsActivity.class);
				further.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
				startActivity(further);
			}
		});
		
		textview14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_sysba("    ");
			}
		});
		
		bar1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_sysba(bar1.getText().toString());
			}
		});
		
		bar2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_sysba(bar2.getText().toString());
			}
		});
		
		textview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_sysba("{\n}");
			}
		});
		
		textview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_sysba(textview4.getText().toString());
			}
		});
		
		textview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_sysba("[ ]");
			}
		});
		
		textview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_sysba(textview6.getText().toString());
			}
		});
		
		textview11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_sysba("()");
			}
		});
		
		textview12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_sysba(textview12.getText().toString());
			}
		});
		
		textview13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_sysba(textview13.getText().toString());
			}
		});
		
		textview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_sysba(textview8.getText().toString());
			}
		});
		
		textview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_sysba(textview7.getText().toString());
			}
		});
		
		textview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_sysba(textview9.getText().toString());
			}
		});
		
		textview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_sysba(textview10.getText().toString());
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try{
							try{
						if (shp.contains("pos_path")) {
							if (!shp.getString("pos_path", "").equals("")) {
								FileUtil.writeFile(shp.getString("pos_path", ""), editor.getText().toString());
								SketchwareUtil.showMessage(getApplicationContext(), Uri.parse(shp.getString("pos_path", "")).getLastPathSegment().concat(" saved"));
							}
							else {
								
							}
						}
					}catch(Exception e){
						SketchwareUtil.showMessage(getApplicationContext(), e.toString());
					}
					if (shp.getString("pos_path", "").contains(".html")) {
						htmlrus.setClass(getApplicationContext(), HtmlrunerActivity.class);
						htmlrus.putExtra("run", shp.getString("pos_path", ""));
						startActivity(htmlrus);
					}
					else {
						if (shp.getString("pos_path", "").contains(".json")) {
							jsonview.setClass(getApplicationContext(), JsonviewerActivity.class);
							jsonview.putExtra("g", editor.getText().toString());
							startActivity(jsonview);
						}
						else {
							if (shp.getString("pos_path", "").contains(".js")) {
								intentaddFile.setClass(getApplicationContext(), JsrunerActivity.class);
								intentaddFile.putExtra("sendCode", editor.getText().toString().trim());
								startActivity(intentaddFile);
							}
							else {
								if (shp.getString("pos_path", "").contains(".sh")) {
									res.setClass(getApplicationContext(), ShellcodeActivity.class);
									res.putExtra("sh", editor.getText().toString().trim());
									startActivity(res);
								}
								else {
									if (shp.getString("pos_path", "").contains(".svg")) {
										htmlrus.setClass(getApplicationContext(), HtmlrunerActivity.class);
										htmlrus.putExtra("run", shp.getString("pos_path", ""));
										startActivity(htmlrus);
									}
									else {
										if (shp.getString("pos_path", "").contains(".md")) {
											getmd.setClass(getApplicationContext(), MdcodeviewActivity.class);
											getmd.putExtra("v", shp.getString("pos_path", ""));
											startActivity(getmd);
										}
										else {
											
										}
									}
								}
							}
						}
					}
				}catch(Exception ex){
							final AlertDialog.Builder malterDialog = new AlertDialog.Builder(CodeeditorActivity.this);
							StringBuffer sb = new StringBuffer(500); 
							StackTraceElement[] st =ex.getStackTrace(); 
							sb.append(ex.getClass().getName() + ": " +ex.getMessage() + "\n"); 
							for (int iii = 0; iii < st.length; iii++) { 
										sb.append("\t at ⟶" + st[iii].toString() + "\n"); 
							}
							
							final LinearLayout lin = new LinearLayout(getApplicationContext());
							
							lin.setPadding(8,8,8,8);
							
							final TextView txt = new TextView(getApplicationContext());
							
							txt.setPadding(8,8,8,8);
							
							txt.setTextIsSelectable(true);
							
							lin.addView(txt);
							
							txt.setText(sb.toString());
							
							
							{
										SpannableString spannableString = new SpannableString(txt.getText().toString());
										Matcher matcher = Pattern.compile("(^(.*)|(?<=:)\\d+)").matcher(txt.getText().toString());
										
										
										
										
										while (matcher.find()) {
													
													
													spannableString.setSpan(new ForegroundColorSpan(0xFFB71C1C), matcher.start(), matcher.end(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
													spannableString.setSpan(new StyleSpan(1), matcher.start(), matcher.end(), 33);
													
										}
										
										
										
										txt.setText(spannableString);
							}
							malterDialog.setView(lin);
							malterDialog.show();
				}
				
			}
		});
		
		_constreust_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
	}
	
	private void initializeLogic() {
		CrashHandler.INSTANCE.init(this);
		editor.setSelection((int)(int)editor.getCursor().getLeftColumn(), (int)editor.getCursor().getRightColumn());
		di = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		stopIntarsenl.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFF44336));
		fileinfo.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFEB3B));
		_textAim();
		_themeInstallLojic();
		imageRagexHtmlFormat.setVisibility(View.GONE);
		showPanelSearch.setVisibility(View.GONE);
		new AsyncTask<String, String, String>() {
			@Override
			protected void onPreExecute() {
				recyclerview1.setVisibility(View.GONE);
				editor.setVisibility(View.GONE);
				panelSattinges.setVisibility(View.GONE);
				progressbar1.setVisibility(View.VISIBLE);
			}
			@Override
			protected String doInBackground(String... params) {
				String _param = params[0];
				_poz();
				return "";
			}
			@Override
			protected void onPostExecute(String _result) {
				recyclerview1.setVisibility(View.VISIBLE);
				editor.setVisibility(View.VISIBLE);
				panelSattinges.setVisibility(View.VISIBLE);
				progressbar1.setVisibility(View.GONE);
			}
		}.execute("");
		
		_EditorSummery();
		imap = new HashMap<>();
		if (FileUtil.isExistFile("/storage/emulated/0/GhostWebIDE/theme/GhostThemeapp.ghost")) {
				try{
				imap = new Gson().fromJson(FileUtil.readFile("/storage/emulated/0/GhostWebIDE/theme/GhostThemeapp.ghost"), new TypeToken<HashMap<String, Object>>(){}.getType());
			}catch(Exception e){
				 
			}
		}
		else {
				try{
				java.io.InputStream inputstream1 = getAssets().open("GhostThemeapp.ghost");
				imap = new Gson().fromJson(SketchwareUtil.copyFromInputStream(inputstream1), new TypeToken<HashMap<String, Object>>(){}.getType());
			}catch(Exception e){
				SketchwareUtil.showMessage(getApplicationContext(), e.toString());
			}
		}
		getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE|WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
		_coderuner();
		//SymbolInputView inputView = findViewById(R.id.sysbar);
		
		//inputView.bindEditor(editor);
		//inputView.setTextColor(Color.parseColor(imap.get("SyombolBarTextColor").toString()));
		///inputView.setTextColor(Color.RED);
		//inputView.addSymbols(new String[]{"->", "{", "}", "(", ")", ",", "|","=","#","!","&","/","%","`","_",";",".", "×", "<",">","\"", "?", "+", "-", "*", "/","<-"},
		//new String[]{"\t", "{}", "}", "(", ")", ",", ".", ";", "|","\"", "?", "+", "-", "*", "/"});
		
		editor.setLineNumberAlign(Paint.Align.CENTER);
		
		_managerpanel(panelSattinges);
		themenotfound.setVisibility(View.GONE);
		if (imap.containsKey("BackgroundColorLinear")) {
			if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) { 
					   Window Hsi = this.getWindow();
				 Hsi.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				 Hsi.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
				
					   Hsi.setStatusBarColor(Color.parseColor(imap.get("BackgroundColorLinear").toString())); Hsi.setNavigationBarColor(Color.parseColor(imap.get("BackgroundColorLinear").toString()));
			}
		}
		else {
			if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) { 
					   Window Hsi = this.getWindow();
				 Hsi.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				 Hsi.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
				
					   Hsi.setStatusBarColor(Color.parseColor("#ff02102c")); Hsi.setNavigationBarColor(Color.parseColor("#ff02102c"));
			}
			_dialogError();
		}
		_sttingpp();
		editor.setTypefaceText(Typeface.createFromAsset(getAssets(), "GhostFont.ttf"));
		editor.setTypefaceLineNumber(Typeface.createFromAsset(getAssets(), "GhostFont.ttf"));
		editor.getColorScheme().setColor(EditorColorScheme.MATCHED_TEXT_BACKGROUND, Color.parseColor("#75800F31"));
		if (imap.containsKey("ToolbarColor")) {
			CustomToolbar.setBackgroundColor(Color.parseColor(imap.get("ToolbarColor").toString()));
		}
		else {
			CustomToolbar.setBackgroundColor(Color.parseColor("#ff030b34"));
			_dialogError();
		}
		_fab.shrink();
		///all parament color html 
		if (imap.containsKey("OPERATOR")) {
			editor.getColorScheme().setColor(EditorColorScheme.OPERATOR, Color.parseColor(imap.get("OPERATOR").toString()));
		}
		else {
			editor.getColorScheme().setColor(EditorColorScheme.OPERATOR, Color.parseColor("#ffa1aaff"));
			_dialogError();
		}
		if (imap.containsKey("BLOCK_LINE")) {
			editor.getColorScheme().setColor(EditorColorScheme.BLOCK_LINE, Color.parseColor(imap.get("BLOCK_LINE").toString()));
		}
		else {
			editor.getColorScheme().setColor(EditorColorScheme.BLOCK_LINE, Color.parseColor("#ffaea2ff"));
			_dialogError();
		}
		if (imap.containsKey("BLOCK_LINE_CURRENT")) {
			editor.getColorScheme().setColor(EditorColorScheme.BLOCK_LINE_CURRENT, Color.parseColor(imap.get("BLOCK_LINE_CURRENT").toString()));
		}
		else {
			editor.getColorScheme().setColor(EditorColorScheme.BLOCK_LINE_CURRENT, Color.parseColor("#ffb9eeff"));
			_dialogError();
		}
		if (imap.containsKey("NON_PRINTABLE_CHAR")) {
			editor.getColorScheme().setColor(EditorColorScheme.NON_PRINTABLE_CHAR, Color.parseColor(imap.get("NON_PRINTABLE_CHAR").toString()));
		}
		else {
			editor.getColorScheme().setColor(EditorColorScheme.NON_PRINTABLE_CHAR, Color.parseColor("#ffb9ffcb"));
			_dialogError();
		}
		if (imap.containsKey("CURRENT_LINE")) {
			editor.getColorScheme().setColor(EditorColorScheme.CURRENT_LINE, Color.parseColor(imap.get("CURRENT_LINE").toString()));
		}
		else {
			editor.getColorScheme().setColor(EditorColorScheme.CURRENT_LINE, Color.parseColor("#20171717"));
			_dialogError();
		}
		if (imap.containsKey("SELECTION_INSERT")) {
			editor.getColorScheme().setColor(EditorColorScheme.SELECTION_INSERT, Color.parseColor(imap.get("SELECTION_INSERT").toString()));
			editor.getColorScheme().setColor(EditorColorScheme.SELECTION_INSERT, Color.parseColor("#ffffffff"));
		}
		else {
			_dialogError();
		}
		if (imap.containsKey("SELECTION_HANDLE")) {
			editor.getColorScheme().setColor(EditorColorScheme.SELECTION_HANDLE, Color.parseColor(imap.get("SELECTION_HANDLE").toString()));
		}
		else {
			editor.getColorScheme().setColor(EditorColorScheme.SELECTION_HANDLE, Color.parseColor("#ffffffff"));
			_dialogError();
		}
		if (imap.containsKey("LINE_NUMBER")) {
			editor.getColorScheme().setColor(EditorColorScheme.LINE_NUMBER, Color.parseColor(imap.get("LINE_NUMBER").toString()));
		}
		else {
			editor.getColorScheme().setColor(EditorColorScheme.LINE_NUMBER, Color.parseColor("#ff748979"));
			_dialogError();
		}
		if (imap.containsKey("LINE_DIVIDER")) {
			editor.getColorScheme().setColor(EditorColorScheme.LINE_DIVIDER, Color.parseColor(imap.get("LINE_DIVIDER").toString()));
		}
		else {
			editor.getColorScheme().setColor(EditorColorScheme.LINE_DIVIDER, Color.parseColor("#ff91b68f"));
			_dialogError();
		}
		if (imap.containsKey("ATTRIBUTE_VALUE")) {
			editor.getColorScheme().setColor(EditorColorScheme.ATTRIBUTE_VALUE, Color.parseColor(imap.get("ATTRIBUTE_VALUE").toString()));
		}
		else {
			editor.getColorScheme().setColor(EditorColorScheme.ATTRIBUTE_VALUE, Color.parseColor("#ffffdcb9"));
			_dialogError();
		}
		if (imap.containsKey("ATTRIBUTE_NAME")) {
			editor.getColorScheme().setColor(EditorColorScheme.ATTRIBUTE_NAME, Color.parseColor(imap.get("ATTRIBUTE_NAME").toString()));
		}
		else {
			editor.getColorScheme().setColor(EditorColorScheme.ATTRIBUTE_NAME, Color.parseColor("#FF1B4AD7"));
			_dialogError();
		}
		if (imap.containsKey("HTML_TAG")) {
			editor.getColorScheme().setColor(EditorColorScheme.HTML_TAG, Color.parseColor(imap.get("HTML_TAG").toString()));
		}
		else {
			editor.getColorScheme().setColor(EditorColorScheme.HTML_TAG, Color.parseColor("#ffffa1d9"));
			_dialogError();
		}
		if (imap.containsKey("TEXT_NORMAL")) {
			editor.getColorScheme().setColor(EditorColorScheme.TEXT_NORMAL, Color.parseColor(imap.get("TEXT_NORMAL").toString()));
		}
		else {
			editor.getColorScheme().setColor(EditorColorScheme.TEXT_NORMAL, Color.parseColor("#ffebffd7"));
			_dialogError();
		}
		if (imap.containsKey("IDENTIFIER_NAME")) {
			editor.getColorScheme().setColor(EditorColorScheme.IDENTIFIER_NAME, Color.parseColor(imap.get("IDENTIFIER_NAME").toString()));
		}
		else {
			editor.getColorScheme().setColor(EditorColorScheme.IDENTIFIER_NAME, Color.parseColor("#626262"));
			_dialogError();
		}
		if (imap.containsKey("COMMENT")) {
			editor.getColorScheme().setColor(EditorColorScheme.COMMENT, Color.parseColor(imap.get("COMMENT").toString()));
		}
		else {
			editor.getColorScheme().setColor(EditorColorScheme.COMMENT, Color.parseColor("#fff0be4b"));
			_dialogError();
		}
		//// for css and other....
		if (imap.containsKey("KEYWORD")) {
			editor.getColorScheme().setColor(EditorColorScheme.KEYWORD, Color.parseColor(imap.get("KEYWORD").toString()));
		}
		else {
			editor.getColorScheme().setColor(EditorColorScheme.KEYWORD, Color.parseColor("#ffffa1a1"));
			_dialogError();
		}
		if (imap.containsKey("print")) {
			editor.getColorScheme().setColor(EditorColorScheme.print, Color.parseColor(imap.get("print").toString()));
		}
		else {
			editor.getColorScheme().setColor(EditorColorScheme.print, Color.parseColor("#ffb4a1ff"));
			_dialogError();
		}
		if (imap.containsKey("Ninja")) {
			editor.getColorScheme().setColor(EditorColorScheme.Ninja, Color.parseColor(imap.get("Ninja").toString()));
		}
		else {
			editor.getColorScheme().setColor(EditorColorScheme.Ninja, Color.parseColor("#ffffac94"));
			_dialogError();
		}
		if (imap.containsKey("LITERAL")) {
			editor.getColorScheme().setColor(EditorColorScheme.LITERAL, Color.parseColor(imap.get("LITERAL").toString()));
		}
		else {
			editor.getColorScheme().setColor(EditorColorScheme.LITERAL, Color.parseColor("#ffdea1ff"));
			_dialogError();
		}
		if (imap.containsKey("AUTO_COMP_PANEL_BG")) {
			editor.getColorScheme().setColor(EditorColorScheme.AUTO_COMP_PANEL_BG, Color.parseColor(imap.get("AUTO_COMP_PANEL_BG").toString()));
		}
		else {
			editor.getColorScheme().setColor(EditorColorScheme.AUTO_COMP_PANEL_BG, Color.parseColor("#ff000a1a"));
			_dialogError();
		}
		if (imap.containsKey("AUTO_COMP_PANEL_CORNER")) {
			editor.getColorScheme().setColor(EditorColorScheme.AUTO_COMP_PANEL_CORNER, Color.parseColor(imap.get("AUTO_COMP_PANEL_CORNER").toString()));
		}
		else {
			editor.getColorScheme().setColor(EditorColorScheme.AUTO_COMP_PANEL_CORNER, Color.parseColor("#ff94ffe7"));
			_dialogError();
		}
		if (imap.containsKey("LINE_NUMBER_BACKGROUND")) {
			editor.getColorScheme().setColor(EditorColorScheme.LINE_NUMBER_BACKGROUND, Color.parseColor(imap.get("LINE_NUMBER_BACKGROUND").toString()));
		}
		else {
			editor.getColorScheme().setColor(EditorColorScheme.LINE_NUMBER_BACKGROUND, Color.parseColor("#00FFFFFF"));
			_dialogError();
		}
		if (imap.containsKey("WHOLE_BACKGROUND")) {
			editor.getColorScheme().setColor(EditorColorScheme.WHOLE_BACKGROUND, Color.parseColor(imap.get("WHOLE_BACKGROUND").toString()));
		}
		else {
			editor.getColorScheme().setColor(EditorColorScheme.WHOLE_BACKGROUND, Color.parseColor("#02FFFFFF"));
			_dialogError();
		}
		if (imap.containsKey("BackgroundColorLinear")) {
			Mainlinear.setBackgroundColor(Color.parseColor(imap.get("BackgroundColorLinear").toString()));
		}
		else {
			Mainlinear.setBackgroundColor(Color.parseColor("#ff02102c"));
			_dialogError();
		}
		if (imap.containsKey("ToolbarTextColor")) {
			tvtitle.setTextColor(Color.parseColor(imap.get("ToolbarTextColor").toString()));
		}
		else {
			tvtitle.setTextColor(Color.parseColor("#ffbce1ff"));
			_dialogError();
		}
		if (imap.containsKey("ImageColor")) {
			backgroundPressBack.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)66, Color.parseColor(imap.get("ImageColor").toString())));
			amber.setImageTintList(new android.content.res.ColorStateList(new int[][] {{-android.R.attr.state_pressed},{android.R.attr.state_pressed}},new int[]{Color.parseColor(imap.get("ImageColor").toString()),Color.parseColor(imap.get("ImageColor").toString())}));
			imageRagexHtmlFormat.setColorFilter(Color.parseColor(imap.get("ImageColor").toString()), PorterDuff.Mode.MULTIPLY);
			imageview1.setColorFilter(Color.parseColor(imap.get("ImageColor").toString()), PorterDuff.Mode.MULTIPLY);
		}
		else {
			backgroundPressBack.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)66, Color.parseColor("#ff94e7ff")));
			amber.setImageTintList(new android.content.res.ColorStateList(new int[][] {{-android.R.attr.state_pressed},{android.R.attr.state_pressed}},new int[]{Color.parseColor("#ff94e7ff"),Color.parseColor("#ff94e7ff")}));
			imageRagexHtmlFormat.setColorFilter(Color.parseColor("#ff94e7ff"), PorterDuff.Mode.MULTIPLY);
			imageview1.setColorFilter(Color.parseColor("#ff94e7ff"), PorterDuff.Mode.MULTIPLY);
			_dialogError();
		}
		tvtitle.setText("GhostWeb IDE");
		if (imap.containsKey("FabBackgroundColorColor")) {
			_fab.setText("Run Code");
			_fab.setTextColor(0xFFF8B09A);
			_fab.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(imap.get("FabBackgroundColorColor").toString())));
			
		}
		else {
			_fab.setText("Run Code");
			_fab.setTextColor(0xFFF8B09A);
			_fab.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#ff000c2f")));
			
			_dialogError();
		}
		if (imap.containsKey("FabColorStroker") && imap.containsKey("FabImageColor")) {
			_fab.setStrokeColor(ColorStateList.valueOf(Color.parseColor(imap.get("FabColorStroker").toString())));
			_fab.setStrokeWidth(1);
			_fab.setIconTint(ColorStateList.valueOf(Color.parseColor(imap.get("FabImageColor").toString())));
		}
		else {
			_fab.setStrokeColor(ColorStateList.valueOf(Color.parseColor("#ffaebdff")));
			_fab.setStrokeWidth(1);
			_fab.setIconTint(ColorStateList.valueOf(Color.parseColor("#ffc9f2ff")));
			_dialogError();
		}
		_Animwork(_fab);
		proanjctor.setVisibility(View.GONE);
		_Anim01(editor);
		if (imap.containsKey("SyombolBarTextColor")) {
			bar1.setTextColor(Color.parseColor(imap.get("SyombolBarTextColor").toString()));
			bar2.setTextColor(Color.parseColor(imap.get("SyombolBarTextColor").toString()));
			textview3.setTextColor(Color.parseColor(imap.get("SyombolBarTextColor").toString()));
			textview4.setTextColor(Color.parseColor(imap.get("SyombolBarTextColor").toString()));
			textview5.setTextColor(Color.parseColor(imap.get("SyombolBarTextColor").toString()));
			textview6.setTextColor(Color.parseColor(imap.get("SyombolBarTextColor").toString()));
			textview7.setTextColor(Color.parseColor(imap.get("SyombolBarTextColor").toString()));
			textview8.setTextColor(Color.parseColor(imap.get("SyombolBarTextColor").toString()));
			textview9.setTextColor(Color.parseColor(imap.get("SyombolBarTextColor").toString()));
			textview10.setTextColor(Color.parseColor(imap.get("SyombolBarTextColor").toString()));
			textview11.setTextColor(Color.parseColor(imap.get("SyombolBarTextColor").toString()));
			textview12.setTextColor(Color.parseColor(imap.get("SyombolBarTextColor").toString()));
			textview13.setTextColor(Color.parseColor(imap.get("SyombolBarTextColor").toString()));
			textview14.setTextColor(Color.parseColor(imap.get("SyombolBarTextColor").toString()));
		}
		else {
			bar1.setTextColor(0xFF2196F3);
			bar2.setTextColor(0xFF2196F3);
			textview3.setTextColor(0xFF2196F3);
			textview4.setTextColor(0xFF2196F3);
			textview5.setTextColor(0xFF2196F3);
			textview6.setTextColor(0xFF2196F3);
			textview7.setTextColor(0xFF2196F3);
			textview8.setTextColor(0xFF2196F3);
			textview9.setTextColor(0xFF2196F3);
			textview10.setTextColor(0xFF2196F3);
			textview11.setTextColor(0xFF2196F3);
			textview12.setTextColor(0xFF2196F3);
			textview13.setTextColor(0xFF2196F3);
			textview14.setTextColor(0xFF2196F3);
			_dialogError();
		}
	}
	
	
	@Override
	public void onResume() {
		super.onResume();
		if (shp.contains("pos_path")) {
			if (!shp.getString("pos_path", "").equals("")) {
				_codeEditor(shp.getString("pos_path", ""));
			}
		}
	}
	
	@Override
	public void onStart() {
		super.onStart();
	}
	private void a(StringBuilder content, int indents) {
			for(int i = 0; i < indents; i++) {
					content.append('\t');
			}
	}
	
	private String format(final String input) {
			StringBuilder bilder = new StringBuilder();
			
			for (String line : editor.getText().toString().split("\n")) {
					String trims = (line + "X").trim();
					trims = trims.substring(0, trims.length() - 1);
					
					bilder.append(trims);
					bilder.append("\n");
			}
			String s = bilder.toString();
			
			try {
					final StringBuilder sb = new StringBuilder(4096);
					final char[] charArray = s.toCharArray();
					final int length = charArray.length;
					int i = 0;
					int n = 0;
					int n2 = 0;
					int n3 = 0;
					int n4 = 0;
					int n5 = 0;
					int n6 = 0;
				while (i < length) {
							final char c = charArray[i];
							int n10 = 0;
							int n11 = 0;
							Label_0094: {
									Label_0082: {
											if (n != 0) {
													if (c == '\n') {
															sb.append(c);
															a(sb, n4);
															n = 0;
													}
													else {
															sb.append(c);
													}
											}
											else if (n2 != 0) {
													if (c == '*') {
															final int n7 = i + 1;
															final char c2 = charArray[n7];
															if (c2 == '/') {
																	sb.append(c);
																	sb.append(c2);
																	n2 = 0;
																	i = n7;
																	break Label_0082;
															}
													}
													sb.append(c);
													if(c=='\n') 
							                         a(sb, n4);
											}
											else if (n3 != 0) {
													sb.append(c);
													n3 = 0;
											}
											else if (c == '\\') {
													sb.append(c);
													n3 = 1;
											}
											else if (n5 != 0) {
													if (c == '\'') {
															sb.append(c);
															n5 = 0;
													}
													else {
															sb.append(c);
													}
											}
											else if (n6 != 0) {
													if (c == '\"') {
															sb.append(c);
															n6 = 0;
													}
													else {
															sb.append(c);
													}
											}
											else {
													if (c == '/') {
															final int n8 = i + 1;
															final char c3 = charArray[n8];
															if (c3 == '/') {
																	sb.append(c);
																	sb.append(c3);
																	n = 1;
																	i = n8;
																	break Label_0082;
															}
															if (c3 == '*') {
																	sb.append(c);
																	sb.append(c3);
																	n2 = 1;
																	i = n8;
																	break Label_0082;
															}
													}
													if (c != '\n') {
															if (c == '\'') {
																	n5 = 1;
															}
															int n9;
															if (c == '\"') {
																	n9 = 1;
															}
															else {
																	n9 = n6;
															}
															if (c== '{') {
																	++n4;
															}
															n10 = n4;
															if (c == '}') {
																	n10 = --n4;
																	if (sb.charAt(sb.length() - 1) == '\t') {
																			sb.deleteCharAt(sb.length() - 1);
																			n10 = n4;
																	}
															}
															sb.append(c);
															n11 = n9;
															break Label_0094;
													}
													sb.append(c);
													a(sb, n4);
											}
									}
									final int n12 = n6;
									n10 = n4;
									n11 = n12;
							}
							++i;
							final int n13 = n10;
							n6 = n11;
							n4 = n13;
					}
					return sb.toString();
			} catch (Exception e) {
					return input;
			}
	}
	
	{
	}
	
	@Override
	public void onStop() {
		super.onStop();
		if (shp.contains("pos_path")) {
			if (!shp.getString("pos_path", "").equals("")) {
				_codeEditor(shp.getString("pos_path", ""));
			}
		}
	}
	public void _coderuner() {
		editor.setColorScheme(new io.github.rosemoe.sora.widget.EditorColorScheme());
		
		if (shp.getString("path", "").contains(".html")) {
			_fab.show();
		}
		else {
			if (shp.getString("path", "").contains(".py")) {
				_fab.hide();
			}
			else {
				if (shp.getString("path", "").contains(".js")) {
					_fab.show();
				}
				else {
					if (shp.getString("path", "").contains(".css")) {
						_fab.hide();
					}
					else {
						
					}
				}
			}
		}
	}
	
	
	public void _managerpanel(final View _view) {
		LayoutInflater hsi = LayoutInflater.from(CodeeditorActivity.this);
		LinearLayout mninjacoder = (LinearLayout) hsi.inflate(R.layout.managerpanel, null, false);
		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams( LinearLayout.LayoutParams.MATCH_PARENT,  LinearLayout.LayoutParams.WRAP_CONTENT);
		mninjacoder.setLayoutParams(params);
		  
		final LinearLayout bg = mninjacoder.findViewById(R.id.bg);
		final ImageView colorpicker = mninjacoder.findViewById(R.id.colorpicker);
		final ImageView undo = mninjacoder.findViewById(R.id.undo);
		final ImageView redo = mninjacoder.findViewById(R.id.redo);
		final com.allenliu.badgeview.BadgeView mycolor = mninjacoder.findViewById(R.id.mycolor);
		final ImageView romved = mninjacoder.findViewById(R.id.romved);
		final ImageView save = mninjacoder.findViewById(R.id.save);
		final ImageView pastme = mninjacoder.findViewById(R.id.pastme);
		final ImageView format = mninjacoder.findViewById(R.id.format);
		final ImageView search = mninjacoder.findViewById(R.id.search);
		final com.allenliu.badgeview.BadgeView colorAma = mninjacoder.findViewById(R.id.colorAma);
		final ImageView link = mninjacoder.findViewById(R.id.link);
		_Animwork(colorpicker);
		_Animwork(undo);
		_Animwork(redo);
		_Animwork(romved);
		_Animwork(save);
		_Animwork(pastme);
		_Animwork(format);
		_Animwork(search);
		_Animwork(link);
		if (imap.containsKey("LINE_DIVIDER")) {
			_Ripple_Drawable(colorpicker, imap.get("LINE_DIVIDER").toString());
			_Ripple_Drawable(undo, imap.get("LINE_DIVIDER").toString());
			_Ripple_Drawable(redo, imap.get("LINE_DIVIDER").toString());
			_Ripple_Drawable(romved, imap.get("LINE_DIVIDER").toString());
			_Ripple_Drawable(save, imap.get("LINE_DIVIDER").toString());
			_Ripple_Drawable(pastme, imap.get("LINE_DIVIDER").toString());
			_Ripple_Drawable(format, imap.get("LINE_DIVIDER").toString());
			_Ripple_Drawable(search, imap.get("LINE_DIVIDER").toString());
			_Ripple_Drawable(link, imap.get("LINE_DIVIDER").toString());
		}
		else {
			_Ripple_Drawable(colorpicker, "#ff91b68f");
			_Ripple_Drawable(undo, "#ff91b68f");
			_Ripple_Drawable(redo, "#ff91b68f");
			_Ripple_Drawable(romved, "#ff91b68f");
			_Ripple_Drawable(save, "#ff91b68f");
			_Ripple_Drawable(pastme, "#ff91b68f");
			_Ripple_Drawable(format, "#ff91b68f");
			_Ripple_Drawable(search, "#ff91b68f");
			_Ripple_Drawable(link, "#ff91b68f");
			_dialogError();
		}
		if (imap.containsKey("ImageColor")) {
			colorpicker.setColorFilter(Color.parseColor(imap.get("ImageColor").toString()), PorterDuff.Mode.MULTIPLY);
			undo.setColorFilter(Color.parseColor(imap.get("ImageColor").toString()), PorterDuff.Mode.MULTIPLY);
			redo.setColorFilter(Color.parseColor(imap.get("ImageColor").toString()), PorterDuff.Mode.MULTIPLY);
			romved.setColorFilter(Color.parseColor(imap.get("ImageColor").toString()), PorterDuff.Mode.MULTIPLY);
			save.setColorFilter(Color.parseColor(imap.get("ImageColor").toString()), PorterDuff.Mode.MULTIPLY);
			pastme.setColorFilter(Color.parseColor(imap.get("ImageColor").toString()), PorterDuff.Mode.MULTIPLY);
			format.setColorFilter(Color.parseColor(imap.get("ImageColor").toString()), PorterDuff.Mode.MULTIPLY);
			search.setColorFilter(Color.parseColor(imap.get("ImageColor").toString()), PorterDuff.Mode.MULTIPLY);
			link.setColorFilter(Color.parseColor(imap.get("ImageColor").toString()), PorterDuff.Mode.MULTIPLY);
		}
		else {
			colorpicker.setColorFilter(Color.parseColor("#ff94e7ff"), PorterDuff.Mode.MULTIPLY);
			undo.setColorFilter(Color.parseColor("#ff94e7ff"), PorterDuff.Mode.MULTIPLY);
			redo.setColorFilter(Color.parseColor("#ff94e7ff"), PorterDuff.Mode.MULTIPLY);
			romved.setColorFilter(Color.parseColor("#ff94e7ff"), PorterDuff.Mode.MULTIPLY);
			save.setColorFilter(Color.parseColor("#ff94e7ff"), PorterDuff.Mode.MULTIPLY);
			pastme.setColorFilter(Color.parseColor("#ff94e7ff"), PorterDuff.Mode.MULTIPLY);
			format.setColorFilter(Color.parseColor("#ff94e7ff"), PorterDuff.Mode.MULTIPLY);
			search.setColorFilter(Color.parseColor("#ff94e7ff"), PorterDuff.Mode.MULTIPLY);
			link.setColorFilter(Color.parseColor("#ff94e7ff"), PorterDuff.Mode.MULTIPLY);
			_dialogError();
		}
		mycolor.setBadgeBackground(Color.TRANSPARENT);
		mycolor.setTextSize((int)12);
		mycolor.setTextColor(0xFFFFFFFF);
		mycolor.setBadgeCount("0");
		colorpicker.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ColorPickerDialogBuilder
				.with(CodeeditorActivity.this)
				.setTitle("لطفا رنگ را انتخاب کنید")
				//.initialColor(getColor(R.color.Ninja))
				.wheelType(ColorPickerView.WHEEL_TYPE.FLOWER)
				.showColorPreview(true)
				.showColorEdit(true)
				.density(22)
				.showColorEdit(true)
				.setOnColorSelectedListener(new OnColorSelectedListener() {
						@Override
						public void onColorSelected(int selectedColor) {
								
						}
				})
				.setPositiveButton("انتخاب", new ColorPickerClickListener() {
						@Override
						public void onClick(DialogInterface dialog, int selectedColor, Integer[] allColors) {
								
								
								String rgs = Integer.toHexString(selectedColor);
								
								SketchwareUtil.CustomToast(getApplicationContext(), "رنگ کپی شد" + rgs, 0xFFFFFFFF, 15, 0xFF1F1B1C, 15, SketchwareUtil.CENTER);
								try {
										((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE))
										.setPrimaryClip(ClipData.newPlainText("clipboard",
										"#".concat(rgs).replace("#ff", "#")));
								} catch (Exception exception) {
										exception.printStackTrace();
										
								}
								
								editor.pasteText();
								//editor.setSelection(editor.getCursor().getRightLine(), editor.getCursor().getRightColumn());
								
								
								
								
						}
				})
				.setNegativeButton("لغو", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface dialog, int which) {
								
								SketchwareUtil.showMessage(getApplicationContext(), "لغو شد");
								
						}
				})
				
				
				.build()
				.show();
				
			}
		});
		undo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
				_postUndo();
			}
		});
		redo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_postRedo();
			}
		});
		romved.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				editor.setText("");
			}
		});
		editor.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try { 
					String textSpan = editor.getText().toString();
					final int selection = editor.getCursor().getLeft();
					final Pattern pattern = Pattern.compile("(#?)(\\w+)");
					final Matcher matcher = pattern.matcher(textSpan);
					int start = 0;
					int end = 0;
					
					String currentWordddddddd = "";
					try { 
							while (matcher.find()) {
									start = matcher.start();
									end = matcher.end();
									if (start <= selection && selection <= end) {
											currentWordddddddd = textSpan.substring(start, end).toString();
											currentWord = currentWordddddddd;
									}
							}
					} catch (Exception rr) { 
							rr.printStackTrace();
					}
					
					if (!currentWord.isEmpty()) {
						if (currentWord.contains("#")) {
							try {
								    
								mycolor.setBadgeBackground(Color.parseColor(currentWord));
								mycolor.setBadgeCount("#");
								mycolor.setTextSize((int)12);
								mycolor.setTextColor(0xFFFFFFFF);
							} catch (IllegalArgumentException iae) {
								    
							}
						}
						else {
							if (currentWord.toLowerCase().contains("0xff")) {
								try {
									    
									currentWord = currentWord.replace("0xff", "#");
									currentWord = currentWord.replace("0xFF", "#");
									mycolor.setBadgeCount("0xff");
									mycolor.setBadgeBackground(Color.parseColor(currentWord));
									mycolor.setTextColor(0xFFFFFFFF);
									mycolor.setTextSize((int)12);
								} catch (IllegalArgumentException iae) {
									    
								}
							}
							else {
								mycolor.setBadgeBackground(Color.TRANSPARENT);
							}
						}
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		save.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_fab.setVisibility(View.GONE);
				if (editor.getText().toString().isEmpty()) {
					ViewGroup v = (ViewGroup) ((ViewGroup) CodeeditorActivity.this .findViewById(android.R.id.content)).getChildAt(0);
					
					final var snackbar = com.google.android.material.snackbar.Snackbar.make(v, "", com.google.android.material.snackbar.Snackbar.LENGTH_SHORT);
					  
					                
					                View customSnackView = getLayoutInflater().inflate(R.layout.customsneakbar, null);
					  
					                
					                snackbar.getView().setBackgroundColor(Color.TRANSPARENT);
					  
					                
					                var snackbarLayout = (com.google.android.material.snackbar.Snackbar.SnackbarLayout) snackbar.getView();
					  
					                
					                snackbarLayout.setPadding(0, 0, 0, 0);
					  
					                
					                androidx.cardview.widget.CardView card = customSnackView.findViewById(R.id.card);           
					TextView tv1 = customSnackView.findViewById(R.id.tv1);           
					tv1.setText("خطا متن نمیتواند خالی باشد برای ذخیره شدن");
					card.setCardBackgroundColor(0xFF1F1B1C);
					card.setRadius((float)20);
					card.setCardElevation((float)3);
					_fab.setVisibility(View.VISIBLE);
					snackbar.dismiss();                    
					  
					                
					                snackbarLayout.addView(customSnackView, 0);
					                  
					                snackbar.show();
				}
				else {
					try{
						if (shp.contains("pos_path")) {
							if (!shp.getString("pos_path", "").equals("")) {
								FileUtil.writeFile(shp.getString("pos_path", ""), editor.getText().toString());
								ViewGroup v = (ViewGroup) ((ViewGroup) CodeeditorActivity.this .findViewById(android.R.id.content)).getChildAt(0);
								
								final var snackbar = com.google.android.material.snackbar.Snackbar.make(v, "", com.google.android.material.snackbar.Snackbar.LENGTH_SHORT);
								  
								                
								                View customSnackView = getLayoutInflater().inflate(R.layout.customsneakbar, null);
								  
								                
								                snackbar.getView().setBackgroundColor(Color.TRANSPARENT);
								  
								                
								                var snackbarLayout = (com.google.android.material.snackbar.Snackbar.SnackbarLayout) snackbar.getView();
								  
								                
								                snackbarLayout.setPadding(0, 0, 0, 0);
								  
								                
								                androidx.cardview.widget.CardView card = customSnackView.findViewById(R.id.card);           
								TextView tv1 = customSnackView.findViewById(R.id.tv1);           
								tv1.setText("Saved file ".concat(Uri.parse(shp.getString("pos_path", "")).getLastPathSegment()));
								card.setCardBackgroundColor(0xFF1F1B1C);
								card.setRadius((float)20);
								card.setCardElevation((float)3);
								_fab.setVisibility(View.VISIBLE);
								snackbar.dismiss();                    
								  
								                
								                snackbarLayout.addView(customSnackView, 0);
								                  
								                snackbar.show();
							}
							else {
								SketchwareUtil.showMessage(getApplicationContext(), "Error not File saved!");
							}
						}
					}catch(Exception e){
						SketchwareUtil.showMessage(getApplicationContext(), "Error not File saved!");
					}
				}
				if (imap.containsKey("ImageColor")) {
					save.setColorFilter(Color.parseColor(imap.get("ImageColor").toString()), PorterDuff.Mode.MULTIPLY);
				}
				else {
					save.setColorFilter(Color.parseColor("#ff94e7ff"), PorterDuff.Mode.MULTIPLY);
					_dialogError();
				}
			}
		});
		pastme.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				editor.pasteText();
				//editor.setSelection(editor.getCursor().getRightLine(), editor.getCursor().getRightColumn());
			}
		});
		format.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_codestyle(shp.getString("pos_path", ""));
				save.performClick();
			}
		});
		search.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_a();
			}
		});
		proanjctor.setVisibility(View.GONE);
		editor.setEventListener(new io.github.rosemoe.sora.interfaces.EditorEventListener() {
			
			   		public boolean onRequestFormat(CodeEditor editor, boolean b) {
										b = true;
										return b;
							}
						@Override
						public boolean onFormatFail(CodeEditor arg0, Throwable arg1) {
								 
								  
								
							    return false;
						}
			
						@Override
						public void onFormatSucceed(CodeEditor arg0) {
								
								 
						}
							@Override
							public void onNewTextSet(CodeEditor editor) {
						                 
							}
				
						@Override
						public void afterDelete(CodeEditor arg0, CharSequence arg1, int arg2, int arg3, int arg4, int arg5, CharSequence arg6) {
								
								 try{
					typeVl.setText(String.valueOf((long)(Double.parseDouble(arg1.toString()))));
				}catch(Exception e){
					typeVl.setText("");
				}
								
						}
			
						@Override
						public void afterInsert(CodeEditor arg0, CharSequence arg1, int arg2, int arg3, int arg4, int arg5, CharSequence arg6) {
								
								 try{
					typeVl.setText(String.valueOf((long)(Double.parseDouble(arg1.toString()))));
				}catch(Exception e){
					typeVl.setText("");
				}
								
						}
						@Override
						public void beforeReplace(CodeEditor arg0, CharSequence arg1) {
								
								 
						}
						@Override
						public void onSelectionChanged(CodeEditor arg0, io.github.rosemoe.sora.text.Cursor arg1) {
								
								ask = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								proanjctor.setVisibility(View.GONE);
							}
						});
					}
				};
				_timer.schedule(ask, (int)(500));
				_viber();
				proanjctor.setVisibility(View.VISIBLE);
				if (at.getString("v1", "").equals("true")) {
					ask = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									FileUtil.writeFile(shp.getString("pos_path", ""), editor.getText().toString());
								}
							});
						}
					};
					_timer.schedule(ask, (int)(1000));
					if (imap.containsKey("ImageColor")) {
						save.setColorFilter(Color.parseColor(imap.get("ImageColor").toString()), PorterDuff.Mode.MULTIPLY);
					}
					else {
						save.setColorFilter(Color.parseColor("#ff94e7ff"), PorterDuff.Mode.MULTIPLY);
						_dialogError();
					}
				}
				else {
					if (at.getString("v1", "").equals("false")) {
						proanjctor.setVisibility(View.VISIBLE);
						if (imap.containsKey("Ninja")) {
							save.setColorFilter(Color.parseColor(imap.get("Ninja").toString()), PorterDuff.Mode.MULTIPLY);
						}
						else {
							save.setColorFilter(Color.parseColor("#ffffac94"), PorterDuff.Mode.MULTIPLY);
							_dialogError();
						}
					}
					else {
						
					}
				}
								
								
						}
			
						@Override
						public boolean onRequestFormat(CodeEditor arg0) {
								
								 
							    return false;
						}
			
			
			
			
		});
		link.setOnClickListener((view) -> {
			
			       		 LinearLayout linearLayout = new LinearLayout(getApplicationContext());
					linearLayout.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.MATCH_PARENT,
							android.widget.LinearLayout.LayoutParams.MATCH_PARENT));
					linearLayout.setOrientation(LinearLayout.VERTICAL);
			
					
					linearLayout.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
					linearLayout.setPadding(10, 10, 10, 10);
				
					String[] arr = editor.getText().toString().split(" ");
					 StringBuilder build = new StringBuilder();
			
					 com.google.android.material.dialog.MaterialAlertDialogBuilder bui = new com.google.android.material.dialog.MaterialAlertDialogBuilder(
							CodeeditorActivity.this);
							GradientDrawable gradientDrawable = new GradientDrawable();
							gradientDrawable.setColor(Color.parseColor("#FF1F1B1C"));
							gradientDrawable.setStroke(1,Color.parseColor("#FFFFB49D"));
							gradientDrawable.setCornerRadius(15f);
							bui.setBackground(gradientDrawable);
							
			
					 TextView textView = new TextView(getApplicationContext());
					textView.setTextColor(Color.RED);
					textView.setTextIsSelectable(true);
			
					textView.setTextSize((float) 16);
					bui.setPositiveButton("Copy", (cc, dd) -> {
				
							 try {
									android.content.ClipboardManager clipboard = (android.content.ClipboardManager) getSystemService(
											CLIPBOARD_SERVICE);
									ClipData clip = ClipData.newPlainText("label", textView.getText().toString());
									Toast.makeText(getApplicationContext() ,"Copy Link",2).show();
									clipboard.setPrimaryClip(clip);
							} catch (Exception exception) {
									exception.printStackTrace();
							}
							
					});
			
					for (String one : arr) {
							if (one.contains("http") || one.contains("www")) {
					
									build.append(one).append("\n");
					
							}
				
					}
			
					textView.setText(build.toString().replace("\"", "").replace("\'", "").replace("(", "").replace(")", "")
							.replace("{", "").replace("}", "").replace("[", "").replace("]", ""));
			
					linearLayout.addView(textView);
			
					bui.setView(linearLayout);
			
					bui.show();
					textView.setGravity(Gravity.CENTER_VERTICAL | Gravity.LEFT);
					textView.setPadding(50, 50, 8, 10);
			
			
		});
		panelSattinges.addView(mninjacoder);
	}
	
	
	public void _sttingpp() {
		////get word app for my app lol 
		if (line.getString("getline", "").equals("true")) {
			editor.setPinLineNumber(true);
		}
		else {
			if (line.getString("getline", "").equals("false")) {
				editor.setPinLineNumber(false);
			}
			else {
				
			}
		}
	}
	
	
	public void _Ripple_Drawable(final View _view, final String _c) {
		android.content.res.ColorStateList clr = new android.content.res.ColorStateList(new int[][]{new int[]{}},new int[]{Color.parseColor(_c)}); android.graphics.drawable.RippleDrawable ripdr = new android.graphics.drawable.RippleDrawable(clr, null, null); _view.setBackground(ripdr);
	}
	
	
	public void _dialogCodeFormater() {
		///result code By Ninja coder.ir my love java
		
		
		GradientDrawable v = new GradientDrawable();
				v.setColor(0xFF1F1B1C);
				v.setCornerRadius(21);
				v.setStroke(1, 0xFFF8B09A);
		new com.google.android.material.dialog.MaterialAlertDialogBuilder(CodeeditorActivity.this)
		    .setTitle("Formating")
		.setMessage("Set Formating")
		.setNeutralButton("html", (p, d) -> {
			
			         try{
				editor.setText(HtmlFormatter.xmlFormat(editor.getText().toString()));
				editor.setSelection(editor.getCursor().getRightLine(), editor.getCursor().getRightColumn());
			}catch(Exception e){
				 
			}
			
						})
		.setPositiveButton("java", (p1, d2) -> {
			
			         try {
					
					editor.setText(format(editor.getText().toString()));
				    editor.setSelection(editor.getCursor().getRightLine(), editor.getCursor().getRightColumn());
			} catch (Exception ninjacoder) {
					SketchwareUtil.CustomToast(getApplicationContext(), "Error no road Code format", 0xFFFFFFFF, 19, 0xFF3F51B5, 25, SketchwareUtil.TOP);
			}
			
			
						})
		.setNegativeButton("json", (p3, d3) -> {
			
			         if (editor.getText().toString().isEmpty()) {
					Toast.makeText(getApplicationContext(), "Text is Empty !", Toast.LENGTH_LONG).show();
			} else {
					try {
							JsonFormater.install(editor.getText().toString(), editor, CodeeditorActivity.this);
							editor.setSelection(editor.getCursor().getRightLine(), editor.getCursor().getRightColumn());
					} catch (Exception r) {
							r.printStackTrace();
							
					}
			}
			
			
						})
		.setBackground(v)
		.show();
		
		
		
		
	}
	
	
	public void _codeEditor(final String _path) {
		_fab.shrink();
		if (_path.endsWith(".css")) {
			try {
				java.io.File f = new java.io.File(_path);
				
				
				java.io.BufferedReader buf = new java.io.BufferedReader(new java.io.FileReader(f));
				StringBuilder result=new StringBuilder();
				String line = null;
				while ((line = buf.readLine()) != null) { 
					result.append(line + "\n");
				}
				
				editor.setText(result.toString());
				
				
			} catch (java.io.IOException e) {
				finishAffinity();
			}
			editor.setEditorLanguage(new UniversalLanguage(new CssDescription()));
			_fab.hide();
		}
		else {
			if (_path.endsWith(".py")) {
				try {
					java.io.File f = new java.io.File(_path);
					
					
					java.io.BufferedReader buf = new java.io.BufferedReader(new java.io.FileReader(f));
					StringBuilder result=new StringBuilder();
					String line = null;
					while ((line = buf.readLine()) != null) { 
						result.append(line + "\n");
					}
					
					editor.setText(result.toString());
					
					
				} catch (java.io.IOException e) {
					finishAffinity();
				}
				editor.setEditorLanguage(new PythonLanguage()); 
				_fab.hide();
			}
			else {
				if (_path.endsWith(".cpp")) {
					try {
						java.io.File f = new java.io.File(_path);
						
						
						java.io.BufferedReader buf = new java.io.BufferedReader(new java.io.FileReader(f));
						StringBuilder result=new StringBuilder();
						String line = null;
						while ((line = buf.readLine()) != null) { 
							result.append(line + "\n");
						}
						
						editor.setText(result.toString());
						
						
					} catch (java.io.IOException e) {
						finishAffinity();
					}
					_fab.hide();
					
					editor.setEditorLanguage(new UniversalLanguage(new io.github.rosemoe.sora.langs.desc.CppDescription()));
				}
				else {
					if (_path.endsWith(".html")) {
						try {
							java.io.File f = new java.io.File(_path);
							
							
							java.io.BufferedReader buf = new java.io.BufferedReader(new java.io.FileReader(f));
							StringBuilder result=new StringBuilder();
							String line = null;
							while ((line = buf.readLine()) != null) { 
								result.append(line + "\n");
							}
							
							editor.setText(result.toString());
							
							
						} catch (java.io.IOException e) {
							finishAffinity();
						}
						_fab.setIconResource(R.drawable.play);
						editor.setEditorLanguage(new HTMLLanguage()); 
						_fab.show();
						imageRagexHtmlFormat.setVisibility(View.VISIBLE);
					}
					else {
						
						if (_path.endsWith(".js")) {
							try {
								java.io.File f = new java.io.File(_path);
								
								
								java.io.BufferedReader buf = new java.io.BufferedReader(new java.io.FileReader(f));
								StringBuilder result=new StringBuilder();
								String line = null;
								while ((line = buf.readLine()) != null) { 
									result.append(line + "\n");
								}
								
								editor.setText(result.toString());
								
								
							} catch (java.io.IOException e) {
								finishAffinity();
							}
							editor.setEditorLanguage(new UniversalLanguage(new io.github.rosemoe.sora.langs.desc.JavaScriptDescription()));
							_fab.show();
							_fab.setIconResource(R.drawable.play);
						}
						else {
							if (_path.endsWith(".scss")) {
								try {
									java.io.File f = new java.io.File(_path);
									
									
									java.io.BufferedReader buf = new java.io.BufferedReader(new java.io.FileReader(f));
									StringBuilder result=new StringBuilder();
									String line = null;
									while ((line = buf.readLine()) != null) { 
										result.append(line + "\n");
									}
									
									editor.setText(result.toString());
									
									
								} catch (java.io.IOException e) {
									finishAffinity();
								}
								editor.setEditorLanguage(new UniversalLanguage(new io.github.rosemoe.sora.langs.desc.SCSSDescription()));
								_fab.hide();
							}
							else {
								if (_path.endsWith(".c")) {
									try {
										java.io.File f = new java.io.File(_path);
										
										
										java.io.BufferedReader buf = new java.io.BufferedReader(new java.io.FileReader(f));
										StringBuilder result=new StringBuilder();
										String line = null;
										while ((line = buf.readLine()) != null) { 
											result.append(line + "\n");
										}
										
										editor.setText(result.toString());
										
										
									} catch (java.io.IOException e) {
										finishAffinity();
									}
									_fab.hide();
									
									
									editor.setEditorLanguage(new UniversalLanguage(new io.github.rosemoe.sora.langs.desc.CDescription()));
								}
								else {
									if (_path.endsWith(".json")) {
										try {
											java.io.File f = new java.io.File(_path);
											
											
											java.io.BufferedReader buf = new java.io.BufferedReader(new java.io.FileReader(f));
											StringBuilder result=new StringBuilder();
											String line = null;
											while ((line = buf.readLine()) != null) { 
												result.append(line + "\n");
											}
											
											editor.setText(result.toString());
											
											
										} catch (java.io.IOException e) {
											finishAffinity();
										}
										editor.setEditorLanguage(new UniversalLanguage(new io.github.rosemoe.sora.langs.desc.JSONDescription()));
										_fab.show();
										_fab.setIconResource(R.drawable.play);
									}
									else {
										if (_path.endsWith(".java")) {
											try {
												java.io.File f = new java.io.File(_path);
												
												
												java.io.BufferedReader buf = new java.io.BufferedReader(new java.io.FileReader(f));
												StringBuilder result=new StringBuilder();
												String line = null;
												while ((line = buf.readLine()) != null) { 
													result.append(line + "\n");
												}
												
												editor.setText(result.toString());
												
												
											} catch (java.io.IOException e) {
												finishAffinity();
											}
											_fab.hide();
											editor.setEditorLanguage(new io.github.rosemoe.sora.langs.java.JavaLanguage()); 
										}
										else {
											if (_path.endsWith(".cs")) {
												try {
													java.io.File f = new java.io.File(_path);
													
													
													java.io.BufferedReader buf = new java.io.BufferedReader(new java.io.FileReader(f));
													StringBuilder result=new StringBuilder();
													String line = null;
													while ((line = buf.readLine()) != null) { 
														result.append(line + "\n");
													}
													
													editor.setText(result.toString());
													
													
												} catch (java.io.IOException e) {
													finishAffinity();
												}
												_fab.hide();
												
												
												editor.setEditorLanguage(new UniversalLanguage(new io.github.rosemoe.sora.langs.desc.sharpDescription()));
											}
											else {
												if (_path.endsWith(".xml")) {
													try {
														java.io.File f = new java.io.File(_path);
														
														
														java.io.BufferedReader buf = new java.io.BufferedReader(new java.io.FileReader(f));
														StringBuilder result=new StringBuilder();
														String line = null;
														while ((line = buf.readLine()) != null) { 
															result.append(line + "\n");
														}
														
														editor.setText(result.toString());
														
														
													} catch (java.io.IOException e) {
														finishAffinity();
													}
													_fab.hide();
													XMLLanguage xmlLanguage=new XMLLanguage(); xmlLanguage.setSyntaxCheckEnable(true); editor.setEditorLanguage(xmlLanguage);
													imageRagexHtmlFormat.setVisibility(View.VISIBLE);
												}
												else {
													if (_path.endsWith(".ghost")) {
														try {
															java.io.File f = new java.io.File(_path);
															
															
															java.io.BufferedReader buf = new java.io.BufferedReader(new java.io.FileReader(f));
															StringBuilder result=new StringBuilder();
															String line = null;
															while ((line = buf.readLine()) != null) { 
																result.append(line + "\n");
															}
															
															editor.setText(result.toString());
															
															
														} catch (java.io.IOException e) {
															finishAffinity();
														}
														_fab.hide();
														
														
														editor.setEditorLanguage(new UniversalLanguage(new io.github.rosemoe.sora.langs.desc.JSONDescription()));
													}
													else {
														if (_path.endsWith(".ninja")) {
															try {
																java.io.File f = new java.io.File(_path);
																
																
																java.io.BufferedReader buf = new java.io.BufferedReader(new java.io.FileReader(f));
																StringBuilder result=new StringBuilder();
																String line = null;
																while ((line = buf.readLine()) != null) { 
																	result.append(line + "\n");
																}
																
																editor.setText(result.toString());
																
																
															} catch (java.io.IOException e) {
																finishAffinity();
															}
															_fab.hide();
															
															
															editor.setEditorLanguage(new UniversalLanguage(new io.github.rosemoe.sora.langs.desc.NINJADescription()));
														}
														else {
															if (_path.endsWith(".sh")) {
																try {
																	java.io.File f = new java.io.File(_path);
																	
																	
																	java.io.BufferedReader buf = new java.io.BufferedReader(new java.io.FileReader(f));
																	StringBuilder result=new StringBuilder();
																	String line = null;
																	while ((line = buf.readLine()) != null) { 
																		result.append(line + "\n");
																	}
																	
																	editor.setText(result.toString());
																	
																	
																} catch (java.io.IOException e) {
																	finishAffinity();
																}
																_fab.show();
																
																
																editor.setEditorLanguage(new UniversalLanguage(new io.github.rosemoe.sora.langs.desc.ShellDescription()));
																_fab.setIconResource(R.drawable.play);
															}
															else {
																if (_path.endsWith(".svg")) {
																	try {
																		java.io.File f = new java.io.File(_path);
																		
																		
																		java.io.BufferedReader buf = new java.io.BufferedReader(new java.io.FileReader(f));
																		StringBuilder result=new StringBuilder();
																		String line = null;
																		while ((line = buf.readLine()) != null) { 
																			result.append(line + "\n");
																		}
																		
																		editor.setText(result.toString());
																		
																		
																	} catch (java.io.IOException e) {
																		finishAffinity();
																	}
																	_fab.setIconResource(R.drawable.play);
																	editor.setEditorLanguage(new HTMLLanguage()); 
																	_fab.show();
																	imageRagexHtmlFormat.setVisibility(View.VISIBLE);
																}
																else {
																	if (_path.endsWith(".md")) {
																		try {
																			java.io.File f = new java.io.File(_path);
																			
																			
																			java.io.BufferedReader buf = new java.io.BufferedReader(new java.io.FileReader(f));
																			StringBuilder result=new StringBuilder();
																			String line = null;
																			while ((line = buf.readLine()) != null) { 
																				result.append(line + "\n");
																			}
																			
																			editor.setText(result.toString());
																			
																			
																		} catch (java.io.IOException e) {
																			finishAffinity();
																		}
																		_fab.setIconResource(R.drawable.play);
																		
																		_fab.show();
																	}
																	else {
																		if (_path.endsWith(".php")) {
																			try {
																				java.io.File f = new java.io.File(_path);
																				
																				
																				java.io.BufferedReader buf = new java.io.BufferedReader(new java.io.FileReader(f));
																				StringBuilder result=new StringBuilder();
																				String line = null;
																				while ((line = buf.readLine()) != null) { 
																					result.append(line + "\n");
																				}
																				
																				editor.setText(result.toString());
																				
																				
																			} catch (java.io.IOException e) {
																				finishAffinity();
																			}
																			
																			
																			editor.setEditorLanguage(new UniversalLanguage(new io.github.rosemoe.sora.langs.desc.PhpDescription()));
																			
																			_fab.hide();
																		}
																		else {
																			if (_path.endsWith(".go")) {
																				try {
																					java.io.File f = new java.io.File(_path);
																					
																					
																					java.io.BufferedReader buf = new java.io.BufferedReader(new java.io.FileReader(f));
																					StringBuilder result=new StringBuilder();
																					String line = null;
																					while ((line = buf.readLine()) != null) { 
																						result.append(line + "\n");
																					}
																					
																					editor.setText(result.toString());
																					
																					
																				} catch (java.io.IOException e) {
																					finishAffinity();
																				}
																				editor.setEditorLanguage(new UniversalLanguage(new io.github.rosemoe.sora.langs.desc.GoDescription()));
																				
																				_fab.hide();
																			}
																			else {
																				if (_path.endsWith(".txt")) {
																					try {
																						java.io.File f = new java.io.File(_path);
																						
																						
																						java.io.BufferedReader buf = new java.io.BufferedReader(new java.io.FileReader(f));
																						StringBuilder result=new StringBuilder();
																						String line = null;
																						while ((line = buf.readLine()) != null) { 
																							result.append(line + "\n");
																						}
																						
																						editor.setText(result.toString());
																						
																						
																					} catch (java.io.IOException e) {
																						finishAffinity();
																					}
																					
																					_fab.hide();
																				}
																				else {
																					if (_path.endsWith(".swift")) {
																						try {
																							java.io.File f = new java.io.File(_path);
																							
																							
																							java.io.BufferedReader buf = new java.io.BufferedReader(new java.io.FileReader(f));
																							StringBuilder result=new StringBuilder();
																							String line = null;
																							while ((line = buf.readLine()) != null) { 
																								result.append(line + "\n");
																							}
																							
																							editor.setText(result.toString());
																							
																							
																						} catch (java.io.IOException e) {
																							finishAffinity();
																						}
																						editor.setEditorLanguage(new UniversalLanguage(new io.github.rosemoe.sora.langs.desc.SwiftDescription()));
																						
																						_fab.hide();
																					}
																					else {
																						if (_path.endsWith(".rb") || _path.endsWith(".rbw")) {
																							try {
																								java.io.File f = new java.io.File(_path);
																								
																								
																								java.io.BufferedReader buf = new java.io.BufferedReader(new java.io.FileReader(f));
																								StringBuilder result=new StringBuilder();
																								String line = null;
																								while ((line = buf.readLine()) != null) { 
																									result.append(line + "\n");
																								}
																								
																								editor.setText(result.toString());
																								
																								
																							} catch (java.io.IOException e) {
																								finishAffinity();
																							}
																							editor.setEditorLanguage(new UniversalLanguage(new io.github.rosemoe.sora.langs.desc.RubyDescription()));
																							
																							_fab.hide();
																						}
																						else {
																							if (_path.endsWith(".dart")) {
																								try {
																									java.io.File f = new java.io.File(_path);
																									
																									
																									java.io.BufferedReader buf = new java.io.BufferedReader(new java.io.FileReader(f));
																									StringBuilder result=new StringBuilder();
																									String line = null;
																									while ((line = buf.readLine()) != null) { 
																										result.append(line + "\n");
																									}
																									
																									editor.setText(result.toString());
																									
																									
																								} catch (java.io.IOException e) {
																									finishAffinity();
																								}
																								editor.setEditorLanguage(new UniversalLanguage(new io.github.rosemoe.sora.langs.desc.DartDescription()));
																								
																								_fab.hide();
																							}
																							else {
																								if (_path.endsWith(".kt")) {
																									editor.setEditorLanguage(new UniversalLanguage(new io.github.rosemoe.sora.langs.desc.KotlinDescription()));
																									
																									_fab.hide();
																								}
																								else {
																									imageRagexHtmlFormat.setVisibility(View.GONE);
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	public void _close_tab(final double _position, final ArrayList<HashMap<String, Object>> _data) {
		if (FileUtil.isExistFile(_data.get((int)_position).get("path").toString())) {
			_data.remove((int)(_position));
			if (_data.isEmpty()) {
				editor.setText("");
				_data.clear();
				shp.edit().remove("pos_path").commit();
				shp.edit().remove("path").commit();
				n = 0;
				finish();
			}
			else {
				if ((_position == 0) && (_data.size() > 1)) {
					shp.edit().putString("pos_path", _data.get((int)_position + 1).get("path").toString()).commit();
					shp.edit().putString("positionTabs", String.valueOf((long)(_position + 1))).commit();
					_codeEditor(_data.get((int)_position + 1).get("path").toString());
				}
				else {
					if ((_position == 0) && (_data.size() == 1)) {
						shp.edit().putString("pos_path", _data.get((int)0).get("path").toString()).commit();
						_codeEditor(_data.get((int)0).get("path").toString());
						editor.setText("");
					}
					else {
						shp.edit().putString("pos_path", _data.get((int)_position - 1).get("path").toString()).commit();
						shp.edit().putString("positionTabs", String.valueOf((long)(_position - 1))).commit();
						_codeEditor(_data.get((int)_position - 1).get("path").toString());
					}
				}
			}
			shp.edit().putString("path", new Gson().toJson(_data)).commit();
		}
		else {
			_data.remove((int)(_position));
			if (_data.isEmpty()) {
				_data.clear();
				shp.edit().remove("pos_path").commit();
				shp.edit().remove("path").commit();
				finish();
			}
			else {
				if ((_position == 0) && (_data.size() > 1)) {
					shp.edit().putString("pos_path", _data.get((int)_position + 1).get("path").toString()).commit();
					shp.edit().putString("positionTabs", String.valueOf((long)(_position + 1))).commit();
				}
				else {
					if ((_position == 0) && (_data.size() == 1)) {
						shp.edit().putString("pos_path", _data.get((int)0).get("path").toString()).commit();
					}
					else {
						shp.edit().putString("pos_path", _data.get((int)_position - 1).get("path").toString()).commit();
						shp.edit().putString("positionTabs", String.valueOf((long)(_position - 1))).commit();
					}
				}
			}
			shp.edit().putString("path", new Gson().toJson(_data)).commit();
		}
	}
	
	
	public void _Anim(final View _codeEditor) {
		android.view.animation.Animation animation = new android.view.animation.AlphaAnimation(0, 1);
		animation.setDuration(300);
		_codeEditor.setAnimation(animation);
	}
	
	
	public void _Bounce(final View _view) {
		AnimUtils.Bounce(_view);
	}
	
	
	public void _Anim01(final View _view) {
		AnimUtils.Amin01(_view);
	}
	
	
	public void _Animwork(final View _view) {
		AnimUtils.Worker(_view);
	}
	
	
	public void _Anim04(final View _view) {
		AnimUtils.Amin04(_view,this);
	}
	
	
	public void _viber() {
		if (getvb.getString("HsiGamer", "").equals("true")) {
			vb.vibrate((long)(59));
		}
		else {
			if (getvb.getString("HsiGamer", "").equals("false")) {
				
			}
			else {
				
			}
		}
	}
	
	
	public void _clickAnimation(final View _view) {
		ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
		fade_in.setDuration(300);
		fade_in.setFillAfter(true);
		_view.startAnimation(fade_in);
	}
	
	
	public void _EditorSummery() {
		
		if (re.getString("f380", "").equals("true")) {
			editor.setNonPrintablePaintingFlags(CodeEditor.FLAG_DRAW_WHITESPACE_LEADING | CodeEditor.FLAG_DRAW_LINE_SEPARATOR);
		}
		else {
			if (re.getString("f380", "").equals("false")) {
				
			}
			else {
				
			}
		}
	}
	
	
	public void _poz() {
		if (shp.contains("path")) {
			if (!shp.getString("path", "").equals("")) {
				tabs_listmap = new Gson().fromJson(shp.getString("path", ""), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
				recyclerview1.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
				recyclerview1.setAdapter(new Recyclerview1Adapter(tabs_listmap));
				recyclerview1.setHasFixedSize(true);
			}
		}
		if (FileUtil.isExistFile(shp.getString("pos_path", ""))) {
			 ((LinearLayoutManager) recyclerview1.getLayoutManager()).scrollToPositionWithOffset((int)Math.floor(Double.parseDouble(shp.getString("positionTabs", ""))), (int)0);
			_codeEditor(shp.getString("pos_path", ""));
		}
	}
	
	
	public void _codestyle(final String _input) {
		if (_input.endsWith(".json")) {
			if (editor.getText().toString().isEmpty()) {
					Toast.makeText(getApplicationContext(), "Text is Empty !", Toast.LENGTH_LONG).show();
			} else {
					try {
							JsonFormater.install(editor.getText().toString(), editor, CodeeditorActivity.this);
							editor.setSelection(editor.getCursor().getRightLine(), editor.getCursor().getRightColumn());
					} catch (Exception r) {
							r.printStackTrace();
							
					}
			}
			
		}
		else {
			if (_input.endsWith(".java")) {
				if (editor.getText().toString().isEmpty()) {
					SketchwareUtil.showMessage(getApplicationContext(), "Empty Text");
				}
				else {
					try {
							
							editor.setText(format(editor.getText().toString()));
						    editor.setSelection(editor.getCursor().getRightLine(), editor.getCursor().getRightColumn());
					} catch (Exception ninjacoder) {
							SketchwareUtil.CustomToast(getApplicationContext(), "Error no road Code format", 0xFFFFFFFF, 19, 0xFF3F51B5, 25, SketchwareUtil.TOP);
					}
					
				}
			}
			else {
				if (_input.endsWith(".js")) {
					if (editor.getText().toString().isEmpty()) {
						SketchwareUtil.showMessage(getApplicationContext(), "Empty Text");
					}
					else {
						try {
								
								editor.setText(format(editor.getText().toString()));
							    editor.setSelection(editor.getCursor().getRightLine(), editor.getCursor().getRightColumn());
						} catch (Exception ninjacoder) {
								SketchwareUtil.CustomToast(getApplicationContext(), "Error no road Code format", 0xFFFFFFFF, 19, 0xFF3F51B5, 25, SketchwareUtil.TOP);
						}
						
					}
				}
				else {
					if (_input.endsWith(".xml")) {
						if (editor.getText().toString().isEmpty()) {
							SketchwareUtil.showMessage(getApplicationContext(), "Empty Text");
						}
						else {
							try{
								editor.setText(HtmlFormatter.xmlFormat(editor.getText().toString()));
								editor.setSelection(editor.getCursor().getRightLine(), editor.getCursor().getRightColumn());
							}catch(Exception e){
								 
							}
						}
					}
					else {
						if (_input.endsWith(".css")) {
							if (editor.getText().toString().isEmpty()) {
								SketchwareUtil.showMessage(getApplicationContext(), "Empty Text");
							}
							else {
								try {
										
										editor.setText(format(editor.getText().toString()));
									    editor.setSelection(editor.getCursor().getRightLine(), editor.getCursor().getRightColumn());
								} catch (Exception ninjacoder) {
										SketchwareUtil.CustomToast(getApplicationContext(), "Error no road Code format", 0xFFFFFFFF, 19, 0xFF3F51B5, 25, SketchwareUtil.TOP);
								}
								
							}
						}
						else {
							if (_input.endsWith(".c")) {
								if (editor.getText().toString().isEmpty()) {
									SketchwareUtil.showMessage(getApplicationContext(), "Empty Text");
								}
								else {
									try {
											
											editor.setText(format(editor.getText().toString()));
										    editor.setSelection(editor.getCursor().getRightLine(), editor.getCursor().getRightColumn());
									} catch (Exception ninjacoder) {
											SketchwareUtil.CustomToast(getApplicationContext(), "Error no road Code format", 0xFFFFFFFF, 19, 0xFF3F51B5, 25, SketchwareUtil.TOP);
									}
									
								}
							}
							else {
								if (_input.endsWith(".cpp")) {
									if (editor.getText().toString().isEmpty()) {
										SketchwareUtil.showMessage(getApplicationContext(), "Empty Text");
									}
									else {
										try {
												
												editor.setText(format(editor.getText().toString()));
											    editor.setSelection(editor.getCursor().getRightLine(), editor.getCursor().getRightColumn());
										} catch (Exception ninjacoder) {
												SketchwareUtil.CustomToast(getApplicationContext(), "Error no road Code format", 0xFFFFFFFF, 19, 0xFF3F51B5, 25, SketchwareUtil.TOP);
										}
										
									}
								}
								else {
									if (_input.endsWith(".ninja")) {
										if (editor.getText().toString().isEmpty()) {
											SketchwareUtil.showMessage(getApplicationContext(), "Empty Text");
										}
										else {
											try {
													
													editor.setText(format(editor.getText().toString()));
												    editor.setSelection(editor.getCursor().getRightLine(), editor.getCursor().getRightColumn());
											} catch (Exception ninjacoder) {
													SketchwareUtil.CustomToast(getApplicationContext(), "Error no road Code format", 0xFFFFFFFF, 19, 0xFF3F51B5, 25, SketchwareUtil.TOP);
											}
											
										}
									}
									else {
										if (_input.endsWith(".html")) {
											if (editor.getText().toString().isEmpty()) {
												SketchwareUtil.showMessage(getApplicationContext(), "Empty Text");
											}
											else {
												try{
													editor.setText(HtmlFormatter.xmlFormat(editor.getText().toString()));
													editor.setSelection(editor.getCursor().getRightLine(), editor.getCursor().getRightColumn());
												}catch(Exception e){
													 
												}
											}
										}
										else {
											
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	public void _sysba(final String _input) {
		io.github.rosemoe.sora.widget.SymbolChannel channel = editor.createNewSymbolChannel();
		channel.insertSymbol(_input, (int)_input.length());
	}
	
	
	public void _textAim() {
		bar1.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()){
					case MotionEvent.ACTION_DOWN:{
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(bar1);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues(0.9f);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(bar1);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues(0.9f);
						scaleY.setDuration((int)5);
						scaleY.start();
						break;
					}
					case MotionEvent.ACTION_UP:{
						
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(bar1);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues((float)1);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(bar1);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues((float)1);
						scaleY.setDuration((int)5);
						scaleY.start();
						
						break;
					}
				}
				return false;
			}
		});
		bar2.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()){
					case MotionEvent.ACTION_DOWN:{
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(bar2);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues(0.9f);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(bar2);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues(0.9f);
						scaleY.setDuration((int)5);
						scaleY.start();
						break;
					}
					case MotionEvent.ACTION_UP:{
						
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(bar2);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues((float)1);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(bar2);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues((float)1);
						scaleY.setDuration((int)5);
						scaleY.start();
						
						break;
					}
				}
				return false;
			}
		});
		textview3.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()){
					case MotionEvent.ACTION_DOWN:{
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(textview3);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues(0.9f);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(textview3);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues(0.9f);
						scaleY.setDuration((int)5);
						scaleY.start();
						break;
					}
					case MotionEvent.ACTION_UP:{
						
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(textview3);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues((float)1);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(textview3);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues((float)1);
						scaleY.setDuration((int)5);
						scaleY.start();
						
						break;
					}
				}
				return false;
			}
		});
		textview4.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()){
					case MotionEvent.ACTION_DOWN:{
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(textview4);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues(0.9f);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(textview4);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues(0.9f);
						scaleY.setDuration((int)5);
						scaleY.start();
						break;
					}
					case MotionEvent.ACTION_UP:{
						
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(textview4);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues((float)1);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(textview4);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues((float)1);
						scaleY.setDuration((int)5);
						scaleY.start();
						
						break;
					}
				}
				return false;
			}
		});
		textview5.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()){
					case MotionEvent.ACTION_DOWN:{
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(textview5);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues(0.9f);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(textview5);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues(0.9f);
						scaleY.setDuration((int)5);
						scaleY.start();
						break;
					}
					case MotionEvent.ACTION_UP:{
						
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(textview5);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues((float)1);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(textview5);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues((float)1);
						scaleY.setDuration((int)5);
						scaleY.start();
						
						break;
					}
				}
				return false;
			}
		});
		textview6.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()){
					case MotionEvent.ACTION_DOWN:{
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(textview6);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues(0.9f);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(textview6);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues(0.9f);
						scaleY.setDuration((int)5);
						scaleY.start();
						break;
					}
					case MotionEvent.ACTION_UP:{
						
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(textview6);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues((float)1);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(textview6);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues((float)1);
						scaleY.setDuration((int)5);
						scaleY.start();
						
						break;
					}
				}
				return false;
			}
		});
		textview8.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()){
					case MotionEvent.ACTION_DOWN:{
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(textview8);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues(0.9f);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(textview8);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues(0.9f);
						scaleY.setDuration((int)5);
						scaleY.start();
						break;
					}
					case MotionEvent.ACTION_UP:{
						
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(textview8);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues((float)1);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(textview8);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues((float)1);
						scaleY.setDuration((int)5);
						scaleY.start();
						
						break;
					}
				}
				return false;
			}
		});
		textview13.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()){
					case MotionEvent.ACTION_DOWN:{
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(textview13);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues(0.9f);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(textview13);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues(0.9f);
						scaleY.setDuration((int)5);
						scaleY.start();
						break;
					}
					case MotionEvent.ACTION_UP:{
						
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(textview13);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues((float)1);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(textview13);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues((float)1);
						scaleY.setDuration((int)5);
						scaleY.start();
						
						break;
					}
				}
				return false;
			}
		});
		textview7.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()){
					case MotionEvent.ACTION_DOWN:{
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(textview7);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues(0.9f);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(textview7);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues(0.9f);
						scaleY.setDuration((int)5);
						scaleY.start();
						break;
					}
					case MotionEvent.ACTION_UP:{
						
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(textview7);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues((float)1);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(textview7);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues((float)1);
						scaleY.setDuration((int)5);
						scaleY.start();
						
						break;
					}
				}
				return false;
			}
		});
		textview9.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()){
					case MotionEvent.ACTION_DOWN:{
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(textview9);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues(0.9f);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(textview9);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues(0.9f);
						scaleY.setDuration((int)5);
						scaleY.start();
						break;
					}
					case MotionEvent.ACTION_UP:{
						
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(textview9);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues((float)1);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(textview9);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues((float)1);
						scaleY.setDuration((int)5);
						scaleY.start();
						
						break;
					}
				}
				return false;
			}
		});
		textview10.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()){
					case MotionEvent.ACTION_DOWN:{
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(textview10);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues(0.9f);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(textview10);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues(0.9f);
						scaleY.setDuration((int)5);
						scaleY.start();
						break;
					}
					case MotionEvent.ACTION_UP:{
						
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(textview10);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues((float)1);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(textview10);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues((float)1);
						scaleY.setDuration((int)5);
						scaleY.start();
						
						break;
					}
				}
				return false;
			}
		});
		textview11.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()){
					case MotionEvent.ACTION_DOWN:{
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(textview11);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues(0.9f);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(textview11);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues(0.9f);
						scaleY.setDuration((int)5);
						scaleY.start();
						break;
					}
					case MotionEvent.ACTION_UP:{
						
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(textview11);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues((float)1);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(textview11);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues((float)1);
						scaleY.setDuration((int)5);
						scaleY.start();
						
						break;
					}
				}
				return false;
			}
		});
		textview12.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()){
					case MotionEvent.ACTION_DOWN:{
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(textview12);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues(0.9f);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(textview12);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues(0.9f);
						scaleY.setDuration((int)5);
						scaleY.start();
						break;
					}
					case MotionEvent.ACTION_UP:{
						
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(textview12);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues((float)1);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(textview12);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues((float)1);
						scaleY.setDuration((int)5);
						scaleY.start();
						
						break;
					}
				}
				return false;
			}
		});
		textview14.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()){
					case MotionEvent.ACTION_DOWN:{
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(textview14);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues(0.9f);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(textview14);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues(0.9f);
						scaleY.setDuration((int)5);
						scaleY.start();
						break;
					}
					case MotionEvent.ACTION_UP:{
						
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(textview14);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues((float)1);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(textview14);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues((float)1);
						scaleY.setDuration((int)5);
						scaleY.start();
						
						break;
					}
				}
				return false;
			}
		});
	}
	
	
	public void _themeInstallLojic() {
		
	}
	
	
	public void _postUndo() {
		if (editor.canUndo()) {
			editor.undo();
		}
		else {
			SketchwareUtil.CustomToast(getApplicationContext(), "داده ای یافت نشد", 0xFFFDA893, 15, 0xFF1F1B1C, 25, SketchwareUtil.CENTER);
		}
	}
	
	
	public void _postRedo() {
		if (editor.canRedo()) {
			editor.redo();
		}
		else {
			SketchwareUtil.CustomToast(getApplicationContext(), "داده ای یافت نشد", 0xFFFDA893, 15, 0xFF1F1B1C, 25, SketchwareUtil.CENTER);
		}
	}
	
	
	public void _dialogError() {
		themenotfound.setVisibility(View.VISIBLE);
		var di = new com.google.android.material.dialog.MaterialAlertDialogBuilder(CodeeditorActivity.this);
		    di.setTitle("شکست تم ");
		di.setMessage("تم دچار نقص شده است ممکن است تم را دستی ویرایش کرده باشید یا یک ویژگی جدید به تم اضافه شده باشد لطفاً گزینه تعمیر را بزنید تا تم برای شما باز تولید شود");
		di.setNeutralButton("تعمیر", (p, d) -> {
			
			         SketchwareUtil.showMessage(getApplicationContext(), "شروع باز نویسی تم");
			FileUtil.deleteFile("/storage/emulated/0/GhostWebIDE/theme/GhostThemeapp.ghost");
			ask = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							finishAffinity();
						}
					});
				}
			};
			_timer.schedule(ask, (int)(2000));
			
						});
		di.setCancelable(false);
		di.show();
		
		
		
		
	}
	
	
	public void _a() {
		var aaa = new GradientDrawable();
		aaa.setColor(0xFF1F1B1C);
		aaa.setCornerRadius(15);
		aaa.setStroke(1, 0xFFFDA893);
		var di = new MaterialAlertDialogBuilder(this);
		ViewGroup viewGroup = findViewById(android.R.id.content);
		View dialogview = getLayoutInflater().inflate(R.layout.serachviews, viewGroup, false);
		EditText editorrep = dialogview.findViewById(R.id.editorrep);
		EditText editorser = dialogview.findViewById(R.id.editorser);
		Button mis = dialogview.findViewById(R.id.mis);
		Button ser = dialogview.findViewById(R.id.ser);
		Button rep = dialogview.findViewById(R.id.rep);
		Button repall = dialogview.findViewById(R.id.repall);
		com.google.android.material.textfield.TextInputLayout input1 = dialogview.findViewById(R.id.input1);
		com.google.android.material.textfield.TextInputLayout input2 = dialogview.findViewById(R.id.input2);
		di.setTitle("جستجو");
		editorser.addTextChangedListener(new TextWatcher() {
				@Override
				public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
						final String _charSeq = _param1.toString();
						editor.getSearcher().search(_charSeq);
						
						com.neo.highlight.core.Highlight highlight = new com.neo.highlight.core.Highlight();
						
						//add Schemes
						
						highlight.addScheme(
						
						new com.neo.highlight.util.scheme.ColorScheme(
						Pattern.compile("\\b0x[0-9a-f]{6,8}|\\b([0-9]+)\\b"),0xFFF44336
						),
						new com.neo.highlight.util.scheme.ColorScheme(
						Pattern.compile("\\b(?:[A-Z])[a-zA-Z0-9]+\\b"),0xFFE91E63
						)
						
						);
						highlight.setSpan(editorser);
						
				}
				
				@Override
				public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
						
				}
				
				@Override
				public void afterTextChanged(Editable _param1) {
						
				}
		});
		
		mis.setOnClickListener((view) -> {
				
				try {
						editor.getSearcher().gotoLast();
				} catch (IllegalStateException e) {
						e.printStackTrace();
				}
				
		});
		ser.setOnClickListener((view) -> {
				
				try {
						editor.getSearcher().gotoNext();
				} catch (IllegalStateException e) {
						e.printStackTrace();
				}
				
		});
		rep.setOnClickListener((view) -> {
				
				if (editorrep.getText().toString().isEmpty()) {
						//	Mp(a, "متن نمیتواند خالی باشد");
						SketchwareUtil.showMessage(getApplicationContext(), " متن خالی است");
				} else {
						try {
								editor.getSearcher().replaceThis(editorrep.getText().toString());
						} catch (IllegalStateException e) {
								e.printStackTrace();
						}
				}
				
		});
		repall.setOnClickListener((view) -> {
				
				if (editorrep.getText().toString().isEmpty()) {
						//	Mp(a, "متن نمیتواند خالی باشد");
						SketchwareUtil.showMessage(getApplicationContext(), " متن خالی است");
				} else {
						try {
								editor.getSearcher().replaceAll(editorrep.getText().toString());
						} catch (IllegalStateException e) {
								e.printStackTrace();
						}
				}
				
		});
		di.setNeutralButton("بستن", (p, d) -> {
				
		});
		di.setBackground(aaa);
		di.setView(dialogview);
		di.show();
		
	}
	
	
	public void _b() {
		final com.google.android.material.bottomsheet.BottomSheetDialog bottomSheetDialog = new com.google.android.material.bottomsheet.BottomSheetDialog(CodeeditorActivity.this);
		
		View bottomSheetView; bottomSheetView = getLayoutInflater().inflate(R.layout.fromsheets,null );
		bottomSheetDialog.setContentView(bottomSheetView);
		
		bottomSheetDialog.getWindow().findViewById(R.id.design_bottom_sheet).setBackgroundResource(android.R.color.transparent);
		
		TextView tani = (TextView) bottomSheetView.findViewById(R.id.tani);
		EditText editorrep = (EditText) bottomSheetView.findViewById(R.id.editorrep);
		EditText editorser = (EditText) bottomSheetView.findViewById(R.id.editorser);
		ImageButton imageclose = (ImageButton) bottomSheetView.findViewById(R.id.imageclose);
		Button mis = (Button) bottomSheetView.findViewById(R.id.mis);
		Button ser = (Button) bottomSheetView.findViewById(R.id.ser);
		Button rep = (Button) bottomSheetView.findViewById(R.id.rep);
		Button repall = (Button) bottomSheetView.findViewById(R.id.repall);
		com.google.android.material.textfield.TextInputLayout input1 = (com.google.android.material.textfield.TextInputLayout) bottomSheetView.findViewById(R.id.input1);
		com.google.android.material.textfield.TextInputLayout input2 = (com.google.android.material.textfield.TextInputLayout) bottomSheetView.findViewById(R.id.input2);
		
				
				editorser.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String _charSeq = _param1.toString();
								editor.getSearcher().search(_charSeq);
						}
			
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
						}
			
						@Override
						public void afterTextChanged(Editable _param1) {
				
						}
				});
		mis.setOnClickListener((view) -> {
			
						try {
								editor.getSearcher().gotoLast();
						} catch (IllegalStateException e) {
								e.printStackTrace();
						}
			
						tani.setOnClickListener(cd -> {
							//	Mp(a, "اذیت نکن عه");
						});
			
				});
				ser.setOnClickListener((view) -> {
			
						try {
								editor.getSearcher().gotoNext();
						} catch (IllegalStateException e) {
								e.printStackTrace();
						}
			
				});
				rep.setOnClickListener((view) -> {
			
						if (editorrep.getText().toString().isEmpty()) {
							//	Mp(a, "متن نمیتواند خالی باشد");
									SketchwareUtil.showMessage(getApplicationContext(), " متن خالی است");
						} else {
								try {
										editor.getSearcher().replaceThis(editorrep.getText().toString());
								} catch (IllegalStateException e) {
										e.printStackTrace();
								}
						}
			
				});
				repall.setOnClickListener((view) -> {
			
						if (editorrep.getText().toString().isEmpty()) {
							//	Mp(a, "متن نمیتواند خالی باشد");
				
									SketchwareUtil.showMessage(getApplicationContext(), " متن خالی است");
						} else {
								try {
										editor.getSearcher().replaceAll(editorrep.getText().toString());
								} catch (IllegalStateException e) {
										e.printStackTrace();
								}
						}
			
				});
		imageclose.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
				
				bottomSheetDialog.dismiss();
				
			}
		});
		bottomSheetDialog.show();
	}
	
	
	public void _finalShowPanelSeach() {
		LayoutInflater hh = LayoutInflater.from(CodeeditorActivity.this);
		LinearLayout mninjacoder = (LinearLayout) hh.inflate(R.layout.fromsheets, null, false);
		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams( LinearLayout.LayoutParams.MATCH_PARENT,  LinearLayout.LayoutParams.WRAP_CONTENT);
		mninjacoder.setLayoutParams(params);
		  
		final TextView tani = mninjacoder.findViewById(R.id.tani);
		final EditText editorrep = mninjacoder.findViewById(R.id.editorrep);
		final EditText editorser = mninjacoder.findViewById(R.id.editorser);
		final ImageButton imageclose = mninjacoder.findViewById(R.id.imageclose);
		final Button mis = mninjacoder.findViewById(R.id.mis);
		final Button ser = mninjacoder.findViewById(R.id.ser);
		final Button rep = mninjacoder.findViewById(R.id.rep);
		final Button repall = mninjacoder.findViewById(R.id.repall);
		final com.google.android.material.textfield.TextInputLayout input1 = mninjacoder.findViewById(R.id.input1);
		final com.google.android.material.textfield.TextInputLayout input2 = mninjacoder.findViewById(R.id.input2);
		
		
		editorser.addTextChangedListener(new TextWatcher() {
				@Override
				public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
						final String _charSeq = _param1.toString();
						editor.getSearcher().search(_charSeq);
				}
				
				@Override
				public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
						
				}
				
				@Override
				public void afterTextChanged(Editable _param1) {
						
				}
		});
		
		mis.setOnClickListener((view) -> {
				
				try {
						editor.getSearcher().gotoLast();
				} catch (IllegalStateException e) {
						e.printStackTrace();
				}
				
				tani.setOnClickListener(cd -> {
						//	Mp(a, "اذیت نکن عه");
				});
				
		});
		ser.setOnClickListener((view) -> {
				
				try {
						editor.getSearcher().gotoNext();
				} catch (IllegalStateException e) {
						e.printStackTrace();
				}
				
		});
		rep.setOnClickListener((view) -> {
				
				if (editorrep.getText().toString().isEmpty()) {
						//	Mp(a, "متن نمیتواند خالی باشد");
						SketchwareUtil.showMessage(getApplicationContext(), " متن خالی است");
				} else {
						showPanelSearch.setVisibility(View.GONE);
						panelSattinges.setVisibility(View.VISIBLE);
						newLayoutSymbolBar.setVisibility(View.VISIBLE);
						try {
								editor.getSearcher().replaceThis(editorrep.getText().toString());
						} catch (IllegalStateException e) {
								e.printStackTrace();
						}
				}
				
		});
		repall.setOnClickListener((view) -> {
				
				if (editorrep.getText().toString().isEmpty()) {
						//	Mp(a, "متن نمیتواند خالی باشد");
						
						SketchwareUtil.showMessage(getApplicationContext(), " متن خالی است");
				} else {
						showPanelSearch.setVisibility(View.GONE);
						panelSattinges.setVisibility(View.VISIBLE);
						newLayoutSymbolBar.setVisibility(View.VISIBLE);
						try {
								editor.getSearcher().replaceAll(editorrep.getText().toString());
						} catch (IllegalStateException e) {
								e.printStackTrace();
						}
				}
				
		});
		
		editorser.setOnClickListener(v ->{
					panelSattinges.setVisibility(View.GONE);
					newLayoutSymbolBar.setVisibility(View.GONE);
			    
		});
		
		imageclose.setOnClickListener((view) -> {
			
			       showPanelSearch.setVisibility(View.GONE);
			panelSattinges.setVisibility(View.VISIBLE);
			newLayoutSymbolBar.setVisibility(View.VISIBLE);
			
			
		});
		showPanelSearch.addView(mninjacoder);
	}
	
	
	public void _adptorList() {
	}
	public class MyListViewListAdapter extends BaseAdapter {
				
				ArrayList<HashMap<String, Object>> _data;
				
				public MyListViewListAdapter(ArrayList<HashMap<String, Object>> _arr) {
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
								_view = _inflater.inflate(R.layout.onviewtag, null);
						}
						
			
						
			       
			      final TextView sub = _view.findViewById(R.id.sub);
			final TextView tag = _view.findViewById(R.id.tag);
			final LinearLayout back = _view.findViewById(R.id.back);
			tag.setText(_data.get((int)_position).get("tb").toString().trim());
			sub.setText(tag.getText().toString().substring((int)(1), (int)(2)));
			back.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)666, 0xFFF44336));
						
						return _view;
				}
		}
	
	{
	}
	
	
	public void _datako() {
		var di = new com.google.android.material.dialog.MaterialAlertDialogBuilder(CodeeditorActivity.this);
		    ViewGroup viewGroup = findViewById(android.R.id.content);
				View dialogview = getLayoutInflater().inflate(R.layout.tagpost, viewGroup, false);
		ListView list1 = dialogview.findViewById(R.id.list1);
		TextView tvpost = dialogview.findViewById(R.id.tvpost);
		di.setTitle("TagView");
		indifier.clear();
		tags.clear();
		pos = editor.getText().toString().trim();
		pos = pos.replace(">", ">#####");
		pos = pos.replace("</", "#####</");
		indifier = new ArrayList<String>(Arrays.asList(pos.split("#####")));
		for (int pas = 0; pas < (int)(indifier.size()); pas++) {
			if (!(!indifier.get((int)(pas)).contains(">") || indifier.get((int)(pas)).contains("</"))) {
				if (indifier.get((int)(pas)).trim().matches("<.*?>")) {
					{
						HashMap<String, Object> _item = new HashMap<>();
						_item.put("tb", indifier.get((int)(pas)));
						tags.add(_item);
					}
					
				}
			}
		}
		list1.setAdapter(new MyListViewListAdapter(tags));
		((BaseAdapter)list1.getAdapter()).notifyDataSetChanged();
		list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
						@Override
						public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
								final int _position = _param3;
								editor.getSearcher().search(tags.get((int)_position).get("tb").toString());
						}
				});
		di.setNeutralButton("ok", (p, d) -> {
			
			          
			
						});
		di.setView(dialogview);
		di.show();
		
		
		
		
	}
	
	
	public void _logcat() {
		final com.google.android.material.bottomsheet.BottomSheetDialog bottomSheetDialog = new com.google.android.material.bottomsheet.BottomSheetDialog(CodeeditorActivity.this);
		
		View bottomSheetView; bottomSheetView = getLayoutInflater().inflate(R.layout.logeditorview,null );
		bottomSheetDialog.setContentView(bottomSheetView);
		
		bottomSheetDialog.getWindow().findViewById(R.id.design_bottom_sheet).setBackgroundResource(android.R.color.transparent);
		
		ImageView info = (ImageView) bottomSheetView.findViewById(R.id.info);
		ImageView closee = (ImageView) bottomSheetView.findViewById(R.id.closee);
		io.github.rosemoe.sora.widget.CodeEditor inputlog = (io.github.rosemoe.sora.widget.CodeEditor) bottomSheetView.findViewById(R.id.inputlog);
		if (inputlog.getText().toString().isEmpty()) {
			inputlog.setText("خطای رکورد نشده است");
		}
		else {
			
		}
		
		inputlog.setColorScheme(new SchemeDarcula());
		new AsyncTask<String, String, String>() {
			@Override
			protected void onPreExecute() {
				inputlog.setText("loading....");
			}
			@Override
			protected String doInBackground(String... params) {
				String _param = params[0];
				 
				return "";
			}
			@Override
			protected void onPostExecute(String _result) {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						FileInputStream fis = null;
						try {
								fis = openFileInput("crash-journal.log");
								var br = new BufferedReader(new InputStreamReader(fis));
								var sb = new StringBuilder();
								String line;
								while ((line = br.readLine()) != null) {
										sb.append(line).append('\n');
								}
								Toast.makeText(getApplicationContext(), "Succeeded", Toast.LENGTH_SHORT).show();
								inputlog.setText(sb);
						} catch (Exception e) {
								Toast.makeText(getApplicationContext(), "Failed:" + e, Toast.LENGTH_SHORT).show();
								e.printStackTrace();
						} finally {
								if (fis != null) {
										try {
												fis.close();
										} catch (IOException e) {
												e.printStackTrace();
										}
								}
						}
						
					}
				});
			}
		}.execute("");
		closee.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
				
				bottomSheetDialog.dismiss();
				
			}
		});
		info.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
				
				PopupMenu popup = new PopupMenu(CodeeditorActivity.this, info);
				Menu menu = popup.getMenu();
				menu.add("اشتراک گذاری خطا").setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
				menu.add("پاک کردن خطا").setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
				popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
					public boolean onMenuItemClick(MenuItem item) {
						switch (item.getTitle().toString()) {
							
							case "اشتراک گذاری خطا":
							
							Intent sendlog = new Intent(android.content.Intent.ACTION_SEND);
							sendlog.setType("text/plain");
							sendlog.putExtra(android.content.Intent.EXTRA_TEXT, inputlog.getText().toString());
							startActivity(Intent.createChooser(sendlog,"Error Log CatVersion 0.1"));
							
							
							return true;
							case "پاک کردن خطا":
							
							ask = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
										@Override
										public void run() {
											
											FileOutputStream fos = null;
											try {
													fos = openFileOutput("crash-journal.log", MODE_PRIVATE);
													Toast.makeText(getApplicationContext(), "Succeeded", Toast.LENGTH_SHORT).show();
												    inputlog.setText("");
											} catch (Exception e) {
													Toast.makeText(getApplicationContext(), "Failed:" + e, Toast.LENGTH_SHORT).show();
													e.printStackTrace();
											} finally {
													if (fos != null) {
															try {
																	fos.close();
															} catch (IOException e) {
																	e.printStackTrace();
															}
													}
											}
											
										}
									});
								}
							};
							_timer.schedule(ask, (int)(300));
							
							return true;
							default: return false;
						}
					}
				});
				
				
				popup.show();
				
			}
		});
		bottomSheetDialog.setCancelable(false);
		bottomSheetDialog.show();
	}
	
	public class Recyclerview1Adapter extends RecyclerView.Adapter<Recyclerview1Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Recyclerview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getLayoutInflater();
			View _v = _inflater.inflate(R.layout.listeditor, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final LinearLayout linear3 = _view.findViewById(R.id.linear3);
			final LinearLayout linear4 = _view.findViewById(R.id.linear4);
			final LinearLayout linear5 = _view.findViewById(R.id.linear5);
			final LinearLayout selector = _view.findViewById(R.id.selector);
			final ImageView imageview2 = _view.findViewById(R.id.imageview2);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final LinearLayout close = _view.findViewById(R.id.close);
			
			close.setVisibility(View.GONE);
			_fab.shrink();
			if (_data.isEmpty()) {
				
			}
			else {
				
				RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
				_view.setLayoutParams(_lp);
				if (imap.containsKey("TabBack")) {
					android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
					int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
					SketchUi.setColor(Color.parseColor(imap.get("TabBack").toString()));
					SketchUi.setCornerRadii(new float[]{
						d*360,d*360,d*360 ,d*360,d*0,d*0 ,d*0,d*0});
					selector.setElevation(d*4);
					selector.setBackground(SketchUi);
				}
				else {
					android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
					int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
					SketchUi.setColor(Color.parseColor("#ffd1aeff"));
					SketchUi.setCornerRadii(new float[]{
						d*360,d*360,d*360 ,d*360,d*0,d*0 ,d*0,d*0});
					selector.setElevation(d*4);
					selector.setBackground(SketchUi);
				}
				if (imap.containsKey("TabImageColorFilter")) {
					close.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("TabImageColorFilter").toString())));
				}
				else {
					close.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor("#fffad7ff")));
				}
				textview1.setText(Uri.parse(_data.get((int)_position).get("path").toString()).getLastPathSegment().toLowerCase());
				if (FileUtil.isDirectory(_data.get((int)_position).get("path").toString())) {
					_fab.shrink();
					imageview2.setImageResource(R.drawable.file);
				}
				else {
					_fab.shrink();
					if (_data.get((int)_position).get("path").toString().endsWith(".html")) {
						SvgShow.GetAsster(getApplicationContext() , imageview2 , "file_type_html.svg");
					}
					else {
						if (_data.get((int)_position).get("path").toString().endsWith(".css")) {
							SvgShow.GetAsster(getApplicationContext() , imageview2 , "file_type_css.svg");
						}
						else {
							if (_data.get((int)_position).get("path").toString().endsWith(".cpp")) {
								SvgShow.GetAsster(getApplicationContext() , imageview2 , "file_type_cpp3.svg");
							}
							else {
								if (_data.get((int)_position).get("path").toString().endsWith(".c")) {
									SvgShow.GetAsster(getApplicationContext() , imageview2 , "file_type_c3.svg");
								}
								else {
									if (_data.get((int)_position).get("path").toString().endsWith(".js")) {
										SvgShow.GetAsster(getApplicationContext() , imageview2 , "file_type_node.svg");
									}
									else {
										if (_data.get((int)_position).get("path").toString().endsWith(".py")) {
											SvgShow.GetAsster(getApplicationContext() , imageview2 , "file_type_python.svg");
										}
										else {
											if (_data.get((int)_position).get("path").toString().endsWith(".java")) {
												SvgShow.GetAsster(getApplicationContext() , imageview2 , "file_type_java.svg");
											}
											else {
												if (_data.get((int)_position).get("path").toString().endsWith(".json")) {
													SvgShow.GetAsster(getApplicationContext() , imageview2 , "file_type_json2.svg");
												}
												else {
													if (_data.get((int)_position).get("path").toString().endsWith(".ghost")) {
														SvgShow.GetAsster(getApplicationContext() , imageview2 , "file_type_ink.svg");
													}
													else {
														if (_data.get((int)_position).get("path").toString().endsWith(".cs")) {
															SvgShow.GetAsster(getApplicationContext() , imageview2 , "file_type_csharp2.svg");
														}
														else {
															if (_data.get((int)_position).get("path").toString().endsWith(".ninja")) {
																SvgShow.GetAsster(getApplicationContext() , imageview2 , "file_type_ninja.svg");
															}
															else {
																if (_data.get((int)_position).get("path").toString().endsWith(".sh")) {
																	SvgShow.GetAsster(getApplicationContext() , imageview2 , "rowbash.svg");
																}
																else {
																	if (_data.get((int)_position).get("path").toString().endsWith(".go")) {
																		SvgShow.GetAsster(getApplicationContext() , imageview2 , "go.svg");
																	}
																	else {
																		if (_data.get((int)_position).get("path").toString().endsWith(".svg")) {
																			SvgShow.GetAsster(getApplicationContext() , imageview2 , "file_type_svg.svg");
																		}
																		else {
																			if (_data.get((int)_position).get("path").toString().endsWith(".scss")) {
																				SvgShow.GetAsster(getApplicationContext() , imageview2 , "file_type_scss2.svg");
																			}
																			else {
																				if (_data.get((int)_position).get("path").toString().endsWith(".xml")) {
																					SvgShow.GetAsster(getApplicationContext() , imageview2 , "file_type_source.svg");
																				}
																				else {
																					if (_data.get((int)_position).get("path").toString().endsWith(".md")) {
																						SvgShow.GetAsster(getApplicationContext() , imageview2 , "mdx.svg");
																					}
																					else {
																						if (_data.get((int)_position).get("path").toString().endsWith(".php")) {
																							imageview2.setImageResource(R.drawable.languagephp);
																						}
																						else {
																							if (_data.get((int)_position).get("path").toString().endsWith(".go")) {
																								imageview2.setImageResource(R.drawable.languagego);
																							}
																							else {
																								if (_data.get((int)_position).get("path").toString().endsWith(".txt")) {
																									imageview2.setImageResource(R.drawable.txtfile);
																								}
																								else {
																									if (_data.get((int)_position).get("path").toString().endsWith(".kt")) {
																										SvgShow.GetAsster(getApplicationContext() , imageview2 , "kotlin.svg");
																									}
																									else {
																										if (_data.get((int)_position).get("path").toString().endsWith(".rb") || _data.get((int)_position).get("path").toString().endsWith(".rbw")) {
																											SvgShow.GetAsster(getApplicationContext() , imageview2 , "ruby.svg");
																										}
																										else {
																											if (_data.get((int)_position).get("path").toString().endsWith(".dart")) {
																												SvgShow.GetAsster(getApplicationContext() , imageview2 , "dart.svg");
																											}
																											else {
																												if (_data.get((int)_position).get("path").toString().endsWith(".swift")) {
																													SvgShow.GetAsster(getApplicationContext() , imageview2 , "swift.svg");
																												}
																												else {
																													imageview2.setImageResource(R.drawable.file);
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
					if (FileUtil.isExistFile(_data.get((int)_position).get("path").toString())) {
						
					}
					else {
						textview1.setText("FileNotFound*".concat(Uri.parse(_data.get((int)_position).get("path").toString()).getLastPathSegment()).toLowerCase());
					}
				}
				if (_data.get((int)_position).get("path").toString().equals(shp.getString("pos_path", ""))) {
					_Anim01(textview1);
					_Anim01(imageview2);
					_Anim01(editor);
					selector.setVisibility(View.VISIBLE);
					close.setVisibility(View.VISIBLE);
					n = 0;
					if (imap.containsKey("TabTextColor")) {
						textview1.setTextColor(Color.parseColor(imap.get("TabTextColor").toString()));
					}
					else {
						textview1.setTextColor(Color.parseColor("#f4ffc6bc"));
					}
				}
				else {
					selector.setVisibility(View.GONE);
					n = 0;
					close.setVisibility(View.INVISIBLE);
					_Bounce(textview1);
					_Bounce(imageview2);
					_Anim01(editor);
					if (imap.containsKey("DisplayTextColorTab")) {
						textview1.setTextColor(Color.parseColor(imap.get("DisplayTextColorTab").toString()));
					}
					else {
						textview1.setTextColor(Color.parseColor("#ffc9fff2"));
					}
				}
				linear5.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						if (FileUtil.isExistFile(_data.get((int)_position).get("path").toString())) {
							_codeEditor(_data.get((int)_position).get("path").toString());
							shp.edit().putString("positionTabs", String.valueOf((long)(_position))).commit();
							shp.edit().putString("pos_path", _data.get((int)_position).get("path").toString()).commit();
							notifyDataSetChanged();
							if (FileUtil.isExistFile(_data.get((int)_position).get("path").toString())) {
								_codeEditor(_data.get((int)_position).get("path").toString());
								if (_data.get((int)_position).get("path").toString().equals(shp.getString("pos_path", ""))) {
									if (imap.containsKey("TabTextColor")) {
										textview1.setTextColor(Color.parseColor(imap.get("TabTextColor").toString()));
									}
									else {
										textview1.setTextColor(Color.parseColor("#f4ffc6bc"));
									}
									selector.setVisibility(View.VISIBLE);
									close.setVisibility(View.VISIBLE);
									_Anim01(imageview2);
									_Anim01(textview1);
									n = 0;
									_Anim01(editor);
								}
								else {
									selector.setVisibility(View.GONE);
									if (imap.containsKey("DisplayTextColorTab")) {
										textview1.setTextColor(Color.parseColor(imap.get("DisplayTextColorTab").toString()));
									}
									else {
										textview1.setTextColor(Color.parseColor("#ffc9fff2"));
									}
									n = 0;
									close.setVisibility(View.INVISIBLE);
									_Bounce(textview1);
									_Bounce(imageview2);
									
									_Anim01(editor);
								}
							}
							else {
								selector.setVisibility(View.GONE);
							}
						}
						else {
							///result code By Ninja coder.ir my love java
							
							
							GradientDrawable mmd = new GradientDrawable();
									mmd.setColor(0xFF1F1B1C);
									mmd.setCornerRadius(21);
									mmd.setStroke(1, 0xFFF8B09A);
							var di = new com.google.android.material.dialog.MaterialAlertDialogBuilder(CodeeditorActivity.this);
							    di.setTitle("File not Found!");
							di.setCancelable(false);
							di.setBackground(mmd);
							di.setNeutralButton("Romved!", (p, d) -> {
								
								         _close_tab(_position, _data);
								notifyDataSetChanged();
								
											});
							di.show();
							
							
							
							
						}
					}
				});
				linear5.setOnLongClickListener(new View.OnLongClickListener() {
					@Override
					public boolean onLongClick(View _view) {
						View popupView = getLayoutInflater().inflate(R.layout.popmenulayouteditor, null);
						final PopupWindow popup = new PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
						/// popView : View.GONE ? View.VISIBLE;
						//if(popupView : View.GONE ? View.VISIBLE)
						 LinearLayout   c1 = popupView.findViewById(R.id.c1);
						
						 
						
						 LinearLayout   c2 = popupView.findViewById(R.id.c2);
						
						 
						
						 LinearLayout   c3 = popupView.findViewById(R.id.c3);
						
						 
						
						 androidx.cardview.widget.CardView   mcard = popupView.findViewById(R.id.mcard);
						
						 
						
						c1.setOnClickListener(new OnClickListener() { public void onClick(View view) {
										_close_tab(_position, _data);
								notifyDataSetChanged();
								n = 0;
										popup.dismiss();
								} });
						
						c2.setOnClickListener(new OnClickListener() { public void onClick(View view) {
										SketchwareUtil.showMessage(getApplicationContext(), "Soon");
								n = 0;
										popup.dismiss();
								} });
						
						c3.setOnClickListener(new OnClickListener() { public void onClick(View view) {
										SketchwareUtil.showMessage(getApplicationContext(), "Soon");
								n = 0;
										popup.dismiss();
								} });
						
						AnimUtils.O(popupView);
						AnimUtils.Worker(c1); 
						AnimUtils.Worker(c2);
						AnimUtils.Worker(c3);
						mcard.setCardBackgroundColor(0xFF1F1B1C);
						mcard.setRadius((float)10);
						mcard.setCardElevation((float)3);
						popup.setAnimationStyle(android.R.style.Animation_Dialog);
						
						popup.showAsDropDown(linear5, 0,0);
						
						popup.setBackgroundDrawable(new BitmapDrawable());
						return true;
					}
				});
				if (imap.containsKey("TabBack")) {
					_Ripple_Drawable(linear5, imap.get("TabBack").toString());
					_Ripple_Drawable(close, imap.get("TabBack").toString());
				}
				else {
					_Ripple_Drawable(linear5, "#ffd1aeff");
					_Ripple_Drawable(close, "#ffd1aeff");
				}
				shp.edit().putString("path", new Gson().toJson(_data)).commit();
			}
			_Anim(selector);
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