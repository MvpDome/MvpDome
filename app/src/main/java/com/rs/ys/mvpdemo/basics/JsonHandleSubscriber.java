package com.rs.ys.mvpdemo.basics;

import com.rs.ys.mvpdemo.Response;

import java.io.IOException;

import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;
import okhttp3.ResponseBody;

/**
 * Created by 谢岳峰 on 2018/9/7.
 */
public abstract class JsonHandleSubscriber extends ErrorHandleSubscriber<Response> {
    public JsonHandleSubscriber(RxErrorHandler rxErrorHandler) {
        super(rxErrorHandler);
    }

    @Override
    public void onNext(Response response) {
        if (response != null) {
            try {
                final ResponseBody responseBody = response.responseBody;
                final String json = responseBody.string();
                final JsonResponse jsonResponse = JsonResponse.getResponse(json, response.isShowToast);
                if (jsonResponse.getCode() == 0) {
                    onSuccess(jsonResponse);
                } else {
                    onDefinedError(jsonResponse.getCode());
                }
            } catch (IOException e) {
                e.printStackTrace();
                onError(null);
            }
        }
    }

    public abstract void onSuccess(JsonResponse response);

    public void onDefinedError(int code){}
}
