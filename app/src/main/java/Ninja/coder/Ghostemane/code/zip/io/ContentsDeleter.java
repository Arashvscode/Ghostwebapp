package com.balatong.zip.io;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import com.balatong.logger.Logger;
import com.balatong.zip.helper.StatsUtil;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;

public class ContentsDeleter extends AsyncTask<Object, Object, Integer> {

	private static Logger logger = Logger.getLogger(ContentsDeleter.class.getName());

	final private static int MAX_BYTES = 24 * 1024;

	final public static String NEW_ENTRY = "NEW_ENTRY";
	final public static String OLD_ENTRY = "OLD_ENTRY";
	final public static String SET_PROGRESS_DIALOG = "SET_PROGRESS_DIALOG";
	final public static String ENTRY_SIZE = "ENTRY_SIZE";
	final public static String BYTES_READ = "BYTES_READ";
	final public static String TOTAL_FILES = "TOTAL_FILES";
	final public static String TOTAL_SIZE = "TOTAL_SIZE";
    final protected static String TaskError = "";

	private File file;
	private Context context;

	public ContentsDeleter(File file, Context context) {
		this.file = file;
		this.context = context;
	}

	@Override
	protected Integer doInBackground(Object... params) {
		return deleteEntries((Map<String, Object>)params[0]);
	}


	
	@Override
	protected void onPostExecute(Integer result) {
		super.onPostExecute(result);
		
	}
	
	@Override
	protected void onProgressUpdate(Object... values) {
		super.onProgressUpdate(values);

		if (NEW_ENTRY.equals(values[0])) {
			
		}
		else if (OLD_ENTRY.equals(values[0])) {
			
		}
		else if (SET_PROGRESS_DIALOG.equals(values[0])) {
			
		}
	}

	private Integer deleteEntries(Map<String, Object> checkedZipEntries) {
		int deleted = 0;
		File tempPath = new File("/sdcard/tmp");
		if (!tempPath.exists())
			if (!tempPath.mkdirs()) {
				String message = "Unable to create directory " + tempPath + ".";
				logger.debug(message);
				return 0;
			}
		
		Map<String, ZipEntry> tobeDeletedEntries = flatten(checkedZipEntries);
		publishProgress(SET_PROGRESS_DIALOG, tobeDeletedEntries.size(), tobeDeletedEntries.size());
		
		ZipFile zipFile = null;
		ZipOutputStream zos = null;
		File tempFile = null;
		try {
			tempFile = File.createTempFile("unzipper", null, tempPath);
			zos = new ZipOutputStream(new FileOutputStream(tempFile));
			zipFile = new ZipFile(file);
			
			Enumeration<? extends ZipEntry> entries = zipFile.entries();
			while (entries.hasMoreElements()) {
				ZipEntry zipEntry = entries.nextElement();				
				if (tobeDeletedEntries.containsKey(zipEntry.getName())) {
					publishProgress(NEW_ENTRY, zipEntry.getName(), 1);
					deleted++;
					publishProgress(OLD_ENTRY, 1);
					continue;
				}
				if (zipEntry.getName().endsWith("/"))
					continue;
//				writeEntry(zipFile, zipEntry, zos);
				InputStream is = zipFile.getInputStream(zipEntry);
				writeEntry(zipEntry, is, zos);
				is.close();

			}
			file.delete();
			tempFile.renameTo(file);
			return deleted;
		}
		catch (IOException e) {
			logger.equals("Unable to delete entries. " + e.getMessage());
			return 0;
		}
		finally {
			try {
				zipFile.close();
				zos.close();
			}
			catch (Exception e) {
			}
		}
	}

	private Map<String, ZipEntry> flatten(Map<String, Object> checkedZipEntries) {
		Map<String, ZipEntry> flatCheckedEntries = new HashMap<String, ZipEntry>();
		for (Map.Entry<String, Object> entry : checkedZipEntries.entrySet()) {
			if (entry.getValue() instanceof ZipEntry) {
				ZipEntry zipEntry = (ZipEntry)entry.getValue();
				flatCheckedEntries.put(zipEntry.getName(), zipEntry);
			}
			else { 
				if (!"..".equals(entry.getKey())) {
					flatCheckedEntries.putAll( flatten((Map<String, Object>)entry.getValue()) );
				}
			}
		}
		return flatCheckedEntries;
	}

	private int writeEntry(ZipEntry zipEntry, InputStream is, ZipOutputStream zos) {
		ByteArrayOutputStream bos = null;		
		try {
			bos = new ByteArrayOutputStream();
			
			if (zipEntry.isDirectory()) {
				zos.putNextEntry(zipEntry);
				return 1;
			}

			CRC32 crc32 = new CRC32();
			byte buffer[] = new byte[MAX_BYTES];
			int count = 0;
			int readTotal = 0;
			while ((count = is.read(buffer, 0, MAX_BYTES)) > 0) {
				bos.write(buffer, 0, count);
				crc32.update(buffer, 0, count);
				publishProgress(OLD_ENTRY, count);
				readTotal += count;
			}
			zipEntry.setCrc(crc32.getValue());
			zipEntry.setSize(readTotal);
			zipEntry.setTime(System.currentTimeMillis());
			zos.putNextEntry(zipEntry);
			zos.write(bos.toByteArray(), 0, bos.size());
			
			return 1;
		}
		catch (IOException e) {
			logger.error("Unable to write com.balatong.zip.zip entry: " + zipEntry.getName(), e);
			return 0;
		}
		finally {
			try {
				zos.closeEntry();
				bos.close();
			}
			catch (Exception e) {
			}
		}		
	}
	
	private Intent wrapIntent(String action, Object... extras) {
		Intent intent = new Intent();
		
		return intent;
	}

	
}
