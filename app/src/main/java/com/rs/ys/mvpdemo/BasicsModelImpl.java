package com.rs.ys.mvpdemo;

import io.reactivex.Observable;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
public class BasicsModelImpl extends BaseModel {

    public BasicsModelImpl(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    public <T extends BasicsRequest> Observable<WeatherRp> get(T t) {

    }

    @Override
    public void onDestroy() {

    }
}
