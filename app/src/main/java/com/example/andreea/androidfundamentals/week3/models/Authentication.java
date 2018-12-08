package com.example.andreea.androidfundamentals.week3.models;

public class Authentication {
    private String mEmail;
    private String mPhone;
    private boolean mAccepted;

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public boolean getAccepted() {
        return mAccepted;
    }

    public void setAccepted(boolean mAccepted) {
        this.mAccepted = mAccepted;
    }

    @Override
    public String toString() {
        return "Authentication{" +
                "mEmail='" + mEmail + '\'' +
                ", mPhone='" + mPhone + '\'' +
                ", mIsAccepted=" + mAccepted +
                '}';
    }
}
