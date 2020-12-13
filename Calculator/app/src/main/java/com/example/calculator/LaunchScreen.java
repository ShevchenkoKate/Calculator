package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LaunchScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().
        setContentView(R.layout.activity_launch_screen);

        int SPLASH_SCREEN = 5000;
        new Handler().postDelayed(() -> {
            Intent intent = new Intent( LaunchScreen.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, SPLASH_SCREEN);

    }
}