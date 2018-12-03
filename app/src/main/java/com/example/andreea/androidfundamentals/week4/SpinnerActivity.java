
package com.example.andreea.androidfundamentals.week4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.andreea.androidfundamentals.R;

import java.util.ArrayList;
import java.util.List;

public class SpinnerActivity extends AppCompatActivity {

    private List<String> mFruits;
    private Spinner mSpinnerFruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        Toast.makeText(this, "Hello from a Toast", Toast.LENGTH_SHORT).show();
        
        //get data source
        mFruits = getFruits();

        //get the Spinner from xml layput
        mSpinnerFruits = findViewById(R.id.spinner_fruits);

        // set the adapter on the Spinner
        mSpinnerFruits.setAdapter(getAdapter());
    }

    //get source->data source
    private List<String> getFruits() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Strawberries");
        fruits.add("Apple");
        fruits.add("Pineeapple");
        fruits.add("Lemon");
        return fruits;
    }

    private ArrayAdapter<String> getAdapter() {
        return new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, mFruits);
    }
}
