package com.example.deliverymanagementapp;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TandSActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tands);

        final CheckBox checkBoxAccept = findViewById(R.id.checkBoxAccept);
        final Button buttonAccept = findViewById(R.id.buttonAccept);

        // Find the ScrollView and TextView from the layout
        // final ScrollView scrollView = findViewById(R.id.scrollView1);
        final TextView textView = findViewById(R.id.textView1);

        // Set the content for the TextView
        textView.setText("These are the terms and conditions of our delivery application. " +
                "Please read them carefully before accepting.");

        // Disable the Accept button initially
        buttonAccept.setEnabled(false);

        // Set the ScrollView as the content view of the activity
        // setContentView(scrollView);

        // Add a listener to the CheckBox to enable/disable the Accept button
        checkBoxAccept.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Enable the Accept button only when the CheckBox is checked
                buttonAccept.setEnabled(isChecked);
            }
        });

        // Set click listener for the Accept button
        buttonAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the click event for the Accept button
                // For demonstration, let's assume it goes to the home page
                Toast.makeText(TandSActivity.this, "Accepted", Toast.LENGTH_LONG).show();
                startActivity(new Intent(TandSActivity.this, HomeActivity.class));
            }
        });
    }
}
