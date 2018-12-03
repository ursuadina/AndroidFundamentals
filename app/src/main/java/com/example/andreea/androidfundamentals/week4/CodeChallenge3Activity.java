package com.example.andreea.androidfundamentals.week4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.andreea.androidfundamentals.R;

import java.util.ArrayList;
import java.util.List;

public class CodeChallenge3Activity extends AppCompatActivity {

    private RecyclerView mRecyclerViewStudents;
    private List<Student> mStudents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_challenge3);
        setContentView(R.layout.activity_recycler_view);

        //get recycler view from xml layout
        mRecyclerViewStudents = findViewById(R.id.recyclerview_contacts);

        //define and set layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerViewStudents.setLayoutManager(layoutManager);

        //get data source
        mStudents = getStudents();

        //get the adapter instance
        StudentsAdapter studentsAdapter = new StudentsAdapter(mStudents);

        //set the adapter to the recycler view
        mRecyclerViewStudents.setAdapter(studentsAdapter);
    }

    private List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("FirstName1","LastName1"));
        students.add(new Student("FirstName2","LastName2"));
        students.add(new Student("FirstName3","LastName3"));
        students.add(new Student("FirstName4","LastName4"));
        students.add(new Student("FirstName5","LastName5"));
        students.add(new Student("FirstName6","LastName6"));
        students.add(new Student("FirstName7","LastName7"));
        students.add(new Student("FirstName8","LastName8"));
        students.add(new Student("FirstName9","LastName9"));
        students.add(new Student("FirstName10","LastName10"));
        return students;
    }
}
