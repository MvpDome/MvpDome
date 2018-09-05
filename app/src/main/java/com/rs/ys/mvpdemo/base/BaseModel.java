package com.rs.ys.mvpdemo.base;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;

import com.rs.ys.mvpdemo.IModel;

/**
 * Created by 谢岳峰 on 2018/8/28.
 */
public class BaseModel implements IModel,LifecycleObserver {

    public BaseModel() {
    }
    /**
     * 在框架中 {@link BasePresenter#onDestroy()} 时会默认调用 {@link IModel#onDestroy()}
     */
    @Override
    public void onDestroy() {

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroy(LifecycleOwner owner) {
        owner.getLifecycle().removeObserver(this);
    }
}
