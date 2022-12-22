package Ninja.coder.Ghostemane.code;

import android.animation.*;
import android.app.*;
import android.content.*;
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
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.LinearLayout;
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
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.antlr.v4.runtime.*;
import org.benf.cfr.reader.*;
import org.beyka.tiffbitmapfactory.*;
import org.json.*;
import storage.sdcard.*;
import xyz.doikki.videoplayer.*;
import xyz.doikki.videoplayer.exo.*;
import xyz.doikki.videoplayer.ijk.*;
import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.RemoteAction;
import android.content.BroadcastReceiver;
import xyz.doikki.videoplayer.player.VideoView;
import android.content.Context;
import android.content.IntentFilter;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Icon;
import java.util.ArrayList;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import Ninja.coder.Ghostemane.code.component.CompleteView;
import Ninja.coder.Ghostemane.code.component.ErrorView;
import Ninja.coder.Ghostemane.code.component.GestureView;
import Ninja.coder.Ghostemane.code.component.PrepareView;
import Ninja.coder.Ghostemane.code.component.TitleView;
import Ninja.coder.Ghostemane.code.component.VodControlView;


public class VideoviewsActivity extends AppCompatActivity {
	
	private final PictureInPictureParams.Builder mPictureInPictureParamsBuilder = new PictureInPictureParams.Builder();
	private static final String ACTION_MEDIA_CONTROL = "media_control";
	private static final String EXTRA_CONTROL_TYPE = "control_type";
	private static final int REQUEST_PLAY = 1;
	private static final int REQUEST_PAUSE = 2;
	private static final int CONTROL_TYPE_PLAY = 1;
	private static final int CONTROL_TYPE_PAUSE = 2;
	private static final int CONTROL_TYPE_REPLAY = 3;
	private BroadcastReceiver mReceiver;
	private StandardVideoController mController;
	private int mWidthPixels;
	private static final int REQUEST_REPLAY = 3;
	private xyz.doikki.videoplayer.player.VideoView mVideoView;
	
