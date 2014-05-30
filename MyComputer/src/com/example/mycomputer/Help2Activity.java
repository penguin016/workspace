package com.example.mycomputer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Help2Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_help2);
		TextView textview = (TextView)findViewById(R.id.textview2);
		textview.setText("    该计算器的扩展模式完成了常用的三角函数、开放和乘方以及数论中的一些方法，使用时注意：" +"\n"+
				"    1.双目操作符，先输入第一个操作数，再按操作符按键，再输入第二个操作数；" +"\n"+
				"    2.单目操作符，先输入操作数，再按操作符按键。");
	}
	

}
