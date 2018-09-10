package com.rs.ys.mvpdemo;

import okhttp3.ResponseBody;

/**
 * Created by 谢岳峰 on 2018/9/7.
 */
public class Response {
    public ResponseBody responseBody;
    public boolean[] isShowToast = new boolean[]{false,true};

    public Response(ResponseBody responseBody) {
        this.responseBody = responseBody;
    }

    public Response(ResponseBody responseBody, boolean[] isShowToast) {
        this.responseBody = responseBody;
        this.isShowToast = isShowToast;
    }
}
