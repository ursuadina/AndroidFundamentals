package com.example.andreea.androidfundamentals.week5.codechallenge4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.andreea.androidfundamentals.R;

public class ReceiverActivity extends AppCompatActivity {

    private EditText mEditTextMessage;
    private TextView mTextViewMessageS;
    private TextView mTextViewTitleR;
    private String mMessage;
    public static final String MESSAGE = "message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);

        Intent intent = getIntent();
        if (intent != null) {
            mTextViewTitleR = (TextView) findViewById(R.id.textview_titleR);
            mTextViewTitleR.setVisibility(View.VISIBLE);
            mMessage = intent.getStringExtra(SenderActivity.MESSAGE);
            mTextViewMessageS = (TextView) findViewById(R.id.textview_convR);
            mTextViewMessageS.setText(mMessage);
        }
    }

    public void btnSendMsgR(View view) {
        mEditTextMessage = (EditText) findViewById(R.id.edittext_msgR);
        if(!isMsgEmpty()){
            Intent intent = new Intent(ReceiverActivity.this, SenderActivity.class);
            intent.putExtra(MESSAGE, mEditTextMessage.getText().toString());
            startActivity(intent);
        }
    }

    private boolean isMsgEmpty() {
        String message = mEditTextMessage.getText().toString();
        if(message != null && !message.isEmpty())
            return false;
        else {
            mEditTextMessage.setError("Please add a message");
            return true;
        }
    }
}
