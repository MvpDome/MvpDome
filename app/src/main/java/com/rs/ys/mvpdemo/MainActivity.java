package com.rs.ys.mvpdemo;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;

import com.google.gson.Gson;
import com.rs.ys.mvpdemo.basics.BasicsImplActivity;
import com.rs.ys.mvpdemo.basics.BasicsResponse;

import java.util.Map;

public class MainActivity extends BasicsImplActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        httpUrl = "http://www.wanandroid.com/article/list/0/json";

        apiTag = ApiTag.BRANDS;
        put("cid", 60);
        mPresenter.response(BasicsResponse.class);

        apiTag = ApiTag.BRANDS_TEST;
        put("cid", 294);
        mPresenter.response(TestBean.class);

    }

    @Override
    public <T extends BasicsResponse> void callBack(T r, int tag, Object obj) {
        switch (tag) {
            case ApiTag.BRANDS:
                Log.e("Tag" + "  " + ApiTag.BRANDS, new Gson().toJson(r));
                break;
            case ApiTag.BRANDS_TEST:
                Log.e("Tag" + "  " + ApiTag.BRANDS_TEST, new Gson().toJson(r));
                break;
        }
    }

}