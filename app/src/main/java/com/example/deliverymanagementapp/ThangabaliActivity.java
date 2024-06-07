package com.example.deliverymanagementapp;

import static com.example.deliverymanagementapp.R.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ThangabaliActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tangabali);

        // Find the "Add" buttons by their IDs
        Button item1Button = findViewById(R.id.item1Button);
        Button item2Button = findViewById(R.id.item2Button);
        Button item4Button = findViewById(R.id.item4Button);
        Button item5Button = findViewById(R.id.item5Button);
        Button placeorder = findViewById(id.placeorderbtn);

        placeorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the new XML file (replace NewActivity.class with your new activity)
                startActivity(new Intent(ThangabaliActivity.this, PayActivity.class));
            }
        });


        // Set click listeners on the "Add" buttons
        item1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement logic to add item 1 to cart or perform any other action
            }
        });

        item2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement logic to add item 2 to cart or perform any other action
            }
        });

        item4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement logic to add item 4 to cart or perform any other action
            }
        });

        item5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement logic to add item 5 to cart or perform any other action
            }
        });

        // Set click listener on the "Place Order" button

    }
}
