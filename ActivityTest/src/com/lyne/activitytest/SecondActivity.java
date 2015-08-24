package com.lyne.activitytest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class SecondActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		Log.d("SecondActivity","Task id is" + getTaskId());
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.second_layout);
		
		//获取Activity传送过来的数据
		Intent intent = getIntent();
		String data = intent.getStringExtra("extra_data");
		if(data != null){
			Log.d("SecondActivity",data);
		}
		
		Button button3=(Button)findViewById(R.id.button_3);
		button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// Toast.makeText(SecondActivity.this, "Hello lyne!NIce to meet you!", Toast.LENGTH_SHORT).show();
				// 创建新的活动
				Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
				startActivity(intent);
			}
		});
	}
	//启动活动的最佳写法
	public static void actonStart(Context context,String data1,String data2){
		Intent intent = new Intent(context,SecondActivity.class);
		intent.putExtra("param1",data1);
		intent.putExtra("param2",data2);
		context.startActivity(intent);
	}
	
	@Override
	protected void onDestroy(){
		super.onDestroy();
		Log.d("Secondactivity","Second__onDestroy");
	}
}
