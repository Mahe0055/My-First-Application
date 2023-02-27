package com.example.my_first_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    //String LOG_TAG = this.class

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Welcome to my first application");
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}