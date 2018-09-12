package com.rs.ys.mvpdemo.http;

import android.support.annotation.NonNull;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 谢岳峰 on 2018/8/28.
 */
public abstract class BasicsRequest implements Serializable, Comparable<BasicsRequest> {
    public abstract String getRequestUrl();

    private boolean[] showMsg = new boolean[]{false, true};//第一个参数：请求成功，展示json中的msg；第二个参数：请求失败，展示json中的msg
    //应用场景：请求成功就展示，失败就不需要展示，

    public boolean[] isShowMsg() {
        return showMsg;
    }

    public void setShowMsg(boolean[] showMsg) {
        this.showMsg = showMsg;
    }

    /**
     * 决定当前参数使用Map集合还是Json串
     *
     * @return true = Json; false = Map
     */
    public boolean isParam() {
        return false;
    }

    public Map<String, Object> getMapParams() {
        Map<String, Object> params = new HashMap<>();
        List<String> filedName = getFiledName();
        for (String key : filedName)
            params.put(key, getFieldValueByName(key));
        return params;
    }

    public String getJsonParam() {
        JSONObject jsonObject = new JSONObject();
        List<String> filedName = getFiledName();
        for (String key : filedName) {
            try {
                jsonObject.put(key, getFieldValueByName(key));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jsonObject.toString();
    }

    @Override
    public int compareTo(@NonNull BasicsRequest o) {
        return 0;
    }

    public Object getTag() {
        return null;
    }

    /**
     * 获取属性名数组
     */
    private List<String> getFiledName() {
        Field[] fields = this.getClass().getDeclaredFields();
        List<String> strings = new ArrayList<>();
        for (Field field : fields) {
            if (field.getName().equals("showMsg")) {
                continue;
            }
            strings.add(field.getName());
        }
        return strings;
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
