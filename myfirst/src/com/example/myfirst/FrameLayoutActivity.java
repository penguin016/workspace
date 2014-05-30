package com.example.myfirst;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class FrameLayoutActivity extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.frame_layout);
		ImageView photo = new ImageView(this);
	}

}