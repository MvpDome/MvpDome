package com.rs.ys.mvpdemo;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
public interface IModel {

    /**
     * 在框架中 {@link BasicsPresenterImpl#onDestroy()} 时会默认调用 {@link IModel#onDestroy()}
     */
    void onDestroy();
}
