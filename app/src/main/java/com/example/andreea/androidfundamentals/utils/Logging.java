package com.example.andreea.androidfundamentals.utils;

import android.util.Log;

import com.example.andreea.androidfundamentals.BuildConfig;

public class Logging {
    public static void show(Object obj, String message) {
        if (BuildConfig.DEBUG) {
            Log.e(obj.getClass().getName(), message);
        }
    }
}