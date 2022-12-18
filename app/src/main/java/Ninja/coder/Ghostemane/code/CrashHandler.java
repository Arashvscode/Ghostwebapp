package Ninja.coder.Ghostemane.code;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;



/**
 * CrashHandler handles uncaught exceptions
 * And force the main thread continue to work
 *
 * @author Rose
 */
public class CrashHandler implements UncaughtExceptionHandler {

    public final static String LOG_TAG = "CrashHandler";
    @SuppressLint("StaticFieldLeak")
    public final static CrashHandler INSTANCE = new CrashHandler();

    private Context mContext;
    private final Map<String, String> info = new HashMap<>();

    private CrashHandler() {
    }

    public void init(Context context) {
        mContext = context.getApplicationContext();
        collectDeviceInfo(mContext);
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override
    public void uncaughtException(Thread thread, @NonNull Throwable ex) {
        saveCrashInfo(thread.getName(), ex);
        // Save the world, hopefully
        if (Looper.myLooper() != null) {
            Handler handler = new Handler(Looper.myLooper());
            while (true) {
                try {
                    handler.post(() -> {
                        Toast.makeText(mContext, "خطا مشاهده شد آیکون Log را مشاهده کنید", Toast.LENGTH_SHORT).show();
                    });
                    Looper.loop();
                } catch (Throwable t) {
                    saveCrashInfo(thread.getName(), t);
                }
            }
        }
    }

    public void collectDeviceInfo(Context ctx) {
        try {
            PackageManager pm = ctx.getPackageManager();
            PackageInfo pi = pm.getPackageInfo(ctx.getPackageName(), PackageManager.GET_ACTIVITIES);
            if (pi != null) {
                String versionName = pi.versionName == null ? "null" : pi.versionName;
                String versionCode = pi.versionCode + "";
                info.put("versionName", versionName);
                info.put("versionCode", versionCode);
            }
        } catch (NameNotFoundException e) {
            Log.e(LOG_TAG, "an error occurred while collecting package info", e);
        }
        Field[] fields = Build.class.getDeclaredFields();
        for (Field field : fields) {
            try {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (obj instanceof String[]) {
                    info.put(field.getName(), Arrays.toString((String[]) obj));
                } else {
                    info.put(field.getName(), String.valueOf(obj));
                }
            } catch (Exception e) {
                Log.e(LOG_TAG, "an error occurred while collecting crash info", e);
            }
        }
        fields = Build.VERSION.class.getDeclaredFields();
        for (Field field : fields) {
            try {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (obj instanceof String[]) {
                    info.put(field.getName(), Arrays.toString((String[]) obj));
                } else {
                    info.put(field.getName(), String.valueOf(obj));
                }
            } catch (Exception e) {
                Log.e(LOG_TAG, "an error occurred while collecting crash info", e);
            }
        }
    }

    private void saveCrashInfo(String threadName, Throwable ex) {
        StringBuilder sb = new StringBuilder();
        long timestamp = System.currentTimeMillis();
        sb.append("Crash at ").append(timestamp).append("(timestamp) in thread named '").append(threadName).append("'\n");
        sb.append("Local date and time:").append(SimpleDateFormat.getDateTimeInstance().format(new Date(timestamp))).append('\n');
        for (Map.Entry<String, String> entry : info.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            sb.append(key).append("=").append(value).append("\n");
        }

        Writer writer = new StringWriter();
        PrintWriter printWriter = new PrintWriter(writer);
        ex.printStackTrace(printWriter);
        Throwable cause = ex.getCause();
        while (cause != null) {
            cause.printStackTrace(printWriter);
            cause = cause.getCause();
        }
        printWriter.close();
        String result = writer.toString();
        sb.append(result).append('\n');
        try {
            Log.e(LOG_TAG, sb.toString());
            FileOutputStream fos = mContext.openFileOutput("crash-journal.log", Context.MODE_APPEND);
            fos.write(sb.toString().getBytes());
            fos.close();
        } catch (Exception e) {
            Log.e(LOG_TAG, "an error occurred while writing file...", e);
        }
    }
}
