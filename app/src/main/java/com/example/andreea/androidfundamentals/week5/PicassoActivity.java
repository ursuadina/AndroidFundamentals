package com.example.andreea.androidfundamentals.week5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.andreea.androidfundamentals.R;
import com.squareup.picasso.Picasso;

public class PicassoActivity extends AppCompatActivity {

    private static final String TAG = PicassoActivity.class.getSimpleName();
    public static final String MESSAGE = "message";
    public static final String COUNT = "count";
    private ImageView mImageView;
    private EditText mEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso);

        Log.e(TAG, "onCreate");

        mEditText = findViewById(R.id.editText);
        //mImageView = findViewById(R.id.imageView);
        //Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(mImageView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");
    }

    public void btnGoToOnClick(View view) {
        if (mEditText != null) {
            String text = mEditText.getText().toString();
            Intent intent = new Intent(PicassoActivity.this, SecondActivity.class);
            intent.putExtra(MESSAGE, text);
            intent.putExtra(COUNT, 7);
            startActivity(intent);
        }
    }

    public void btnCallOnClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com"));
        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
    }
}
