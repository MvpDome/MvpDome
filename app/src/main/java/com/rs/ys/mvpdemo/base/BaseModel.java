package com.rs.ys.mvpdemo.base;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;

import com.rs.ys.mvpdemo.IModel;
import com.rs.ys.mvpdemo.RepositoryManager;
import com.rs.ys.mvpdemo.utils.IRepositoryManager;

/**
 * Created by 谢岳峰 on 2018/8/28.
 */
public class BaseModel implements IModel,LifecycleObserver {
    protected IRepositoryManager mRepositoryManager;//用于管理网络请求层, 以及数据缓存层

    public BaseModel(RepositoryManager repositoryManager) {
        this.mRepositoryManager = repositoryManager;
    }
    public BaseModel() {
    }
    /**
     * 在框架中 {@link BasePresenter#onDestroy()} 时会默认调用 {@link IModel#onDestroy()}
     */
    @Override
    public void onDestroy() {
        mRepositoryManager = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroy(LifecycleOwner owner) {
        owner.getLifecycle().removeObserver(this);
    }
}
