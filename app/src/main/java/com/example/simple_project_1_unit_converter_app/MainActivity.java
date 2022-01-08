package com.example.simple_project_1_unit_converter_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Java is an object-oriented language. So for any instance where in you need to use an asset or
        //some interactive component, you need to "instantiate" it.
        TextView title_unit_converter = findViewById(R.id.title_unit_converter);
        Button volumeBtn = (Button) findViewById(R.id.volumeBtn);
        volumeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //Open the Volume converter
                openActivityVolumeConverter(v);

            }
        });
    }

    public void openActivityVolumeConverter(View view) {
        Intent intent = new Intent(this, VolumeConversionActivity.class);
    }
}