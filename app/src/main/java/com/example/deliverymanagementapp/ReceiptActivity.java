package com.example.deliverymanagementapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class ReceiptActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        // Generate random order ID and confirmation number
        String orderId = generateRandomString(6);
        String confirmationNumber = generateRandomString(6);

        // Set order ID and confirmation number TextViews
        TextView orderIdTextView = findViewById(R.id.orderIdTextView);
        orderIdTextView.setText("Order ID: " + orderId);

        TextView confirmationNumberTextView = findViewById(R.id.confirmationNumberTextView);
        confirmationNumberTextView.setText("Confirmation Number: " + confirmationNumber);

        // Cancel Button
        Button cancelButton = findViewById(R.id.cancelButton);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open HomeActivity when Cancel Button is clicked
                startActivity(new Intent(ReceiptActivity.this, HomeActivity.class));
                finish(); // Optional, finish the current activity
            }
        });

        // Print Receipt Button
        Button printReceiptButton = findViewById(R.id.printReceiptButton);
        printReceiptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show custom dialog box for printing receipt
                showReceiptDownloadedDialog();
            }
        });
    }

    // Method to generate a random alphanumeric string of given length
    private String generateRandomString(int length) {
        String allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomString = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(allowedChars.length());
            char randomChar = allowedChars.charAt(randomIndex);
            randomString.append(randomChar);
        }

        return randomString.toString();
    }

    // Method to show custom dialog box for receipt downloaded
    private void showReceiptDownloadedDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_receipt_downloaded, null);
        builder.setView(dialogView);
        builder.setCancelable(false); // Prevent dialog from being canceled on outside touch

        Button okButton = dialogView.findViewById(R.id.okButton);
        final AlertDialog dialog = builder.create();

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss(); // Dismiss the dialog when OK button is clicked
            }
        });

        dialog.show();
    }
}
