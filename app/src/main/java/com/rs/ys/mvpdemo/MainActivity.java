package com.rs.ys.mvpdemo;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.rs.ys.mvpdemo.basics.BasicsImplActivity;
import com.rs.ys.mvpdemo.bean.TestBean;
import com.rs.ys.mvpdemo.http.BasicsResponse;
import com.rs.ys.mvpdemo.http.ApiTag;
import com.rs.ys.mvpdemo.http.request.TestRequest;

public class MainActivity extends BasicsImplActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter.request(new TestRequest(60), false, ApiTag.BRANDS, null);
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
                if (r != null)
                    Log.e("Tag" + "  " + ApiTag.BRANDS, new Gson().toJson(r.getBean(TestBean.class, true)));
                break;
            case ApiTag.BRANDS_TEST:
                if (r != null)
                    Log.e("Tag" + "  " + ApiTag.BRANDS_TEST, new Gson().toJson(r));
                break;
        }
    }
}