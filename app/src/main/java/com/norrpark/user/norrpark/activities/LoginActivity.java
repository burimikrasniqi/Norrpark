package com.norrpark.user.norrpark.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

import com.hannesdorfmann.mosby.mvp.MvpActivity;
import com.norrpark.user.norrpark.R;
import com.norrpark.user.norrpark.presenters.LoginPresenter;
import com.norrpark.user.norrpark.views.LoginView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by burim on 3/9/2017.
 */

public class LoginActivity extends MvpActivity<LoginView, LoginPresenter> implements LoginView {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        ButterKnife.bind(this);
    }


    @NonNull
    @Override
    public LoginPresenter createPresenter() {
        return new LoginPresenter();
    }
}
