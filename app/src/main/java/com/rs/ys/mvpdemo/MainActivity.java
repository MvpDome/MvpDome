package com.rs.ys.mvpdemo;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.rs.ys.mvpdemo.basics.BasicsImplActivity;
import com.rs.ys.mvpdemo.basics.BasicsResponse;

public class MainActivity extends BasicsImplActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter.response(new TestRequest(60), TestBean.class, ApiTag.BRANDS);

        mPresenter.response(new TestRequest(294), TestBean.class, ApiTag.BRANDS_TEST);

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public <R extends BasicsResponse> void callBack(R r, int tag, Object obj) {
        switch (tag) {
            case ApiTag.BRANDS:
                TestBean testBean = (TestBean) r;
                Log.e("Tag" + "  " + ApiTag.BRANDS, new Gson().toJson(testBean.getData().getDatas()));
                break;
            case ApiTag.BRANDS_TEST:
                Log.e("Tag" + "  " + ApiTag.BRANDS_TEST, new Gson().toJson(r));
                break;
        }
    }

}