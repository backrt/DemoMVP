package com.backrt.library.mvp.base.delegate;

import android.app.Activity;
import android.os.Bundle;

import com.backrt.library.mvp.MVPPresenter;
import com.backrt.library.mvp.MVPView;

/**
 * Author：lhb on 2018/5/30 13:22
 * Mail：lihaibo@znds.com
 */

public class ActivityMVPDelegateImpl<V extends MVPView, P extends MVPPresenter<V>> implements ActivityMVPDetegate {

    protected Activity activity;
    private MVPDelegateCallback<V, P> delegateCallback;

    public ActivityMVPDelegateImpl(Activity activity, MVPDelegateCallback<V, P> delegateCallback) {
        this.activity = activity;
        this.delegateCallback = delegateCallback;
    }


    @Override
    public void onCreate(Bundle bundle) {
        P presenter = this.delegateCallback.createPresenter();
        if (null != presenter) {
            this.delegateCallback.setPresenter(presenter);
            V view = this.getMvpView();
            presenter.attachView(view);
        }
    }

    private P getPresenter() {
        P presenter = delegateCallback.getPresenter();
        if (presenter == null) {
            throw new NullPointerException("Presenter returned from getPresenter() is null");
        }
        return presenter;
    }

    private V getMvpView() {
        V view = delegateCallback.getMvpView();
        if (view == null) {
            throw new NullPointerException("View returned from getMvpView() is null");
        }
        return view;
    }

    @Override
    public void onDestroy() {
        getPresenter().detachView();
        getPresenter().destory();
    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onRestart() {

    }

    @Override
    public void onContentChanged() {

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {

    }

    @Override
    public void onPostCreate(Bundle savedInstanceState) {

    }
}
