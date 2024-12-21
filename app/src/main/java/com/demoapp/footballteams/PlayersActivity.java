package com.demoapp.footballteams;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PlayersActivity extends AppCompatActivity {

    String[] Players = {
            "Shahidul Alam", "Pritom Kumer", "Tarek Raihan", "Mustafa Muntasir", "Jewel Rana",
            "Jamaldin Mollah", "Mohammad Atique", "Nasir Uddin", "Sohag Kazi", "Ariful Islam",
            "Mahmudul Hasan", "Masuk Mia", "Moshiur Rahman", "Shamsul Haque", "Rokibul Hassan",
            "Rajon Shikder", "Ashraful Alam", "Koushik Sarkar", "Saddam Hossain", "Mokhlesur Rahman",
            "Zahid Hossain", "Rakibul Islam", "Mohiuddin Mollah", "Shakil Ahmed", "Shahriar Alam",
            "Abu Musa", "Ali Hossain", "Shahidul Islam", "Poyel Hossain", "Rahmat Ali", "Tariq Ahmed"
    };

    ListView lstPlayersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_players);

        String passedData = getIntent().getStringExtra("CountryName");
        getSupportActionBar().setTitle(passedData);

        lstPlayersList = findViewById(R.id.lst_players);

        ArrayAdapter myAdapter = new ArrayAdapter(PlayersActivity.this, android.R.layout.simple_list_item_1, Players);

        lstPlayersList.setAdapter(myAdapter);

    }
}
