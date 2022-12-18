package Ninja.coder.Ghostemane.code;

import android.app.*;
import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.*;
import android.content.Context;
import android.content.Intent;
import android.os.*;
import java.util.*;
import android.os.Process;
import android.util.Log;

public class ApplicationLoader extends Application {
	
	private static Context mApplicationContext;
	private Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
	
	public static Context getContext() {
		return mApplicationContext;
	}
	
	@Override
	public void onCreate() {
		mApplicationContext = getApplicationContext();
		this.uncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
		
		Thread.setDefaultUncaughtExceptionHandler(
		new Thread.UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread thread, Throwable throwable) {
				var intent = new Intent(getApplicationContext(), ErrormanagerActivity.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
				intent.putExtra("GetlogError", Log.getStackTraceString(throwable));
				
				PendingIntent pendingIntent =
				PendingIntent.getActivity(
				getApplicationContext(),
				11111,
				intent,
				PendingIntent.FLAG_ONE_SHOT
				);
				
				var am = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
				am.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, 1000, pendingIntent);
				
				Process.killProcess(Process.myPid());
				System.exit(1);
				
				uncaughtExceptionHandler.uncaughtException(thread, throwable);
			}
		});
		super.onCreate();
	}
}
