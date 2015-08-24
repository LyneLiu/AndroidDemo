package com.lyne.activitytest;

import android.content.Intent;
//import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class ThirdActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		Log.d("ThirdActivity","Task id is" + getTaskId());
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.third_layout);
		
		//获取Activity传送过来的数据
//		Intent intent = getIntent();
//		String data = intent.getStringExtra("extra_data");
//		Log.d("ThirdActivity",data);
		
		Button button4=(Button)findViewById(R.id.button_4);
		button4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// 访问Web应用
				// 1.Intent intent3=new Intent(Intent.ACTION_VIEW);
				// intent3.setData(Uri.parse("http://www.baidu.com/"));
				// startActivity(intent3);
				// 访问电话应用
				// 2.Intent intent = new Intent(Intent.ACTION_DIAL);
				// intent.setData(Uri.parse("tel:10086"));
				// startActivity(intent);
				// 向其他的活动返回一个数据，setResult用于返回数据
				Intent intent = new Intent();
				String data = "FirstActivity,it's your show time!";
				intent.putExtra("data_return", data);
				setResult(RESULT_OK,intent);
				finish();
			}
		});
		
		Button button7=(Button)findViewById(R.id.button_7);
		button7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ActivityCollector.finishAll();
			}
		});
	}
	
	//重写onBackPressed()方法，在用户使用返回键的时候，向上一个Activity返回数据
	@Override
	public void onBackPressed(){
		String data = "Hello,I'm back!";
		Intent intent = new Intent();
		intent.putExtra("data_return", data);
		setResult(RESULT_OK, intent);
		finish();
	}
}
