package com.example.andreea.androidfundamentals.week6;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.andreea.androidfundamentals.R;

public class DynamicActivity extends AppCompatActivity {

    public static final String NUMBER = "number";

    private EditText mEditTextNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);

        initView();
    }

    private void initView() {
        mEditTextNumber = findViewById(R.id.edittext_number);
    }
    private void initFragment(BlankFragment blankFragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, blankFragment);
        fragmentTransaction.commit();
    }

    public void btnCheckNumberOnClick(View view) {
        if(mEditTextNumber != null) {
            String numberString = mEditTextNumber.getText().toString();
            if(numberString != null && !numberString.isEmpty()) {
                int number = Integer.parseInt(numberString);

                //bundle
                /*Bundle bundle = new Bundle();
                bundle.putInt(NUMBER, number);

                BlankFragment blankFragment = new BlankFragment();
                blankFragment.setArguments(bundle);
                initFragment(blankFragment);*/


                //method
                BlankFragment blankFragment = new BlankFragment();
                blankFragment.setNumber(number);
                initFragment(blankFragment);
            }
        }
    }
}
