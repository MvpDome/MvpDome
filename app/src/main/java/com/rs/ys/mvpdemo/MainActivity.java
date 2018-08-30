package com.rs.ys.mvpdemo;

import android.os.Bundle;

import com.rs.ys.mvpdemo.basics.BasicsImplActivity;
import com.rs.ys.mvpdemo.basics.BasicsResponse;

public class MainActivity extends BasicsImplActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void callBack(BasicsResponse response, int tag, Object obj) {
        switch (tag) {
            case ApiTag.BRANDS:

                break;
        }
    }
}