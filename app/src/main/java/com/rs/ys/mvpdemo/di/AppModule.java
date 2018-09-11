package com.rs.ys.mvpdemo.di;


import android.app.Application;

import com.rs.ys.mvpdemo.basics.BasicsScope;
import com.tbruyelle.rxpermissions2.RxPermissions;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.listener.ResponseErrorListener;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
@Module
public class AppModule {

    @Singleton
    @Provides
    ResponseErrorListener providesResponseErrorListener(){
        return ResponseErrorListener.EMPTY;
    }

    @Singleton
    @Provides
    static RxErrorHandler providesRxErrorHandler(Application application, ResponseErrorListener listener) {
        return RxErrorHandler
                .builder()
                .with(application)
                .responseErrorListener(listener)
                .build();
    }
}
