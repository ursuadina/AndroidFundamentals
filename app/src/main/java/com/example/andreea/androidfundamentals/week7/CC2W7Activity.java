package com.example.andreea.androidfundamentals.week7;

import android.graphics.drawable.LevelListDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.andreea.androidfundamentals.R;

public class CC2W7Activity extends AppCompatActivity {

    private ImageView mBattery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cc2_w7);

        mBattery = findViewById(R.id.imageViewBattery);
    }

    public void btnDecrementLevel(View view) {
        LevelListDrawable levelListDrawable = (LevelListDrawable) mBattery.getDrawable();
        int level = levelListDrawable.getLevel();
        level = level - 1;
        if (level < 0) {
            level = 0;
        }
        mBattery.setImageLevel(level);
    }

    public void btnIncrementLevel(View view) {
        LevelListDrawable levelListDrawable = (LevelListDrawable) mBattery.getDrawable();
        int level = levelListDrawable.getLevel();
        level = level + 1;
        if (level > 6) {
            level = 6;
        }
        mBattery.setImageLevel(level);
    }
}
