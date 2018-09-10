package com.rs.ys.mvpdemo.basics;

import com.rs.ys.mvpdemo.Api;
import com.rs.ys.mvpdemo.IModel;
import com.rs.ys.mvpdemo.Response;

import java.util.Map;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.functions.Function;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
public class BasicsModelImpl implements IModel {

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
    public Observable<ResponseBody> get(String actionHeader, Map<String, String> params) {
        return api.requestGet(actionHeader, params);
    }

    @Override
    public <T extends BasicsRequest> Observable<Response> get(T t) {
        return api.requestGet(t.getRequestUrl(), t.getMapParams())
                .flatMap((Function<ResponseBody, Observable<Response>>) responseBody -> {
                    Response response = new Response(responseBody, t.isShowMsg());
                    return Observable.just(response);
                });
    }
}
