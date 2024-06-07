package com.example.deliverymanagementapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    // Splash screen duration in milliseconds
    private static final int SPLASH_DURATION = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Delay for 5 seconds and then start LoginActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
                finish(); // Close MainActivity
            }
        }, SPLASH_DURATION);
    }
}