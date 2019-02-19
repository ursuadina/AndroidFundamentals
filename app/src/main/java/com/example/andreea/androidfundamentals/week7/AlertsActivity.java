package com.example.andreea.androidfundamentals.week7;

import android.app.AlertDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

import com.example.andreea.androidfundamentals.R;

import java.util.Calendar;

public class AlertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alerts);
    }

    public void btnDatePickerOnClick(View view) {
        DialogFragment newFragment = new DatePickerActivity();
        newFragment.show(getSupportFragmentManager(), "DatePicker");
    }

    public void btnTimeOnClick(View view) {
        final Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        // Launch Time Picker Dialog
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {

                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay,
                                          int minute) {
                        Toast.makeText(AlertsActivity.this, hourOfDay + ":" + minute, Toast.LENGTH_SHORT).show();
                    }
                }, hour, minute, false);
        timePickerDialog.show();
    }


    public void btnAlertOnClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getString(R.string.notice));
        builder.setMessage(getString(R.string.alert_title));

// add the buttons
        builder.setPositiveButton(getString(R.string.launch_app), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(AlertsActivity.this, getString(R.string.launch_app) + " " + getString(R.string.click), Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNeutralButton(getString(R.string.reminde_me), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(AlertsActivity.this, getString(R.string.reminde_me) + " " + getString(R.string.click), Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(AlertsActivity.this, getString(R.string.cancel) + " " + getString(R.string.click), Toast.LENGTH_SHORT).show();
            }
        });

// create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }
    private void setAnimation() {
        ConstraintLayout linearLayout = (ConstraintLayout) findViewById(R.id.alerts);
        AnimationDrawable animationDrawable = (AnimationDrawable) linearLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();
    }
}
