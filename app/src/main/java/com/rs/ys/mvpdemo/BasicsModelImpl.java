package com.rs.ys.mvpdemo;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
public class BasicsModelImpl implements IModel {

    @Inject
    public BasicsModelImpl() {
    }

   public <T extends BasicsRequest> Observable<WeatherRp>get(T t){

   }

    @Override
    public void onDestroy() {

    }
}
