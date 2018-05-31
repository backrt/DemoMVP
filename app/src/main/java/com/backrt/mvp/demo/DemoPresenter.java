package com.backrt.mvp.demo;

import android.support.annotation.NonNull;

import java.lang.ref.WeakReference;

/**
 * Author：lhb on 2018/5/31 09:49
 * Mail：lihaibo@znds.com
 */

public class DemoPresenter implements DemoContract.IDemoPresenter {
    WeakReference<DemoContract.IDemoViewer> viewRef;

    @Override
    public void attachView(@NonNull DemoContract.IDemoViewer view) {
        this.viewRef = new WeakReference<DemoContract.IDemoViewer>(view);
    }

    @Override
    public void detachView() {
        this.viewRef.clear();
    }

    @Override
    public void destory() {

    }

    @Override
    public void test() {
        // do nothings
        this.viewRef.get().onTest();
    }
}
