package com.rs.ys.mvpdemo.basics;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.rs.ys.mvpdemo.AppComponent;
import com.rs.ys.mvpdemo.DaggerAppComponent;
import com.rs.ys.mvpdemo.base.BaseActivity;
import com.rs.ys.mvpdemo.utils.Params;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import io.rx_cache2.internal.RxCache;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
public abstract class BasicsImplActivity extends BaseActivity<BasicsPresenterImpl> implements Params{
    protected boolean isAutoBuild=true;//自动注入公共属性
    protected String httpUrl;
    protected int apiTag;
    protected Map<String,Object> map =new HashMap<>();
    @Override
    public void setupActivityComponent(AppComponent appComponent) {
        DaggerBasicsComponent.builder()
                .appComponent(appComponent)
                .basicsModule(new BasicsModule(this))
                .build().inject(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            if(isAutoBuild){
              setupActivityComponent(DaggerAppComponent.builder().application(getApplication()).build());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public Map<String, Object> getMap() {
        return map;
    }

    @Override
    public String getUrl() {
        return httpUrl;
    }
    protected void put(String key,Object value){
        map.put(key, value);
    }

    @Override
    public int getApiTag() {
        return apiTag;
    }
}