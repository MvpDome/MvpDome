package com.rs.ys.mvpdemo;

import java.util.LinkedHashMap;

/**
 * Created by 谢岳峰 on 2018/8/28.
 */
public abstract class BasicsRequest {
    public abstract String getRequestUrl();
    public abstract LinkedHashMap<String,String> getMapParams();
}
