// 1、引入包（package）机制，提供了类的的多层命名空间，用于解决类的命名冲突、类文件管理等问题
// 2、一旦在Java源文件中使用了这个package语句，就意味着该源文件里定义的所有类都属于这个包。
//   位于包中的每个类的完整类名都应该是包名和类名的组合，如果其他人需要使用该包下的类，
//   也应该使用包名加类名的组合。
package com.lyne.helloworld;

// 如果需要使用不同包中的其他类时，总是需要使用该类的全名，这是一件繁琐的事情。
// 为了简化编程，Java引入了import关键字，import关键字可以向某个java文件导入指定包层次下的某个类
// 或全部类，import语句应该出现在package语句之后、类定义之前。一个Java源文件只能包含一个package语句，
// 但可以包含多个import语句，多个import语句用于导入多个包层次下的类。
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

//在类的声明中，通过关键字extends来创建一个类的子类。一个类通过关键字implements声明自己使用一个或者多个接口。
public class HelloActivity extends Activity {

	// 重写父类的方法，使用@override会提示函数及参数的相关信息
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	//super调用父类基类，this调用当前基类
        super.onCreate(savedInstanceState);
        //给当前的活动引入一个hello_world_layout布局
        setContentView(R.layout.activity_hello);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hello, menu);
        return true;
    }
    
}
