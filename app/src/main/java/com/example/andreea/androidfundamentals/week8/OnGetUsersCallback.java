package com.example.andreea.androidfundamentals.week8;

import java.util.List;

public interface OnGetUsersCallback {

    void onSuccess(List<User> users);

    void onError();
}