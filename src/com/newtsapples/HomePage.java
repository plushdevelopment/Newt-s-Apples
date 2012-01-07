package com.newtsapples;

import android.app.Activity;
import android.app.SearchManager.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class HomePage extends Activity implements OnClickListener {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.homepage);
		
		View v = (View) findViewById(R.id.imageView2);
		v.setOnClickListener(this);
		
		v = (View) findViewById(R.id.imageView3);
		v.setOnClickListener(this);
		
		v = (View) findViewById(R.id.imageView4);
		v.setOnClickListener(this);
		
		v = (View) findViewById(R.id.imageView6);
		v.setOnClickListener(this);
		
		v = (View) findViewById(R.id.imageView7);
		v.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		
		Intent i = new Intent(HomePage.this, SimpleGame.class);
		startActivity(i);
	}

}
