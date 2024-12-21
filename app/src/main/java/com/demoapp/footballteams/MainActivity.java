package com.demoapp.footballteams;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String[] country = {"Bangladesh","Brazil","Argentina","Portugal"};
    String[] coach = {"Javier Fernández Cabrera Martín Peñato", "Dorival Júnior", "Lionel Scaloni", " Roberto Martínez"};
    int[] flag = {R.drawable.bangladesh1, R.drawable.brazil, R.drawable.argentina, R.drawable.portugal};

    ListView lstCountryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        lstCountryList = findViewById(R.id.lst_country);



    }
}