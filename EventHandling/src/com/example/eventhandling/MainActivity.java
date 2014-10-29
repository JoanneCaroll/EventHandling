package com.example.eventhandling;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
	public static final String TAG="MainActivity";
	TextView label;
	Button showButton;
	Button showToast;
	Button nextButton;
	int i=0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "OnCreate");
        label = (TextView)findViewById(R.id.hello_world);
		label.setVisibility(View.INVISIBLE);
        showButton = (Button)findViewById(R.id.showText);
        showButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (i==0)
				{
					label.setVisibility(View.VISIBLE);
					i=1;
				}
				else if(i==1)
				{
					label.setVisibility(View.INVISIBLE);
					i=0;
				}
			}
		});
        
        showToast = (Button)findViewById(R.id.showToast);
        showToast.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, R.string.hello_world, Toast.LENGTH_SHORT).show();
			}
		});
        	
       
    	nextButton = (Button)findViewById(R.id.next);
    	nextButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Log.d(TAG, "nextButton");
				sendActivity();
			}
		});

    }
    public void sendActivity(){
    	Intent i = new Intent(this, NextActivity.class);
    	startActivity(i);
    }

}
