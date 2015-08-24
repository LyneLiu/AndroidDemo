package com.lyne.activitytest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

//可以通过Base类知道当前是哪一个活动
public class BaseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		Log.d("BaseActivity",getClass().getSimpleName());
		ActivityCollector.addActivity(this);
	}
	
	@Override
	protected void onDestroy(){
		super.onDestroy();
		ActivityCollector.removeActivity(this);
	}
}
