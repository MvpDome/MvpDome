package com.rs.ys.mvpdemo.utils;

import android.test.mock.MockContentProvider;

import com.rs.ys.mvpdemo.DemoConfig;

import java.io.File;

import io.rx_cache2.internal.RxCache;
import io.victoralbertos.jolyglot.GsonSpeaker;

import static com.rs.ys.mvpdemo.DemoConfig.mPersistence_MaxCache;

public class RxCacheManager {
    private static RxCacheManager cacheManager;
    private  RxCache rxCache;

    private RxCacheManager(File fileName) {
        rxCache = new RxCache.Builder()
                .useExpiredDataIfLoaderNotAvailable(true)
                .setMaxMBPersistenceCache(mPersistence_MaxCache)
                .persistence(fileName, new GsonSpeaker());
    }
    public static RxCacheManager getInstance() {
        if (cacheManager == null) {
            cacheManager = new RxCacheManager(DemoConfig.mRxCache_File);
        }
        return cacheManager;
    }

    public <T> T addCacheData(Class<T> t){
        try {
            return rxCache.using(t);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
