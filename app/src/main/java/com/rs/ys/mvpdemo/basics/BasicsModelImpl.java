package com.rs.ys.mvpdemo.basics;

import com.rs.ys.mvpdemo.RepositoryManager;
import com.rs.ys.mvpdemo.utils.IRepositoryManager;
import com.rs.ys.mvpdemo.base.BaseModel;

import javax.inject.Inject;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
public class BasicsModelImpl extends BaseModel {
    @Inject
    public BasicsModelImpl(RepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    public BasicsModelImpl() {

    }

    @Override
    public void onDestroy() {

    }
}
