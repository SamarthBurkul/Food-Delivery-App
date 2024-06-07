package com.example.deliverymanagementapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    // Hardcoded valid username and password
    private static final String VALID_USERNAME_1 = "kartik";
    private static final String VALID_PASSWORD_1 = "123";
    private static final String VALID_USERNAME_2 = "samarth";
    private static final String VALID_PASSWORD_2 = "abc";

    // Views
    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button btnLogin;

    private Button btnCreateAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize views
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnCreateAccount = findViewById(R.id.btnCreateAccount1);

        // Login button click listener
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get entered username and password
                String username = editTextUsername.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                // Check for valid username and password
                if ((username.equals(VALID_USERNAME_1) && password.equals(VALID_PASSWORD_1)) ||
                        (username.equals(VALID_USERNAME_2) && password.equals(VALID_PASSWORD_2))) {
                    // Valid credentials, go to home activity
                    startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                    finish(); // Close login activity
                } else {
                    // Invalid credentials, show toast
                    Toast.makeText(LoginActivity.this, "Wrong username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // "Don't have an account?" button click listener
        btnCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });
    }
}