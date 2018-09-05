package com.rs.ys.mvpdemo.basics;

import android.annotation.SuppressLint;

import com.google.gson.Gson;
import com.rs.ys.mvpdemo.ApiTag;
import com.rs.ys.mvpdemo.IView;
import com.rs.ys.mvpdemo.TestBean;
import com.rs.ys.mvpdemo.base.BasePresenter;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
public class BasicsPresenterImpl extends BasePresenter<BasicsModelImpl, IView> {

    @Inject
    public BasicsPresenterImpl(BasicsModelImpl mModel, IView mRootView) {
        super(mModel, mRootView);
    }

    @SuppressLint("CheckResult")
    public <T extends BasicsRequest,C extends BasicsResponse> void response(T t, Class<C> mClass, int tag) {
        mModel.requestGet(t)
                .map(response -> new Gson().fromJson(response.getResponseBody().string(),mClass))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(response -> mRootView.callBack(response, tag, null));
    }

}
