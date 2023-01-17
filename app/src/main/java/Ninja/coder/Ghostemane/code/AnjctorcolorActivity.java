package Ninja.coder.Ghostemane.code;

import android.Manifest;
import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.SharedPreferences;
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
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
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
import com.flask.colorpicker.*;
import com.flask.colorpicker.builder.ColorPickerDialogBuilder;
import com.flask.colorpicker.OnColorSelectedListener;
import com.flask.colorpicker.builder.ColorPickerClickListener;
import androidx.core.widget.NestedScrollView;
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
import com.flask.colorpicker.*;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import android.content.ClipData;
import android.content.ClipboardManager;
import Ninja.coder.Ghostemane.code.EditorSearch.CodeEditorSearch;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.progressindicator.CircularProgressIndicator;

public class AnjctorcolorActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private HashMap<String, Object> imap = new HashMap<>();
	private String jsonpath = "";
	private String html = "";
	private String java = "";
	private String xml = "";
	
	private NestedScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout CustomToolbar;
	private LinearLayout linear2;
	private LinearLayout linear4;
	private LinearLayout linear6;
	private LinearLayout linear8;
	private LinearLayout linear11;
	private LinearLayout linear14;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private LinearLayout linear27;
	private LinearLayout linear30;
	private LinearLayout linear36;
	private LinearLayout linear38;
	private LinearLayout linear40;
	private LinearLayout linear42;
	private LinearLayout linear44;
	private LinearLayout linear46;
	private LinearLayout linear48;
	private LinearLayout linear50;
	private LinearLayout linear52;
	private LinearLayout linear54;
	private LinearLayout linear56;
	private LinearLayout linear58;
	private LinearLayout linear60;
	private LinearLayout linear63;
	private ImageView imageview29;
	private ImageView resultViewer;
	private TextView textview35;
	private ImageView imageview30;
	private TextView textview2;
	private LinearLayout linear3;
	private LinearLayout htmltagcolor;
	private TextView tvtaghtml;
	private ImageView imageview1;
	private TextView textview3;
	private LinearLayout linear5;
	private LinearLayout linearkeyword;
	private TextView tvkeyword;
	private ImageView imageview2;
	private TextView textview4;
	private LinearLayout linear7;
	private LinearLayout linearOPERATOR;
	private TextView tvOPERATOR;
	private ImageView imageview3;
	private TextView textview5;
	private LinearLayout linear9;
	private LinearLayout linearBLOCK_LINE;
	private TextView tvBLOCK_LINE;
	private ImageView imageview4;
	private TextView textview7;
	private LinearLayout linear12;
	private LinearLayout linearBLOCK_LINE_CURRENT;
	private TextView tvBLOCK_LINE_CURRENT;
	private ImageView imageview5;
	private TextView textview9;
	private LinearLayout linear15;
	private LinearLayout linearNON_PRINTABLE_CHAR;
	private TextView textviewNON_PRINTABLE_CHAR;
	private ImageView imageview6;
	private TextView textview10;
	private LinearLayout linear22;
	private LinearLayout linearLINE_DIVIDER;
	private TextView tvLINE_DIVIDER;
	private ImageView imageview7;
	private TextView textview11;
	private LinearLayout linear23;
	private LinearLayout linearLINE_NUMBER;
	private TextView tvLINE_NUMBER;
	private ImageView imageview8;
	private TextView textview12;
	private LinearLayout linear24;
	private LinearLayout linearATTRIBUTE_VALUE;
	private TextView textviewATTRIBUTE_VALUE;
	private ImageView imageview9;
	private TextView textview13;
	private LinearLayout linear26;
	private LinearLayout linearTEXT_NORMAL;
	private TextView textviewTEXT_NORMAL;
	private ImageView imageview10;
	private TextView textview15;
	private LinearLayout linear28;
	private LinearLayout linearBackgroundColorLinear;
	private TextView textviewBackgroundColorLinear;
	private ImageView imageview11;
	private TextView textview16;
	private LinearLayout linear29;
	private LinearLayout linearImageColor;
	private TextView textviewImageColor;
	private ImageView imageview12;
	private TextView textview19;
	private LinearLayout linear35;
	private LinearLayout linearFabBackgroundColorColor;
	private TextView textviewFabBackgroundColorColor;
	private ImageView imageview13;
	private TextView textview20;
	private LinearLayout linear37;
	private LinearLayout linearFabImageColor;
	private TextView textviewFabImageColor;
	private ImageView imageview14;
	private TextView textview21;
	private LinearLayout linear39;
	private LinearLayout linearToolbarTextColor;
	private TextView textviewToolbarTextColor;
	private ImageView imageview15;
	private TextView textview22;
	private LinearLayout linear41;
	private LinearLayout linearToolbarColor;
	private TextView textviewToolbarColor;
	private ImageView imageview16;
	private TextView textview23;
	private LinearLayout linear43;
	private LinearLayout linearSyombolBarTextColor;
	private TextView textviewSyombolBarTextColor;
	private ImageView imageview17;
	private TextView textview24;
	private LinearLayout linear45;
	private LinearLayout linearprint;
	private TextView textviewprint;
	private ImageView imageview18;
	private TextView textview25;
	private LinearLayout linear47;
	private LinearLayout linearTabBack;
	private TextView textviewTabBack;
	private ImageView imageview19;
	private TextView textview26;
	private LinearLayout linear49;
	private LinearLayout linearTabTextColor;
	private TextView textviewTabTextColor;
	private ImageView imageview22;
	private TextView textview27;
	private LinearLayout linear51;
	private LinearLayout linearTabImageColorFilter;
	private TextView textviewTabImageColorFilter;
	private ImageView imageview21;
	private TextView textview28;
	private LinearLayout linear53;
	private LinearLayout linearNinja;
	private TextView textviewNinja;
	private ImageView imageview23;
	private TextView textview29;
	private LinearLayout linear55;
	private LinearLayout linearDisplayTextColorTab;
	private TextView textviewDisplayTextColorTab;
	private ImageView imageview24;
	private TextView textview30;
	private LinearLayout linear57;
	private LinearLayout linearFabColorStroker;
	private TextView textviewFabColorStroker;
	private ImageView imageview25;
	private TextView textview31;
	private LinearLayout linear59;
	private LinearLayout linearLITERAL;
	private TextView textviewLITERAL;
	private ImageView imageview26;
	private TextView textview32;
	private LinearLayout linear61;
	private LinearLayout linearAUTO_COMP_PANEL_CORNER;
	private TextView textviewAUTO_COMP_PANEL_CORNER;
	private ImageView imageview27;
	private TextView textview34;
	private LinearLayout linear64;
	private LinearLayout linear65;
	private LinearLayout linearAUTO_COMP_PANEL_BG;
	private TextView textviewAUTO_COMP_PANEL_BG;
	private ImageView imageview28;
	private TextView textview36;
	private LinearLayout linear66;
	private LinearLayout linearSELECTION_INSERT;
	private TextView textviewSELECTION_INSERT;
	private ImageView imageview31;
	
	private SharedPreferences co;
	private TimerTask pvr;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.anjctorcolor);
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
		CustomToolbar = findViewById(R.id.CustomToolbar);
		linear2 = findViewById(R.id.linear2);
		linear4 = findViewById(R.id.linear4);
		linear6 = findViewById(R.id.linear6);
		linear8 = findViewById(R.id.linear8);
		linear11 = findViewById(R.id.linear11);
		linear14 = findViewById(R.id.linear14);
		linear17 = findViewById(R.id.linear17);
		linear18 = findViewById(R.id.linear18);
		linear19 = findViewById(R.id.linear19);
		linear20 = findViewById(R.id.linear20);
		linear21 = findViewById(R.id.linear21);
		linear27 = findViewById(R.id.linear27);
		linear30 = findViewById(R.id.linear30);
		linear36 = findViewById(R.id.linear36);
		linear38 = findViewById(R.id.linear38);
		linear40 = findViewById(R.id.linear40);
		linear42 = findViewById(R.id.linear42);
		linear44 = findViewById(R.id.linear44);
		linear46 = findViewById(R.id.linear46);
		linear48 = findViewById(R.id.linear48);
		linear50 = findViewById(R.id.linear50);
		linear52 = findViewById(R.id.linear52);
		linear54 = findViewById(R.id.linear54);
		linear56 = findViewById(R.id.linear56);
		linear58 = findViewById(R.id.linear58);
		linear60 = findViewById(R.id.linear60);
		linear63 = findViewById(R.id.linear63);
		imageview29 = findViewById(R.id.imageview29);
		resultViewer = findViewById(R.id.resultViewer);
		textview35 = findViewById(R.id.textview35);
		imageview30 = findViewById(R.id.imageview30);
		textview2 = findViewById(R.id.textview2);
		linear3 = findViewById(R.id.linear3);
		htmltagcolor = findViewById(R.id.htmltagcolor);
		tvtaghtml = findViewById(R.id.tvtaghtml);
		imageview1 = findViewById(R.id.imageview1);
		textview3 = findViewById(R.id.textview3);
		linear5 = findViewById(R.id.linear5);
		linearkeyword = findViewById(R.id.linearkeyword);
		tvkeyword = findViewById(R.id.tvkeyword);
		imageview2 = findViewById(R.id.imageview2);
		textview4 = findViewById(R.id.textview4);
		linear7 = findViewById(R.id.linear7);
		linearOPERATOR = findViewById(R.id.linearOPERATOR);
		tvOPERATOR = findViewById(R.id.tvOPERATOR);
		imageview3 = findViewById(R.id.imageview3);
		textview5 = findViewById(R.id.textview5);
		linear9 = findViewById(R.id.linear9);
		linearBLOCK_LINE = findViewById(R.id.linearBLOCK_LINE);
		tvBLOCK_LINE = findViewById(R.id.tvBLOCK_LINE);
		imageview4 = findViewById(R.id.imageview4);
		textview7 = findViewById(R.id.textview7);
		linear12 = findViewById(R.id.linear12);
		linearBLOCK_LINE_CURRENT = findViewById(R.id.linearBLOCK_LINE_CURRENT);
		tvBLOCK_LINE_CURRENT = findViewById(R.id.tvBLOCK_LINE_CURRENT);
		imageview5 = findViewById(R.id.imageview5);
		textview9 = findViewById(R.id.textview9);
		linear15 = findViewById(R.id.linear15);
		linearNON_PRINTABLE_CHAR = findViewById(R.id.linearNON_PRINTABLE_CHAR);
		textviewNON_PRINTABLE_CHAR = findViewById(R.id.textviewNON_PRINTABLE_CHAR);
		imageview6 = findViewById(R.id.imageview6);
		textview10 = findViewById(R.id.textview10);
		linear22 = findViewById(R.id.linear22);
		linearLINE_DIVIDER = findViewById(R.id.linearLINE_DIVIDER);
		tvLINE_DIVIDER = findViewById(R.id.tvLINE_DIVIDER);
		imageview7 = findViewById(R.id.imageview7);
		textview11 = findViewById(R.id.textview11);
		linear23 = findViewById(R.id.linear23);
		linearLINE_NUMBER = findViewById(R.id.linearLINE_NUMBER);
		tvLINE_NUMBER = findViewById(R.id.tvLINE_NUMBER);
		imageview8 = findViewById(R.id.imageview8);
		textview12 = findViewById(R.id.textview12);
		linear24 = findViewById(R.id.linear24);
		linearATTRIBUTE_VALUE = findViewById(R.id.linearATTRIBUTE_VALUE);
		textviewATTRIBUTE_VALUE = findViewById(R.id.textviewATTRIBUTE_VALUE);
		imageview9 = findViewById(R.id.imageview9);
		textview13 = findViewById(R.id.textview13);
		linear26 = findViewById(R.id.linear26);
		linearTEXT_NORMAL = findViewById(R.id.linearTEXT_NORMAL);
		textviewTEXT_NORMAL = findViewById(R.id.textviewTEXT_NORMAL);
		imageview10 = findViewById(R.id.imageview10);
		textview15 = findViewById(R.id.textview15);
		linear28 = findViewById(R.id.linear28);
		linearBackgroundColorLinear = findViewById(R.id.linearBackgroundColorLinear);
		textviewBackgroundColorLinear = findViewById(R.id.textviewBackgroundColorLinear);
		imageview11 = findViewById(R.id.imageview11);
		textview16 = findViewById(R.id.textview16);
		linear29 = findViewById(R.id.linear29);
		linearImageColor = findViewById(R.id.linearImageColor);
		textviewImageColor = findViewById(R.id.textviewImageColor);
		imageview12 = findViewById(R.id.imageview12);
		textview19 = findViewById(R.id.textview19);
		linear35 = findViewById(R.id.linear35);
		linearFabBackgroundColorColor = findViewById(R.id.linearFabBackgroundColorColor);
		textviewFabBackgroundColorColor = findViewById(R.id.textviewFabBackgroundColorColor);
		imageview13 = findViewById(R.id.imageview13);
		textview20 = findViewById(R.id.textview20);
		linear37 = findViewById(R.id.linear37);
		linearFabImageColor = findViewById(R.id.linearFabImageColor);
		textviewFabImageColor = findViewById(R.id.textviewFabImageColor);
		imageview14 = findViewById(R.id.imageview14);
		textview21 = findViewById(R.id.textview21);
		linear39 = findViewById(R.id.linear39);
		linearToolbarTextColor = findViewById(R.id.linearToolbarTextColor);
		textviewToolbarTextColor = findViewById(R.id.textviewToolbarTextColor);
		imageview15 = findViewById(R.id.imageview15);
		textview22 = findViewById(R.id.textview22);
		linear41 = findViewById(R.id.linear41);
		linearToolbarColor = findViewById(R.id.linearToolbarColor);
		textviewToolbarColor = findViewById(R.id.textviewToolbarColor);
		imageview16 = findViewById(R.id.imageview16);
		textview23 = findViewById(R.id.textview23);
		linear43 = findViewById(R.id.linear43);
		linearSyombolBarTextColor = findViewById(R.id.linearSyombolBarTextColor);
		textviewSyombolBarTextColor = findViewById(R.id.textviewSyombolBarTextColor);
		imageview17 = findViewById(R.id.imageview17);
		textview24 = findViewById(R.id.textview24);
		linear45 = findViewById(R.id.linear45);
		linearprint = findViewById(R.id.linearprint);
		textviewprint = findViewById(R.id.textviewprint);
		imageview18 = findViewById(R.id.imageview18);
		textview25 = findViewById(R.id.textview25);
		linear47 = findViewById(R.id.linear47);
		linearTabBack = findViewById(R.id.linearTabBack);
		textviewTabBack = findViewById(R.id.textviewTabBack);
		imageview19 = findViewById(R.id.imageview19);
		textview26 = findViewById(R.id.textview26);
		linear49 = findViewById(R.id.linear49);
		linearTabTextColor = findViewById(R.id.linearTabTextColor);
		textviewTabTextColor = findViewById(R.id.textviewTabTextColor);
		imageview22 = findViewById(R.id.imageview22);
		textview27 = findViewById(R.id.textview27);
		linear51 = findViewById(R.id.linear51);
		linearTabImageColorFilter = findViewById(R.id.linearTabImageColorFilter);
		textviewTabImageColorFilter = findViewById(R.id.textviewTabImageColorFilter);
		imageview21 = findViewById(R.id.imageview21);
		textview28 = findViewById(R.id.textview28);
		linear53 = findViewById(R.id.linear53);
		linearNinja = findViewById(R.id.linearNinja);
		textviewNinja = findViewById(R.id.textviewNinja);
		imageview23 = findViewById(R.id.imageview23);
		textview29 = findViewById(R.id.textview29);
		linear55 = findViewById(R.id.linear55);
		linearDisplayTextColorTab = findViewById(R.id.linearDisplayTextColorTab);
		textviewDisplayTextColorTab = findViewById(R.id.textviewDisplayTextColorTab);
		imageview24 = findViewById(R.id.imageview24);
		textview30 = findViewById(R.id.textview30);
		linear57 = findViewById(R.id.linear57);
		linearFabColorStroker = findViewById(R.id.linearFabColorStroker);
		textviewFabColorStroker = findViewById(R.id.textviewFabColorStroker);
		imageview25 = findViewById(R.id.imageview25);
		textview31 = findViewById(R.id.textview31);
		linear59 = findViewById(R.id.linear59);
		linearLITERAL = findViewById(R.id.linearLITERAL);
		textviewLITERAL = findViewById(R.id.textviewLITERAL);
		imageview26 = findViewById(R.id.imageview26);
		textview32 = findViewById(R.id.textview32);
		linear61 = findViewById(R.id.linear61);
		linearAUTO_COMP_PANEL_CORNER = findViewById(R.id.linearAUTO_COMP_PANEL_CORNER);
		textviewAUTO_COMP_PANEL_CORNER = findViewById(R.id.textviewAUTO_COMP_PANEL_CORNER);
		imageview27 = findViewById(R.id.imageview27);
		textview34 = findViewById(R.id.textview34);
		linear64 = findViewById(R.id.linear64);
		linear65 = findViewById(R.id.linear65);
		linearAUTO_COMP_PANEL_BG = findViewById(R.id.linearAUTO_COMP_PANEL_BG);
		textviewAUTO_COMP_PANEL_BG = findViewById(R.id.textviewAUTO_COMP_PANEL_BG);
		imageview28 = findViewById(R.id.imageview28);
		textview36 = findViewById(R.id.textview36);
		linear66 = findViewById(R.id.linear66);
		linearSELECTION_INSERT = findViewById(R.id.linearSELECTION_INSERT);
		textviewSELECTION_INSERT = findViewById(R.id.textviewSELECTION_INSERT);
		imageview31 = findViewById(R.id.imageview31);
		co = getSharedPreferences("co", Activity.MODE_PRIVATE);
		
		imageview29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imap.put("HTML_TAG", tvtaghtml.getText().toString());
				imap.put("KEYWORD", tvkeyword.getText().toString());
				imap.put("OPERATOR", tvOPERATOR.getText().toString());
				imap.put("BLOCK_LINE", tvBLOCK_LINE.getText().toString());
				imap.put("BLOCK_LINE_CURRENT", tvBLOCK_LINE_CURRENT.getText().toString());
				imap.put("NON_PRINTABLE_CHAR", textviewNON_PRINTABLE_CHAR.getText().toString());
				imap.put("LINE_DIVIDER", tvLINE_DIVIDER.getText().toString());
				imap.put("LINE_NUMBER", tvLINE_NUMBER.getText().toString());
				imap.put("ATTRIBUTE_VALUE", textviewATTRIBUTE_VALUE.getText().toString());
				imap.put("TEXT_NORMAL", textviewTEXT_NORMAL.getText().toString());
				imap.put("BackgroundColorLinear", textviewBackgroundColorLinear.getText().toString());
				imap.put("ImageColor", textviewImageColor.getText().toString());
				imap.put("FabBackgroundColorColor", textviewFabBackgroundColorColor.getText().toString());
				imap.put("FabImageColor", textviewFabImageColor.getText().toString());
				imap.put("ToolbarTextColor", textviewToolbarTextColor.getText().toString());
				imap.put("ToolbarColor", textviewToolbarColor.getText().toString());
				imap.put("SyombolBarTextColor", textviewSyombolBarTextColor.getText().toString());
				imap.put("print", textviewprint.getText().toString());
				imap.put("TabBack", textviewTabBack.getText().toString());
				imap.put("TabTextColor", textviewTabTextColor.getText().toString());
				imap.put("TabImageColorFilter", textviewTabImageColorFilter.getText().toString());
				imap.put("Ninja", textviewNinja.getText().toString());
				imap.put("DisplayTextColorTab", textviewDisplayTextColorTab.getText().toString());
				imap.put("FabColorStroker", textviewFabColorStroker.getText().toString());
				imap.put("LITERAL", textviewLITERAL.getText().toString());
				imap.put("AUTO_COMP_PANEL_BG", textviewAUTO_COMP_PANEL_BG.getText().toString());
				imap.put("AUTO_COMP_PANEL_CORNER", textviewAUTO_COMP_PANEL_CORNER.getText().toString());
				imap.put("SELECTION_INSERT", textviewSELECTION_INSERT.getText().toString());
				imap.put("SELECTION_HANDLE", textviewSELECTION_INSERT.getText().toString());
				FileUtil.writeFile(jsonpath, new Gson().toJson(imap));
				ViewGroup v = (ViewGroup) ((ViewGroup) AnjctorcolorActivity.this .findViewById(android.R.id.content)).getChildAt(0);
				
				final var snackbar = com.google.android.material.snackbar.Snackbar.make(v, "", com.google.android.material.snackbar.Snackbar.LENGTH_SHORT);
				  
				                
				                View customSnackView = getLayoutInflater().inflate(R.layout.customsneakbar, null);
				  
				                
				                snackbar.getView().setBackgroundColor(Color.TRANSPARENT);
				  
				                
				                var snackbarLayout = (com.google.android.material.snackbar.Snackbar.SnackbarLayout) snackbar.getView();
				  
				                
				                snackbarLayout.setPadding(0, 0, 0, 0);
				  
				                
				                androidx.cardview.widget.CardView card = customSnackView.findViewById(R.id.card);           
				card.setCardBackgroundColor(0xFF2B2122);
				card.setRadius((float)20);
				card.setCardElevation((float)3);
				snackbar.dismiss();                    
				  
				                
				                snackbarLayout.addView(customSnackView, 0);
				                  
				                snackbar.show();
			}
		});
		
		resultViewer.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_editorcolor();
			}
		});
		
		imageview30.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				onBackPressed();
			}
		});
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(htmltagcolor, tvtaghtml);
			}
		});
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(linearkeyword, tvkeyword);
			}
		});
		
		imageview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(linearOPERATOR, tvOPERATOR);
			}
		});
		
		imageview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(linearBLOCK_LINE, tvBLOCK_LINE);
			}
		});
		
		imageview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(linearBLOCK_LINE_CURRENT, tvBLOCK_LINE_CURRENT);
			}
		});
		
		imageview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(linearNON_PRINTABLE_CHAR, textviewNON_PRINTABLE_CHAR);
			}
		});
		
		imageview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(linearLINE_DIVIDER, tvLINE_DIVIDER);
			}
		});
		
		imageview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(linearLINE_NUMBER, tvLINE_NUMBER);
			}
		});
		
		imageview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(linearATTRIBUTE_VALUE, textviewATTRIBUTE_VALUE);
			}
		});
		
		imageview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(linearTEXT_NORMAL, textviewTEXT_NORMAL);
			}
		});
		
		imageview11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(linearBackgroundColorLinear, textviewBackgroundColorLinear);
			}
		});
		
		imageview12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(linearImageColor, textviewImageColor);
			}
		});
		
		imageview13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(linearFabBackgroundColorColor, textviewFabBackgroundColorColor);
			}
		});
		
		imageview14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(linearFabImageColor, textviewFabImageColor);
			}
		});
		
		imageview15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(linearToolbarTextColor, textviewToolbarTextColor);
			}
		});
		
		imageview16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(linearToolbarColor, textviewToolbarColor);
			}
		});
		
		imageview17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(linearSyombolBarTextColor, textviewSyombolBarTextColor);
			}
		});
		
		imageview18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(linearprint, textviewprint);
			}
		});
		
		imageview19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(linearTabBack, textviewTabBack);
			}
		});
		
		imageview22.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(linearTabTextColor, textviewTabTextColor);
			}
		});
		
		imageview21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(linearTabImageColorFilter, textviewTabImageColorFilter);
			}
		});
		
		imageview23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(linearNinja, textviewNinja);
			}
		});
		
		imageview24.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(linearDisplayTextColorTab, textviewDisplayTextColorTab);
			}
		});
		
		imageview25.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(linearFabColorStroker, textviewFabColorStroker);
			}
		});
		
		imageview26.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(linearLITERAL, textviewLITERAL);
			}
		});
		
		imageview27.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(linearAUTO_COMP_PANEL_CORNER, textviewAUTO_COMP_PANEL_CORNER);
			}
		});
		
		imageview28.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(linearAUTO_COMP_PANEL_BG, textviewAUTO_COMP_PANEL_BG);
			}
		});
		
		imageview31.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_setcolor(linearSELECTION_INSERT, textviewSELECTION_INSERT);
			}
		});
	}
	
	private void initializeLogic() {
		_toolbar.setBackgroundColor(0xFF1C1B20);
		_toolbar.setVisibility(View.GONE);
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) { 
				Window Hsi = this.getWindow();
				Hsi.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				Hsi.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
				Hsi.setStatusBarColor(Color.parseColor("#FF2B2121")); 
				Hsi.setNavigationBarColor(Color.parseColor("#FF2B2121"));
		}
		_toolbar.setElevation((float)0);
		
		imap = new HashMap<>();
		jsonpath = "/storage/emulated/0/GhostWebIDE/theme/GhostThemeapp.ghost";
		imap = new Gson().fromJson(FileUtil.readFile(jsonpath), new TypeToken<HashMap<String, Object>>(){}.getType());
		var gradientDrawable  = new GradientDrawable();
		gradientDrawable.setColor(0xFF1F1B1C);
		AnjctorcolorActivity.this.getWindow().setBackgroundDrawable(gradientDrawable);
		if (imap.containsKey("HTML_TAG")) {
			tvtaghtml.setText(imap.get("HTML_TAG").toString());
			htmltagcolor.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("HTML_TAG").toString())));
		}
		else {
			tvtaghtml.setText("Null");
			htmltagcolor.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			imageview29.setEnabled(false);
		}
		if (imap.containsKey("KEYWORD")) {
			tvkeyword.setText(imap.get("KEYWORD").toString());
			linearkeyword.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("KEYWORD").toString())));
		}
		else {
			tvkeyword.setText("Null");
			linearkeyword.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			imageview29.setEnabled(false);
		}
		if (imap.containsKey("OPERATOR")) {
			tvOPERATOR.setText(imap.get("OPERATOR").toString());
			linearOPERATOR.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("OPERATOR").toString())));
		}
		else {
			tvOPERATOR.setText("Null");
			linearOPERATOR.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			imageview29.setEnabled(false);
		}
		if (imap.containsKey("BLOCK_LINE")) {
			tvBLOCK_LINE.setText(imap.get("BLOCK_LINE").toString());
			linearBLOCK_LINE.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("BLOCK_LINE").toString())));
		}
		else {
			tvBLOCK_LINE.setText("Null");
			linearBLOCK_LINE.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			imageview29.setEnabled(false);
		}
		if (imap.containsKey("BLOCK_LINE_CURRENT")) {
			tvBLOCK_LINE_CURRENT.setText(imap.get("BLOCK_LINE_CURRENT").toString());
			linearBLOCK_LINE_CURRENT.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("BLOCK_LINE_CURRENT").toString())));
		}
		else {
			tvBLOCK_LINE_CURRENT.setText("Null");
			linearBLOCK_LINE_CURRENT.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			imageview29.setEnabled(false);
		}
		if (imap.containsKey("NON_PRINTABLE_CHAR")) {
			textviewNON_PRINTABLE_CHAR.setText(imap.get("NON_PRINTABLE_CHAR").toString());
			linearNON_PRINTABLE_CHAR.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("NON_PRINTABLE_CHAR").toString())));
		}
		else {
			textviewNON_PRINTABLE_CHAR.setText("Null");
			linearNON_PRINTABLE_CHAR.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			imageview29.setEnabled(false);
		}
		if (imap.containsKey("LINE_DIVIDER")) {
			tvLINE_DIVIDER.setText(imap.get("LINE_DIVIDER").toString());
			linearLINE_DIVIDER.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("LINE_DIVIDER").toString())));
		}
		else {
			tvLINE_DIVIDER.setText("Null");
			linearLINE_DIVIDER.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			imageview29.setEnabled(false);
		}
		if (imap.containsKey("LINE_NUMBER")) {
			tvLINE_NUMBER.setText(imap.get("LINE_NUMBER").toString());
			linearLINE_NUMBER.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("LINE_NUMBER").toString())));
		}
		else {
			tvLINE_NUMBER.setText("Null");
			linearLINE_NUMBER.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			imageview29.setEnabled(false);
		}
		if (imap.containsKey("ATTRIBUTE_VALUE")) {
			textviewATTRIBUTE_VALUE.setText(imap.get("ATTRIBUTE_VALUE").toString());
			linearATTRIBUTE_VALUE.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("ATTRIBUTE_VALUE").toString())));
		}
		else {
			textviewATTRIBUTE_VALUE.setText("Null");
			linearATTRIBUTE_VALUE.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			imageview29.setEnabled(false);
		}
		if (imap.containsKey("TEXT_NORMAL")) {
			textviewTEXT_NORMAL.setText(imap.get("TEXT_NORMAL").toString());
			linearTEXT_NORMAL.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("TEXT_NORMAL").toString())));
		}
		else {
			textviewTEXT_NORMAL.setText("Null");
			linearTEXT_NORMAL.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			imageview29.setEnabled(false);
		}
		if (imap.containsKey("BackgroundColorLinear")) {
			textviewBackgroundColorLinear.setText(imap.get("BackgroundColorLinear").toString());
			linearBackgroundColorLinear.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("BackgroundColorLinear").toString())));
		}
		else {
			textviewBackgroundColorLinear.setText("Null");
			linearBackgroundColorLinear.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			imageview29.setEnabled(false);
		}
		if (imap.containsKey("ImageColor")) {
			linearImageColor.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("ImageColor").toString())));
			textviewImageColor.setText(imap.get("ImageColor").toString());
		}
		else {
			linearImageColor.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			textviewImageColor.setText("Null");
			imageview29.setEnabled(false);
		}
		if (imap.containsKey("FabBackgroundColorColor")) {
			linearFabBackgroundColorColor.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("FabBackgroundColorColor").toString())));
			textviewFabBackgroundColorColor.setText(imap.get("FabBackgroundColorColor").toString());
		}
		else {
			linearFabBackgroundColorColor.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			textviewFabBackgroundColorColor.setText("Null");
			imageview29.setEnabled(false);
		}
		if (imap.containsKey("FabImageColor")) {
			linearFabImageColor.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("FabImageColor").toString())));
			textviewFabImageColor.setText(imap.get("FabImageColor").toString());
		}
		else {
			linearFabImageColor.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			textviewFabImageColor.setText("Null");
			imageview29.setEnabled(false);
		}
		if (imap.containsKey("ToolbarTextColor")) {
			linearToolbarTextColor.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("ToolbarTextColor").toString())));
			textviewToolbarTextColor.setText(imap.get("ToolbarTextColor").toString());
		}
		else {
			linearToolbarTextColor.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			textviewToolbarTextColor.setText("Null");
			imageview29.setEnabled(false);
		}
		if (imap.containsKey("ToolbarColor")) {
			linearToolbarColor.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("ToolbarColor").toString())));
			textviewToolbarColor.setText(imap.get("ToolbarColor").toString());
		}
		else {
			linearToolbarColor.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			textviewToolbarColor.setText("Null");
			imageview29.setEnabled(false);
		}
		if (imap.containsKey("SyombolBarTextColor")) {
			linearSyombolBarTextColor.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("SyombolBarTextColor").toString())));
			textviewSyombolBarTextColor.setText(imap.get("SyombolBarTextColor").toString());
		}
		else {
			linearSyombolBarTextColor.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			textviewSyombolBarTextColor.setText("Null");
			imageview29.setEnabled(false);
		}
		if (imap.containsKey("print")) {
			linearprint.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("print").toString())));
			textviewprint.setText(imap.get("print").toString());
		}
		else {
			linearprint.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			textviewprint.setText("Null");
			imageview29.setEnabled(false);
		}
		if (imap.containsKey("TabBack")) {
			linearTabBack.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("TabBack").toString())));
			textviewTabBack.setText(imap.get("TabBack").toString());
		}
		else {
			linearTabBack.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			textviewTabBack.setText("Null");
			imageview29.setEnabled(false);
		}
		if (imap.containsKey("TabTextColor")) {
			linearTabTextColor.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("TabTextColor").toString())));
			textviewTabTextColor.setText(imap.get("TabTextColor").toString());
		}
		else {
			linearTabTextColor.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			textviewTabTextColor.setText("Null");
			imageview29.setEnabled(false);
		}
		if (imap.containsKey("TabImageColorFilter")) {
			linearTabImageColorFilter.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("TabImageColorFilter").toString())));
			textviewTabImageColorFilter.setText(imap.get("TabImageColorFilter").toString());
		}
		else {
			linearTabImageColorFilter.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			textviewTabImageColorFilter.setText("Null");
			imageview29.setEnabled(false);
		}
		if (imap.containsKey("DisplayTextColorTab")) {
			linearDisplayTextColorTab.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("DisplayTextColorTab").toString())));
			textviewDisplayTextColorTab.setText(imap.get("DisplayTextColorTab").toString());
		}
		else {
			linearDisplayTextColorTab.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			textviewDisplayTextColorTab.setText("Null");
			imageview29.setEnabled(false);
		}
		if (imap.containsKey("Ninja")) {
			linearNinja.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("Ninja").toString())));
			textviewNinja.setText(imap.get("Ninja").toString());
		}
		else {
			linearNinja.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			textviewNinja.setText("Null");
			imageview29.setEnabled(false);
		}
		if (imap.containsKey("FabColorStroker")) {
			linearFabColorStroker.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("FabColorStroker").toString())));
			textviewFabColorStroker.setText(imap.get("FabColorStroker").toString());
		}
		else {
			linearFabColorStroker.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			textviewFabColorStroker.setText("Null");
			imageview29.setEnabled(false);
		}
		if (imap.containsKey("LITERAL")) {
			linearLITERAL.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("LITERAL").toString())));
			textviewLITERAL.setText(imap.get("LITERAL").toString());
		}
		else {
			linearLITERAL.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			textviewLITERAL.setText("Null");
			imageview29.setEnabled(false);
		}
		if (imap.containsKey("AUTO_COMP_PANEL_CORNER")) {
			linearAUTO_COMP_PANEL_CORNER.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("AUTO_COMP_PANEL_CORNER").toString())));
			textviewAUTO_COMP_PANEL_CORNER.setText(imap.get("AUTO_COMP_PANEL_CORNER").toString());
		}
		else {
			linearAUTO_COMP_PANEL_CORNER.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			textviewAUTO_COMP_PANEL_CORNER.setText("Null");
			imageview29.setEnabled(false);
		}
		if (imap.containsKey("AUTO_COMP_PANEL_BG")) {
			linearAUTO_COMP_PANEL_BG.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("AUTO_COMP_PANEL_BG").toString())));
			textviewAUTO_COMP_PANEL_BG.setText(imap.get("AUTO_COMP_PANEL_BG").toString());
		}
		else {
			linearAUTO_COMP_PANEL_BG.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			textviewAUTO_COMP_PANEL_BG.setText("Null");
			imageview29.setEnabled(false);
		}
		if (imap.containsKey("SELECTION_INSERT") && imap.containsKey("SELECTION_HANDLE")) {
			textviewSELECTION_INSERT.setText(imap.get("SELECTION_INSERT").toString());
			linearSELECTION_INSERT.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor(imap.get("SELECTION_INSERT").toString())));
		}
		else {
			linearSELECTION_INSERT.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
			textviewSELECTION_INSERT.setText("Null");
			imageview29.setEnabled(false);
		}
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuItem menuitem1 = menu.add(Menu.NONE, 1, Menu.NONE, "save");
		menuitem1.setIcon(R.drawable.save);
		menuitem1.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
		MenuItem menuitem2 = menu.add(Menu.NONE, 1, Menu.NONE, "save");
		menuitem2.setIcon(R.drawable.okeye);
		menuitem2.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		final int _id = item.getItemId();
		final String _title = (String) item.getTitle();
		if (_id == 1) {
			imap.put("HTML_TAG", tvtaghtml.getText().toString());
			imap.put("KEYWORD", tvkeyword.getText().toString());
			imap.put("OPERATOR", tvOPERATOR.getText().toString());
			imap.put("BLOCK_LINE", tvBLOCK_LINE.getText().toString());
			imap.put("BLOCK_LINE_CURRENT", tvBLOCK_LINE_CURRENT.getText().toString());
			imap.put("NON_PRINTABLE_CHAR", textviewNON_PRINTABLE_CHAR.getText().toString());
			imap.put("LINE_DIVIDER", tvLINE_DIVIDER.getText().toString());
			imap.put("LINE_NUMBER", tvLINE_NUMBER.getText().toString());
			imap.put("ATTRIBUTE_VALUE", textviewATTRIBUTE_VALUE.getText().toString());
			imap.put("TEXT_NORMAL", textviewTEXT_NORMAL.getText().toString());
			imap.put("BackgroundColorLinear", textviewBackgroundColorLinear.getText().toString());
			imap.put("ImageColor", textviewImageColor.getText().toString());
			imap.put("FabBackgroundColorColor", textviewFabBackgroundColorColor.getText().toString());
			imap.put("FabImageColor", textviewFabImageColor.getText().toString());
			imap.put("ToolbarTextColor", textviewToolbarTextColor.getText().toString());
			imap.put("ToolbarColor", textviewToolbarColor.getText().toString());
			imap.put("SyombolBarTextColor", textviewSyombolBarTextColor.getText().toString());
			imap.put("print", textviewprint.getText().toString());
			imap.put("TabBack", textviewTabBack.getText().toString());
			imap.put("TabTextColor", textviewTabTextColor.getText().toString());
			imap.put("TabImageColorFilter", textviewTabImageColorFilter.getText().toString());
			imap.put("Ninja", textviewNinja.getText().toString());
			imap.put("DisplayTextColorTab", textviewDisplayTextColorTab.getText().toString());
			imap.put("FabColorStroker", textviewFabColorStroker.getText().toString());
			imap.put("LITERAL", textviewLITERAL.getText().toString());
			imap.put("AUTO_COMP_PANEL_BG", textviewAUTO_COMP_PANEL_BG.getText().toString());
			imap.put("AUTO_COMP_PANEL_CORNER", textviewAUTO_COMP_PANEL_CORNER.getText().toString());
			FileUtil.writeFile(jsonpath, new Gson().toJson(imap));
			ViewGroup v = (ViewGroup) ((ViewGroup) AnjctorcolorActivity.this .findViewById(android.R.id.content)).getChildAt(0);
			
			final var snackbar = com.google.android.material.snackbar.Snackbar.make(v, "", com.google.android.material.snackbar.Snackbar.LENGTH_SHORT);
			  
			                
			                View customSnackView = getLayoutInflater().inflate(R.layout.customsneakbar, null);
			  
			                
			                snackbar.getView().setBackgroundColor(Color.TRANSPARENT);
			  
			                
			                var snackbarLayout = (com.google.android.material.snackbar.Snackbar.SnackbarLayout) snackbar.getView();
			  
			                
			                snackbarLayout.setPadding(0, 0, 0, 0);
			  
			                
			                androidx.cardview.widget.CardView card = customSnackView.findViewById(R.id.card);           
			card.setCardBackgroundColor(0xFF1F1B1C);
			card.setRadius((float)20);
			card.setCardElevation((float)3);
			snackbar.dismiss();                    
			  
			                
			                snackbarLayout.addView(customSnackView, 0);
			                  
			                snackbar.show();
		}
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	public void onStart() {
		super.onStart();
		AnimUtils.Worker(imageview29);
	}
	public void _setcolor(final View _setlinear, final TextView _tvone) {
		ColorPickerDialogBuilder
		.with(AnjctorcolorActivity.this)
		.setTitle("SetColor")
		.initialColor(getColor(R.color.Ninja))
		.wheelType(ColorPickerView.WHEEL_TYPE.FLOWER)
		.density(20)
		.showColorEdit(true)
		.setOnColorSelectedListener(new OnColorSelectedListener() {
				@Override
				public void onColorSelected(int selectedColor) {
						
				}
		})
		.setPositiveButton("Ok", new ColorPickerClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int selectedColor, Integer[] allColors) {
						
						
						String rgs = Integer.toHexString(selectedColor);
						
						_tvone.setText("#".concat(rgs));
						_setlinear.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, Color.parseColor("#".concat(rgs))));
						
						
				}
		})
		.setNegativeButton("No", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
						
						
						
				}
		})
		
		
		.build()
		.show();
		
	}
	
	
	public void _editorcolor() {
		final com.google.android.material.bottomsheet.BottomSheetDialog bottomSheetDialog = new com.google.android.material.bottomsheet.BottomSheetDialog(AnjctorcolorActivity.this);
		
		View bottomSheetView; bottomSheetView = getLayoutInflater().inflate(R.layout.editorbottomsheet,null );
		bottomSheetDialog.setContentView(bottomSheetView);
		
		bottomSheetDialog.getWindow().findViewById(R.id.design_bottom_sheet).setBackgroundResource(android.R.color.transparent);
		
		io.github.rosemoe.sora.widget.CodeEditor editor = (io.github.rosemoe.sora.widget.CodeEditor) bottomSheetView.findViewById(R.id.editor);
		ImageView more = (ImageView) bottomSheetView.findViewById(R.id.more);
		ImageView close = (ImageView) bottomSheetView.findViewById(R.id.close);
		var setThemeForJson = new a.a.SetThemeForJson();
				setThemeForJson.setThemeCodeEditor(editor,imap,false,AnjctorcolorActivity.this);
				
		java = "package com.myapp.byNinjacoder;\n\nimport java.util.*;\n\npublic class Ninjacoder{\n	public static void postone(int[] p){\n		var input = new Scanner(System.in);\n		int pvr = input.nextInt();\n		if(pvr == 10){\n			System.out.format(\"hello +%d\",pvr);\n		}else{\n			System.out.println(\"Error\");\n	\n		}\n	}\n	\n	protected void Inmap(HashMap<Object,Integer,Boolean>> los){\n		\n		los.put(\"Key\",1,true);\n		los.put(\"Key2\",2,true);\n		los.put(\"Key3\",3,true);\n		los.put(\"Key4\",4,true);\n		los.put(\"Key5\",1,true);\n		los.put(\"Key6\",1,true);\n		los.put(\"Key7\",1,true);\n		los.put(\"Key8\",1,true);\n		los.put(\"Key9\",1,true);\n	}\n}\n";
		editor.setText(java); 
		
		editor.setEditorLanguage(new io.github.rosemoe.sora.langs.java.JavaLanguage()); 
		editor.setEditable(true);
		close.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
				
				bottomSheetDialog.dismiss();
				
			}
		});
		more.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
				
				PopupMenu popup = new PopupMenu(AnjctorcolorActivity.this, more);
				Menu menu = popup.getMenu();
				menu.add("Html code View").setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
				menu.add("Java code View").setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
				popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
					public boolean onMenuItemClick(MenuItem item) {
						switch (item.getTitle().toString()) {
							
							case "Html code View":
							
							html = "<html>\n	<head>\n	<meta charset=\"utf-8\">\n		</head>\n	<body>\n	<div>\n	<h1>hello word </h1>\n	<p>in text in beta not work</p>\n	<p>in massges Result Theme view </p>\n	<p>project by ninja coder(Hanzo Hasahi)</p>\n		</div>\n		</body>\n	</html>\n";
							editor.setText(html);
							
							editor.setEditorLanguage(new HTMLLanguage()); 
							
							return true;
							case "Java code View":
							
							java = "package com.myapp.byNinjacoder;\n\nimport java.util.*;\n\npublic class Ninjacoder{\n	public static void postone(int[] p){\n		var input = new Scanner(System.in);\n		int pvr = input.nextInt();\n		if(pvr == 10){\n			System.out.format(\"hello +%d\",pvr);\n		}else{\n			System.out.println(\"Error\");\n	\n		}\n	}\n	\n	protected void Inmap(HashMap<Object,Integer,Boolean>> los){\n		\n		los.put(\"Key\",1,true);\n		los.put(\"Key2\",2,true);\n		los.put(\"Key3\",3,true);\n		los.put(\"Key4\",4,true);\n		los.put(\"Key5\",1,true);\n		los.put(\"Key6\",1,true);\n		los.put(\"Key7\",1,true);\n		los.put(\"Key8\",1,true);\n		los.put(\"Key9\",1,true);\n	}\n}\n";
							editor.setText(java); 
							
							editor.setEditorLanguage(new io.github.rosemoe.sora.langs.java.JavaLanguage()); 
							
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
	
	
	public void _ff() {
		
	} 
	  private void fonts(final android.content.Context context, final View v) {
			    String fontName = "fonts/ghostfont.ttf";
			 try {
								Typeface 
								typeace = Typeface.createFromAsset(getAssets(), fontName);
								if ((v instanceof ViewGroup)) {
											ViewGroup vg = (ViewGroup) v;
											for (int i = 0;
											i < vg.getChildCount();
											i++) {
														View child = vg.getChildAt(i);
														fonts(context, child);
											}
								}
								else {
											if ((v instanceof TextView)) {
														((TextView) v).setTypeface(typeace);
											}
											else {
														if ((v instanceof EditText )) {
																	((EditText) v).setTypeface(typeace);
														}
														else {
																	if ((v instanceof Button)) {
																				((Button) v).setTypeface(typeace);
																	}
														}
											}
								}
					}
					catch(Exception e)
					
					{
								e.printStackTrace();
					};
			
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