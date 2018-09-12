package com.rs.ys.mvpdemo.mvp.presenter;

import android.annotation.SuppressLint;

import com.rs.ys.mvpdemo.base.BasePresenter;
import com.rs.ys.mvpdemo.http.BasicsRequest;
import com.rs.ys.mvpdemo.http.JsonHandleSubscriber;
import com.rs.ys.mvpdemo.http.JsonResponse;
import com.rs.ys.mvpdemo.http.RequestType;
import com.rs.ys.mvpdemo.http.Response;
import com.rs.ys.mvpdemo.mvp.interfaces.IBasics;
import com.rs.ys.mvpdemo.mvp.model.BasicsModelImpl;
import com.tbruyelle.rxpermissions2.RxPermissions;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.RetryWithDelay;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
public class BasicsPresenterImpl extends BasePresenter<BasicsModelImpl, IBasics.IView> {

    private RxErrorHandler mRxErrorHandler;
    private RxPermissions mRxPermissions;

    @Inject
    public BasicsPresenterImpl(BasicsModelImpl mModel, IBasics.IView mRootView,
                               RxPermissions rxPermissions, RxErrorHandler rxErrorHandler) {
        super(mModel, mRootView);
        mRxPermissions = rxPermissions;
        mRxErrorHandler = rxErrorHandler;
    }

    @SuppressLint("CheckResult")
    public <T extends BasicsRequest> void request(RequestType requestType, T t, boolean showLoading,
                                                  int tag, Object o) {
        if (t == null) {
            mRootView.callBack(null, tag, o);
            return;
        }
        Observable<Response> request;
        switch (requestType) {
            case REQUEST_GET:
                request = mModel.get(t);
                break;
            case REQUEST_POST:
                request = mModel.post(t);
                break;
            default:
                request = mModel.get(t);
                break;
        }
        request.subscribeOn(Schedulers.io())
                .retryWhen(new RetryWithDelay(1, 2))
                .doOnSubscribe(disposable -> {
                    if (showLoading) mRootView.showLoading();
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .doFinally(() -> {
                    if (showLoading) mRootView.hideLoading();
                })
                .subscribe(new JsonHandleSubscriber(mRxErrorHandler) {
                    @Override
                    public void onSuccess(JsonResponse response) {
                        mRootView.callBack(response, tag, o);
                    }

                    @Override
                    public void onDefinedError(int code) {
                        mRootView.callBack(null, tag, o);
                    }
                });
    }

    public RxPermissions getRxPermissions() {
        return mRxPermissions;
    }
}
