package com.rs.ys.mvpdemo.base;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.rs.ys.mvpdemo.di.AppComponent;
import com.rs.ys.mvpdemo.mvp.interfaces.IBasics;

import javax.inject.Inject;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
public abstract class BaseActivity<P extends IBasics.IPresenter> extends AppCompatActivity implements IBasics.IView {
    @Inject
    @Nullable
    protected P mPresenter;

    public abstract void setupActivityComponent(AppComponent appComponent);

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null)
            mPresenter.onDestroy();//释放资源
        this.mPresenter = null;
    }
}
