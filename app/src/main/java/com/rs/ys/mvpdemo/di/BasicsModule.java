package com.rs.ys.mvpdemo.di;

import com.rs.ys.mvpdemo.basics.BasicsScope;
import com.rs.ys.mvpdemo.mvp.interfaces.IBasics;
import com.rs.ys.mvpdemo.mvp.model.BasicsModelImpl;
import com.tbruyelle.rxpermissions2.RxPermissions;

import dagger.Module;
import dagger.Provides;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */

@Module
public class BasicsModule {
    private IBasics.IView view;

    public BasicsModule(IBasics.IView view) {
        this.view = view;
    }

    @BasicsScope
    @Provides
    IBasics.IView providesView() {
        return view;
    }

    @BasicsScope
    @Provides
    IBasics.IModel providesModel(BasicsModelImpl basicsModel) {
        return basicsModel;
    }

    @BasicsScope
    @Provides
    RxPermissions providesRxPermissions() {
        return new RxPermissions(view.getActivity());
    }

}
