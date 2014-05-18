package com.example.datewithme;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class AvailableRideListFragment extends ListFragment 
{
	
	

		private String ride[];
		//private String String;
		public AvailableRideListFragment() 
			{
				ride = new String[] 
					{
						"Sagar has offered a Ride to Montgomery,NY at 6:00pm",
						"Alper has offered a Ride to Walkill, NY at 5:30pm",
						"Mahmoud has offered a Ride to Poughkeepsie, NY at 6:00pm",
					};
				// TODO Auto-generated constructor stub
			}
		
		@Override
		public void onCreate(Bundle savedInstanceState) 
		{
			super.onCreate(savedInstanceState);
			
			ListAdapter listAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, ride);
			setListAdapter(listAdapter);
		}
		
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) 
		{
			return inflater.inflate(R.layout.list_fragment, container, false);
		}
		
		@Override
		public void onListItemClick(ListView listViewRides, View v, int position, long id) 
		{

			Toast.makeText(getActivity(), getListView().getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
		}
		
		

		
}
