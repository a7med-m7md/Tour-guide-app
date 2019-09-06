package com.tourguide.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Resturant extends AppCompatActivity {
    String [] restaurant = {"MCDONALD" , "KFC" , "Pizza hut" , "Cook Door"};
    int [] img_ = {R.drawable.mcdonalds , R.drawable.kfc , R.drawable.pizaahut , R.drawable.cookdoor};
    int [] des = {R.string.McDonald,R.string.KFC,R.string.pizzahut,R.string.cookdoor};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturant);
        ListView lst = (ListView)findViewById(R.id.list_restaurant);

        list res_lst = new list();
        lst.setAdapter(res_lst);
    }

    public class list extends BaseAdapter {


        @Override
        public int getCount() {
            return restaurant.length;
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
            convertView = getLayoutInflater().inflate(R.layout.custom_list,null);
            ImageView img = (ImageView)convertView.findViewById(R.id.res_img);
            img.setImageResource(img_[position]);

            TextView txt = (TextView)convertView.findViewById(R.id.res_name);
            txt.setText(restaurant[position]);

            TextView txt_des = (TextView)convertView.findViewById(R.id.res_description);
            txt_des.setText(des[position]);
            return convertView;
        }
    }
}
