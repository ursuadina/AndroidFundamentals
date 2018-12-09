package com.example.andreea.androidfundamentals.week5.codechallenge5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.andreea.androidfundamentals.R;

public class CC5Activity extends AppCompatActivity {

    private EditText mEditTextWebsite;
    private EditText mEditTextLocation;
    private EditText mEditTextShare;
    private EditText mEditTextPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cc5);
    }

    public void btnOpenWebsite(View view) {
        mEditTextWebsite = findViewById(R.id.edittext_website);
        String website = mEditTextWebsite.getText().toString();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(website));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void btnOpenLocation(View view) {
        mEditTextLocation = findViewById(R.id.edittext_location);
        String location = mEditTextLocation.getText().toString();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.co.in/maps?q=" + location));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void btnShareText(View view) {
        mEditTextShare = findViewById(R.id.edittext_share);
        String share = mEditTextShare.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT, share);
        intent.setType("text/plain");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(Intent.createChooser(intent, "Share.."));
        }
    }

    public void btnCall(View view) {
        mEditTextPhone = findViewById(R.id.edittext_phone);
        String phone = mEditTextPhone.getText().toString();
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phone));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
