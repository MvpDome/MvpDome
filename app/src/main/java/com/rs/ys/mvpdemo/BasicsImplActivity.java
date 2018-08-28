package com.rs.ys.mvpdemo;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
public abstract class BasicsImplActivity extends BaseActivity<BasicsPresenterImpl> {
    @Override
    public void setupActivityComponent(AppComponent appComponent) {
        DaggerBasicsComponent.builder()
                .appComponent(appComponent)
                .basicsModule(new BasicsModule(this))
                .build().inject(this);
    }
}