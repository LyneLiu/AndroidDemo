// 1���������package�����ƣ��ṩ����ĵĶ�������ռ䣬���ڽ�����������ͻ�����ļ����������
// 2��һ����JavaԴ�ļ���ʹ�������package��䣬����ζ�Ÿ�Դ�ļ��ﶨ��������඼�����������
//   λ�ڰ��е�ÿ���������������Ӧ���ǰ�������������ϣ������������Ҫʹ�øð��µ��࣬
//   ҲӦ��ʹ�ð�������������ϡ�
package com.lyne.helloworld;

// �����Ҫʹ�ò�ͬ���е�������ʱ��������Ҫʹ�ø����ȫ��������һ�����������顣
// Ϊ�˼򻯱�̣�Java������import�ؼ��֣�import�ؼ��ֿ�����ĳ��java�ļ�����ָ��������µ�ĳ����
// ��ȫ���࣬import���Ӧ�ó�����package���֮���ඨ��֮ǰ��һ��JavaԴ�ļ�ֻ�ܰ���һ��package��䣬
// �����԰������import��䣬���import������ڵ�����������µ��ࡣ
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

//����������У�ͨ���ؼ���extends������һ��������ࡣһ����ͨ���ؼ���implements�����Լ�ʹ��һ�����߶���ӿڡ�
public class HelloActivity extends Activity {

	// ��д����ķ�����ʹ��@override����ʾ�����������������Ϣ
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	//super���ø�����࣬this���õ�ǰ����
        super.onCreate(savedInstanceState);
        //����ǰ�Ļ����һ��hello_world_layout����
        setContentView(R.layout.activity_hello);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hello, menu);
        return true;
    }
    
}
