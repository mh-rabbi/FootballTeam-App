package com.demoapp.footballteams;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Arrays;

public class PlayersActivity extends AppCompatActivity {

 /*   String[] Players = {
            "Shahidul Alam", "Pritom Kumer", "Tarek Raihan", "Mustafa Muntasir", "Jewel Rana",
            "Jamaldin Mollah", "Mohammad Atique", "Nasir Uddin", "Sohag Kazi", "Ariful Islam",
            "Mahmudul Hasan", "Masuk Mia", "Moshiur Rahman", "Shamsul Haque", "Rokibul Hassan",
            "Rajon Shikder", "Ashraful Alam", "Koushik Sarkar", "Saddam Hossain", "Mokhlesur Rahman",
            "Zahid Hossain", "Rakibul Islam", "Mohiuddin Mollah", "Shakil Ahmed", "Shahriar Alam",
            "Abu Musa", "Ali Hossain", "Shahidul Islam", "Poyel Hossain", "Rahmat Ali", "Tariq Ahmed"
    };
*/
    ImageView img;
    TextView txtCountry;
    ListView lstPlayers;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_players);

//        String passedData = getIntent().getStringExtra("CountryName");
//        getSupportActionBar().setTitle(passedData);

        img = findViewById(R.id.img);
        txtCountry =findViewById(R.id.txt_country);
        lstPlayers = findViewById(R.id.lst_players);

        String countryName = getIntent().getStringExtra("CountryName");
        int flagId = getIntent().getIntExtra("Flag", -1);
        String[] players = getIntent().getStringArrayExtra("Players");

        // Set country name and flag
        txtCountry.setText(countryName);
        img.setImageResource(flagId);


       // ArrayAdapter myAdapter = new ArrayAdapter(PlayersActivity.this, android.R.layout.simple_list_item_1,Players );

        //lstPlayers.setAdapter(myAdapter);

        // Populate players list
        ArrayList<String> playerList = new ArrayList<>(Arrays.asList(players));
        com.demoapp.footballteams.PlayersAdapter adapter = new com.demoapp.footballteams.PlayersAdapter(this, playerList);
        lstPlayers.setAdapter(adapter);

    }
}
