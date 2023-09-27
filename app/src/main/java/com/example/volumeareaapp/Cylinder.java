package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.security.SecureRandom;

public class Cylinder extends AppCompatActivity {

    EditText cylinderRadius, cylinderHeight;
    TextView title, result;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);
        cylinderRadius = findViewById(R.id.radius);
        cylinderHeight = findViewById(R.id.height);
        title = findViewById(R.id.textView2);
        result = findViewById(R.id.textView3);
        btn = findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String radius = cylinderRadius.getText().toString();
                String height = cylinderHeight.getText().toString();
                double r = Double.parseDouble(radius);
                double h = Double.parseDouble(height);

                double volume = Math.PI*r*r*h;
                result.setText("Volume " + volume + " m3");

            }
        });
    }
}