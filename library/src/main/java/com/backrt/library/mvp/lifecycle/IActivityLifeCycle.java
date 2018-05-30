package com.backrt.library.mvp.lifecycle;

import android.os.Bundle;

/**
 * Author：lhb on 2018/5/30 10:09
 * Mail：lihaibo@znds.com
 */

public interface IActivityLifeCycle {

    void onCreate(Bundle bundle);

    void onStart();

    void onResume();

    void onPause();

    void onStop();

    void onDestory();

    void onRestoreInstanceState(Bundle savedInstanceState);

    void onSaveInstanceState(Bundle outState);
}
