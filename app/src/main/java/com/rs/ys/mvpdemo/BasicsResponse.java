package com.rs.ys.mvpdemo;

import java.io.Serializable;

/**
 * Created by 谢岳峰 on 2018/8/28.
 */
public class BasicsResponse implements Serializable {
    private Object data;
    private String desc;
    private int status;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isSuccess() {
        return status == 1000;
    }
}
