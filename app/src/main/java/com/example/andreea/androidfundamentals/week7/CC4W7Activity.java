package com.example.andreea.androidfundamentals.week7;

import android.app.DatePickerDialog;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import com.example.andreea.androidfundamentals.R;

import java.util.Calendar;

public class CC4W7Activity extends AppCompatActivity {
    private DatePickerDialog mDatePicker;
    private Button mBtnDP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cc4_w7);

        mBtnDP = findViewById(R.id.buttonDP);
    }

    public void btnDatePicker(View view) {
        DialogFragment dFragment = new DatePickerActivity();
        dFragment.show(getSupportFragmentManager(), "Date Picker");

    }
}
