package com.norrpark.user.norrpark.activities;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;

import com.norrpark.user.norrpark.R;
import com.norrpark.user.norrpark.customViews.FontEditText;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.username)
    FontEditText username;
    @BindView(R.id.password)
    FontEditText password;
    @BindView(R.id.login)
    AppCompatButton login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



}
