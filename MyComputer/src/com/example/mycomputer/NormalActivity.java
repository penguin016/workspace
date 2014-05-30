package com.example.mycomputer;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NormalActivity extends Activity {
	
	double number1 = 0;
	double number2 = 0;
	String lastOperation = null;
	String nowOperation = null;
	boolean isclear = true;
	TextView textview;
	String realtext;
	Button button1,button2,button3,button4,button5,button6,button7,button8,
	       button9,button10,button11,button12,button13,button14,button15,
	       button16,button17,button18,button19;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_normal);
		textview = (TextView)findViewById(R.id.edit);
		textview.setBackgroundColor(Color.YELLOW);
		textview.setText("0");
		button1 = (Button)findViewById(R.id.button1);
		button1.setText("C");
		button1.setTextColor(Color.YELLOW);
		button2 = (Button)findViewById(R.id.button2);
		button2.setText("+/-");
		button3 = (Button)findViewById(R.id.button3);
		button3.setText("del");
		button3.setTextColor(Color.YELLOW);
		button4 = (Button)findViewById(R.id.button4);
		button4.setText("+");
		button4.setTextColor(Color.YELLOW);
		button5 = (Button)findViewById(R.id.button5);
		button5.setText("7");
		button6 = (Button)findViewById(R.id.button6);
		button6.setText("8");
		button7 = (Button)findViewById(R.id.button7);
		button7.setText("9");
		button8 = (Button)findViewById(R.id.button8);
		button8.setText("-");
		button8.setTextColor(Color.YELLOW);
		button9= (Button)findViewById(R.id.button9);
		button9.setText("4");
		button10 = (Button)findViewById(R.id.button10);
		button10.setText("5");
		button11 = (Button)findViewById(R.id.button11);
		button11.setText("6");
		button12 = (Button)findViewById(R.id.button12);
		button12.setText("*");
		button12.setTextColor(Color.YELLOW);
		button13 = (Button)findViewById(R.id.button13);
		button13.setText("1");
		button14 = (Button)findViewById(R.id.button14);
		button14.setText("2");
		button15 = (Button)findViewById(R.id.button15);
		button15.setText("3");
		button16 = (Button)findViewById(R.id.button16);
		button16.setText("/");
		button16.setTextColor(Color.YELLOW);
		button17 = (Button)findViewById(R.id.button17);
		button17.setText(".");
		button18 = (Button)findViewById(R.id.button18);
		button18.setText("0");
		button19 = (Button)findViewById(R.id.button19);
		button19.setText("=");
		button19.setTextColor(Color.YELLOW);
		//…Ë÷√π¶ƒ‹
		
		button1.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				textview.setText("0");
				number1 = 0;
				number2 = 0;
				lastOperation = null;
				nowOperation = null;
				isclear = true;
			}
		});
		button2.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				if(temp.substring(0, 1).equals("-"))
					textview.setText(temp.substring(1));
				else
					textview.setText("-"+temp);
			}
		});
		button3.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				if(temp.length() == 1)
					textview.setText("0");
				else if(temp.length() == 2&&temp.substring(0, 1).equals("-"))
					textview.setText("0");
				else
					textview.setText(temp.substring(0,temp.length()-1));
			}
		});
		button4.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				number1 = number2;
				number2 = Double.parseDouble(temp);
				lastOperation = nowOperation;
				nowOperation = "+";
				if(lastOperation != null)
					number2 = function(lastOperation,number1,number2);
				textview.setText(OperationResult(number2));
				isclear = true;
			}
		});
		button5.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				if(isclear == false){
					String temp = (String)textview.getText();
					if(temp.equals("0"))
						textview.setText("7");
					else
						textview.setText(temp+"7");
				}
				else{
					textview.setText("7");
					isclear = false;
				}
			}
		});
		button6.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				if(isclear == false){
					String temp = (String)textview.getText();
					if(temp.equals("0"))
						textview.setText("8");
					else
						textview.setText(temp+"8");
				}
				else{
					textview.setText("8");
					isclear = false;
				}
			}
		});
		button7.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				if(isclear == false){
					String temp = (String)textview.getText();
					if(temp.equals("0"))
						textview.setText("9");
					else
						textview.setText(temp+"9");
				}
				else{
					textview.setText("9");
					isclear = false;
				}
			}
		});
		button8.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				number1 = number2;
				number2 = Double.parseDouble(temp);
				lastOperation = nowOperation;
				nowOperation = "-";
				if(lastOperation != null)
					number2 = function(lastOperation,number1,number2);
				textview.setText(OperationResult(number2));
				isclear = true;
			}
		});
		button9.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				if(isclear == false){
					String temp = (String)textview.getText();
					if(temp.equals("0"))
						textview.setText("4");
					else
						textview.setText(temp+"4");
				}
				else{
					textview.setText("4");
					isclear = false;
				}
			}
		});
		button10.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				if(isclear == false){
					String temp = (String)textview.getText();
					if(temp.equals("0"))
						textview.setText("5");
					else
						textview.setText(temp+"5");
				}
				else{
					textview.setText("5");
					isclear = false;
				}
			}
		});
		button11.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				if(isclear == false){
					String temp = (String)textview.getText();
					if(temp.equals("0"))
						textview.setText("6");
					else
						textview.setText(temp+"6");
				}
				else{
					textview.setText("6");
					isclear = false;
				}
			}
		});
		button12.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				number1 = number2;
				number2 = Double.parseDouble(temp);
				lastOperation = nowOperation;
				nowOperation = "*";
				if(lastOperation != null)
					number2 = function(lastOperation,number1,number2);
				textview.setText(OperationResult(number2));
				isclear = true;
			}
		});
		button13.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				if(isclear == false){
					String temp = (String)textview.getText();
					if(temp.equals("0"))
						textview.setText("1");
					else
						textview.setText(temp+"1");
				}
				else{
					textview.setText("1");
					isclear = false;
				}
			}
		});
		button14.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				if(isclear == false){
					String temp = (String)textview.getText();
					if(temp.equals("0"))
						textview.setText("2");
					else
						textview.setText(temp+"2");
				}
				else{
					textview.setText("2");
					isclear = false;
				}
			}
		});
		button15.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				if(isclear == false){
					String temp = (String)textview.getText();
					if(temp.equals("0"))
						textview.setText("3");
					else
						textview.setText(temp+"3");
				}
				else{
					textview.setText("3");
					isclear = false;
				}
			}
		});
		button16.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				number1 = number2;
				number2 = Double.parseDouble(temp);
				lastOperation = nowOperation;
				nowOperation = "/";
				if(lastOperation != null)
					number2 = function(lastOperation,number1,number2);
				textview.setText(OperationResult(number2));
				isclear = true;
			}
		});
		button17.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				textview.setText(temp+".");
				isclear = false;
			}
		});
		button18.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				if(isclear == false){
					String temp = (String)textview.getText();
					if(temp.equals("0"))
						textview.setText("0");
					else
						textview.setText(temp+"0");
				}
				else{
					textview.setText("0");
					isclear = false;
				}
			}
		});
		button19.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				number1 = number2;
				number2 = Double.parseDouble(temp);
				lastOperation = nowOperation;
				nowOperation = null;
				if(lastOperation != null)
					number2 = function(lastOperation,number1,number2);
				textview.setText(OperationResult(number2));
				isclear = true;
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.normal, menu);
		return true;
	}
	
	public double function(String operation,double number1,double number2) {
		if(operation.equals("+"))
			return number1+number2;
		else if(operation.equals("-"))
			return number1-number2;
		else if(operation.equals("*"))
			return number1*number2;
		else 
			return number1/number2;
	}
	
	public String OperationResult(double number) {
		int temp = (int)number;
		if(temp-number == 0)
			return(Integer.toString(temp));
		else
			return(Double.toString(number));
			
		
	}

}
