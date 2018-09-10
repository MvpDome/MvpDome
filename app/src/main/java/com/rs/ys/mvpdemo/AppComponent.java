package com.rs.ys.mvpdemo;

import android.app.Application;

import com.rs.ys.mvpdemo.module.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    Application application();

    //RxJava 错误处理管理类
    RxErrorHandler rxErrorHandler();

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
