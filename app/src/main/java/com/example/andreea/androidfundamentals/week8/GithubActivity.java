package com.example.andreea.androidfundamentals.week8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.andreea.androidfundamentals.R;
import com.example.andreea.androidfundamentals.utils.Logging;

import java.util.List;

public class GithubActivity extends AppCompatActivity {

    private UsersRepository mUsersRepository;
    private TextView mTextViewUsers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github);

        mTextViewUsers = findViewById(R.id.textViewUsers);
        mUsersRepository = UsersRepository.getInstance();

        mUsersRepository.getUsers(new OnGetUsersCallback() {
            @Override
            public void onSuccess(List<User> users) {
                //mTextViewUsers.setText("Github users = " + users.toString());
                Logging.show("Github users = ", users.toString());
            }

            @Override
            public void onError() {
                mTextViewUsers.setText("error Github users = check the code :D");
                Logging.show("error Github users = ", "check the code :D ");
            }
        });
    }
}
