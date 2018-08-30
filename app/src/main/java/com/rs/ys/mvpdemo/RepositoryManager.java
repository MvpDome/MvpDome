package com.rs.ys.mvpdemo;

import android.app.Application;
import android.content.Context;

import com.rs.ys.mvpdemo.basics.BasicsScope;
import com.rs.ys.mvpdemo.utils.IRepositoryManager;
import com.rs.ys.mvpdemo.utils.RxCacheManager;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Lazy;
import io.rx_cache2.internal.RxCache;
import retrofit2.Retrofit;

/**
 * Created by 谢岳峰 on 2018/8/30.
 */
@BasicsScope
public class RepositoryManager implements IRepositoryManager {
    //    @Inject
//    Lazy<Retrofit> mRetrofit;
    @Inject
    RxCacheManager cacheManager;

    //    Lazy<RxCache> mRxCache;
//    @Inject
//    Application mApplication;
    @Inject
    public RepositoryManager(){};

    @Override
    public <T> T obtainRetrofitService(Class<T> service) {
        return null;
    }

    @Override
    public <T> T obtainCacheService(Class<T> cache) {
        return null;
    }

    @Override
    public void clearAllCache() {

    }

    @Override
    public Context getContext() {
        return null;
    }

}
