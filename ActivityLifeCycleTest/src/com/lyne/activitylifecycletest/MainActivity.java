package com.lyne.activitylifecycletest;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate");
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null)
        {
        	String tempData = savedInstanceState.getString("data_key");
        	Log.d(TAG, tempData);
        }
        
        //创建启动两个Activity（NormalActivity和DialogActivity）的Button
        Button startNormalActivity = (Button)findViewById(R.id.start_normal_activity);
        Button startDialogActivity = (Button)findViewById(R.id.start_dialog_activity);
        startNormalActivity.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,NormalActivity.class);
				startActivity(intent);
			}
		});
        startDialogActivity.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,DialogActivity.class);
				startActivity(intent);
			}
		});
    }


    @Override
    protected void onStart(){
    	super.onStart();
    	Log.d(TAG,"onStart");
    }
    
    @Override
    protected void onResume(){
    	super.onResume();
    	Log.d(TAG,"onResume");
    }
    
    @Override
    protected void onPause(){
    	super.onPause();
    	Log.d(TAG,"onPause");
    }
    
    @Override
    protected void onStop(){
    	super.onStop();
    	Log.d(TAG,"onStop");
    }
    
    @Override
    protected void onDestroy(){
    	super.onDestroy();
    	Log.d(TAG,"onDestroy");
    }
    
    @Override
    //活动onStop后，在没有被回收的情况下，通过onRestart进行启动
    protected void onRestart(){
    	super.onRestart();
    	Log.d(TAG,"onRestart");
    }
    
    @Override
    protected void onSaveInstanceState(Bundle outState){
    	super.onSaveInstanceState(outState);
    	String tempData = "Something you just typed!";
    	outState.putString("data_key", tempData);
    }
}
