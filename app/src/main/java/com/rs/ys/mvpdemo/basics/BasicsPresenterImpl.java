package com.rs.ys.mvpdemo.basics;

import android.util.Log;

import com.rs.ys.mvpdemo.ApiTag;
import com.rs.ys.mvpdemo.IView;
import com.rs.ys.mvpdemo.base.BasePresenter;
import com.rs.ys.mvpdemo.utils.Action;

import java.util.Map;

import javax.inject.Inject;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
public class BasicsPresenterImpl extends BasePresenter<BasicsModelImpl, IView>  {

    @Inject
    public BasicsPresenterImpl(BasicsModelImpl mModel, IView mRootView) {
        super(mModel, mRootView);
    }

    public <T extends BasicsResponse> void response(Class<T> t) {
        mModel.response(t, mRootView.getUrl(), mRootView.getMap(),new Action<T>(){

            @Override
            public void onSuccess(T t) {
                mRootView.callBack(t, mRootView.getApiTag(),null);
            }
            @Override
            public void onError(String e) {
                mRootView.callBack(null,mRootView.getApiTag(),e);
            }
        });

    }

}
