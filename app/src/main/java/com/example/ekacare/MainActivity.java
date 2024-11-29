package com.example.ekacare; // The package declaration should be the first statement in the file.

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ekacare.UserRepository;
import com.example.ekacare.UserViewModel;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private UserViewModel userViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UserViewModel with UserRepository
        UserRepository repository = new UserRepository(getApplicationContext());
        userViewModel = new UserViewModel(repository);

        // Find views by their IDs
        EditText etName = findViewById(R.id.et_name);
        EditText etAge = findViewById(R.id.et_age);
        TextView tvDob = findViewById(R.id.tv_dob);
        EditText etAddress = findViewById(R.id.et_address);
        Button btnSubmit = findViewById(R.id.btn_submit);

        // Date picker dialog for Date of Birth
        tvDob.setOnClickListener(v -> {
            Calendar calendar = Calendar.getInstance();
            DatePickerDialog datePickerDialog = new DatePickerDialog(
                    MainActivity.this,
                    (view, year, month, dayOfMonth) -> {
                        String dob = dayOfMonth + "/" + (month + 1) + "/" + year;
                        tvDob.setText(dob);
                    },
                    calendar.get(Calendar.YEAR),
                    calendar.get(Calendar.MONTH),
                    calendar.get(Calendar.DAY_OF_MONTH)
            );
            datePickerDialog.show();
        });

        // Submit button click listener
        btnSubmit.setOnClickListener(v -> {
            String name = etName.getText().toString();
            String ageText = etAge.getText().toString();
            String dob = tvDob.getText().toString();
            String address = etAddress.getText().toString();

            // Basic validation for input fields
            if (!name.isEmpty() && !ageText.isEmpty() && !dob.isEmpty() && !address.isEmpty()) {
                try {
                    int age = Integer.parseInt(ageText);
                    if (age > 0) {
                        userViewModel.saveUser(name, age, dob, address);
                    } else {
                        etAge.setError("Please enter a valid age.");
                    }
                } catch (NumberFormatException e) {
                    etAge.setError("Please enter a valid number.");
                }
            } else {
                if (name.isEmpty()) etName.setError("Name cannot be empty.");
                if (ageText.isEmpty()) etAge.setError("Age cannot be empty.");
                if (dob.isEmpty()) tvDob.setError("Date of Birth cannot be empty.");
                if (address.isEmpty()) etAddress.setError("Address cannot be empty.");
            }
        });
    }
}
