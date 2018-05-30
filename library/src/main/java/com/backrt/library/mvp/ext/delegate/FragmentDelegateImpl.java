package com.backrt.library.mvp.ext.delegate;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

import com.backrt.library.mvp.MVPPresenter;
import com.backrt.library.mvp.MVPView;

/**
 * Author：lhb on 2018/5/30 16:34
 * Mail：lihaibo@znds.com
 */

public class FragmentDelegateImpl<V extends MVPView, P extends MVPPresenter<V>> implements FragmentDelegate<V, P> {
    private MVPDelegateCallback<V, P> delegateCallback;
    protected Fragment fragment;

    public FragmentDelegateImpl(MVPDelegateCallback<V, P> delegateCallback, Fragment fragment) {
        this.delegateCallback = delegateCallback;
        this.fragment = fragment;
    }

    @Override
    public void onCreate(Bundle saved) {
        P presenter = this.delegateCallback.createPresenter();
        if (null != presenter) {
            this.delegateCallback.setPresenter(presenter);
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
        getPresenter().destory();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        P presenter = getPresenter();
        presenter.attachView(getMvpView());
    }

    @Override
    public void onDestroyView() {

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
    public void onActivityCreated(Bundle savedInstanceState) {

    }

    @Override
    public void onAttach(Activity activity) {

    }

    @Override
    public void onDetach() {
        getPresenter().detachView();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {

    }
}
