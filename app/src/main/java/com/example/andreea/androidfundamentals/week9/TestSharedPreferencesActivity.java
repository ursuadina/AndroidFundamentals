package com.example.andreea.androidfundamentals.week9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.andreea.androidfundamentals.R;

public class TestSharedPreferencesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_shared_preferences);

        int count = 80;
        ApplicationData.setIntValueInSharedPreferences(TestSharedPreferencesActivity.this,
                ApplicationData.COUNT_KEY, count);
        int countFromSharedReferences = ApplicationData.getIntValueFromSharedPreferences(
                TestSharedPreferencesActivity.this, ApplicationData.COUNT_KEY);
        Log.e("Count from sharedRef ", countFromSharedReferences + "");
    }
}
