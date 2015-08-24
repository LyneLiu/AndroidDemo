package com.lyne.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		Log.d("FirstActivity","Task id is" + getTaskId());
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.first_layout);
		Button button1=(Button) findViewById(R.id.button_1);
		Button button2=(Button) findViewById(R.id.button_2);
		Button button3=(Button) findViewById(R.id.button_5);
		Button button4=(Button) findViewById(R.id.button_6);
		
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// 1.Toast.makeText(FirstActivity.this, "You clicked Button 1!", Toast.LENGTH_SHORT).show();
				// 2.finish();
				// 3.Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
				//   startActivity(intent);
				SecondActivity.actonStart(FirstActivity.this, "data1", "data2");
			}
		});
		
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// 1.Toast.makeText(FirstActivity.this, "You clicked Button 1!", Toast.LENGTH_SHORT).show();
				// 2.finish();
				// 3.Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
				//   startActivity(intent);
				// 4.Intent intent=new Intent("com.lyne.activitytest.ACTION_ATART");
				//   intent.addCategory("com.lyne.activitytest.MY_CATEGORY");
				//   startActivity(intent);
				// 5.
				Intent intent2=new Intent(Intent.ACTION_VIEW);
				intent2.setData(Uri.parse("https://www.baidu.com/"));
				startActivity(intent2);
			}
		});
		
		button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// 1.Toast.makeText(FirstActivity.this, "You clicked Button 1!", Toast.LENGTH_SHORT).show();
				// 2.finish();
				//向ThirdActivity发送数据（调用putExtra函数）
				String data = "Hello ThirdActivity!";
				Intent intent=new Intent(FirstActivity.this,ThirdActivity.class);
				intent.putExtra("extra_data",data);
				startActivityForResult(intent, 1);
			}
		});
		
		button4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// 1.Toast.makeText(FirstActivity.this, "You clicked Button 1!", Toast.LENGTH_SHORT).show();
				// 2.finish();
				   Intent intent=new Intent(FirstActivity.this,FirstActivity.class);
				   startActivity(intent);
			}
		});
	}
	
	public boolean onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	// 菜单选项item的执行结果
	public boolean onOptionsItemSelected(MenuItem item){
		switch(item.getItemId()){
		case R.id.add_item:
			Toast.makeText(this, "You clicked Add Item!", Toast.LENGTH_SHORT).show();
			break;
		case R.id.remove_item:
			Toast.makeText(this, "You clicked Remove Item!", Toast.LENGTH_SHORT).show();
			break;
		default:
		}
		return true;
	}
	
	//处理返回数据
	//requestCode请求标识码
	//resultCode返回结果：RESULT_OK/RESULT_CANCELED
	@Override
	protected void onActivityResult(int requestCode,int resultCode,Intent data){
		switch(requestCode){
		case 1:
			if(resultCode == RESULT_OK){
				String returnedData = data.getStringExtra("data_return");
				Log.d("FirstActivity", returnedData);
			}
			break;
		default:
			Log.d("error_info","NO Message!");
		}
	}
	
	@Override
	protected void onRestart(){
		super.onRestart();
		Log.d("FirstActicity","First__onRestart");
	}
}
