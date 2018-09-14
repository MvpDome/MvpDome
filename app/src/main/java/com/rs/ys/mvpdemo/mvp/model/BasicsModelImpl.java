package com.rs.ys.mvpdemo.mvp.model;

import com.rs.ys.mvpdemo.BuildConfig;
import com.rs.ys.mvpdemo.http.Api;
import com.rs.ys.mvpdemo.http.BasicsRequest;
import com.rs.ys.mvpdemo.http.MediaTypes;
import com.rs.ys.mvpdemo.http.Response;
import com.rs.ys.mvpdemo.http.interceptor.HttpLogInterceptor;
import com.rs.ys.mvpdemo.mvp.interfaces.IBasics;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.functions.Function;
import okhttp3.Cache;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
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
        Cache cache = new Cache(new File(BuildConfig.PATH_CACHE), BuildConfig.DEFAULT_CACHE_SIZE);
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .cache(cache)
                .connectTimeout(BuildConfig.DEFAULT_CONNECT_TIMEOUT, TimeUnit.SECONDS)//设置连接超时时间
                .readTimeout(BuildConfig.DEFAULT_READ_TIMEOUT, TimeUnit.SECONDS)//设置读取超时时间
                .writeTimeout(BuildConfig.DEFAULT_WRITE_TIMEOUT, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true);
        //调试模式打印Log日志
        if (BuildConfig.DEBUG) {
            HttpLogInterceptor interceptor = new HttpLogInterceptor();
            interceptor.setLevel(HttpLogInterceptor.Level.BODY);
            builder.addInterceptor(interceptor);
        }
        api = new Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(builder.build())
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
    public <T extends BasicsRequest> Observable<ResponseBody> uploadFiles(T t) {
        List<MultipartBody.Part> multipartBodyParts = new ArrayList<>();
        Iterator<Map.Entry<String, Object>> entryIterator = t.getMapParams().entrySet().iterator();
        Map.Entry<String, Object> entry;
        while (entryIterator.hasNext()) {
            entry = entryIterator.next();
            if (entry != null) {
                multipartBodyParts.add(MultipartBody.Part.createFormData(entry.getKey(), String.valueOf(entry.getValue())));
            }
        }
        return api.uploadFiles(t.getRequestUrl(), multipartBodyParts);
    }

    @Override
    public <T extends BasicsRequest> Observable<ResponseBody> downFile(T t) {
        return null;
    }
}
