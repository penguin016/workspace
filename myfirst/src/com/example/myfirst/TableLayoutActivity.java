package com.example.myfirst;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TableLayoutActivity extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.table);
		TextView tv1 = new TextView(this);
		TextView tv2 = new TextView(this);
		EditText text1 = new EditText(this);
		EditText text2 = new EditText(this);
		Button button0 = new Button(this);
		Button button1 = new Button(this);
	}

}
