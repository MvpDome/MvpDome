package com.rs.ys.mvpdemo;

import com.rs.ys.mvpdemo.basics.BasicsResponse;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
public interface IView {
    void showLoading();
    void hideLoading();
     <R extends BasicsResponse> void callBack(R  r, int tag, Object e);
}
