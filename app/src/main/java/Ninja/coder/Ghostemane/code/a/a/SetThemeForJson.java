Package a.a;

import Ninja.coder.Ghostemane.code.SketchwareUtil;
import Ninja.coder.Ghostemane.code.FileUtil;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.Window;
import android.os.Build;
import android.view.WindowManager;
import android.widget.TextView;
import io.github.rosemoe.sora.widget.CodeEditor;
import io.github.rosemoe.sora.widget.EditorColorScheme;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import org.json.*;

public class SetThemeForJson {
	protected HashMap<String, Object> map = new HashMap<>();
	private Timer timer = new Timer();
	private TimerTask task;

	public SetThemeForJson() {

	}

	public SetThemeForJson(HashMap<String, Object> maps) {
		this.map = maps;
	}

	public SetThemeForJson setShowTheme() {
		if (map.containsKey("Title")) {
			map.put("Title", Color.parseColor("#FF84A9FF"));
		} else {
			map.put("Title", Color.BLUE);

		}
		if (map.containsKey("BackGround")) {
			map.put("BackGround", Color.parseColor("#FFFF84FA"));
		} else {
			map.put("BackGround", Color.DKGRAY);
		}
		return this;
	}

	public SetThemeForJson setThemeCodeEditor(CodeEditor editor, HashMap<String, Object> imap, boolean chackHashMap,
			Activity x) {

		if (imap.containsKey("OPERATOR")) {
			editor.getColorScheme().setColor(EditorColorScheme.OPERATOR,
					Color.parseColor(imap.get("OPERATOR").toString()));

		} else {
			editor.getColorScheme().setColor(EditorColorScheme.OPERATOR, Color.parseColor("#ffa1aaff"));
			dialogError(x);
		}
		if (imap.containsKey("BLOCK_LINE")) {
			editor.getColorScheme().setColor(EditorColorScheme.BLOCK_LINE,
					Color.parseColor(imap.get("BLOCK_LINE").toString()));
		} else {
			editor.getColorScheme().setColor(EditorColorScheme.BLOCK_LINE, Color.parseColor("#ffaea2ff"));
			dialogError(x);
		}
		if (imap.containsKey("BLOCK_LINE_CURRENT")) {
			editor.getColorScheme().setColor(EditorColorScheme.BLOCK_LINE_CURRENT,
					Color.parseColor(imap.get("BLOCK_LINE_CURRENT").toString()));
		} else {
			editor.getColorScheme().setColor(EditorColorScheme.BLOCK_LINE_CURRENT, Color.parseColor("#ffb9eeff"));
			dialogError(x);
		}
		if (imap.containsKey("NON_PRINTABLE_CHAR")) {
			editor.getColorScheme().setColor(EditorColorScheme.NON_PRINTABLE_CHAR,
					Color.parseColor(imap.get("NON_PRINTABLE_CHAR").toString()));
		} else {
			editor.getColorScheme().setColor(EditorColorScheme.NON_PRINTABLE_CHAR, Color.parseColor("#ffb9ffcb"));
			dialogError(x);
		}
		if (imap.containsKey("CURRENT_LINE")) {
			editor.getColorScheme().setColor(EditorColorScheme.CURRENT_LINE,
					Color.parseColor(imap.get("CURRENT_LINE").toString()));
		} else {
			editor.getColorScheme().setColor(EditorColorScheme.CURRENT_LINE, Color.parseColor("#20171717"));
			dialogError(x);
		}
		if (imap.containsKey("SELECTION_INSERT")) {
			editor.getColorScheme().setColor(EditorColorScheme.SELECTION_INSERT,
					Color.parseColor(imap.get("SELECTION_INSERT").toString()));
		} else {
			editor.getColorScheme().setColor(EditorColorScheme.SELECTION_INSERT, Color.parseColor("#ffffffff"));
			dialogError(x);
		}
		if (imap.containsKey("SELECTION_HANDLE")) {
			editor.getColorScheme().setColor(EditorColorScheme.SELECTION_HANDLE,
					Color.parseColor(imap.get("SELECTION_HANDLE").toString()));
		} else {
			editor.getColorScheme().setColor(EditorColorScheme.SELECTION_HANDLE, Color.parseColor("#ffffffff"));
			dialogError(x);
		}
		if (imap.containsKey("LINE_NUMBER")) {
			editor.getColorScheme().setColor(EditorColorScheme.LINE_NUMBER,
					Color.parseColor(imap.get("LINE_NUMBER").toString()));
		} else {
			editor.getColorScheme().setColor(EditorColorScheme.LINE_NUMBER, Color.parseColor("#ff748979"));
			dialogError(x);
		}
		if (imap.containsKey("LINE_DIVIDER")) {
			editor.getColorScheme().setColor(EditorColorScheme.LINE_DIVIDER,
					Color.parseColor(imap.get("LINE_DIVIDER").toString()));
		} else {
			editor.getColorScheme().setColor(EditorColorScheme.LINE_DIVIDER, Color.parseColor("#ff91b68f"));
			dialogError(x);
		}
		if (imap.containsKey("ATTRIBUTE_VALUE")) {
			editor.getColorScheme().setColor(EditorColorScheme.ATTRIBUTE_VALUE,
					Color.parseColor(imap.get("ATTRIBUTE_VALUE").toString()));
		} else {
			editor.getColorScheme().setColor(EditorColorScheme.ATTRIBUTE_VALUE, Color.parseColor("#ffffdcb9"));
			dialogError(x);
		}
		if (imap.containsKey("ATTRIBUTE_NAME")) {
			editor.getColorScheme().setColor(EditorColorScheme.ATTRIBUTE_NAME,
					Color.parseColor(imap.get("ATTRIBUTE_NAME").toString()));
		} else {
			editor.getColorScheme().setColor(EditorColorScheme.ATTRIBUTE_NAME, Color.parseColor("#FF1B4AD7"));
			dialogError(x);
		}
		if (imap.containsKey("HTML_TAG")) {
			editor.getColorScheme().setColor(EditorColorScheme.HTML_TAG,
					Color.parseColor(imap.get("HTML_TAG").toString()));
		} else {
			editor.getColorScheme().setColor(EditorColorScheme.HTML_TAG, Color.parseColor("#ffffa1d9"));
			dialogError(x);
		}
		if (imap.containsKey("TEXT_NORMAL")) {
			editor.getColorScheme().setColor(EditorColorScheme.TEXT_NORMAL,
					Color.parseColor(imap.get("TEXT_NORMAL").toString()));
		} else {
			editor.getColorScheme().setColor(EditorColorScheme.TEXT_NORMAL, Color.parseColor("#ffebffd7"));
			dialogError(x);
		}
		if (imap.containsKey("IDENTIFIER_NAME")) {
			editor.getColorScheme().setColor(EditorColorScheme.IDENTIFIER_NAME,
					Color.parseColor(imap.get("IDENTIFIER_NAME").toString()));
		} else {
			editor.getColorScheme().setColor(EditorColorScheme.IDENTIFIER_NAME, Color.parseColor("#626262"));
			dialogError(x);
		}
		if (imap.containsKey("COMMENT")) {
			editor.getColorScheme().setColor(EditorColorScheme.COMMENT,
					Color.parseColor(imap.get("COMMENT").toString()));
		} else {
			editor.getColorScheme().setColor(EditorColorScheme.COMMENT, Color.parseColor("#fff0be4b"));
			dialogError(x);
		}
		//// for css and other....
		if (imap.containsKey("KEYWORD")) {
			editor.getColorScheme().setColor(EditorColorScheme.KEYWORD,
					Color.parseColor(imap.get("KEYWORD").toString()));
		} else {
			editor.getColorScheme().setColor(EditorColorScheme.KEYWORD, Color.parseColor("#ffffa1a1"));
			dialogError(x);
		}
		if (imap.containsKey("print")) {
			editor.getColorScheme().setColor(EditorColorScheme.print, Color.parseColor(imap.get("print").toString()));
		} else {
			editor.getColorScheme().setColor(EditorColorScheme.print, Color.parseColor("#ffb4a1ff"));
			dialogError(x);
		}
		if (imap.containsKey("Ninja")) {
			editor.getColorScheme().setColor(EditorColorScheme.Ninja, Color.parseColor(imap.get("Ninja").toString()));
		} else {
			editor.getColorScheme().setColor(EditorColorScheme.Ninja, Color.parseColor("#ffffac94"));
			dialogError(x);
		}
		if (imap.containsKey("LITERAL")) {
			editor.getColorScheme().setColor(EditorColorScheme.LITERAL,
					Color.parseColor(imap.get("LITERAL").toString()));
		} else {
			editor.getColorScheme().setColor(EditorColorScheme.LITERAL, Color.parseColor("#ffdea1ff"));
			dialogError(x);
		}
		if (imap.containsKey("AUTO_COMP_PANEL_BG")) {
			editor.getColorScheme().setColor(EditorColorScheme.AUTO_COMP_PANEL_BG,
					Color.parseColor(imap.get("AUTO_COMP_PANEL_BG").toString()));
		} else {
			editor.getColorScheme().setColor(EditorColorScheme.AUTO_COMP_PANEL_BG, Color.parseColor("#ff000a1a"));
			dialogError(x);
		}
		if (imap.containsKey("AUTO_COMP_PANEL_CORNER")) {
			editor.getColorScheme().setColor(EditorColorScheme.AUTO_COMP_PANEL_CORNER,
					Color.parseColor(imap.get("AUTO_COMP_PANEL_CORNER").toString()));
		} else {
			editor.getColorScheme().setColor(EditorColorScheme.AUTO_COMP_PANEL_CORNER, Color.parseColor("#ff94ffe7"));
			dialogError(x);
		}
		if (imap.containsKey("LINE_NUMBER_BACKGROUND")) {
			editor.getColorScheme().setColor(EditorColorScheme.LINE_NUMBER_BACKGROUND,
					Color.parseColor(imap.get("LINE_NUMBER_BACKGROUND").toString()));
		} else {
			editor.getColorScheme().setColor(EditorColorScheme.LINE_NUMBER_BACKGROUND, Color.parseColor("#00FFFFFF"));
			dialogError(x);
		}
		if (imap.containsKey("WHOLE_BACKGROUND")) {
			editor.getColorScheme().setColor(EditorColorScheme.WHOLE_BACKGROUND,
					Color.parseColor(imap.get("WHOLE_BACKGROUND").toString()));
		} else {
			editor.getColorScheme().setColor(EditorColorScheme.WHOLE_BACKGROUND, Color.parseColor("#02FFFFFF"));
			dialogError(x);
		}

		return this;
	}

