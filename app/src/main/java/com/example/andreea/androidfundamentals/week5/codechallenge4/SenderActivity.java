package com.example.andreea.androidfundamentals.week5.codechallenge4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.andreea.androidfundamentals.R;

import org.w3c.dom.Text;

public class SenderActivity extends AppCompatActivity {

    private EditText mEditTextMessage;
    private TextView mTextViewMessageR;
    private TextView mTextViewTitleS;
    private String mMessage;
    public static final String MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);

        Intent intent = getIntent();
        if (intent != null) {
            mMessage = intent.getStringExtra(ReceiverActivity.MESSAGE);
            if(mMessage != null && !mMessage.isEmpty() ) {

                mTextViewTitleS = (TextView) findViewById(R.id.textview_titleS);
                mTextViewTitleS.setVisibility(View.VISIBLE);
            }
            mTextViewMessageR = (TextView) findViewById(R.id.textview_convS);
            mTextViewMessageR.setText(mMessage);
        }
    }

    public void btnSendMsgS(View view) {
        mEditTextMessage = (EditText) findViewById(R.id.edittext_msgS);
        if(!isMsgEmpty()){
            Intent intent = new Intent(SenderActivity.this, ReceiverActivity.class);
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
