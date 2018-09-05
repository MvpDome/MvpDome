package com.rs.ys.mvpdemo.basics;

import java.io.Serializable;

import okhttp3.ResponseBody;

/**
 * Created by 谢岳峰 on 2018/8/28.
 */
public class BasicsResponse implements Serializable {
    private final ResponseBody responseBody;
    private final boolean aBoolean;
    private int errorCode;
    private String errorMsg;

    public BasicsResponse(ResponseBody responseBody, boolean showMsg) {
        this.responseBody = responseBody;
        aBoolean = showMsg;
    }

    public ResponseBody getResponseBody() {
        return responseBody;
    }

    public boolean isaBoolean() {
        return aBoolean;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
