package com.rs.ys.mvpdemo.basics;

import android.util.Log;

import com.rs.ys.mvpdemo.IView;
import com.rs.ys.mvpdemo.base.BasePresenter;

import java.util.Map;

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
        Map<String, Object> map = mRootView.getMap();
    }
}
