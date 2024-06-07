package com.example.deliverymanagementapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.deliverymanagementapp.ContiActivity;
import com.example.deliverymanagementapp.FsfoActivity;
import com.example.deliverymanagementapp.MarathiActivity;
import com.example.deliverymanagementapp.PunjabActivtiy;
import com.example.deliverymanagementapp.R;
import com.example.deliverymanagementapp.ThangabaliActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Find all ImageButtons by their IDs
        ImageButton imageButton1 = findViewById(R.id.imageButton1);
        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        ImageButton imageButton3 = findViewById(R.id.imageButton3);
        ImageButton imageButton4 = findViewById(R.id.imageButton4);
        ImageButton imageButton5 = findViewById(R.id.imageButton5);


        // Set OnClickListener for each ImageButton
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open imagefile1.xml when ImageButton 1 is clicked
                startActivity(new Intent(HomeActivity.this, MarathiActivity.class));
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open imagefile2.xml when ImageButton 2 is clicked
                startActivity(new Intent(HomeActivity.this, ThangabaliActivity.class));
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open imagefile3.xml when ImageButton 3 is clicked
                startActivity(new Intent(HomeActivity.this, PunjabActivtiy.class));
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open imagefile4.xml when ImageButton 4 is clicked
                startActivity(new Intent(HomeActivity.this, ContiActivity.class));
            }
        });

        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open imagefile5.xml when ImageButton 5 is clicked
                startActivity(new Intent(HomeActivity.this, FsfoActivity.class));
            }
        });

    }
}
