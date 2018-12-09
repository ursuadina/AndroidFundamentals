package com.example.andreea.androidfundamentals.week5.codechallenge2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.andreea.androidfundamentals.R;
import com.example.andreea.androidfundamentals.week5.SecondActivity;

public class Second2Activity extends AppCompatActivity {

    private static final String TAG = Second2Activity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        Log.e(TAG, "Second2Activity: onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "Second2Activity: onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "Second2Activity: onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "Second2Activity: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "Second2Activity: onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "Second2Activity: onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "Second2Activity: onDestroy");
    }
}
