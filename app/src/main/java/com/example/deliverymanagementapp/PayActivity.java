package com.example.deliverymanagementapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PayActivity extends AppCompatActivity {

    private RadioGroup paymentModeRadioGroup;
    private Button payButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);

        // Initialize views
        paymentModeRadioGroup = findViewById(R.id.paymentModeRadioGroup);
        payButton = findViewById(R.id.payButton);

        // Set OnClickListener for Pay Button
        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the selected payment mode
                int selectedId = paymentModeRadioGroup.getCheckedRadioButtonId();

                if (selectedId != -1) {
                    RadioButton radioButton = findViewById(selectedId);
                    String paymentMode = radioButton.getText().toString();

                    // Perform payment process (you can replace this with your actual payment logic)
                    // For demonstration purposes, a toast message is shown
                    String message = "Payment successful with " + paymentMode;
                    Toast.makeText(PayActivity.this, message, Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(PayActivity.this, ReceiptActivity.class));
                } else {
                    // If no payment mode is selected, show a toast message
                    Toast.makeText(PayActivity.this, "Please select a payment mode", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
