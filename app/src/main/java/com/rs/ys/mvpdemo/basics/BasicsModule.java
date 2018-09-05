package com.rs.ys.mvpdemo.basics;

import com.rs.ys.mvpdemo.IModel;
import com.rs.ys.mvpdemo.IView;

import dagger.Module;
import dagger.Provides;

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
    IView providesView(){
        return view;
    }

    @BasicsScope
    @Provides
    IModel providesModel(BasicsModelImpl basicsModel){
        return basicsModel;
    }

}
