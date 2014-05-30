package com.example.turnover;

import java.util.List;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	
	private SensorManager mSensorManager1;
	private TextView mTextView1;
	private int strRingerMode;
	private int audioManagerMode;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mTextView1 = (TextView)findViewById(R.id.myTextView1);
		
		mSensorManager1 = (SensorManager)getSystemService(Context.SENSOR_SERVICE);
		
		audioManagerMode = GetAudioManagerMode();
 
        setTextByAudioManagerMode(audioManagerMode);

	}
	
	private void setTextByAudioManagerMode(int audioManagerMode2) {
		// TODO Auto-generated method stub
				switch(strRingerMode){
		    case AudioManager.RINGER_MODE_NORMAL:
		    mTextView1.setText("正常模式");
		    break;
		    case AudioManager.RINGER_MODE_SILENT:
		  	mTextView1.setText("静音模式");
			break;
		    case AudioManager.RINGER_MODE_VIBRATE:
			mTextView1.setText("振动模式");
			break;
		}
	}

	private final SensorEventListener mSensorEventListener = new SensorEventListener(){

		public void onAccuracyChanged(Sensor sensor, int accuracy) {
			// TODO Auto-generated method stub
			
		}

		public void onSensorChanged(SensorEvent event) {
			// TODO Auto-generated method stub
			if (event.sensor.getType() == Sensor.TYPE_ORIENTATION){
				float fPitchAngle = event.values[SensorManager.DATA_Y];
				if(fPitchAngle<-120){
					ChangeToSilentMode();
				
				    ChangeToVibrateMode();
				
				    switch(strRingerMode){
				    case AudioManager.RINGER_MODE_NORMAL:
					    mTextView1.setText("正常模式");
					    break;
					    case AudioManager.RINGER_MODE_SILENT:
					  	mTextView1.setText("静音模式");
						break;
					    case AudioManager.RINGER_MODE_VIBRATE:
						mTextView1.setText("振动模式");
						break;
				    }
				}
			    else{
			    	ChangeToNormalMode();
				    switch(strRingerMode){
				    case AudioManager.RINGER_MODE_NORMAL:
					    mTextView1.setText("正常模式");
					    break;
					    case AudioManager.RINGER_MODE_SILENT:
					  	mTextView1.setText("静音模式");
						break;
					    case AudioManager.RINGER_MODE_VIBRATE:
						mTextView1.setText("振动模式");
						break;
				    }
			    }
			}
			
		}	
	};

	private int GetAudioManagerMode() {
		// TODO Auto-generated method stub
		int ringerMode = 0;
		try{
			AudioManager audiomanager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
		
		    if(audiomanager != null){
		    	strRingerMode = audiomanager.getRingerMode();
		    }
		}
		catch(Exception e){
			mTextView1.setText(e.toString());
			e.printStackTrace();
		}
		return ringerMode;
		
	}


	protected void ChangeToNormalMode() {
		// TODO Auto-generated method stub
		try{
			AudioManager audiomanager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
		
		    if(audiomanager != null){
		    	audiomanager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
		    	strRingerMode = audiomanager.getRingerMode();
		    }
		}
		catch(Exception e){
			mTextView1.setText(e.toString());
			e.printStackTrace();
		}
		
	}

	protected void ChangeToVibrateMode() {
		// TODO Auto-generated method stub
		try{
			AudioManager audiomanager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
		
		    if(audiomanager != null){
		    	audiomanager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
		    	strRingerMode = audiomanager.getRingerMode();
		    }
		}
		catch(Exception e){
			mTextView1.setText(e.toString());
			e.printStackTrace();
		}
		
	}

	protected void ChangeToSilentMode() {
		// TODO Auto-generated method stub
		try{
			AudioManager audiomanager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
		
		    if(audiomanager != null){
		    	audiomanager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
		    	strRingerMode = audiomanager.getRingerMode();
		    }
		}
		catch(Exception e){
			mTextView1.setText(e.toString());
			e.printStackTrace();
		}
	}
	@Override
	protected void onResume(){
		List<Sensor> sensors = mSensorManager1.getSensorList(Sensor.TYPE_ORIENTATION);  
		 mTextView1.setText("注册成功1");
		mSensorManager1.registerListener(mSensorEventListener, sensors.get(0),
    			SensorManager.SENSOR_DELAY_NORMAL);  
		 mTextView1.setText("注册成功2");
        super.onResume(); 
        mTextView1.setText("注册成功");

    }
	protected void onPause(){
		((SensorManager) mSensorManager1).unregisterListener(mSensorEventListener);
		super.onPause();
	}



}
