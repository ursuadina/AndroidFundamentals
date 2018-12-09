package com.example.andreea.androidfundamentals.week5.codechallenge3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.andreea.androidfundamentals.R;

public class ButtonsActivity extends AppCompatActivity {

    public static final String POSITION = "position";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
    }

    public void btnSendText1(View view) {
        Intent intent = new Intent(ButtonsActivity.this, PassageActivity.class);
        intent.putExtra(POSITION, 1);
        startActivity(intent);
    }

    public void btnSendText2(View view) {
        Intent intent = new Intent(ButtonsActivity.this, PassageActivity.class);
        intent.putExtra(POSITION, 2);
        startActivity(intent);
    }

    public void btnSendText3(View view) {
        Intent intent = new Intent(ButtonsActivity.this, PassageActivity.class);
        intent.putExtra(POSITION, 3);
        startActivity(intent);
    }
}
