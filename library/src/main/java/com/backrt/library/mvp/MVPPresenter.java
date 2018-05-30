package com.backrt.library.mvp;

import android.support.annotation.NonNull;
import android.support.annotation.UiThread;

/**
 * Author：lhb on 2018/5/30 10:05
 * Mail：lihaibo@znds.com
 */

public interface MVPPresenter<V extends MVPView> {

    @UiThread
    void attachView(@NonNull V view);

    @UiThread
    void detachView();

    @UiThread
    void destory();
}
