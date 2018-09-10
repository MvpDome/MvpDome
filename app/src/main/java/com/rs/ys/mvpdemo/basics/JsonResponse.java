package com.rs.ys.mvpdemo.basics;

import android.text.TextUtils;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by 谢岳峰 on 2018/9/7.
 */
public class JsonResponse extends BasicsResponse {

    public static JsonResponse getResponse(String json, boolean[] isShowToast) {
        JsonResponse mResponse = new JsonResponse();
        mResponse.setFullData(json);
        int code = -1;
        String msg = "";
        String data = "";
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(json);
            boolean hasCode = jsonObject.has("errorCode");
            if (hasCode) {
                code = jsonObject.getInt("errorCode");
            }
            boolean hasMsg = jsonObject.has("errorMsg");
            if (hasMsg) {
                msg = jsonObject.getString("errorMsg");
            }
            boolean hasData = jsonObject.has("data");
            if (hasData) {
                data = jsonObject.getString("data");
            }
            if (isShowToast != null) {
                int codeNumber = Integer.valueOf(code);
                if (codeNumber != 200 && isShowToast[1]) {
                    //提示Toast
                } else if (!msg.equals("") && codeNumber == 200 && isShowToast[0]) {
                    //提示Toast
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        mResponse.setCode(code);
        mResponse.setMsg(msg);
        mResponse.setData(data);
        return mResponse;
    }

    @Override
    public <T> T getBean(Class<T> clazz, boolean isFull) throws IllegalArgumentException {
        if (!isFull && TextUtils.isEmpty(getData())) {
            throw new IllegalArgumentException("In the JsonResponse, data can't be empty");
        } else if (isFull && TextUtils.isEmpty(getFullData())) {
            throw new IllegalArgumentException("In the JsonResponse, Ful data can't be empty");
        }
        T object = null;
        if (isFull && TextUtils.isEmpty(getData())) {
            try {
                return (T) Class.forName(clazz.getName()).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            final Gson gson = new Gson();
            object = gson.fromJson(isFull ? getFullData() : getData(), clazz);
        }
        return object;
    }
}
