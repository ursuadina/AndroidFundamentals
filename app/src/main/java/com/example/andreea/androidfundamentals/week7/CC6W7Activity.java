package com.example.andreea.androidfundamentals.week7;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Camera;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.andreea.androidfundamentals.R;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class CC6W7Activity extends AppCompatActivity {

    public static final String DEBUG_TAG = "MakePhotoActivity";
    private Camera camera;
    private int cameraId = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cc6_w7);
    }

    public static Camera getCameraInstance() {
        Camera c = null;
        try {
            c = Camera.open(); // attempt to get a Camera instance
        }
        catch (Exception e){
            // Camera is not available (in use or does not exist)
        }
        return c; // returns null if camera is unavailable
    }

    public void btnTakePhoto(View view) {
        Camera c = getCameraInstance();
    }
}
