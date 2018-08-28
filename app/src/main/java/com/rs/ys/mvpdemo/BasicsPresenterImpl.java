package com.rs.ys.mvpdemo;

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
