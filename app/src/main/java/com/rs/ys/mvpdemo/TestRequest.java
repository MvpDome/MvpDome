package com.rs.ys.mvpdemo;

import com.rs.ys.mvpdemo.basics.BasicsRequest;

/**
 * Created by 谢岳峰 on 2018/9/5.
 */
public class TestRequest extends BasicsRequest {
    private int cid;

    public TestRequest() {
    }

    public TestRequest(int cid) {
        this.cid = cid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Override
    public String getRequestUrl() {
        return "article/list/0/json";
    }
}