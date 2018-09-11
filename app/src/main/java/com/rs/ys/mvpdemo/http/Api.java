package com.rs.ys.mvpdemo.http;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

/**
 * Created by 谢岳峰 on 2018/8/28.
 */
public interface Api {
    String APP_DOMAIN = "";
    int RequestSuccess = 0;

    @FormUrlEncoded
    @POST
    Observable<ResponseBody> postForm(@Url String url, @FieldMap Map<String, Object> map);

    @POST
    Observable<ResponseBody> postBody(@Url() String url, @Body RequestBody requestBody);

    @Multipart
    @POST()
    Observable<ResponseBody> uploadFiles(@Url() String url, @Part() List<MultipartBody.Part> parts);

    @GET
    Observable<ResponseBody> get(@Url String url, @QueryMap Map<String, Object> map);

    @GET("{url}?{json}")
    Observable<ResponseBody> get(@Path("url") String url, @Path("json") String json);

    @Streaming
    @GET()
    Observable<ResponseBody> downFile(@Url() String url, @QueryMap Map<String, Object> maps);
}
