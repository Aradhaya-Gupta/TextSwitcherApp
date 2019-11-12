package com.example.textswitcherapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher.ViewFactory;

public class MainActivity extends Activity {

	Button btn1,btn2;
	TextSwitcher ts;
	String arr[]={"Ram","Sham","Ramu","Ramphal","Aradhaya","Gupta"};
	Integer len=arr.length;
	Integer a=-1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn1=(Button)findViewById(R.id.button1);
		btn2=(Button)findViewById(R.id.button2);
		ts=(TextSwitcher)findViewById(R.id.textSwitcher1);
		ts.setFactory(new ViewFactory() {
			
			@Override
			public View makeView() {
				// TODO Auto-generated method stub
				TextView tv=new TextView(MainActivity.this);
				return tv;
			}
		});
		btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				a++;
				if(a<=len-1)
				{
					ts.setText(arr[a].toString());
				}
				else if(a==len)
				{
					a=0;
					ts.setText(arr[a].toString());
				}
			}
		});
		btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				a--;
				Toast.makeText(getApplicationContext(), a.toString(), Toast.LENGTH_SHORT).show();
			/*	if(a<=len-1)
				{
					ts.setText(arr[a].toString());
				}
				else if(a==-1)
				{
					a=len-1;
					ts.setText(arr[a].toString());
				}*/
			}
		});
	}
}
