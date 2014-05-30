package com.example.mycomputer;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class ExtendedActivity extends Activity {

	double number1 = 0;
	double number2 = 0;
	String lastOperation = null;
	String nowOperation = null;
	boolean isclear = true;
	boolean isjiao = true;
	TextView textview;
	RadioGroup radiogroup;
	RadioButton radio1,radio2;
	String realtext;
	Button button1,button2,button3,button4,button5,button6,button7,button8,
	       button9,button10,button11,button12,button13,button14,button15,
	       button16,button17,button18,button19,button21,button22,
	       button23,button24,button25,button26,button27,button28,button29,
	       button30,button31,button32,button33,button34,button35,button36,
	       button37,button38,button39,button40,button41,button42,button43,
	       button44,button45,button46,button47;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_extended);
		radiogroup = (RadioGroup)findViewById(R.id.radius);
		radio1 = (RadioButton)findViewById(R.id.hudu);
		radio2 = (RadioButton)findViewById(R.id.jiao);
		textview = (TextView)findViewById(R.id.text);
		textview.setBackgroundColor(Color.YELLOW);
		textview.setText("0");
		button1 = (Button)findViewById(R.id.ebutton1);
		button1.setText("C");
		button1.setTextColor(Color.YELLOW);
		button2 = (Button)findViewById(R.id.ebutton2);
		button2.setText("+/-");
		button3 = (Button)findViewById(R.id.ebutton3);
		button3.setText("del");
		button3.setTextColor(Color.YELLOW);
		button4 = (Button)findViewById(R.id.ebutton4);
		button4.setText("+");
		button4.setTextColor(Color.YELLOW);
		button5 = (Button)findViewById(R.id.ebutton5);
		button5.setText("7");
		button6 = (Button)findViewById(R.id.ebutton6);
		button6.setText("8");
		button7 = (Button)findViewById(R.id.ebutton7);
		button7.setText("9");
		button8 = (Button)findViewById(R.id.ebutton8);
		button8.setText("-");
		button8.setTextColor(Color.YELLOW);
		button9= (Button)findViewById(R.id.ebutton9);
		button9.setText("4");
		button10 = (Button)findViewById(R.id.ebutton10);
		button10.setText("5");
		button11 = (Button)findViewById(R.id.ebutton11);
		button11.setText("6");
		button12 = (Button)findViewById(R.id.ebutton12);
		button12.setText("*");
		button12.setTextColor(Color.YELLOW);
		button13 = (Button)findViewById(R.id.ebutton13);
		button13.setText("1");
		button14 = (Button)findViewById(R.id.ebutton14);
		button14.setText("2");
		button15 = (Button)findViewById(R.id.ebutton15);
		button15.setText("3");
		button16 = (Button)findViewById(R.id.ebutton16);
		button16.setText("/");
		button16.setTextColor(Color.YELLOW);
		button17 = (Button)findViewById(R.id.ebutton17);
		button17.setText(".");
		button18 = (Button)findViewById(R.id.ebutton18);
		button18.setText("0");
		button19 = (Button)findViewById(R.id.ebutton19);
		button19.setText("=");
		button19.setTextColor(Color.YELLOW);
		button21 = (Button)findViewById(R.id.ebutton21);
		button21.setText("(a,b)");
		button21.setTextColor(Color.BLUE);
		button22 = (Button)findViewById(R.id.ebutton22);
		button22.setText("[a,b]");
		button22.setTextColor(Color.BLUE);
		button23 = (Button)findViewById(R.id.ebutton23);
		button23.setText("上取整");
		button23.setTextColor(Color.BLUE);
		button24 = (Button)findViewById(R.id.ebutton24);
		button24.setText("下取整");
		button24.setTextColor(Color.BLUE);
		button25 = (Button)findViewById(R.id.ebutton25);
		button25.setText("C(a,b)");
		button25.setTextColor(Color.BLUE);
		button26 = (Button)findViewById(R.id.ebutton26);
		button26.setText("A(a,b)");
		button26.setTextColor(Color.BLUE);
		button27 = (Button)findViewById(R.id.ebutton27);
		button27.setText("平方根");
		button27.setTextColor(Color.BLUE);
		button28 = (Button)findViewById(R.id.ebutton28);
		button28.setText("立方根");
		button28.setTextColor(Color.BLUE);
		button29 = (Button)findViewById(R.id.ebutton29);
		button29.setText("mod");
		button29.setTextColor(Color.parseColor("#800000"));
		button30 = (Button)findViewById(R.id.ebutton30);
		button30.setText("PI");
		button30.setTextColor(Color.parseColor("#A52A2A"));
		button31 = (Button)findViewById(R.id.ebutton31);
		button31.setText("E");
		button31.setTextColor(Color.parseColor("#A52A2A"));
		button32 = (Button)findViewById(R.id.ebutton32);
		button32.setText("sin");
		button32.setTextColor(Color.parseColor("#A52A2A"));
		button33 = (Button)findViewById(R.id.ebutton33);
		button33.setText("cos");
		button33.setTextColor(Color.parseColor("#A52A2A"));
		button34 = (Button)findViewById(R.id.ebutton34);
		button34.setText("tan");
		button34.setTextColor(Color.parseColor("#A52A2A"));
		button35 = (Button)findViewById(R.id.ebutton35);
		button35.setText("求和");
		button35.setTextColor(Color.parseColor("#A52A2A"));
		button36 = (Button)findViewById(R.id.ebutton36);
		button36.setText("ln");
		button36.setTextColor(Color.parseColor("#A52A2A"));
		button37 = (Button)findViewById(R.id.ebutton37);
		button37.setText("log");
		button37.setTextColor(Color.parseColor("#A52A2A"));
		button38 = (Button)findViewById(R.id.ebutton38);
		button38.setText("a^x");
		button38.setTextColor(Color.parseColor("#A52A2A"));
		button39 = (Button)findViewById(R.id.ebutton39);
		button39.setText("2^x");
		button39.setTextColor(Color.parseColor("#A52A2A"));
		button40 = (Button)findViewById(R.id.ebutton40);
		button40.setText("1/x");
		button40.setTextColor(Color.parseColor("#A52A2A"));
		button41 = (Button)findViewById(R.id.ebutton41);
		button41.setText("n!");
		button41.setTextColor(Color.parseColor("#A52A2A"));
		button42 = (Button)findViewById(R.id.ebutton42);
		button42.setText("max");
		button42.setTextColor(Color.parseColor("#A52A2A"));
		button43 = (Button)findViewById(R.id.ebutton43);
		button43.setText("min");
		button43.setTextColor(Color.parseColor("#A52A2A"));
		button44 = (Button)findViewById(R.id.ebutton44);
		button44.setText("exp");
		button44.setTextColor(Color.parseColor("#A52A2A"));
		button45 = (Button)findViewById(R.id.ebutton45);
		button45.setText("|a|");
		button45.setTextColor(Color.parseColor("#A52A2A"));
		button46 = (Button)findViewById(R.id.ebutton46);
		button46.setText("hypot");
		button46.setTextColor(Color.parseColor("#A52A2A"));
		button47 = (Button)findViewById(R.id.ebutton47);
		button47.setText("rand");
		button47.setTextColor(Color.parseColor("#A52A2A"));
		//设置功能
		radiogroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				if(checkedId == radio1.getId())
					isjiao = false;
				if(checkedId == radio2.getId())
					isjiao = true;
			}
		});
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
				isclear = false;
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
					else if(temp.equals("-0"))
						textview.setText("-7");
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
					else if(temp.equals("-0"))
						textview.setText("-8");
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
					else if(temp.equals("-0"))
						textview.setText("-9");
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
					else if(temp.equals("-0"))
						textview.setText("-4");
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
					else if(temp.equals("-0"))
						textview.setText("-5");
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
					else if(temp.equals("-0"))
						textview.setText("-6");
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
					else if(temp.equals("-0"))
						textview.setText("-1");
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
					else if(temp.equals("-0"))
						textview.setText("-2");
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
					else if(temp.equals("-0"))
						textview.setText("-3");
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
					else if(temp.equals("-0"))
						textview.setText("-0");
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
		button21.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				number1 = number2;
				number2 = Double.parseDouble(temp);
				lastOperation = nowOperation;
				nowOperation = "(a,b)";
				if(lastOperation != null)
					number2 = function(lastOperation,number1,number2);
				textview.setText(OperationResult(number2));
				isclear = true;
			}
		});
		button22.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				number1 = number2;
				number2 = Double.parseDouble(temp);
				lastOperation = nowOperation;
				nowOperation = "[a,b]";
				if(lastOperation != null)
					number2 = function(lastOperation,number1,number2);
				textview.setText(OperationResult(number2));
				isclear = true;
			}
		});
		button23.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				double tempnum = Double.parseDouble(temp);
				if(tempnum>0){
					if((int)tempnum-tempnum == 0)
						textview.setText(OperationResult((int)tempnum));
					else
						textview.setText(OperationResult((int)(tempnum+1)));	
				}	
				else
						textview.setText(OperationResult((int)(tempnum)));
				isclear = true;
			}
		});
		button24.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				double tempnum = Double.parseDouble(temp);
				if(tempnum>0)
					textview.setText(OperationResult((int)tempnum));	
				else{
					if((int)tempnum-tempnum == 0)
						textview.setText(OperationResult((int)tempnum));
					else
						textview.setText(OperationResult((int)(tempnum-1)));
				}		
				isclear = true;
			}
		});
		button25.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				number1 = number2;
				number2 = Double.parseDouble(temp);
				lastOperation = nowOperation;
				nowOperation = "C(a,b)";
				if(lastOperation != null)
					number2 = function(lastOperation,number1,number2);
				textview.setText(OperationResult(number2));
				isclear = true;
			}
		});
		button26.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				number1 = number2;
				number2 = Double.parseDouble(temp);
				lastOperation = nowOperation;
				nowOperation = "A(a,b)";
				if(lastOperation != null)
					number2 = function(lastOperation,number1,number2);
				textview.setText(OperationResult(number2));
				isclear = true;
			}
		});
		button27.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				double tempnum = Double.parseDouble(temp);
				textview.setText(OperationResult(Math.sqrt(tempnum)));
				isclear = true;
			}
		});
		button28.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				double tempnum = Double.parseDouble(temp);
				if(tempnum<0)
					textview.setText(OperationResult(-Math.pow(-tempnum, 1/3.0)));
				else
					textview.setText(OperationResult(Math.pow(tempnum, 1/3.0)));
				isclear = true;
			}
		});
		button29.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				number1 = number2;
				number2 = Double.parseDouble(temp);
				lastOperation = nowOperation;
				nowOperation = "mod";
				if(lastOperation != null)
					number2 = function(lastOperation,number1,number2);
				textview.setText(OperationResult(number2));
				isclear = true;
			}
		});
		button30.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				textview.setText(OperationResult(Math.PI));
				isclear = true;
			}
		});
		button31.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				textview.setText(OperationResult(Math.E));
				isclear = true;
			}
		});
		button32.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				double tempnum = Double.parseDouble(temp);
				if(isjiao == true)
					textview.setText(OperationResult(Math.sin(Math.toRadians(tempnum))));
				else
					textview.setText(OperationResult(Math.sin(tempnum)));
				isclear = true;
			}
		});
		button33.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				double tempnum = Double.parseDouble(temp);
				if(isjiao == true)
					textview.setText(OperationResult(Math.cos(Math.toRadians(tempnum))));
				else
					textview.setText(OperationResult(Math.cos(tempnum)));
				isclear = true;
			}
		});
		button34.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				double tempnum = Double.parseDouble(temp);
				if(isjiao == true)
					textview.setText(OperationResult(Math.tan(Math.toRadians(tempnum))));
				else
					textview.setText(OperationResult(Math.tan(tempnum)));
				isclear = true;
			}
		});
		button35.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				number1 = number2;
				number2 = Double.parseDouble(temp);
				lastOperation = nowOperation;
				nowOperation = "求和";
				if(lastOperation != null)
					number2 = function(lastOperation,number1,number2);
				textview.setText(OperationResult(number2));
				isclear = true;
			}
		});
		button36.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				double tempnum = Double.parseDouble(temp);
				textview.setText(OperationResult(Math.log(tempnum)));
				isclear = true;
			}
		});
		button37.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				double tempnum = Double.parseDouble(temp);
				textview.setText(OperationResult(Math.log10(tempnum)));
				isclear = true;
			}
		});
		button38.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				number1 = number2;
				number2 = Double.parseDouble(temp);
				lastOperation = nowOperation;
				nowOperation = "a^x";
				if(lastOperation != null)
					number2 = function(lastOperation,number1,number2);
				textview.setText(OperationResult(number2));
				isclear = true;
			}
		});
		button39.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				double tempnum = Double.parseDouble(temp);
				textview.setText(OperationResult(Math.pow(2, tempnum)));
				isclear = true;
			}
		});
		button40.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				double tempnum = Double.parseDouble(temp);
				textview.setText(OperationResult(1/tempnum));
				isclear = true;
			}
		});
		button41.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				double tempnum = Double.parseDouble(temp);
				int tempint = (int)tempnum; 
				if(tempint<0){
					textview.setText("ERROR");
					isclear = true;
				}
					
				else{
					textview.setText(OperationResult(jiecheng(tempint)));
					isclear = true;
				}
			}
		});
		button42.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				number1 = number2;
				number2 = Double.parseDouble(temp);
				lastOperation = nowOperation;
				nowOperation = "max";
				if(lastOperation != null)
					number2 = function(lastOperation,number1,number2);
				textview.setText(OperationResult(number2));
				isclear = true;
			}
		});
		button43.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				number1 = number2;
				number2 = Double.parseDouble(temp);
				lastOperation = nowOperation;
				nowOperation = "min";
				if(lastOperation != null)
					number2 = function(lastOperation,number1,number2);
				textview.setText(OperationResult(number2));
				isclear = true;
			}
		});
		button44.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				double tempnum = Double.parseDouble(temp);
				textview.setText(OperationResult(Math.exp(tempnum)));
				isclear = true;
			}
		});
		button45.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				double tempnum = Double.parseDouble(temp);
				textview.setText(OperationResult(Math.abs(tempnum)));
				isclear = true;
			}
		});
		button46.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String temp = (String)textview.getText();
				number1 = number2;
				number2 = Double.parseDouble(temp);
				lastOperation = nowOperation;
				nowOperation = "hypot";
				if(lastOperation != null)
					number2 = function(lastOperation,number1,number2);
				textview.setText(OperationResult(number2));
				isclear = true;
			}
		});
		button47.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				textview.setText(OperationResult(Math.random()));
				isclear = true;
			}
		});
	}
	
	public double function(String operation,double number1,double number2) {
		if(operation.equals("+"))
			return number1+number2;
		else if(operation.equals("-"))
			return number1-number2;
		else if(operation.equals("*"))
			return number1*number2;
		else if(operation.equals("/"))
			return number1/number2;
		else if(operation.equals("(a,b)")){
			int num1 = (int)number1;
			int num2 = (int)number2;
			return Gongyueshu(num1,num2);
		}
		else if(operation.equals("[a,b]")){
			int num1 = (int)number1;
			int num2 = (int)number2;
			return ((num1*num2)/Gongyueshu(num1,num2));
		}
		else if(operation.equals("C(a,b)")){
			int num1 = (int)number1;
			int num2 = (int)number2;
			if(num1<num2)
				return -1;
			else
				return (jiecheng(num1)/((jiecheng(num2)*jiecheng(num1-num2))));
		}
		else if(operation.equals("A(a,b)")){
			int num1 = (int)number1;
			int num2 = (int)number2;
			if(num1<num2)
				return -1;
			else
				return (jiecheng(num1)/(jiecheng(num1-num2)));
		}
		else if(operation.equals("求和")){
			int num1 = (int)number1;
			int num2 = (int)number2;
			return ((num1+num2)*(Math.abs(num2-num1)+1)/2);
		}
		else if(operation.equals("a^x"))
			return (Math.pow(number1, number2));
		else if(operation.equals("max"))
			return (Math.max(number1, number2));
		else if(operation.equals("min"))
			return (Math.min(number1, number2));
		else if(operation.equals("hypot"))
			return (Math.hypot(number1, number2));
		else
			return (number1%number2);
	}
	
	public String OperationResult(double number) {
		int temp = (int)number;
		if(temp-number == 0)
			return(Integer.toString(temp));
		else
			return(Double.toString(number));
			
		
	}
	
	public int jiecheng(int n) {
		if(n == 0)
			return 1;
		else
			return n*jiecheng(n-1);
	}
	public int Gongyueshu(int num1,int num2) {
		if(num1 == num2)
			return num1;
		else if(num1 == 0)
			return num2;
		else if(num2 ==0)
			return num1;
		else if(num1>num2){
			int temp = num1%num2;
			return Gongyueshu(temp,num2);
		}
		else{
			int temp = num2%num1;
			return Gongyueshu(temp,num1);
		}	
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		menu.add(0, 1, 1, "退出");
		menu.add(0, 2, 2, "关于");
		return super.onCreateOptionsMenu(menu);
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		if(item.getItemId() == 1)
			finish();
		if(item.getItemId() == 2){
			Intent intent = new Intent();
			intent.setClass(ExtendedActivity.this, Help2Activity.class);
			startActivity(intent);
		}
		return super.onOptionsItemSelected(item);
	}
	

}
