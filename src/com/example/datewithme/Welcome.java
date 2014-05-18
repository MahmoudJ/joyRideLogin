package com.example.datewithme;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import android.app.FragmentTransaction;

public class Welcome extends FragmentActivity implements ActionBar.TabListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_screen);
		
		final ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.addTab(actionBar.newTab().setText(R.string.title_section1).setTabListener(this));
        actionBar.addTab(actionBar.newTab().setText(R.string.title_section2).setTabListener(this));
    }
	
	
	  @Override
	    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
	    }

	    @Override
	    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) 
	    {
	        
	    	/**
	    	 * On first tab we will show our list
	    	 */
	    	if (tab.getPosition() == 0) {
	    		AvailableRideListFragment AvailableRideList = new AvailableRideListFragment();
	    		getSupportFragmentManager().beginTransaction().replace(R.id.container, AvailableRideList).commit();
	    	} 
	    	else if (tab.getPosition() == 1) {
	    		AvailableRequestList AvailableRequest = new AvailableRequestList();
	    		getSupportFragmentManager().beginTransaction().replace(R.id.container, AvailableRequest).commit();
			}
	    	
	    }


		@Override
		public void onTabReselected(Tab tab, FragmentTransaction ft) {
			// TODO Auto-generated method stub
			
		}
}
