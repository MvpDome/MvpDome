package com.rs.ys.mvpdemo;

import com.rs.ys.mvpdemo.basics.BasicsResponse;
import com.rs.ys.mvpdemo.utils.Params;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
public interface IView extends Params{
    public void callBack(BasicsResponse response, int tag, Object obj);

}
