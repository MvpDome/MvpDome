package com.rs.ys.mvpdemo;

import java.util.LinkedHashMap;

/**
 * Created by 谢岳峰 on 2018/8/28.
 */
public class WeatherRq extends BasicsRequest {

    private String city;

    public WeatherRq(String city) {
        this.city = city;
    }

    @Override
    public String getRequestUrl() {
        return "weather_mini";
    }

    @Override
    public LinkedHashMap<String, String> getMapParams() {
        LinkedHashMap<String, String> params = new LinkedHashMap<>();

        return null;
    }
}
