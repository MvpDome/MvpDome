package com.rs.ys.mvpdemo.mvp.model;

import com.rs.ys.mvpdemo.http.Api;
import com.rs.ys.mvpdemo.http.BasicsRequest;
import com.rs.ys.mvpdemo.http.MediaTypes;
import com.rs.ys.mvpdemo.http.Response;
import com.rs.ys.mvpdemo.mvp.interfaces.IBasics;

import java.util.Map;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.functions.Function;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
public class BasicsModelImpl implements IBasics.IModel {

    private Api api;

    @Inject
    public BasicsModelImpl() {
        super();
        api = new Retrofit.Builder().baseUrl("http://www.wanandroid.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
                .create(Api.class);
    }

    @Override
    public <T extends BasicsRequest> Observable<Response> get(T t) {
        Observable<ResponseBody> responseBodyObservable;
        if (t.isParam()) responseBodyObservable = api.get(t.getRequestUrl(), t.getJsonParam());
        else responseBodyObservable = api.get(t.getRequestUrl(), t.getMapParams());
        return responseBodyObservable
                .flatMap((Function<ResponseBody, Observable<Response>>) responseBody -> {
                    Response response = new Response(responseBody, t.isShowMsg());
                    return Observable.just(response);
                });
    }

    @Override
    public <T extends BasicsRequest> Observable<Response> post(T t) {
        Observable<ResponseBody> responseBodyObservable;
        if (t.isParam()) {
            RequestBody requestBody = RequestBody.create(MediaTypes.APPLICATION_JSON_TYPE, t.getJsonParam());
            responseBodyObservable = api.postBody(t.getRequestUrl(), requestBody);
        } else {
            responseBodyObservable = api.postForm(t.getRequestUrl(), t.getMapParams());
        }
        return responseBodyObservable
                .flatMap((Function<ResponseBody, Observable<Response>>) responseBody -> {
                    Response response = new Response(responseBody, t.isShowMsg());
                    return Observable.just(response);
                });
    }

    @Override
    public Observable<ResponseBody> uploadFiles(String url) {

        return null;
    }

    @Override
    public Observable<ResponseBody> downFile(String url) {

        return null;
    }
}
