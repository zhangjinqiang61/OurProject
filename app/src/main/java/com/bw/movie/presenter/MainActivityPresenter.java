package com.bw.movie.presenter;

import android.content.Context;

import com.bw.movie.R;
import com.bw.movie.mvp.view.AppDelegate;

public class MainActivityPresenter extends AppDelegate {
    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initData() {
        super.initData();
        toast("大");
    }

    public void setContext(Context context) {
        this.context = context;

    }



}
