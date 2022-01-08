package com.example.simple_project_1_unit_converter_app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/ {


    private static final String EXTRA_MESSAGE = "com.example.simple_project_1_unit_converter_app.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvTitleUnitConverter = findViewById(R.id.tvTitleUnitConverter);
        Button volumeBtn = (Button) findViewById(R.id.volumeBtn);
        //volumeBtn.setOnClickListener(this);
        Button weightBtn = (Button) findViewById(R.id.volumeBtn);
        //weightBtn.setOnClickListener(this);
        Button distanceBtn = (Button) findViewById(R.id.volumeBtn);
        //distanceBtn.setOnClickListener(this);
        Button timeBtn = (Button) findViewById(R.id.volumeBtn);
       //timeBtn.setOnClickListener(this);

    }

    public void buttonClicked(View view){
        if(view.getId() == R.id.distanceBtn){
            Intent intent = new Intent(this, DistanceCoversionActivity.class);
            startActivity(intent);
        } else if (view.getId() == R.id.volumeBtn){
            Intent intent = new Intent(this, VolumeConversionActivity.class);
            startActivity(intent);
        } else if (view.getId() == R.id.weightBtn){
            Intent intent = new Intent(this, WeightConversionActivity.class);
            startActivity(intent);
        } else if (view.getId() == R.id.timeBtn){
            Intent intent = new Intent(this, TimeConversionActivity.class);
            startActivity(intent);
        }

    }
}