package com.rs.ys.mvpdemo.mvp.interfaces;

import android.app.Activity;

import com.rs.ys.mvpdemo.http.BasicsRequest;
import com.rs.ys.mvpdemo.http.BasicsResponse;
import com.rs.ys.mvpdemo.http.Response;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.ResponseBody;

/**
 * Created by 谢岳峰 on 2018/9/11.
 */
public interface IBasics {
    public interface IView {
        void showLoading();
        void hideLoading();
        <R extends BasicsResponse> void callBack(R  r, int tag, Object e);
        Activity getActivity();
    }
    public interface IModel {
        Observable<ResponseBody> get(String url, Map<String, Object> params);

        Observable<ResponseBody> get(String url, String jsonParam);

        <T extends BasicsRequest> Observable<Response> get(T t);

        Observable<ResponseBody> post(String url, Map<String, Object> params);

        Observable<ResponseBody> post(String url, String jsonParam);

        <T extends BasicsRequest> Observable<Response> post(T t);
    }
    public interface IPresenter{
        /**
         * 做一些初始化操作
         */
        void onStart();

        /**
         * 在框架中 {@link Activity#onDestroy()} 时会默认调用 {@link IPresenter#onDestroy()}
         */
        void onDestroy();
    }
}
