package com.rs.ys.mvpdemo.base;

import com.rs.ys.mvpdemo.mvp.interfaces.IBasics;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
public abstract class BasePresenter<M extends IBasics.IModel,V extends IBasics.IView> implements IBasics.IPresenter{
    protected final String TAG = this.getClass().getSimpleName();
    protected M mModel;
    protected V mRootView;

    /**
     * 如果当前页面同时需要 Model 层和 View 层,则使用此构造函数(默认)
     *
     * @param mModel
     * @param mRootView
     */
    public BasePresenter(M mModel, V mRootView) {
        this.mModel = mModel;
        this.mRootView = mRootView;
        onStart();
    }

    /**
     * 如果当前页面不需要操作数据,只需要 View 层,则使用此构造函数
     *
     * @param mRootView
     */
    public BasePresenter(V mRootView) {
        this.mRootView = mRootView;
        onStart();
    }

    public BasePresenter() {
        onStart();
    }

    @Override
    public void onStart() {
    }

    @Override
    public void onDestroy() {
        mModel = null;
        mRootView = null;
    }
}
