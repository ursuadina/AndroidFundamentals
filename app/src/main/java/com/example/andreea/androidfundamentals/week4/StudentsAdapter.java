package com.example.andreea.androidfundamentals.week4;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andreea.androidfundamentals.R;

import java.util.List;

public class StudentsAdapter  extends RecyclerView.Adapter<StudentsViewHolder> {

    private List<Student> mStudents;

    public StudentsAdapter(List<Student> mStudents) {
        this.mStudents = mStudents;
    }

    @NonNull
    @Override
    public StudentsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contact_item, viewGroup, false);
        return new StudentsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentsViewHolder studentsViewHolder, int i) {
        Student currentStudent = mStudents.get(i);
        studentsViewHolder.mTextViewFirstName.setText(currentStudent.getmFirstName());
        studentsViewHolder.mTextViewLastName.setText(currentStudent.getmLastName());
    }

    @Override
    public int getItemCount() {
        return mStudents.size();
    }
}
