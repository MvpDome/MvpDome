package com.rs.ys.mvpdemo;

import java.util.Map;
import java.util.Observable;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/**
 * Created by 谢岳峰 on 2018/8/28.
 */
public interface Api {
    String APP_DOMAIN = "";
    int RequestSuccess = 0;
    @FormUrlEncoded
    @POST
    io.reactivex.Observable<ResponseBody> requestPOST( @Url String url,@FieldMap Map<String ,Object> map);
    @GET
    io.reactivex.Observable<ResponseBody> requestGet(@Url String url,@QueryMap Map<String ,Object> map);
}
