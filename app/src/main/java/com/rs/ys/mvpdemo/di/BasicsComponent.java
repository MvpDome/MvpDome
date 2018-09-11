package com.rs.ys.mvpdemo.di;

import com.rs.ys.mvpdemo.basics.BasicsImplActivity;
import com.rs.ys.mvpdemo.basics.BasicsScope;
import com.rs.ys.mvpdemo.di.AppComponent;
import com.rs.ys.mvpdemo.di.BasicsModule;

import dagger.Component;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
@BasicsScope
@Component(dependencies = AppComponent.class, modules = BasicsModule.class)
public interface BasicsComponent {
    void inject(BasicsImplActivity activity);
}
