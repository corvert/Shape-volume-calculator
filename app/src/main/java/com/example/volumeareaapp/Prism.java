package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prism extends AppCompatActivity {
    EditText prismHeight, numOfPanels, edgeLength;
    TextView title, result;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);

        prismHeight = findViewById(R.id.height);
        edgeLength = findViewById(R.id.edge);
        title = findViewById(R.id.textView2);
        result = findViewById(R.id.textView3);
        btn = findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String height = prismHeight.getText().toString();

                String edge = edgeLength.getText().toString();

                double h = Double.parseDouble(height);

                double el = Double.parseDouble(edge);

                double coTanA = 1.0 / Math.tan(60);

                double volume = Math.sqrt(3) / 4 * Math.pow(el, 2) * h;
                result.setText("Volume " + volume + "m3");
            }
        });
    }
}