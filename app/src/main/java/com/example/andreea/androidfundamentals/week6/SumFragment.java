package com.example.andreea.androidfundamentals.week6;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.andreea.androidfundamentals.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SumFragment extends Fragment {

    private EditText mEditTextNumber1;
    private EditText mEditTextNumber2;
    private Button mButtonGetSum;

    public SumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sum, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        mEditTextNumber1 = view.findViewById(R.id.edittext_number1);
        mEditTextNumber2 = view.findViewById(R.id.edittext_number2);
        mButtonGetSum = view.findViewById(R.id.button_sum);

        mButtonGetSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();
            }
        });
    }

    private void sendData() {
        String number1String = mEditTextNumber1.getText().toString();
        int number1 = Integer.parseInt(number1String);

        String number2String = mEditTextNumber2.getText().toString();
        int number2 = Integer.parseInt(number2String);

        MyListener myListener = (MyListener) getActivity();
        myListener.addTwoNumbers(number1, number2);
    }

}
