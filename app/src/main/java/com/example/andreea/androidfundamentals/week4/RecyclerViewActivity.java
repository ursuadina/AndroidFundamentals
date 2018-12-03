package com.example.andreea.androidfundamentals.week4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.andreea.androidfundamentals.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRecycleViewContacts;
    private List<Contact> mContacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        //get recycler view from xml layout
        mRecycleViewContacts = findViewById(R.id.recyclerview_contacts);

        //define and set layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecycleViewContacts.setLayoutManager(layoutManager);

        //get data source
        mContacts = getContacts();

        //get the adapter instance
        ContactsAdapter contactsAdapter = new ContactsAdapter(mContacts);

        //set the adapter to the recycler view
        mRecycleViewContacts.setAdapter(contactsAdapter);
    }

    private List<Contact> getContacts() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Ion","Ionescu"));
        contacts.add(new Contact("Android", "Cupcake"));
        contacts.add(new Contact("Android","Donut"));
        contacts.add(new Contact("Android","Pie"));
        contacts.add(new Contact("Ioana","Ionescu"));
        contacts.add(new Contact("John","Doe"));
        contacts.add(new Contact("John1","Doe1"));
        contacts.add(new Contact("John2","Doe2"));
        contacts.add(new Contact("John3","Doe3"));
        contacts.add(new Contact("John4","Doe4"));
        contacts.add(new Contact("John5","Doe5"));
        return contacts;
    }
}
