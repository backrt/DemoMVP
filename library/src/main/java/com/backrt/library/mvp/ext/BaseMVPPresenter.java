package com.backrt.library.mvp.ext;

import android.support.annotation.NonNull;

import com.backrt.library.mvp.MVPPresenter;
import com.backrt.library.mvp.MVPView;

import java.lang.ref.WeakReference;

/**
 * Author：lhb on 2018/5/30 13:17
 * Mail：lihaibo@znds.com
 */

public class BaseMVPPresenter<V extends MVPView> implements MVPPresenter<V> {
    private WeakReference<V> viewRef;

    @Override
    public void attachView(@NonNull V view) {
        viewRef = new WeakReference<V>(view);
    }

    @Override
    public void detachView() {
        if (viewRef != null) {
            viewRef.clear();
            viewRef = null;
        }
    }

    @Override
    public void destory() {
        this.detachView();

    }

    public interface ViewAction<V> {
        void run(@NonNull V view);
    }
}
