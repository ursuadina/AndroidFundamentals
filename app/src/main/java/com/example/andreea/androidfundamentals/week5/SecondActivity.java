package com.example.andreea.androidfundamentals.week5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.andreea.androidfundamentals.R;

public class SecondActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mTextView = findViewById(R.id.textView4);

        Intent intent = getIntent();
        if (intent != null) {
            String text = intent.getStringExtra(PicassoActivity.MESSAGE);
            int value = intent.getIntExtra(PicassoActivity.COUNT, 0);
            if (text != null && !text.isEmpty()) {
                mTextView.setText(text + " " + value);
            }
        }
    }
}
