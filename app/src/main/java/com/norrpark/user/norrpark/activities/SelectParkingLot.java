package com.norrpark.user.norrpark.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.hannesdorfmann.mosby.mvp.MvpActivity;
import com.norrpark.user.norrpark.R;
import com.norrpark.user.norrpark.customViews.FontEditText;
import com.norrpark.user.norrpark.customViews.FontTextView;
import com.norrpark.user.norrpark.customViews.GlideImageView;
import com.norrpark.user.norrpark.presenters.SelectParkingLotPresenter;
import com.norrpark.user.norrpark.views.SelectParkingLotView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by burim on 3/9/2017.
 */

public class SelectParkingLot extends MvpActivity<SelectParkingLotView, SelectParkingLotPresenter> implements SelectParkingLotView {

    @BindView(R.id.park_lot_no)
    FontEditText parkLotNo;
    @BindView(R.id.select_button)
    FontTextView selectButton;
    @BindView(R.id.validate_icon)
    GlideImageView validateIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_parking_lot);
        ButterKnife.bind(this);
    }

    @NonNull
    @Override
    public SelectParkingLotPresenter createPresenter() {
        return new SelectParkingLotPresenter();
    }
}
