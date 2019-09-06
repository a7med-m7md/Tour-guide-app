package com.tourguide.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt_resturant , txt_cafes , txt_places , txt_events ;
    ListView ls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_resturant = (TextView)findViewById(R.id.resturant);
        txt_cafes = (TextView)findViewById(R.id.cafes);
        txt_places = (TextView)findViewById(R.id.places);
        txt_events = (TextView)findViewById(R.id.events);

        //Move to restaurant activities
        txt_resturant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurant_activity = new Intent(MainActivity.this,Resturant.class);
                startActivity(restaurant_activity);
            }
        });

        //Move to Cafes Activity
        txt_cafes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cafes_activity = new Intent(MainActivity.this , Cafes.class);
                startActivity(cafes_activity);
            }
        });

        //Move to places Activity
        txt_places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent places_activity = new Intent(MainActivity.this , Places.class);
                startActivity(places_activity);
            }
        });

        //Move to events Activity
        txt_events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent events_activity = new Intent(MainActivity.this , Events.class);
                startActivity(events_activity);
            }
        });


    }


}
