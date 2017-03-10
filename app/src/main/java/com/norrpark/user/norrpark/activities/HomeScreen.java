package com.norrpark.user.norrpark.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatImageButton;
import android.view.View;

import com.hannesdorfmann.mosby.mvp.MvpActivity;
import com.norrpark.user.norrpark.R;
import com.norrpark.user.norrpark.customViews.FontTextView;
import com.norrpark.user.norrpark.presenters.HomeScreenPresenter;
import com.norrpark.user.norrpark.views.HomeScreenView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by burim on 3/9/2017.
 */

public class HomeScreen extends MvpActivity<HomeScreenView, HomeScreenPresenter> implements HomeScreenView {

    @BindView(R.id.select_parking_item)
    View selectParking;
    @BindView(R.id.scan_item)
    View scan;
    @BindView(R.id.ticets_item)
    View ticket;
    @BindView(R.id.logout)
    AppCompatImageButton logOut;
    @BindView(R.id.username_title)
    FontTextView userNameTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);
        ButterKnife.bind(this);
    }

    @NonNull
    @Override
    public HomeScreenPresenter createPresenter() {
        return new HomeScreenPresenter();
    }
}
