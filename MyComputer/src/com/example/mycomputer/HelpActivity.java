package com.example.mycomputer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HelpActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_help);
		TextView textview = (TextView)findViewById(R.id.textview);
		textview.setText("�ü������ı�׼ģʽӦ����ɣ��ɹ��û�ʹ�ã���������ģʽ���ڿ�����,�����ڴ���");
	}
	

}
