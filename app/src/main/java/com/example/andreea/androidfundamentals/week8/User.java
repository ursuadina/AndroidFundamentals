package com.example.andreea.androidfundamentals.week8;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("login")
    private String mName;

    public User(String name) {
        this.mName = name;
    }

    public String getUser() {
        return mName;
    }

    public void setUser(String name) {
        this.mName = name;
    }
}