package com.example.lambda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }
    public void band (View view){
        Intent next = new Intent(MainActivity6.this, MainActivity9.class);
        startActivity(next);
    }
    public void clasi (View view){
        Intent next = new Intent(MainActivity6.this, MainActivity10.class);
        startActivity(next);
    }
    public void arm (View view){
        Intent next = new Intent(MainActivity6.this, MainActivity11.class);
        startActivity(next);
    }
}