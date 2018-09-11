package com.rs.ys.mvpdemo.http.request;

import com.rs.ys.mvpdemo.http.BasicsRequest;

/**
 * Created by 谢岳峰 on 2018/9/5.
 */
public class TestRequest extends BasicsRequest {
    private int cid;

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

    @Override
    public boolean isParam() {
        return false;
    }
}
