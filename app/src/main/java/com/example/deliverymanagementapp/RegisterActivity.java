package com.example.deliverymanagementapp;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    private EditText editTextName, editTextNumber, editTextEmail, editTextDOB, editTextAddress, editTextPincode;
    private RadioGroup radioGroupGender;
    private RadioButton radioButtonMale, radioButtonFemale;
    private Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Initialize views
        editTextName = findViewById(R.id.editTextName);
        editTextNumber = findViewById(R.id.editTextNumber);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextDOB = findViewById(R.id.editTextDOB);
        editTextAddress = findViewById(R.id.editTextAddress);
        editTextPincode = findViewById(R.id.editTextPincode);
        radioGroupGender = findViewById(R.id.radioGroupGender);
        radioButtonMale = findViewById(R.id.radioButtonMale);
        radioButtonFemale = findViewById(R.id.radioButtonFemale);
        buttonRegister = findViewById(R.id.buttonRegister);

        // Register button click listener
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get values from the input fields
                String name = editTextName.getText().toString().trim();
                String number = editTextNumber.getText().toString().trim();
                String email = editTextEmail.getText().toString().trim();
                String dob = editTextDOB.getText().toString().trim();
                String address = editTextAddress.getText().toString().trim();
                String pincode = editTextPincode.getText().toString().trim();
                String gender = radioButtonMale.isChecked() ? "Male" : "Female";

                // Perform validation or other registration logic here

                // For demonstration, just show a toast message with the registration data
                String registrationInfo = "Name: " + name + "\n" +
                        "Number: " + number + "\n" +
                        "Email: " + email + "\n" +
                        "Gender: " + gender + "\n" +
                        "DOB: " + dob + "\n" +
                        "Address: " + address + "\n" +
                        "Pincode: " + pincode;
                Toast.makeText(RegisterActivity.this, "Successfull", Toast.LENGTH_LONG).show();

                startActivity(new Intent(RegisterActivity.this, TandSActivity.class));

            }
        });
    }
}
