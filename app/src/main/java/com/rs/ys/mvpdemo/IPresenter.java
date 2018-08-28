package com.rs.ys.mvpdemo;

import android.app.Activity;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
public interface IPresenter {
    /**
     * 做一些初始化操作
     */
    void onStart();

    /**
     * 在框架中 {@link Activity#onDestroy()} 时会默认调用 {@link IPresenter#onDestroy()}
     */
    void onDestroy();
}
