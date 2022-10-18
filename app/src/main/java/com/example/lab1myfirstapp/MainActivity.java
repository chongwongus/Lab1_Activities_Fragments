package com.example.lab1myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    //onCreate Override
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate() started.");
    }

    //onStart Override
    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart() started.");
    }

    //onResume Override
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume() started.");
    }

    //onPause Override
    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "onPause() started.");
    }

    //onRestart Override
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w(TAG, "onRestart() started.");
    }

    //onStop Override
    protected void onStop() {
        super.onStop();
        Log.w(TAG, "onStop() started.");
    }

    //onDestroy Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w(TAG, "onResume() started, DESTRUCTION IMMINENT.");
    }
}