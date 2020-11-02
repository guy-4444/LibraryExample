package com.classy.libraryexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.classy.superbitmap.SuperBitmap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SuperBitmap.generateHeatMap(new double[2][2]);
    }
}