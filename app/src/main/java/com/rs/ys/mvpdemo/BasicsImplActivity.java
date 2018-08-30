package com.rs.ys.mvpdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
public abstract class BasicsImplActivity extends BaseActivity<BasicsPresenterImpl> {
    protected boolean isAutoBuild=true;//自动注入公共属性
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
}