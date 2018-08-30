package com.rs.ys.mvpdemo;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
public class BasicsModelImpl extends BaseModel {

    public BasicsModelImpl(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }
    @Inject
    public BasicsModelImpl() {

    }

    @Override
    public void onDestroy() {

    }
}
