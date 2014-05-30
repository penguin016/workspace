
package com.example.myfirst;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TableLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	OnClickListener listener0 = null;
	OnClickListener listener1 = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    listener0 = new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent0 = new Intent(MainActivity.this,FrameLayoutActivity.class);
				setTitle("FrameLayout");
				startActivity(intent0);
			}
		};
		
        listener1 = new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent1 = new Intent(MainActivity.this,TableLayoutActivity.class);
				setTitle("TableLayout");
				startActivity(intent1);
			}
		};
		setContentView(R.layout.liner);
		Button button0 =  (Button)findViewById(R.id.button0);
		button0.setOnClickListener(listener0);
		Button button1 =  (Button)findViewById(R.id.button1);
		button1.setOnClickListener(listener1);
	}

}
