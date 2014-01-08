package com.example.swipeytabs;

import com.viewpagerindicator.PageIndicator;
import com.viewpagerindicator.TitlePageIndicator;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class MainActivity extends FragmentActivity {
	
	FragmentAdapter mAdapter;
	ViewPager mPager;
	PageIndicator mIndicator;
	int Number = 0;
	    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 mAdapter = new FragmentAdapter(getSupportFragmentManager());

	     mPager = (ViewPager)findViewById(R.id.pager);
	     mPager.setAdapter(mAdapter);

	     mIndicator = (TitlePageIndicator)findViewById(R.id.indicator);
	     mIndicator.setViewPager(mPager);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
