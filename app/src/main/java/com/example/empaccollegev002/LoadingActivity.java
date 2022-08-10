package com.example.empaccollegev002;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class LoadingActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        new Handler().postDelayed(() -> {
            Intent Homeintent = new Intent(LoadingActivity.this, MainActivity.class);
            startActivity(Homeintent);
            finish();
        },SPLASH_TIME_OUT);
    }
}