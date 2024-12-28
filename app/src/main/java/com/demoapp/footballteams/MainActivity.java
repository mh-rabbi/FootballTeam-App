package com.demoapp.footballteams;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String[] country = {
            "Bangladesh","Brazil","Argentina",
            "Brazil","Argentina","Portugal",
            "Brazil","Argentina","Portugal",
            "Brazil","Argentina","Portugal",
            "Brazil","Argentina","Portugal",
            "Brazil","Argentina","Portugal",
            "Brazil","Argentina","Portugal"
    };

    String[] coach = {
            "Javier Fernández Cabrera Martín Peñato", "Dorival Júnior", "Lionel Scaloni",
            "Javier Fernández Cabrera Martín Peñato", "Dorival Júnior", "Lionel Scaloni",
            "Javier Fernández Cabrera Martín Peñato", "Dorival Júnior", "Lionel Scaloni",
            "Javier Fernández Cabrera Martín Peñato", "Dorival Júnior", "Lionel Scaloni",
            "Javier Fernández Cabrera Martín Peñato", "Dorival Júnior", "Lionel Scaloni",
            "Javier Fernández Cabrera Martín Peñato", "Dorival Júnior", "Lionel Scaloni",
            "Javier Fernández Cabrera Martín Peñato", "Dorival Júnior", "Lionel Scaloni",

    };

    int[] flag = {
            R.drawable.brazil, R.drawable.argentina, R.drawable.portugal,
            R.drawable.brazil, R.drawable.argentina, R.drawable.portugal,
            R.drawable.brazil, R.drawable.argentina, R.drawable.portugal,
            R.drawable.brazil, R.drawable.argentina, R.drawable.portugal,
            R.drawable.brazil, R.drawable.argentina, R.drawable.portugal,
            R.drawable.brazil, R.drawable.argentina, R.drawable.portugal,
            R.drawable.brazil, R.drawable.argentina, R.drawable.portugal
    };

    String[][] players = {
            {"Player1", "Player2", "Player3"},  // Bangladesh
            {"Player1", "Player2", "Player3"},  // Brazil
            {"Player1", "Player2", "Player3"},   // Argentina
            {"Player1", "Player2", "Player3"},   // Argentina
            {"Player1", "Player2", "Player3"},   // Argentina
            {"Player1", "Player2", "Player3"},   // Argentina
            {"Player1", "Player2", "Player3"}   // Argentina
    };

    ListView lstCountryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        lstCountryList = findViewById(R.id.lst_country);

        BaseAdapter myBaseAdapter = new BaseAdapter() {
            @Override
            public int getCount() {
                return country.length;
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
            public View getView(int position, View view, ViewGroup viewGroup) {
                if(view == null){
                    view = LayoutInflater.from(MainActivity.this).inflate(R.layout.item_list1,viewGroup,false);
                }
                TextView txtCountry = view.findViewById(R.id.txt_country);
                TextView txtCoach = view.findViewById(R.id.txt_coach);
                ImageView img = view.findViewById(R.id.img);

                txtCountry.setText(country[position]);
                txtCoach.setText(coach[position]);
                // for using the image resource ID from the flag array, we cant use image drawable here as it is INT id
                img.setImageResource(flag[position]);

                return view;
            }
        };
        lstCountryList.setAdapter(myBaseAdapter);

        lstCountryList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent i = new Intent(MainActivity.this, PlayersActivity.class);
                i.putExtra("CountryName", country[position]);
                i.putExtra("Flag", flag[position]);
                i.putExtra("Players", players[position]);

                startActivity(i);
            }
        });

    }
}