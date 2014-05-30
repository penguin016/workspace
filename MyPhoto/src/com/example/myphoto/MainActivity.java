package com.example.myphoto;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

	ImageView photo1;
	ImageView photo2;
	Button button1;
	Button button2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		photo1  = (ImageView)findViewById(R.id.photo1);
		photo2  = (ImageView)findViewById(R.id.photo2);
		button1 = (Button)findViewById(R.id.button1);
		button2 = (Button)findViewById(R.id.button2);
		
		String i = "2";
		final int imgid = getResources().getIdentifier("img_"+i, "drawable", "com.example.myphoto");
		photo1.setImageDrawable(getResources().getDrawable(imgid+1));
		photo2.setImageDrawable(getResources().getDrawable(imgid));
		
		button1.setOnClickListener(new Button.OnClickListener(){
      
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				photo1.setImageDrawable(getResources().getDrawable(imgid+1));
				
			}
			
		});
		button2.setOnClickListener(new Button.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				photo1.setImageDrawable(getResources().getDrawable(imgid-11));
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
