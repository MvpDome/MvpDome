package com.rs.ys.mvpdemo.basics;

import com.rs.ys.mvpdemo.AppComponent;

import dagger.Component;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
@BasicsScope
@Component(dependencies = AppComponent.class, modules = BasicsModule.class)
public interface BasicsComponent {
    void inject(BasicsImplActivity activity);
}
