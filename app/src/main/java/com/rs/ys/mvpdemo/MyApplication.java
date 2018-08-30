package com.rs.ys.mvpdemo;

import android.app.Application;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initRxCacheFile();
    }

    private void initRxCacheFile() {
        DemoConfig.mRxCache_File = getCacheDir();
    }
}
