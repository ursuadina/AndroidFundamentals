package com.example.andreea.androidfundamentals.week5.codechallenge2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.andreea.androidfundamentals.R;

public class FirstActivity extends AppCompatActivity {

    private static final String TAG = FirstActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Log.e(TAG, "FirstActivity: onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "FirstActivity: onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "FirstActivity: onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "FirstActivity: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "FirstActivity: onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "FirstActivity: onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "FirstActivity: onDestroy");
    }

    public void btnCallSecondActivity(View view) {
        Intent intent = new Intent(FirstActivity.this, Second2Activity.class);
        startActivity(intent);
    }
}
