package Ninja.coder.Ghostemane.code;

import android.Manifest;
import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.pm.PackageManager;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
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
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
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
import com.bumptech.glide.Glide;
import com.caverock.androidsvg.*;
import com.github.angads25.filepicker.*;
import com.github.junrar.*;
import com.google.android.material.*;
import com.google.android.material.appbar.AppBarLayout;
import com.lxj.xpopup.*;
import com.mukesh.*;
import com.neo.highlight.*;
import com.tapadoo.alerter.*;
import com.zip4j.*;
import io.github.rosemoe.sora.langs.base.*;
import java.io.*;
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
import com.google.android.material.divider.MaterialDivider;
import com.balatong.zip.Unzipper;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class ZipshowActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private boolean groovie = false;
	private String path = "";
	private double number = 0;
	private String UpFolder = "";
	
	private ArrayList<String> Str = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> Maps = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private ListView listView;
	private TextView textview1;
	private ImageView imageview1;
	
	private TimerTask tt;
	private ProgressDialog dialogProGress;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.zipshow);
		initialize(_savedInstanceState);
		
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE}, 1000);
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
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		listView = findViewById(R.id.listView);
		textview1 = findViewById(R.id.textview1);
		imageview1 = findViewById(R.id.imageview1);
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				onBackPressed();
			}
		});
	}
	
	private void initializeLogic() {
		  dialogProGress = new ProgressDialog(ZipshowActivity.this ,ProgressDialog.THEME_DEVICE_DEFAULT_DARK);
		///result code By Ninja coder.ir my love java
		
		
		GradientDrawable sp = new GradientDrawable();
				sp.setColor(0xFF1F1B1C);
				sp.setCornerRadius(25);
				sp.setStroke(1, 0xFFFDA893);
		dialogProGress.getWindow().setBackgroundDrawable(sp);
		try{
			_install(getIntent().getStringExtra("zipview"));
		}catch(Exception e){
			SketchwareUtil.showMessage(getApplicationContext(), e.toString());
		}
		///AddNiceNameFab
		
		final ExtendedFloatingActionButton Unzip,fabAdd,fabAddFile,fabDeleat;
		///Show id Fab 
		fabAdd = findViewById(R.id.fabAdd);
		fabAddFile = findViewById(R.id.fabAddFile);
		Unzip = findViewById(R.id.Unzip);
		fabDeleat = findViewById(R.id.fabDeleat);
		
		
		fabAdd.setIconResource(R.drawable.plus);
		fabAdd.setBackgroundTintList(ColorStateList.valueOf(0xFF1F1B1C));
		fabAdd.setStrokeColor(ColorStateList.valueOf(0xFFFDA893));
		fabAdd.setStrokeWidth(1);
		fabAdd.setIconTint(ColorStateList.valueOf(0xFFFFFFFF));
		Unzip.setBackgroundTintList(ColorStateList.valueOf(0xFF1F1B1C));
		Unzip.setStrokeColor(ColorStateList.valueOf(0xFFFDA893));
		Unzip.setStrokeWidth(1);
		Unzip.setIconTint(ColorStateList.valueOf(0xFFFFFFFF));
		fabAddFile.setBackgroundTintList(ColorStateList.valueOf(0xFF1F1B1C));
		fabAddFile.setStrokeColor(ColorStateList.valueOf(0xFFFDA893));
		fabAddFile.setStrokeWidth(1);
		fabAddFile.setIconTint(ColorStateList.valueOf(0xFFFFFFFF));
		fabDeleat.setBackgroundTintList(ColorStateList.valueOf(0xFF1F1B1C));
		fabDeleat.setStrokeColor(ColorStateList.valueOf(0xFFFDA893));
		fabDeleat.setStrokeWidth(1);
		fabDeleat.setIconTint(ColorStateList.valueOf(0xFFFFFFFF));
		fabAdd.shrink();
		fabAddFile.shrink();
		Unzip.shrink();
		fabDeleat.shrink();
		//unzip
		Unzip.setIconResource(R.drawable.unzip);
		///delet
		fabDeleat.setIconResource(R.drawable.deletear);
		///AddFile zip
		fabAddFile.setIconResource(R.drawable.fileadds);
		
		///Show All Disane Fab
		_initShowOut(fabAddFile);
		_initShowOut(Unzip);
		_initShowOut(fabDeleat);
		fabAdd.setOnClickListener(v->{
				
			
				 if (!groovie) {
				groovie = true;
				_ShowIn(fabAddFile);
				_ShowIn(Unzip);
				_ShowIn(fabDeleat);
			}
			else {
				groovie = false;
				_ShowOut(fabAddFile);
				_ShowOut(Unzip);
				_ShowOut(fabDeleat);
			}
		});
		Unzip.setOnClickListener(v->{
				
			
				 if (!groovie) {
				groovie = true;
				_ShowIn(fabAddFile);
				_ShowIn(Unzip);
				_ShowIn(fabDeleat);
			}
			else {
				groovie = false;
				_ShowOut(fabAddFile);
				_ShowOut(Unzip);
				_ShowOut(fabDeleat);
			}
			_pp();
			SketchwareUtil.showMessage(getApplicationContext(), "برای استخراج روی چک باکس یک مسیر کلیک کرده و تایید کنید");
		});
		fabAddFile.setOnClickListener(v->{
				
			
				 if (!groovie) {
				groovie = true;
				_ShowIn(fabAddFile);
				_ShowIn(Unzip);
				_ShowIn(fabDeleat);
			}
			else {
				groovie = false;
				_ShowOut(fabAddFile);
				_ShowOut(Unzip);
				_ShowOut(fabDeleat);
			}
			_cc();
		});
		fabDeleat.setOnClickListener(v->{
				
			
				 if (!groovie) {
				groovie = true;
				_ShowIn(fabAddFile);
				_ShowIn(Unzip);
				_ShowIn(fabDeleat);
			}
			else {
				groovie = false;
				_ShowOut(fabAddFile);
				_ShowOut(Unzip);
				_ShowOut(fabDeleat);
			}
			_install(getIntent().getStringExtra("zipview"));
			unzipper.deleteZipEntries(zipContentsAdapter.getCheckedItems());
		});
		_toolbar.setVisibility(View.GONE);
		listView.setHorizontalScrollBarEnabled(false);
		listView.setVerticalScrollBarEnabled(false);
		listView.setOverScrollMode(ListView.OVER_SCROLL_NEVER);
	}
	
	public void _install(final String _input) {
		targetZipFile = new File(_input);
		unzipper = new com.balatong.zip.Unzipper(targetZipFile, getApplicationContext());
		
		unzipper.setUnzipListener(new com.balatong.zip.Unzipper.UnzipListener() {
				@Override
				public void onStart() {
						
				}
				
				@Override
				public void onProgress() {
						
				}
				
				@Override
				public void onFinish(Map<String, Object> parent) {
						zipContentsAdapter = new ContentsAdapter(getApplicationContext(),
						listView);
						zipContentsAdapter.setSource(parent);
						//zipContentsAdapter.setCurrentDirectory("");
						listView.setAdapter(zipContentsAdapter);
						//Toast.makeText(getApplicationContext(),
					//	String.valueOf(parent.size()), //Toast.LENGTH_SHORT).show();
						//((BaseAdapter)currentListView().getAdapter()).notifyDataSetChanged();
						
						
						
						
				}
				
				@Override
				public void onError(String errorMessage) {
						
				}
		});
		
		
	}
	
	
	public void _adptor() {
	}
	class ContentsAdapter extends ArrayAdapter<String> implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {
			
			
			
			private List<String> orderedList = new ArrayList<String>();
			private Map<String, Object> source;
			private ListView listView;
			private String currentDirectory = "";
			private List<Integer> checkedItems = new ArrayList<Integer>();
			private boolean lonClicked = false;
			
			public ContentsAdapter(Context context, ListView listView) {
					super(context, 0);
					this.listView = listView;
					this.listView.setOnItemClickListener(this);
					this.listView.setOnItemLongClickListener(this);
					
			}
			
			public void setSource(final Map<String, Object> source) {
					super.clear();
					
					this.source = source;
					
					checkedItems.clear();
					orderedList.clear();
					orderedList.addAll(source.keySet());
					Collections.sort(orderedList, new Comparator<String>() {
							public int compare(String lhs, String rhs) {
									if (lhs.equals("...."))
									return -1;
									if (rhs.equals("...."))
									return +1;
									if (source.get(lhs) instanceof Map && source.get(rhs) instanceof Map)
									return lhs.compareTo(rhs);
									if (source.get(lhs) instanceof Map && !(source.get(rhs) instanceof Map))
									return -1;
									if (!(source.get(lhs) instanceof Map) && source.get(rhs) instanceof Map)
									return +1;
									if (!(source.get(lhs) instanceof Map) && !(source.get(rhs) instanceof Map))
									return lhs.compareTo(rhs);
									
									return 0;
							}
					});
					
					for	(String key : orderedList)
					super.add(key);
					
					/*
		logger.debug("Source size: " + orderedList.size());
		logger.debug("View size: " + getCount());
		logger.debug("List view size: " + listView.getChildCount());
		*/
					
			}
			
			public Map<String, Object> getSource() {
					return source;
			}
			
			public View getView(final int position, View view, ViewGroup parent) {
					//		View view = convertView;
					if (view == null) {
							LayoutInflater vi = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
							view = vi.inflate(R.layout.views, null);
					}
					String key = orderedList.get(position);
					Object obj = source.get(key);
					ImageView image = (ImageView)view.findViewById(R.id.imageview1);
			        TextView entry = (TextView)view.findViewById(R.id.textview1);
			        TextView desc = (TextView)view.findViewById(R.id.textview2);
					CheckBox chkBox = (CheckBox)view.findViewById(R.id.checkbox1);
					chkBox.setFocusable(false);
					chkBox.setEnabled(true);
					chkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
							@Override
							public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
									if (isChecked && !checkedItems.contains(position))
									checkedItems.add(position);
									else if (!isChecked && checkedItems.contains(position))
									checkedItems.remove(Integer.valueOf(position));
							}
					});
					
					if (!lonClicked){
							if (checkedItems.size() == 0){
									chkBox.setVisibility(View.GONE);
							} else {
									chkBox.setVisibility(View.VISIBLE);
							}
					} 
					else {
							chkBox.setVisibility(View.VISIBLE);
					}
					
					if (checkedItems.contains(position))
					chkBox.setChecked(true);
					else
					chkBox.setChecked(false);
					if ("..".equals(key)) {
							chkBox.setEnabled(false);
							//	logger.debug("Disabled check box for key: " + key);
					}
					
					//		com.balatong.zip.logger.debug("getView() for " + key + " at position " + position + ".");
					
					if (obj != null && obj instanceof java.util.zip.ZipEntry) {
							java.util.zip.ZipEntry zipEntry = (java.util.zip.ZipEntry)obj;
						//	image.setImageResource(R.drawable.file);
				        	_hsi(key, image);
							entry.setText(key);
					}
					else if (obj != null && obj instanceof Map) {
						//	ImageView image = (ImageView)view.findViewById(R.id.imageview1);
							image.setImageResource(R.drawable.folder);
						//	TextView entry = (TextView)view.findViewById(R.id.textview1);
							entry.setText(key);
					//		TextView desc = (TextView)view.findViewById(R.id.textview2);
							desc.setText("");
					}
					else {
							IllegalStateException e = new IllegalStateException("There should have been an object at position " + position + "."); 
							//	logger.error(e.getMessage(), e);
					}
				
			        
					return view;
			}
			
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
					String key = orderedList.get(position);
					Object value = source.get(key); 
					//	logger.debug("Clicked on " + key);
					
					
					if (value instanceof Map) {
							source = (Map<String, Object>)value;
							//TextView statusView = (TextView)view.getRootView().findViewById(R.id.txt_status_message);
							if ("..".equals(key)) {
									currentDirectory = currentDirectory.substring(0, currentDirectory.lastIndexOf("/"));
							}
							else {
									currentDirectory = currentDirectory + "/" + key;
									
							}
							//statusView.setText(currentDirectory);
							this.setSource(source);
							listView.setAdapter(this);
					}
					else { // ZipEntry
							java.util.zip.ZipEntry zipEntry = (java.util.zip.ZipEntry)value;
							//	logger.debug("Extract: " + zipEntry.getName());
							
							// extract
					}
					
					
					
			}
			
			public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
					String key = orderedList.get(position);
					Object value = source.get(key); 
					//	logger.debug("LongClicked on " + key);
					if (!lonClicked){
							lonClicked = true;
					} else {
							lonClicked = false;
							checkedItems.clear();
					}
					notifyDataSetChanged();
					//Toast.makeText(view.getContext(), "long clicked", Toast.LENGTH_SHORT).show();
					return true;
			}
			
			public Map<String, Object> getCheckedItems() {
					Map<String, Object> items = new HashMap<String, Object>();
					for (Integer position : checkedItems) {
							String key = orderedList.get(position);
							Object value = source.get(key);
							items.put(key, value);
					}
					if (items.size() == 0) {
							//	logger.debug("Unzipping all files in source.");
							items = source;
					}
					return items;
			}
			
			public void uncheckItems() {
					checkedItems.clear();
			}
			
			public String getCurrentDirectory() {
					return currentDirectory;
			}
			
			public void setCurrentDirectory(String currentDirectory) {
					this.currentDirectory = currentDirectory;
			}
			
	}
	private ContentsAdapter zipContentsAdapter;
	private boolean isUnzipperBound = false;
	com.balatong.zip.Unzipper unzipper;
	private File targetZipFile;
	{
			
	}
	
	
	public void _initShowOut(final View _v) {
		_v.setVisibility(View.GONE);
		_v.setTranslationY((float)(_v.getHeight()));
		_v.setAlpha((float)(0));
	}
	
	
	public void _ShowIn(final View _v) {
		_v.setVisibility(View.VISIBLE);
		_v.setTranslationY((float)(_v.getHeight()));
		_v.setAlpha((float)(0));
		_v.animate()
		.setDuration(200)
		.translationY(0)
		.setListener(new AnimatorListenerAdapter() {
				@Override
				public void onAnimationEnd(Animator animation) {
						super.onAnimationEnd(animation);
				}
		})
		.alpha(1f)
		.start();
		
	}
	
	
	public void _ShowOut(final View _v) {
		_v.setVisibility(View.VISIBLE);
		_v.setTranslationY((float)(0));
		_v.setAlpha((float)(1));
		_v.animate()
		.setDuration(200)
		.translationY(_v.getHeight())
		.setListener(new AnimatorListenerAdapter() {
				@Override
				public void onAnimationEnd(Animator animation) {
						_v.setVisibility(View.GONE);
						super.onAnimationEnd(animation);
				}
		}).alpha(0f)
		.start();
		
	}
	
	
	public void _br() {
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
								_view = _inflater.inflate(R.layout.view, null);
						}
						
			
						
			       
			      final LinearLayout l1 = (LinearLayout) _view.findViewById(R.id.l1);
			final TextView tv = (TextView) _view.findViewById(R.id.tv);
			final ImageView img = (ImageView) _view.findViewById(R.id.img);
			final CheckBox ch = (CheckBox) _view.findViewById(R.id.ch);
			tv.setText(Uri.parse(_data.get((int)_position).get("path").toString()).getLastPathSegment());
			if (FileUtil.isDirectory(_data.get((int)_position).get("path").toString())) {
				ch.setVisibility(View.VISIBLE);
				img.setImageResource(R.drawable.folder);
			}
			else {
				if (_data.get((int)_position).get("path").toString().endsWith(".jpeg") || (_data.get((int)_position).get("path").toString().endsWith(".jpg") || (_data.get((int)_position).get("path").toString().endsWith(".webp") || (_data.get((int)_position).get("path").toString().endsWith(".bmp") || _data.get((int)_position).get("path").toString().endsWith(".png"))))) {
					Glide.with(getApplicationContext()).load(Uri.parse("file:///".concat(_data.get((int)_position).get("path").toString()))).into(img);
				}
				else {
					img.setImageResource(R.drawable.file);
				}
				ch.setVisibility(View.GONE);
			}
			if (_data.get((int)_position).get("select").toString().equals("true")) {
				ch.setChecked(true);
			}
			else {
				ch.setChecked(false);
			}
			ch.setOnClickListener(new View.OnClickListener() {
								@Override
								public void onClick(View _view) {
										if (ch.isChecked()) {
						_data.get((int)_position).put("select", "true");
					}
					else {
						_data.get((int)_position).put("select", "false");
					}
								}
						});
						
						return _view;
				}
		}
	
	{
	}
	
	
	public void _Adptor(final ListView _lis) {
		Maps.clear();
		FileUtil.listDir(path, Str);
		final class FileComparator implements Comparator<String> {
			public int compare(String f1, String f2) {
				if(f1 == f2) return 0;
				if(FileUtil.isDirectory(f1) && FileUtil.isFile(f2))
				return -1;
				if(FileUtil.isFile(f1) && FileUtil.isDirectory(f2))
				return 1;
				return f1.compareToIgnoreCase(f2);
			}
		}
		Collections.sort(Str, new FileComparator());
		number = 0;
		for (int puls = 0; puls < (int)(Str.size()); puls++) {
			{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put("path", Str.get((int)(number)));
				Maps.add(_item);
			}
			
			Maps.get((int)number).put("select", "false");
			number++;
		}
		_lis.setAdapter(new MyListViewListAdapter(Maps));
		((BaseAdapter)_lis.getAdapter()).notifyDataSetChanged();
	}
	
	
	public void _pp() {
		var di = new com.google.android.material.dialog.MaterialAlertDialogBuilder(ZipshowActivity.this);
		    ViewGroup viewGroup = findViewById(android.R.id.content);
				View dialogview = getLayoutInflater().inflate(R.layout.mylist, viewGroup, false);
		ListView mlist = dialogview.findViewById(R.id.mlist);
		Button btnback = dialogview.findViewById(R.id.btnback);
		Button btnhome = dialogview.findViewById(R.id.btnhome);
		btnback.setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View _view) {
									
				if (path.equals(FileUtil.getExternalStorageDir())) {
					
				}
				else {
					UpFolder = path.substring((int)(0), (int)(path.lastIndexOf("/")));
					path = UpFolder;
					_Adptor(mlist);
				}
							}
					});
		btnhome.setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View _view) {
									path = FileUtil.getExternalStorageDir();
				_Adptor(mlist);
							}
					});
		path = FileUtil.getExternalStorageDir();
		_Adptor(mlist);
		mlist.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
						@Override
						public boolean onItemLongClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
								final int _position = _param3;
				
				
								 
				
				
								return true;
						}
				});
		mlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
						@Override
						public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
								final int _position = _param3;
								if (FileUtil.isDirectory(Maps.get((int)_position).get("path").toString())) {
					path = Maps.get((int)_position).get("path").toString();
					_Adptor(mlist);
				}
				else {
					if (Maps.get((int)_position).get("path").toString().endsWith(".zip")) {
						
					}
				}
						}
				});
		di.setTitle("Custom File Manager");
		di.setNegativeButton("Exit", (p3, d3) -> {
			
			          
			
						});
		di.setPositiveButton("select", (p1, d2) -> {
			
			         new AsyncTask<String, String, String>() {
				@Override
				protected void onPreExecute() {
					dialogProGress.setTitle("Loading.....");
					dialogProGress.show();
				}
				@Override
				protected String doInBackground(String... params) {
					String _param = params[0];
					if (Maps.isEmpty()) {
						SketchwareUtil.showMessage(getApplicationContext(), "please set item");
					}
					else {
						number = Maps.size() - 1;
						for(int _repeat60 = 0; _repeat60 < (int)(Maps.size()); _repeat60++) {
							if (Maps.get((int)number).get("select").toString().equals("true")) {
								String  extractPath = Maps.get((int)number).get("path").toString();
								unzipper.extractZipEntries(zipContentsAdapter.getCheckedItems(), extractPath);
								tt = new TimerTask() {
									@Override
									public void run() {
										runOnUiThread(new Runnable() {
											@Override
											public void run() {
												_install(getIntent().getStringExtra("zipview"));
											}
										});
									}
								};
								_timer.schedule(tt, (int)(100));
							}
							number--;
						}
						_Adptor(mlist);
					}
					return "";
				}
				@Override
				protected void onPostExecute(String _result) {
					dialogProGress.dismiss();
				}
			}.execute("");
			
						});
		di.setView(dialogview);
		di.show();
		
		
		
		
	}
	
	
	public void _cc() {
		
		var di = new com.google.android.material.dialog.MaterialAlertDialogBuilder(ZipshowActivity.this);
		    ViewGroup viewGroup = findViewById(android.R.id.content);
				View dialogview = getLayoutInflater().inflate(R.layout.mylist, viewGroup, false);
		ListView mlist = dialogview.findViewById(R.id.mlist);
		Button btnback = dialogview.findViewById(R.id.btnback);
		Button btnhome = dialogview.findViewById(R.id.btnhome);
		btnback.setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View _view) {
									
				if (path.equals(FileUtil.getExternalStorageDir())) {
					
				}
				else {
					UpFolder = path.substring((int)(0), (int)(path.lastIndexOf("/")));
					path = UpFolder;
					_Adptor(mlist);
				}
							}
					});
		btnhome.setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View _view) {
									path = FileUtil.getExternalStorageDir();
				_Adptor(mlist);
							}
					});
		path = FileUtil.getExternalStorageDir();
		_Adptor(mlist);
		mlist.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
						@Override
						public boolean onItemLongClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
								final int _position = _param3;
				
				
								 
				
				
								return true;
						}
				});
		mlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
						@Override
						public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
								final int _position = _param3;
								if (FileUtil.isDirectory(Maps.get((int)_position).get("path").toString())) {
					path = Maps.get((int)_position).get("path").toString();
					_Adptor(mlist);
				}
				else {
					if (Maps.get((int)_position).get("path").toString().endsWith(".zip")) {
						
					}
				}
						}
				});
		di.setTitle("Custom File Manager");
		di.setNegativeButton("Exit", (p3, d3) -> {
			
			          
			
						});
		di.setPositiveButton("select", (p1, d2) -> {
			
			         new AsyncTask<String, String, String>() {
				@Override
				protected void onPreExecute() {
					dialogProGress.setTitle("Loading....");
					dialogProGress.show();
				}
				@Override
				protected String doInBackground(String... params) {
					String _param = params[0];
					if (Maps.isEmpty()) {
						SketchwareUtil.showMessage(getApplicationContext(), "please set item");
					}
					else {
						number = Maps.size() - 1;
						for(int _repeat60 = 0; _repeat60 < (int)(Maps.size()); _repeat60++) {
							if (Maps.get((int)number).get("select").toString().equals("true")) {
								String pickedF = Maps.get((int)number).get("path").toString();
								unzipper.addZipEntries(zipContentsAdapter.getCurrentDirectory(), pickedF);
								tt = new TimerTask() {
									@Override
									public void run() {
										runOnUiThread(new Runnable() {
											@Override
											public void run() {
												_install(getIntent().getStringExtra("zipview"));
											}
										});
									}
								};
								_timer.schedule(tt, (int)(100));
							}
							number--;
						}
						_Adptor(mlist);
					}
					return "";
				}
				@Override
				protected void onPostExecute(String _result) {
					dialogProGress.dismiss();
				}
			}.execute("");
			
						});
		di.setView(dialogview);
		di.show();
		
		
		
		
	}
	
	
	public void _hsi(final String _key, final ImageView _img) {
		if (_key.endsWith(".png")) {
			_img.setImageResource(R.drawable.keyboardlisnertalluserpost_3);
		}
		else {
			if (_key.endsWith(".java")) {
				_img.setImageResource(R.drawable.javanull);
			}
			else {
				if (_key.endsWith(".mp4")) {
					_img.setImageResource(R.drawable.musico);
				}
				else {
					if (_key.endsWith(".mp3")) {
						_img.setImageResource(R.drawable.musico);
					}
					else {
						if (_key.endsWith(".rar")) {
							_img.setImageResource(R.drawable.rartarget);
						}
						else {
							if (_key.endsWith(".zip")) {
								_img.setImageResource(R.drawable.zipandtar);
							}
							else {
								if (_key.endsWith(".pdf")) {
									_img.setImageResource(R.drawable.rartarget);
								}
								else {
									if (_key.endsWith(".go")) {
										_img.setImageResource(R.drawable.languagego);
									}
									else {
										if (_key.endsWith(".php")) {
											_img.setImageResource(R.drawable.languagephp);
										}
										else {
											if (_key.endsWith(".xml")) {
												_img.setImageResource(R.drawable.keyboardlisnertalluserpost_4);
											}
											else {
												if (_key.endsWith(".js")) {
													SvgShow.GetAsster(getApplicationContext() , _img , "file_type_node.svg");
												}
												else {
													if (_key.endsWith(".cpp")) {
														SvgShow.GetAsster(getApplicationContext() , _img , "file_type_cpp3.svg");
													}
													else {
														if (_key.endsWith(".html")) {
															SvgShow.GetAsster(getApplicationContext() , _img , "file_type_html.svg");
														}
														else {
															if (_key.endsWith(".html")) {
																_img.setImageResource(R.drawable.javanull);
															}
															else {
																_img.setImageResource(R.drawable.file);
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