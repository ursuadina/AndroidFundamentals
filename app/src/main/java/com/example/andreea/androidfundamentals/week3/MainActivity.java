package com.example.andreea.week3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.andreea.week3.models.Authentication;
import com.example.andreea.week3.utils.EmailHelper;

public class MainActivity extends AppCompatActivity {

    private EditText mEditTextEmail;
    private EditText mEditTextPhone;
    private CheckBox mCheckBoxAccept;
    private TextView mTextViewResult;

    private Authentication mAuthentication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuthentication = new Authentication();

        initView();
    }

    private void initView() {
        //init view : gasim toate elementele
        mEditTextEmail = (EditText) findViewById(R.id.edittext_email);
        mEditTextPhone = (EditText) findViewById(R.id.edittext_phone);
        mCheckBoxAccept = (CheckBox) findViewById(R.id.checkbox_accept);
        mTextViewResult = (TextView) findViewById(R.id.textview_result);
    }

    private boolean isEmailValid() {
        String email = mEditTextEmail.getText().toString();
        if(EmailHelper.isEmailValid(email)) {
            mAuthentication.setmEmail(email);
            return true;
        } else {
            mEditTextEmail.setError(getResources().getString(R.string.error_email_input));
            return false;
        }
    }

    private boolean isPhoneValid(){
        String phone = mEditTextPhone.getText().toString();
        if (phone!=null && !phone.isEmpty()) {
            mAuthentication.setmPhone(phone);
            return true;
        } else {
            mEditTextPhone.setError(getResources().getString(R.string.error_phone_input));
            return false;
        }
    }

    private boolean isAccepted() {
        if (mCheckBoxAccept.isChecked()) {
            mAuthentication.setAccepted(true);
            return true;
        } else {
            Toast.makeText(MainActivity.this, getResources().getString(R.string
                    .error_is_accepted_input), Toast.LENGTH_SHORT).show();
            return false;
        }
    }
    public void btnSubmitOnClick(View view) {
        if (isEmailValid() && isPhoneValid() && isAccepted()) {
            mTextViewResult.setText(mAuthentication.toString());
        }
    }
}
