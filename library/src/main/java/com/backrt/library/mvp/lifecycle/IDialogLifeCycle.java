package com.backrt.library.mvp.lifecycle;

/**
 * Author：lhb on 2018/5/30 10:28
 * Mail：lihaibo@znds.com
 */

public interface IDialogLifeCycle {

    void onCreate();

    void onShow();

    void onCancel();

    void onDismiss();

    void onDestory();
}
