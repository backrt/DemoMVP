package com.backrt.library.mvp.lifecycle;

/**
 * Author：lhb on 2018/5/30 10:13
 * Mail：lihaibo@znds.com
 */

public interface IFragmentLifeCycle {

    void onCreate();

    void onCreateView();

    void onActivityCreated();

    void onStart();

    void onResume();

    void onPause();

    void onStop();

    void onDestoryView();

    void onDestory();
}
