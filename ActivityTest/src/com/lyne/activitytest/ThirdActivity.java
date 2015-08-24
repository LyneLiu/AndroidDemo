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
		
		//��ȡActivity���͹���������
//		Intent intent = getIntent();
//		String data = intent.getStringExtra("extra_data");
//		Log.d("ThirdActivity",data);
		
		Button button4=(Button)findViewById(R.id.button_4);
		button4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// ����WebӦ��
				// 1.Intent intent3=new Intent(Intent.ACTION_VIEW);
				// intent3.setData(Uri.parse("http://www.baidu.com/"));
				// startActivity(intent3);
				// ���ʵ绰Ӧ��
				// 2.Intent intent = new Intent(Intent.ACTION_DIAL);
				// intent.setData(Uri.parse("tel:10086"));
				// startActivity(intent);
				// �������Ļ����һ�����ݣ�setResult���ڷ�������
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
	
	//��дonBackPressed()���������û�ʹ�÷��ؼ���ʱ������һ��Activity��������
	@Override
	public void onBackPressed(){
		String data = "Hello,I'm back!";
		Intent intent = new Intent();
		intent.putExtra("data_return", data);
		setResult(RESULT_OK, intent);
		finish();
	}
}
