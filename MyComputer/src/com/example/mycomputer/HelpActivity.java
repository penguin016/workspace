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
		textview.setText("该计算器的标准模式应经完成，可供用户使用，其他两种模式还在开发中,敬请期待！");
	}
	

}
