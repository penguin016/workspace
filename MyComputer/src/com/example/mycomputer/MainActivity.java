package com.example.mycomputer;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.SendMessageToWX;
import com.tencent.mm.sdk.openapi.WXAPIFactory;
import com.tencent.mm.sdk.openapi.WXMediaMessage;
import com.tencent.mm.sdk.openapi.WXTextObject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends Activity {
	Button come_in;
	RadioGroup mRadioGroup;
	RadioButton mRadio1,mRadio2,mRadio3;
	SendMessageToWX.Req req = new SendMessageToWX.Req();
    int whichSelected;
    //合法的微信APPID
    private static final String App_Id = "wxc09973a745886c2f";
    //IWXAPI是第三方app和微信通信的openapi接口
    private IWXAPI api;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		regToWx();
		mRadioGroup = (RadioGroup)findViewById(R.id.computer);
		mRadio1 = (RadioButton)findViewById(R.id.normal);
		mRadio2 = (RadioButton)findViewById(R.id.exten);
		mRadio3 = (RadioButton)findViewById(R.id.bool);
		come_in = (Button)findViewById(R.id.come_in);
		mRadioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(RadioGroup group, int checkedId) {
			// TODO Auto-generated method stub
				if(checkedId == mRadio1.getId()){
					whichSelected = 0;
				}
				if(checkedId == mRadio2.getId()){
					whichSelected = 1;
				}				
				if(checkedId == mRadio3.getId()){
					whichSelected = 2;
				}
			}
		});
		come_in.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent intent = new Intent();
				switch(whichSelected){
				case 0:
					intent.setClass(MainActivity.this, NormalActivity.class);
					MainActivity.this.startActivity(intent);
					break;
				case 2:
					intent.setClass(MainActivity.this, BinaryActivity.class);
					MainActivity.this.startActivity(intent);
					break;
				case 1:
					intent.setClass(MainActivity.this, ExtendedActivity.class);
					MainActivity.this.startActivity(intent);
					break;
				}
			}
		});
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		menu.add(0, 1, 1, "退出");
		menu.add(0, 2, 2, "关于");
		menu.add(0, 3, 3, "分享给微信好友");
		return super.onCreateOptionsMenu(menu);
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		if(item.getItemId() == 1)
			finish();
		if(item.getItemId() == 2){
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, HelpActivity.class);
			startActivity(intent);
		}
		if(item.getItemId() == 3) {
		
			WXTextObject textObj = new WXTextObject();
			textObj.text = "Hello, this is my WXTest!";
			
			WXMediaMessage msg = new WXMediaMessage();
			msg.mediaObject = textObj;
			msg.description = "Hello, this is my WXTest!";

			req.transaction = String.valueOf(System.currentTimeMillis());
			req.message = msg;

			api.sendReq(req);
			System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaa");
		}
		return super.onOptionsItemSelected(item);
	}
	
    private void regToWx() {
		//通过WXAPIFactory工厂，获取IWXAPI的实例
		api = WXAPIFactory.createWXAPI(this, App_Id, true);
		//将应用的appid注册到微信
		api.registerApp(App_Id);
	}

}
