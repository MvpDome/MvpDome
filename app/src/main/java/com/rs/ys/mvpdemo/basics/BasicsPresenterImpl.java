package com.rs.ys.mvpdemo.basics;

import com.rs.ys.mvpdemo.IView;
import com.rs.ys.mvpdemo.base.BasePresenter;

import javax.inject.Inject;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
public class BasicsPresenterImpl extends BasePresenter<BasicsModelImpl, IView> {

    @Inject
    public BasicsPresenterImpl(BasicsModelImpl mModel, IView mRootView) {
        super(mModel, mRootView);
    }

    public void response() {

    }
}
