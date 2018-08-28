package com.rs.ys.mvpdemo;

import android.support.annotation.NonNull;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/**
 * Created by 谢岳峰 on 2018/8/28.
 */
public interface BasicsService {
    @NonNull
    @GET
    Observable get(@Url String url, @QueryMap Map<String, String> params);
}
