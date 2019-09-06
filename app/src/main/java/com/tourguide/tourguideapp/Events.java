package com.tourguide.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Events extends AppCompatActivity {

    String [] event_time = {"09:00PM","08:00PM","08:00PM","08:00PM","11:00AM","06:00PM"};
    String [] event_name = {"Amr Jahin and His Friends at Room Garden City" ,"Strawberry Swing Concert at Cairo Opera House",
                            "Band of Religious Songs at Cairo Opera House","Abdel Halim Nowera at Cairo Opera House",
                            "Naguib Mahfouz B' Khitm El Nisr' Exhibition at the Naguib Mahfouz Museum",
                            "Om Kalthoum Returns at El Sawy Culturewheel"};
    String [] event_address = {"ROOM Art Space Garden City"," Cairo Opera House"," Cairo Opera House","Cairo Opera House"
                                ,"Naguib Mahfouz Museum"," El Sawy Culturewheel"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        ListView lst = (ListView)findViewById(R.id.event_list);
        Event_Adapter adapter = new Event_Adapter();
        lst.setAdapter(adapter);

    }
    public class Event_Adapter extends BaseAdapter{

        @Override
        public int getCount() {
            return event_name.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.event_list_activity,null);
            TextView txt_name = (TextView)convertView.findViewById(R.id.event_name);
            txt_name.setText(event_name[position]);
            TextView txt_time = (TextView)convertView.findViewById(R.id.event_time);
            txt_time.setText(event_time[position]);
            TextView txt_address = (TextView)convertView.findViewById(R.id.event_address);
            txt_address.setText(event_address[position]);
            return convertView;
        }
    }
}
