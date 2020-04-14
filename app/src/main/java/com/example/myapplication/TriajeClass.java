package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class TriajeClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedIntanceState){
        super.onCreate(savedIntanceState);
        setContentView(R.layout.triaje);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

}