	private String path = "";
	private String title = "";
	private String speed = "";
	private String proportion = "";
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout viewvideo;
	private TextView videotitle;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.videoviews);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		viewvideo = findViewById(R.id.viewvideo);
		videotitle = findViewById(R.id.videotitle);
	}
	
	private void initializeLogic() {
		
		
		path = getIntent().getStringExtra("getPath");
		title = getIntent().getStringExtra("getTitle");
		videotitle.setText(getIntent().getStringExtra("getTitle"));
		mVideoView = new xyz.doikki.videoplayer.player.VideoView(this);
		LinearLayout.LayoutParams lpviewvideo = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT,600);
		viewvideo.setLayoutParams(lpviewvideo);
		viewvideo.addView(mVideoView);
		mWidthPixels = getResources().getDisplayMetrics().widthPixels;
		        mVideoView.setLayoutParams(new LinearLayout.LayoutParams(mWidthPixels, mWidthPixels * 9 / 16 + 1));
		
		        mVideoView.setUrl(path);
		        mController = new StandardVideoController(this);
		        //mController.addDefaultControlComponent(title, false);
		mController.addControlComponent(new CompleteView(this));
		mController.addControlComponent(new ErrorView(this));
		mController.addControlComponent(new PrepareView(this));
		mController.addControlComponent(new GestureView(this));
		VodControlView vodControlView = new VodControlView(this);
		vodControlView.findViewById(R.id.speed).setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
						new XPopup.Builder(VideoviewsActivity.this)
				.popupPosition(com.lxj.xpopup.enums.PopupPosition.Right)//右边
				//.hasStatusBarShadow(true) //启用状态栏阴影
				.asCustom(new CustomDrawerPopupView(VideoviewsActivity.this))
				.show();
				}
		});
		vodControlView.findViewById(R.id.proportion).setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
						new XPopup.Builder(VideoviewsActivity.this)
				.popupPosition(com.lxj.xpopup.enums.PopupPosition.Right)//右边
				//.hasStatusBarShadow(true) //启用状态栏阴影
				.asCustom(new CustomDrawerPopupView1(VideoviewsActivity.this))
				.show();
				}
		});
		mController.addControlComponent(vodControlView);
		TitleView titleView = new TitleView(this);
		titleView.findViewById(R.id.pip).setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
							Rational aspectRatio = new Rational(16, 9); 
				mPictureInPictureParamsBuilder.setAspectRatio(aspectRatio).build(); 
				enterPictureInPictureMode(mPictureInPictureParamsBuilder.build());	
					}
		});
		
		
		titleView.setTitle(title);
		mController.addControlComponent(titleView);
		
		        mVideoView.setVideoController(mController);
		        mVideoView.addOnStateChangeListener(new VideoView.SimpleOnStateChangeListener() {
			            @Override
			            public void onPlayStateChanged(int playState) {
				                switch (playState) {
					                    case VideoView.STATE_PAUSED:
					                        updatePictureInPictureActions(
					                                R.drawable.dkplayer_ic_action_play_arrow, "play", CONTROL_TYPE_PLAY, REQUEST_PLAY);
					                        break;
					                    case VideoView.STATE_PLAYING:
					                        updatePictureInPictureActions(
					                                R.drawable.dkplayer_ic_action_pause, "pause", CONTROL_TYPE_PAUSE, REQUEST_PAUSE);
					                        break;
					                    case VideoView.STATE_PLAYBACK_COMPLETED:
					                        updatePictureInPictureActions(
					                                R.drawable.dkplayer_ic_action_replay, "Replay", CONTROL_TYPE_REPLAY, REQUEST_REPLAY);
					                        break;
					                }
				            }
			        });
		         mVideoView.start();
	}
	void updatePictureInPictureActions(
	            @DrawableRes int iconId, String title, int controlType, int requestCode) {
		        final ArrayList<RemoteAction> actions = new ArrayList<>();
		
		        // This is the PendingIntent that is invoked when a user clicks on the action item.
		        // You need to use distinct request codes for play and pause, or the PendingIntent won't
		        // be properly updated.
		        final PendingIntent intent =
		                PendingIntent.getBroadcast(
		                        VideoviewsActivity.this,
		                        requestCode,
		                        new Intent(ACTION_MEDIA_CONTROL).putExtra(EXTRA_CONTROL_TYPE, controlType),
		                        0);
		        final Icon icon = Icon.createWithResource(VideoviewsActivity.this, iconId);
		        actions.add(new RemoteAction(icon, title, title, intent));
		
		        mPictureInPictureParamsBuilder.setActions(actions);
		
		        // This is how you can update action items (or aspect ratio) for Picture-in-Picture mode.
		        // Note this call can happen even when the app is not in PiP mode. In that case, the
		        // arguments will be used for at the next call of #enterPictureInPictureMode.
		        setPictureInPictureParams(mPictureInPictureParamsBuilder.build());
		
	}
	    public class CustomDrawerPopupView extends com.lxj.xpopup.core.DrawerPopupView {
		        public CustomDrawerPopupView(@androidx.annotation.NonNull Context context) {
			            super(context);
			        }
		        @Override
		        protected int getImplLayoutId() {
			            return R.layout.speed;
			        }
		        @Override
		        protected void onCreate() {
			            super.onCreate();
			
						final TextView txt1 = findViewById(R.id.textview1);
						final TextView txt2 = findViewById(R.id.textview2);
						final TextView txt3 = findViewById(R.id.textview3);
						final TextView txt4 = findViewById(R.id.textview4);
						final TextView txt5 = findViewById(R.id.textview5);
						
						if (speed.equals("0.75")) {
								txt1.setTextColor(Color.parseColor("#FF39C5BA"));
						    }
						if (speed.equals("1.0")) {
								txt2.setTextColor(Color.parseColor("#FF39C5BC"));
						    }
						if (speed.equals("1.25")) {
								txt3.setTextColor(Color.parseColor("#FF39C5BC"));
						    }
						if (speed.equals("1.5")) {
								txt4.setTextColor(Color.parseColor("#FF39C5BC"));
						    }
						if (speed.equals("2.0")) {
								txt5.setTextColor(Color.parseColor("#FF39C5BC"));
						    }
						
			            findViewById(R.id.cardview1).setOnClickListener(new OnClickListener() {
				                @Override
				                public void onClick(View v) {
					                    mVideoView.setSpeed(0.75f);
								        speed = "0.75";
										txt1.setTextColor(Color.parseColor("#FF39C5BC"));
										txt2.setTextColor(Color.parseColor("#ffffff"));
										txt3.setTextColor(Color.parseColor("#ffffff"));
										txt4.setTextColor(Color.parseColor("#ffffff"));
										txt5.setTextColor(Color.parseColor("#ffffff"));
					                }
				            });
						
						findViewById(R.id.cardview2).setOnClickListener(new OnClickListener() {
				                @Override
				                public void onClick(View v) {
					                    mVideoView.setSpeed(1.0f);
								        speed = "1.0";
										txt2.setTextColor(Color.parseColor("#FF39C5BC"));
										txt1.setTextColor(Color.parseColor("#ffffff"));
										txt3.setTextColor(Color.parseColor("#ffffff"));
										txt4.setTextColor(Color.parseColor("#ffffff"));
										txt5.setTextColor(Color.parseColor("#ffffff"));
					                }
				            });
						
						findViewById(R.id.cardview3).setOnClickListener(new OnClickListener() {
				                @Override
				                public void onClick(View v) {
					                    mVideoView.setSpeed(1.25f);
								        speed = "1.25";
										txt3.setTextColor(Color.parseColor("#FF39C5BC"));
										txt2.setTextColor(Color.parseColor("#ffffff"));
										txt1.setTextColor(Color.parseColor("#ffffff"));
										txt4.setTextColor(Color.parseColor("#ffffff"));
										txt5.setTextColor(Color.parseColor("#ffffff"));
					                }
				            });
						
						findViewById(R.id.cardview4).setOnClickListener(new OnClickListener() {
				                @Override
				                public void onClick(View v) {
					                    mVideoView.setSpeed(1.5f);
								        speed = "1.5";
										txt4.setTextColor(Color.parseColor("#FF39C5BC"));
										txt2.setTextColor(Color.parseColor("#ffffff"));
										txt3.setTextColor(Color.parseColor("#ffffff"));
										txt1.setTextColor(Color.parseColor("#ffffff"));
										txt5.setTextColor(Color.parseColor("#ffffff"));
					                }
				            });
						
						findViewById(R.id.cardview5).setOnClickListener(new OnClickListener() {
				                @Override
				                public void onClick(View v) {
					                    mVideoView.setSpeed(2.0f);
								        speed = "2.0";
										txt5.setTextColor(Color.parseColor("#FF39C5BC"));
										txt2.setTextColor(Color.parseColor("#ffffff"));
										txt3.setTextColor(Color.parseColor("#ffffff"));
										txt4.setTextColor(Color.parseColor("#ffffff"));
										txt1.setTextColor(Color.parseColor("#ffffff"));
					                }
				            });
			        }
		    }
	{
	}
	    public class CustomDrawerPopupView1 extends com.lxj.xpopup.core.DrawerPopupView {
		        public CustomDrawerPopupView1(@androidx.annotation.NonNull Context context) {
			            super(context);
			        }
		        @Override
		        protected int getImplLayoutId() {
			            return R.layout.proportion;
			        }
		        @Override
		        protected void onCreate() {
			            super.onCreate();
			
						final TextView txt1 = findViewById(R.id.textview1);
						final TextView txt2 = findViewById(R.id.textview2);
						final TextView txt3 = findViewById(R.id.textview3);
						final TextView txt4 = findViewById(R.id.textview4);
						final TextView txt5 = findViewById(R.id.textview5);
						
						if (proportion.equals("default")) {
								txt1.setTextColor(Color.parseColor("#FF39C5BC"));
						    }
						if (proportion.equals("16:9")) {
								txt2.setTextColor(Color.parseColor("#FF39C5BC"));
						    }
						if (proportion.equals("Original size")) {
								txt3.setTextColor(Color.parseColor("#FF39C5BC"));
						    }
						if (proportion.equals("filling")) {
								txt4.setTextColor(Color.parseColor("#FF39C5BC"));
						    }
						if (proportion.equals("center crop")) {
								txt5.setTextColor(Color.parseColor("#FF39C5BC"));
						    }
						
			            findViewById(R.id.cardview1).setOnClickListener(new OnClickListener() {
				                @Override
				                public void onClick(View v) {
					                    mVideoView.setScreenScaleType(VideoView.SCREEN_SCALE_DEFAULT);
								        proportion = "default";
										txt1.setTextColor(Color.parseColor("#FF39C5BC"));
										txt2.setTextColor(Color.parseColor("#ffffff"));
										txt3.setTextColor(Color.parseColor("#ffffff"));
										txt4.setTextColor(Color.parseColor("#ffffff"));
										txt5.setTextColor(Color.parseColor("#ffffff"));
					                }
				            });
						
						findViewById(R.id.cardview2).setOnClickListener(new OnClickListener() {
				                @Override
				                public void onClick(View v) {
					                    mVideoView.setScreenScaleType(VideoView.SCREEN_SCALE_16_9);
								        proportion = "16:9";
										txt2.setTextColor(Color.parseColor("#FF39C5BC"));
										txt1.setTextColor(Color.parseColor("#ffffff"));
										txt3.setTextColor(Color.parseColor("#ffffff"));
										txt4.setTextColor(Color.parseColor("#ffffff"));
										txt5.setTextColor(Color.parseColor("#ffffff"));
					                }
				            });
						
						findViewById(R.id.cardview3).setOnClickListener(new OnClickListener() {
				                @Override
				                public void onClick(View v) {
					                    mVideoView.setScreenScaleType(VideoView.SCREEN_SCALE_ORIGINAL);
								        proportion = "Original size";
										txt3.setTextColor(Color.parseColor("#FF39C5BC"));
										txt2.setTextColor(Color.parseColor("#ffffff"));
										txt1.setTextColor(Color.parseColor("#ffffff"));
										txt4.setTextColor(Color.parseColor("#ffffff"));
										txt5.setTextColor(Color.parseColor("#ffffff"));
					                }
				            });
						
						findViewById(R.id.cardview4).setOnClickListener(new OnClickListener() {
				                @Override
				                public void onClick(View v) {
					                    mVideoView.setScreenScaleType(VideoView.SCREEN_SCALE_MATCH_PARENT);
								        proportion = "filling";
										txt4.setTextColor(Color.parseColor("#FF39C5BC"));
										txt2.setTextColor(Color.parseColor("#ffffff"));
										txt3.setTextColor(Color.parseColor("#ffffff"));
										txt1.setTextColor(Color.parseColor("#ffffff"));
										txt5.setTextColor(Color.parseColor("#ffffff"));
					                }
				            });
						
						findViewById(R.id.cardview5).setOnClickListener(new OnClickListener() {
				                @Override
				                public void onClick(View v) {
					                    mVideoView.setScreenScaleType(VideoView.SCREEN_SCALE_CENTER_CROP);
								        proportion = "center crop";
										txt5.setTextColor(Color.parseColor("#FF39C5BC"));
										txt2.setTextColor(Color.parseColor("#ffffff"));
										txt3.setTextColor(Color.parseColor("#ffffff"));
										txt4.setTextColor(Color.parseColor("#ffffff"));
										txt1.setTextColor(Color.parseColor("#ffffff"));
					                }
				            });
			        }
		    }
	{
		
	}
	
	
	@Override
	public void onBackPressed() {
		if (!mVideoView.onBackPressed()) { super.onBackPressed(); }
	} 
	@Override
	    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) {
		        super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
		        Log.d("pip", "onPictureInPictureModeChanged: " + isInPictureInPictureMode);
		        if (isInPictureInPictureMode) {
			            mVideoView.setVideoController(null);
			            mVideoView.setLayoutParams(new LinearLayout.LayoutParams(
			                    ViewGroup.LayoutParams.WRAP_CONTENT,
			                    ViewGroup.LayoutParams.WRAP_CONTENT));
			            // Starts receiving events from action items in PiP mode.
			            mReceiver =
			                    new BroadcastReceiver() {
				                        @Override
				                        public void onReceive(Context context, Intent intent) {
					                            if (intent == null
					                                    || !ACTION_MEDIA_CONTROL.equals(intent.getAction())) {
						                                return;
						                            }
					
					                            // This is where we are called mBack from Picture-in-Picture action
					                            // items.
					                            final int controlType = intent.getIntExtra(EXTRA_CONTROL_TYPE, 0);
					                            switch (controlType) {
						                                case CONTROL_TYPE_PLAY:
						                                    mVideoView.start();
						                                    break;
						                                case CONTROL_TYPE_PAUSE:
						                                    mVideoView.pause();
						                                    break;
						                                case CONTROL_TYPE_REPLAY:
						                                    mVideoView.replay(true);
						                                    break;
						                            }
					                        }
				                    };
			            registerReceiver(mReceiver, new IntentFilter(ACTION_MEDIA_CONTROL));
			        } else {
			            // We are out of PiP mode. We can stop receiving events from it.
			            unregisterReceiver(mReceiver);
			            mReceiver = null;
			            Log.d("pip", "onPictureInPictureModeChanged: " + mVideoView);
			            mVideoView.setLayoutParams(new LinearLayout.LayoutParams(
			                    mWidthPixels,
			                    mWidthPixels * 9 / 16 + 1));
			            mVideoView.setVideoController(mController);
			            mVideoView.requestLayout();
			        }   
	}
	
	@Override
	public void onStart() {
		super.onStart();
		
	}
	
	@Override
	public void onResume() {
		super.onResume();
		
	}
	
	@Override
	public void onPause() {
		super.onPause();
		
	}
	
	@Override
	public void onStop() {
		super.onStop();
		mVideoView.pause();
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		mVideoView.release();
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