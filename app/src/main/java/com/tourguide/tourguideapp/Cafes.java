package com.tourguide.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Cafes extends AppCompatActivity {
    String [] names = {"LiTCHi" , "Twenty" , "Binary" , "Da Vinci"};
    int [] cafe_image = {R.drawable.litchi , R.drawable.twentycafe , R.drawable.binary , R.drawable.davinci};
    String [] cafe_address = {"ElDourous Street , Faqous , ElSharqia" , "ElDourous Street ,ELboroum, Faqous , ElSharqia","Moubarak Street , Elmanshia , Faqous , Elsharqia"
            , "Abu Rased Street , Elbouroum, Faqous , ElSharqia"};
    String [] cafe_number = {"055 3944067","0101 818 1039","055 3971880","0109 090 0746"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafes);
        ListView lst = (ListView)findViewById(R.id.cafe_list);
        cafesAdapter adapter = new cafesAdapter();
        lst.setAdapter(adapter);
    }

    public class cafesAdapter extends BaseAdapter{


        @Override
        public int getCount() {
            return names.length;
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
            convertView = getLayoutInflater().inflate(R.layout.cafe_activity_list , null);
            ImageView cafe_img = (ImageView)convertView.findViewById(R.id.cafe_img);
            cafe_img.setImageResource(cafe_image[position]);
            TextView txt_name = (TextView)convertView.findViewById(R.id.cafe_name);
            txt_name.setText(names[position]);
            TextView txt_address = (TextView)convertView.findViewById(R.id.address);
            txt_address.setText(cafe_address[position]);
            TextView txt_number = (TextView)convertView.findViewById(R.id.cafe_num);
            txt_number.setText(cafe_number[position]);
            return convertView;
        }
    }
}
