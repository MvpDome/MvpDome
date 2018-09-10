package com.rs.ys.mvpdemo;

import com.rs.ys.mvpdemo.basics.BasicsRequest;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.ResponseBody;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
public interface IModel {
    Observable<ResponseBody> get(String actionHeader, Map<String, String> params);

    <T extends BasicsRequest> Observable<Response> get(T t);
}
