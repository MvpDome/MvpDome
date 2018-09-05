package com.rs.ys.mvpdemo.base;

import android.app.Application;
import android.support.annotation.NonNull;
import android.util.ArrayMap;

import com.rs.ys.mvpdemo.AppComponent;
import com.rs.ys.mvpdemo.DaggerAppComponent;

/**
 * Created by 谢岳峰 on 2018/9/5.
 */
public abstract class BaseApp extends Application implements App {
    private static BaseApp appContext;

    public static BaseApp getAppContext() {
        return appContext;
    }

    @NonNull
    @Override
    public AppComponent getAppComponent() {
        return DaggerAppComponent.builder()
                .application(this)
                .build();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = this;
    }

    /**
     * 配置网络请求根路径
     */
    public abstract String getBaseUrl();

    /**
     * 配置网络请求头
     */
    public abstract ArrayMap<String, String> getRequestHeader();

    /**
     * 配置公共请求参数
     */
    public abstract ArrayMap<String, String> getRequestParams();
}
