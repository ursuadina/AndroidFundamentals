package com.example.andreea.androidfundamentals.week6;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.andreea.androidfundamentals.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    private int number;
    private TextView mTextViewIsOddOrEven;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        mTextViewIsOddOrEven = view.findViewById(R.id.textview_isoddoreven);

       /* Bundle bundle = getArguments();
        if(bundle != null) {
            int number = bundle.getInt(DynamicActivity.NUMBER, 0);
            if(number % 2 == 0) {
                mTextViewIsOddOrEven.setText(number + " is even");
            } else {
                mTextViewIsOddOrEven.setText(number + " is odd");
            }
        }*/

        isEvenOrOdd();

        return view;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private void isEvenOrOdd() {
        if(number % 2 == 0) {
            mTextViewIsOddOrEven.setText(number + " is even");
        } else {
            mTextViewIsOddOrEven.setText(number + " is odd");
        }
    }

}
