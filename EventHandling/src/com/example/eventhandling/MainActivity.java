package com.example.eventhandling;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
	TextView label;
	Button showButton;
	Button showToast;
	int i=0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
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
        	
        }
        

}