	public SetThemeForJson setHashMapInabel(boolean isEnabel, HashMap<String, Object> imap) {
		if (isEnabel) {
			isEnabel = true;
			imap = new HashMap<>();
		} else {
			isEnabel = false;
		}

		return this;
	}

	private SetThemeForJson dialogError(Activity x) {

		var di = new MaterialAlertDialogBuilder(x);
		di.setTitle("شکست تم ");
		di.setMessage(
				"تم دچار نقص شده است ممکن است تم را دستی ویرایش کرده باشید یا یک ویژگی جدید به تم اضافه شده باشد لطفاً گزینه تعمیر را بزنید تا تم برای شما باز تولید شود");
		di.setNeutralButton("تعمیر", (p, d) -> {

			SketchwareUtil.showMessage(x, "شروع باز نویسی تم");
			FileUtil.deleteFile("/storage/emulated/0/GhostWebIDE/theme/GhostThemeapp.ghost");
			task = new TimerTask() {
				@Override
				public void run() {
					x.runOnUiThread(() -> {

						x.finishAffinity();

					});
				}
			};
			timer.schedule(task, (int) (2000));

		});
		di.setCancelable(false);
		di.show();

		return this;
	}

	public SetThemeForJson AddthemetoSattos(Activity a, HashMap<String, Object> imap) {

		if (imap.containsKey("BackgroundColorLinear")) {
			if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
				Window Hsi = a.getWindow();
				Hsi.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				Hsi.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

				Hsi.setStatusBarColor(Color.parseColor(imap.get("BackgroundColorLinear").toString()));
				Hsi.setNavigationBarColor(Color.parseColor(imap.get("BackgroundColorLinear").toString()));
			}
		} else {
			if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
				Window Hsi = a.getWindow();
				Hsi.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				Hsi.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

				Hsi.setStatusBarColor(Color.parseColor("#ff02102c"));
				Hsi.setNavigationBarColor(Color.parseColor("#ff02102c"));
				dialogError(a);
			}

		}

		return this;
	}

	public SetThemeForJson addTextColor( TextView id, String datatype, int color,
			Activity x,HashMap<String, Object>imap2) {

		if (imap2.containsKey(datatype)) {
			id.setTextColor(Color.parseColor(imap2.get(datatype).toString()));
		} else {
			id.setTextColor(color);
			dialogError(x);
		}
		return this;
	}

	public SetThemeForJson addBackground(Activity c, HashMap<String, Object> imap, String datatype, View object,
			int color) {

		if (imap.containsKey(datatype)) {
			object.setBackgroundColor(Color.parseColor(imap.get(datatype).toString()));
		} else {
			object.setBackgroundColor(color);
			dialogError(c);
		}

		return this;
	}
}
