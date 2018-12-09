package com.example.andreea.androidfundamentals.week5.codechallenge3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.andreea.androidfundamentals.R;

import java.util.ArrayList;
import java.util.List;

public class PassageActivity extends AppCompatActivity {

    private TextView mTextView;
    private int number;
    private List<String> passages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passage);

        mTextView = findViewById(R.id.textview_passage);

        Intent intent = getIntent();
        if (intent != null) {
            passages = getPassages();
            number = intent.getIntExtra(ButtonsActivity.POSITION,-1);
            mTextView.setText(passages.get(number-1));
        }
    }

    public List<String> getPassages() {
        List<String> passages = new ArrayList<>();
        passages.add("Text 1: Carturesti: Bucharest's most impressive bookshop is this wonderful building on Strada Lipscani. Dating from the latter part of the 19th century the building was home to a department store during the communist era, before standing neglected for almost a quarter of century until reopening a couple of years ago after a long renovation. And what a renovation: the building has been brought back to life by Carturesti's team of architects and is that impressive that even if you are not in the market for any books, you must pop in to have a look. ");
        passages.add("Text 2: Urban collectors: Library promoting graffiti and street art with over 150 publications on: street art & graffiti, graphics, illustration, community art, urban art, participative art. It's a place known just by the locals and the graffiti and street art lovers, cozy atmosphere. A good place to research the alternative scene. If you want to find out about the hidden graffiti spots of Bucharest or want to know more about graffiti and street art, the Urban Collectors team is the best to ask.");
        passages.add("Text 2: Seneca anticafe: Seneca is a place designed both for work and relaxation. You feel like home. Here you can work on your project, study for exams, hang out and chat with friends or read, participate in a workshop or put up one. We have special spaces for each one of these activities.You pay only for time and make use the space in which you can find: tea and snacks, books, journals, board games, free access to university libraries, working desks, printer, scanner, HD projector and WI-FI. We want you to feel like home, so you are free to bring your own food and non-alcoholic beverages.");
        return passages;
    }
}
