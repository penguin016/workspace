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
		textview.setText("    �ü���������չģʽ����˳��õ����Ǻ��������źͳ˷��Լ������е�һЩ������ʹ��ʱע�⣺" +"\n"+
				"    1.˫Ŀ���������������һ�����������ٰ�������������������ڶ�����������" +"\n"+
				"    2.��Ŀ����������������������ٰ�������������");
	}
	

}
