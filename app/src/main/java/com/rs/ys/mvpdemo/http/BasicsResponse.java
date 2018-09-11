package com.rs.ys.mvpdemo.http;

import org.json.JSONException;

import java.io.Serializable;

/**
 * Created by 谢岳峰 on 2018/8/28.
 */
public abstract class BasicsResponse implements Serializable {
    private String fullData;//完整Json
    private String errorMsg;
    private String data;
    private int errorCode;
    private Object tag;

    public String getFullData() {
        return fullData;
    }

    public void setFullData(String fullData) {
        this.fullData = fullData;
    }

    public String getMsg() {
        return errorMsg;
    }

    public void setMsg(String msg) {
        this.errorMsg = msg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getCode() {
        return errorCode;
    }

    public void setCode(int code) {
        this.errorCode = code;
    }

    public Object getTag() {
        return tag;
    }

    public void setTag(Object tag) {
        this.tag = tag;
    }

    /**
     * 解析单条数据
     *
     * @param clazz
     * @param isFull 是否解析完整json数据
     * @param <T>
     * @return
     * @throws IllegalArgumentException 参数异常(Response中data为空)
     */
    public abstract <T> T getBean(Class<T> clazz, boolean isFull)
            throws IllegalArgumentException;
}
