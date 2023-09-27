package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //1 - AdapterView: GridView
    GridView gridView;
    //2 - data source
    ArrayList<Shape> shapeArrayList;

    //3 - adapter
    MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        shapeArrayList = new ArrayList<>();
        Shape shape1 = new Shape(R.drawable.sphere, "Sphere");
        Shape shape2 = new Shape(R.drawable.cylinder, "Cylinder");
        Shape shape3 = new Shape(R.drawable.cube, "Cube");
        Shape shape4 = new Shape(R.drawable.prism, "Prism");

        shapeArrayList.add(shape1);
        shapeArrayList.add(shape2);
        shapeArrayList.add(shape3);
        shapeArrayList.add(shape4);

        adapter = new MyCustomAdapter(shapeArrayList, getApplicationContext());

        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedShapeName = adapter.getItem(i).getShapeName();
                if (selectedShapeName.equals("Sphere")) {
                    Intent intent = new Intent(getApplicationContext(), Sphere.class);
                    startActivity(intent);
                } else if (selectedShapeName.equals("Cylinder")) {
                    Intent intent = new Intent(getApplicationContext(), Cylinder.class);
                    startActivity(intent);
                } else if (selectedShapeName.equals("Cube")) {
                    Intent intent = new Intent(getApplicationContext(), Cube.class);
                    startActivity(intent);
                } else if (selectedShapeName.equals("Prism")) {
                    Intent intent = new Intent(getApplicationContext(), Prism.class);
                    startActivity(intent);
                }
            }
        });
    }
}