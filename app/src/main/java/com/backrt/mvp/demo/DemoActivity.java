package com.backrt.mvp.demo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.RelativeLayout;

import com.backrt.library.mvp.base.MVPActivity;

/**
 * Author：lhb on 2018/5/31 09:52
 * Mail：lihaibo@znds.com
 */

public class DemoActivity extends MVPActivity<DemoContract.IDemoViewer, DemoContract.IDemoPresenter> implements DemoContract.IDemoViewer {
    private static final String TAG = DemoActivity.class.getSimpleName();

    @NonNull
    @Override
    public DemoContract.IDemoPresenter createPresenter() {
        return new DemoPresenter();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout rootView = new RelativeLayout(this);
        rootView.setBackgroundColor(Color.WHITE);
        setContentView(rootView);

        //test
        doSomething();
    }


    void doSomething() {
        presenter.test();
    }

    @Override
    public void onTest() {
        Log.d(TAG, "onTest");
    }
}
