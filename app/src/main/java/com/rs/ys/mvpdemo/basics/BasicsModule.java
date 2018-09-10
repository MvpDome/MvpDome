package com.rs.ys.mvpdemo.basics;

import android.app.Application;

import com.rs.ys.mvpdemo.IModel;
import com.rs.ys.mvpdemo.IView;
import com.tbruyelle.rxpermissions2.RxPermissions;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.listener.ResponseErrorListener;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */

@Module
public class BasicsModule {
    private IView view;

    public BasicsModule(IView view) {
        this.view = view;
    }

    @BasicsScope
    @Provides
    IView providesView() {
        return view;
    }

    @BasicsScope
    @Provides
    IModel providesModel(BasicsModelImpl basicsModel) {
        return basicsModel;
    }

    @BasicsScope
    @Provides
    RxPermissions providesRxPermissions() {
        return new RxPermissions(view.getActivity());
    }

}
