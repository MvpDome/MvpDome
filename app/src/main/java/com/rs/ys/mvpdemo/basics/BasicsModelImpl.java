package com.rs.ys.mvpdemo.basics;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.rs.ys.mvpdemo.Api;
import com.rs.ys.mvpdemo.RepositoryManager;
import com.rs.ys.mvpdemo.utils.Action;
import com.rs.ys.mvpdemo.utils.IRepositoryManager;
import com.rs.ys.mvpdemo.base.BaseModel;

import java.io.IOException;
import java.util.Map;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
public class BasicsModelImpl extends BaseModel {
    @Inject
    public BasicsModelImpl(RepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    public BasicsModelImpl() {

    }

    public <T> void response(Class<T> dataCache, String url, Map map, Action action) {
        String[] split = url.split("/");
        String baseUrl = split.length >= 3 ? split[0] + "/" + split[1] + "/" + split[2] + "/" : split[0] + "//";
        String apiUrl = url.replace(baseUrl, "");
        getRetrofitService(Api.class, baseUrl).requestGet(apiUrl, map)//测试
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<ResponseBody>() {
                    @Override
                    public void accept(ResponseBody responseBody) throws Exception {
                        try {
                            action.onSuccess(new Gson().fromJson(responseBody.string(),dataCache));
                        } catch (Exception e) {
                            e.printStackTrace();
                            action.onError(e.toString());
                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        action.onError(throwable.getMessage());
                    }
                });

    }

    @Override
    public void onDestroy() {
    }

    public <T> T getRetrofitService(Class<T> service, String baseUrl) {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        return retrofit.create(service);
    }
}
