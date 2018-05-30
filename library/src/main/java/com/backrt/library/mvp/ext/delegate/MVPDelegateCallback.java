package com.backrt.library.mvp.ext.delegate;

import com.backrt.library.mvp.MVPPresenter;
import com.backrt.library.mvp.MVPView;

/**
 * Author：lhb on 2018/5/30 13:24
 * Mail：lihaibo@znds.com
 */

public interface MVPDelegateCallback<V extends MVPView, P extends MVPPresenter<V>> {

    P createPresenter();

    P getPresenter();

    void setPresenter(P presenter);

    V getMvpView();
}
