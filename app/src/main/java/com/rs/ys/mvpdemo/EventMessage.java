package com.rs.ys.mvpdemo;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
public class EventMessage<T> {
    private int tag;
    private T data;

    public EventMessage(int tag, T data) {
        this.tag = tag;
        this.data = data;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
