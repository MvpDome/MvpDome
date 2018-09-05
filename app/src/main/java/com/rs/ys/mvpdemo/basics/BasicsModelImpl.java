package com.rs.ys.mvpdemo.basics;

import com.rs.ys.mvpdemo.Api;
import com.rs.ys.mvpdemo.base.BaseModel;

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
public class BasicsModelImpl extends BaseModel {
    @Inject
    public BasicsModelImpl() {
        super();
    }

    public <T extends BasicsRequest> Observable<BasicsResponse> requestGet(T t) {
        return getRetrofitService(Api.class,"http://www.wanandroid.com/")
                .requestGet(t.getRequestUrl(), t.getMapParams())
                .flatMap((Function<ResponseBody, Observable<BasicsResponse>>) responseBody -> {
                    BasicsResponse response = new BasicsResponse(responseBody, t.isShowMsg());
                    return Observable.just(response);
                });
    }

    private <T> T getRetrofitService(Class<T> service, String baseUrl) {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        return retrofit.create(service);
    }

    @Override
    public void onDestroy() {
    }
}
