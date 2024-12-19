package com.demoapp.footballteams;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);

        Thread th = new Thread() {
            @Override
            public void run() {
                super.run();

                try {
                    sleep(3000);
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                } catch (InterruptedException e) {
                    //Log log;
                   // log.e("Rabbi", e.getMessage());

                    throw new RuntimeException(e);
                }
            }
        };
        th.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();//for suiciding the splash activity when we use back
    }
}