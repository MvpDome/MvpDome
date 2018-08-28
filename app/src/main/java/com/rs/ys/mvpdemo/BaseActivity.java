package com.rs.ys.mvpdemo;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
public abstract class BaseActivity<P extends IPresenter> extends AppCompatActivity implements IView {
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
