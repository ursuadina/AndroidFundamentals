package com.example.andreea.androidfundamentals.week4;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.andreea.androidfundamentals.R;

public class StudentsViewHolder extends RecyclerView.ViewHolder {

    public TextView mTextViewFirstName;
    public TextView mTextViewLastName;

    public StudentsViewHolder(@NonNull View itemView) {
            super(itemView);

            mTextViewFirstName = itemView.findViewById(R.id.textview_firstname);
            mTextViewLastName = itemView.findViewById(R.id.textview_lastname);
            }
}
