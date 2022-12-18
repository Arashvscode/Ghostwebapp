package Ninja.coder.Ghostemane.code;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import android.widget.Toast;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AssetsSoft {
	private static int Version = Build.VERSION.SDK_INT;
	private static int JellyVersion = Build.VERSION_CODES.JELLY_BEAN;
	private static final int BUFFER_SIZE = 1024 * 10;
	private static final String TAG = "Decompress";
	
	public void RoadFileTextinAsset(Activity a, String input, String output) {
		try {
			java.io.InputStream posIn = a.getAssets().open(output);
			int posSi = posIn.available();
			byte[] posBu = new byte[posSi];
			posIn.read(posBu);
			posIn.close();
			input = new String(posBu, "UTF-8");
		} catch (IOException e) {
			Toast.makeText(a, e.toString(), Toast.LENGTH_LONG).show();
			
		}
		
	}
	
	public void RoadFileInWebView(Activity activity, WebView webView, String impaster) {
		
		try {
			java.io.InputStream webViewIn = activity.getAssets().open(impaster);
			int webViewSi = webViewIn.available();
			byte[] webViewBu = new byte[webViewSi];
			webViewIn.read(webViewBu);
			webViewIn.close();
			final String webViewStr = new String(webViewBu, "UTF-8");
			WebSettings webViewSs = webView.getSettings();
			webViewSs.setJavaScriptEnabled(true);
			webViewSs.setJavaScriptCanOpenWindowsAutomatically(true);
			if (Version >= JellyVersion) {
				webViewSs.setAllowFileAccessFromFileURLs(true);
				webViewSs.setAllowUniversalAccessFromFileURLs(true);
			}
			webView.loadUrl("data:text/html ,<html>".concat(webViewStr.concat("<html>")));
		} catch (IOException e) {
			Toast.makeText(activity, e.toString(), Toast.LENGTH_LONG).show();
			
		}
		
	}
	
	public void copyAllFilesAssets(String assetsFolder, String outPath, Activity a) {
		AssetManager assetManager = a.getAssets();
		String[] files = null;
		try {
			files = assetManager.list(assetsFolder);
		} catch (java.io.IOException e) {
			
		}
		if (files != null)
		for (String filename : files) {
			java.io.InputStream in = null;
			java.io.OutputStream out = null;
			try {
				in = assetManager.open(assetsFolder + "/" + filename);
				java.io.File outFile = new java.io.File(outPath, filename);
				if (!(outFile.exists())) {// File does not exist...
					out = new java.io.FileOutputStream(outFile);
					copyFileinAsster(in, out);
					
				}
			} catch (java.io.IOException e) {
				
			} finally {
				if (in != null) {
					try {
						in.close();
					} catch (java.io.IOException e) {
						// NOOP
					}
				}
				if (out != null) {
					try {
						out.close();
					} catch (java.io.IOException e) {
						// NOOP
					}
				}
			}
		}
	}
	
	protected void copyFileinAsster(java.io.InputStream in, java.io.OutputStream out) throws java.io.IOException {
		byte[] buffer = new byte[1024];
		int read;
		while ((read = in.read(buffer)) != -1) {
			out.write(buffer, 0, read);
		}
	}
	
	public void copyOneFileFromAssets(String assetFilename, String assetSavePath, Activity activity) {
		try {
			int count;
			java.io.InputStream input = activity.getAssets().open(assetFilename);
			java.io.OutputStream output = new java.io.FileOutputStream(assetSavePath + "/" + assetFilename);
			byte data[] = new byte[1024];
			while ((count = input.read(data)) > 0) {
				output.write(data, 0, count);
			}
			output.flush();
			output.close();
			input.close();
			Toast.makeText(activity, "Done", Toast.LENGTH_LONG).show();
		} catch (IOException e) {
			Toast.makeText(activity, "Error " + e.toString(), Toast.LENGTH_LONG).show();
		}
	}
	
	public void unzipFromAssets(Context context, String zipFile, String destination) {
		try {
			if (destination == null || destination.length() == 0)
			destination = context.getFilesDir().getAbsolutePath();
			InputStream stream = context.getAssets().open(zipFile);
			unzip(stream, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected void unzip(String zipFile, String location) {
		try {
			FileInputStream fin = new FileInputStream(zipFile);
			unzip(fin, location);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	protected void unzip(InputStream stream, String destination) {
		dirChecker(destination, "");
		byte[] buffer = new byte[BUFFER_SIZE];
		try {
			ZipInputStream zin = new ZipInputStream(stream);
			ZipEntry ze = null;
			
			while ((ze = zin.getNextEntry()) != null) {
				Log.v(TAG, "Unzipping " + ze.getName());
				
				if (ze.isDirectory()) {
					dirChecker(destination, ze.getName());
				} else {
					File f = new File(destination, ze.getName());
					if (!f.exists()) {
						boolean success = f.createNewFile();
						if (!success) {
							Log.w(TAG, "Failed to create file " + f.getName());
							continue;
						}
						FileOutputStream fout = new FileOutputStream(f);
						int count;
						while ((count = zin.read(buffer)) != -1) {
							fout.write(buffer, 0, count);
						}
						zin.closeEntry();
						fout.close();
					}
				}
				
			}
			zin.close();
		} catch (Exception e) {
			Log.e(TAG, "unzip", e);
		}
		
	}
	
	protected  void dirChecker(String destination, String dir) {
		File f = new File(destination, dir);
		
		if (!f.isDirectory()) {
			boolean success = f.mkdirs();
			if (!success) {
				Log.w(TAG, "Failed to create folder " + f.getName());
			}
		}
	}
}
