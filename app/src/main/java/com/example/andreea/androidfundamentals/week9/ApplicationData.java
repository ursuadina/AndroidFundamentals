package com.example.andreea.androidfundamentals.week9;

import android.content.Context;
import android.content.SharedPreferences;

public class ApplicationData {
    private static final String APP_KEY = "android_course_key";
    public static final String COUNT_KEY = "count";

    public static void setIntValueInSharedPreferences(Context ctx, String key, int value) {
        SharedPreferences sharedPreferences = ctx.getSharedPreferences(ApplicationData.APP_KEY, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public static int getIntValueFromSharedPreferences(Context ctx, String key) {
        SharedPreferences sharedPreferences = ctx.getSharedPreferences(ApplicationData.APP_KEY, Context.MODE_PRIVATE);
        return sharedPreferences.getInt(key, 0);
    }
}
