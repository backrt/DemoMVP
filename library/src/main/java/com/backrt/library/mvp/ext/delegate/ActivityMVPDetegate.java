package com.backrt.library.mvp.ext.delegate;

import android.os.Bundle;

import com.backrt.library.mvp.MVPPresenter;
import com.backrt.library.mvp.MVPView;

/**
 * Author：lhb on 2018/5/30 13:20
 * Mail：lihaibo@znds.com
 */
public interface ActivityMVPDetegate<V extends MVPView, P extends MVPPresenter<V>> {

    void onCreate(Bundle bundle);

    void onDestroy();

    void onPause();

    void onResume();

    void onStart();

    void onStop();

    void onRestart();

    void onContentChanged();

    void onSaveInstanceState(Bundle outState);

    void onPostCreate(Bundle savedInstanceState);
}
