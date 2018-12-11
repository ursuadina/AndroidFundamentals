package com.example.andreea.androidfundamentals.week6;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.andreea.androidfundamentals.R;

public class ListenerActivity extends AppCompatActivity implements MyListener {

    private TextView mTextViewSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listener);

        initView();
        initFragment();
    }

    private void initView() {
        mTextViewSum = findViewById(R.id.textview_sum);
    }

    private void initFragment() {
        SumFragment sumFragment = new SumFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container1, sumFragment);
        fragmentTransaction.commit();
    }

    @Override
    public void addTwoNumbers(int num1, int num2) {
        mTextViewSum.setText("Sum is: " + (num1 + num2));
    }
}
