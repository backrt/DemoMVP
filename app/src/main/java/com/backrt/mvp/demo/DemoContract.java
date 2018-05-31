package com.backrt.mvp.demo;

import com.backrt.library.mvp.MVPPresenter;
import com.backrt.library.mvp.MVPView;

/**
 * Author：lhb on 2018/5/31 09:45
 * Mail：lihaibo@znds.com
 */

public final class DemoContract {

    public interface IDemoViewer extends MVPView {

        void onTest();
    }

    public interface IDemoPresenter extends MVPPresenter<IDemoViewer> {

        void test();
    }

}
