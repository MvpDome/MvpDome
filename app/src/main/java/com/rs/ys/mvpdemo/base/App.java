package com.rs.ys.mvpdemo.base;

import android.content.Context;
import android.support.annotation.NonNull;

import com.rs.ys.mvpdemo.AppComponent;

/**
 * Created by 谢岳峰 on 2018/9/4.
 */
public interface App {
    @NonNull
    AppComponent getAppComponent();

}
