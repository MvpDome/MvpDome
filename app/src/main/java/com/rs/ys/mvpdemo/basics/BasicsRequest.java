package com.rs.ys.mvpdemo.basics;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;

/**
 * Created by 谢岳峰 on 2018/8/28.
 */
public abstract class BasicsRequest {
    public abstract String getRequestUrl();

    public LinkedHashMap<String, String> getMapParams() {
        LinkedHashMap<String, String> params = new LinkedHashMap<>();
        String[] filedName = getFiledName();
        for (String key : filedName) {
            params.put(key, (String) getFieldValueByName(key));
        }
        return params;
    }


    /**
     * 获取属性名数组
     */
    private String[] getFiledName() {
        Field[] fields = this.getClass().getDeclaredFields();
        String[] fieldNames = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            fieldNames[i] = fields[i].getName();
        }
        return fieldNames;
    }

    /* 根据属性名获取属性值
     * */
    private Object getFieldValueByName(String fieldName) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = this.getClass().getMethod(getter);
            return method.invoke(this);
        } catch (Exception e) {
            return null;
        }
    }
}
