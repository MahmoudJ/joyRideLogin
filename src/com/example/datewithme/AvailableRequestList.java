package com.example.datewithme;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class AvailableRequestList extends ListFragment {
	

	private String request1[];
	//private String String;
	public AvailableRequestList() 
		{
			request1 = new String[] 
				{
					"Tom wants a Ride to Dunkin Donut, New Paltz, NY at 6:00pm",
					"Nitya wants a Ride to SUNY New Paltz, New Paltz, NY at 5:30pm",
					"Larry wants a Ride to Poughkeepsie, NY at 6:00pm",
				};
			// TODO Auto-generated constructor stub
		}
	
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		
		ListAdapter listAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, request1);
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
