package com.rs.ys.mvpdemo.basics;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;

/**
 * Created by 谢岳峰 on 2018/8/28.
 */
public abstract class BasicsRequest {
    public abstract String getRequestUrl();

    public boolean isShowMsg() {
        return false;
    }

    public LinkedHashMap<String, String> getMapParams() {
        LinkedHashMap<String, String> params = new LinkedHashMap<>();
        String[] filedName = getFiledName();
        for (String key : filedName) {
            Object fieldValueByName = getFieldValueByName(key);
            if (fieldValueByName instanceof Integer)
                params.put(key, Integer.toString((Integer) fieldValueByName));
            else if (fieldValueByName instanceof Long)
                params.put(key, Long.toString((Long) fieldValueByName));
            else if (fieldValueByName instanceof Float)
                params.put(key, Float.toString((Float) fieldValueByName));
            else if (fieldValueByName instanceof Double)
                params.put(key, Double.toString((Double) fieldValueByName));
            else if (fieldValueByName instanceof Boolean)
                params.put(key, Boolean.toString((Boolean) fieldValueByName));
            else if (fieldValueByName instanceof String)
                params.put(key, (String) fieldValueByName);
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
