package com.rs.ys.mvpdemo;

import com.rs.ys.mvpdemo.basics.BasicsResponse;

import java.util.List;

import okhttp3.ResponseBody;

/**
 * Created by 谢岳峰 on 2018/8/28.
 */
public class WeatherRp extends BasicsResponse {

    /**
     * data : {"yesterday":{"date":"27日星期一","high":"高温 30℃","fx":"东南风","low":"低温 22℃","fl":"<![CDATA[<3级]]>","type":"阴"},"city":"北京","aqi":"56","forecast":[{"date":"28日星期二","high":"高温 30℃","fengli":"<![CDATA[<3级]]>","low":"低温 22℃","fengxiang":"北风","type":"多云"},{"date":"29日星期三","high":"高温 31℃","fengli":"<![CDATA[<3级]]>","low":"低温 20℃","fengxiang":"东北风","type":"晴"},{"date":"30日星期四","high":"高温 28℃","fengli":"<![CDATA[<3级]]>","low":"低温 20℃","fengxiang":"北风","type":"多云"},{"date":"31日星期五","high":"高温 27℃","fengli":"<![CDATA[<3级]]>","low":"低温 21℃","fengxiang":"西南风","type":"阴"},{"date":"1日星期六","high":"高温 27℃","fengli":"<![CDATA[<3级]]>","low":"低温 19℃","fengxiang":"西南风","type":"多云"}],"ganmao":"各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。","wendu":"29"}
     */

    private DataBean data;

    public WeatherRp(ResponseBody responseBody, boolean showMsg) {
        super(responseBody, showMsg);
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * yesterday : {"date":"27日星期一","high":"高温 30℃","fx":"东南风","low":"低温 22℃","fl":"<![CDATA[<3级]]>","type":"阴"}
         * city : 北京
         * aqi : 56
         * forecast : [{"date":"28日星期二","high":"高温 30℃","fengli":"<![CDATA[<3级]]>","low":"低温 22℃","fengxiang":"北风","type":"多云"},{"date":"29日星期三","high":"高温 31℃","fengli":"<![CDATA[<3级]]>","low":"低温 20℃","fengxiang":"东北风","type":"晴"},{"date":"30日星期四","high":"高温 28℃","fengli":"<![CDATA[<3级]]>","low":"低温 20℃","fengxiang":"北风","type":"多云"},{"date":"31日星期五","high":"高温 27℃","fengli":"<![CDATA[<3级]]>","low":"低温 21℃","fengxiang":"西南风","type":"阴"},{"date":"1日星期六","high":"高温 27℃","fengli":"<![CDATA[<3级]]>","low":"低温 19℃","fengxiang":"西南风","type":"多云"}]
         * ganmao : 各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。
         * wendu : 29
         */

        private YesterdayBean yesterday;
        private String city;
        private String aqi;
        private String ganmao;
        private String wendu;
        private List<ForecastBean> forecast;

        public YesterdayBean getYesterday() {
            return yesterday;
        }

        public void setYesterday(YesterdayBean yesterday) {
            this.yesterday = yesterday;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getAqi() {
            return aqi;
        }

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public String getGanmao() {
            return ganmao;
        }

        public void setGanmao(String ganmao) {
            this.ganmao = ganmao;
        }

        public String getWendu() {
            return wendu;
        }

        public void setWendu(String wendu) {
            this.wendu = wendu;
        }

        public List<ForecastBean> getForecast() {
            return forecast;
        }

        public void setForecast(List<ForecastBean> forecast) {
            this.forecast = forecast;
        }

        public static class YesterdayBean {
            /**
             * date : 27日星期一
             * high : 高温 30℃
             * fx : 东南风
             * low : 低温 22℃
             * fl : <![CDATA[<3级]]>
             * type : 阴
             */

            private String date;
            private String high;
            private String fx;
            private String low;
            private String fl;
            private String type;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getFx() {
                return fx;
            }

            public void setFx(String fx) {
                this.fx = fx;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ForecastBean {
            /**
             * date : 28日星期二
             * high : 高温 30℃
             * fengli : <![CDATA[<3级]]>
             * low : 低温 22℃
             * fengxiang : 北风
             * type : 多云
             */

            private String date;
            private String high;
            private String fengli;
            private String low;
            private String fengxiang;
            private String type;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getFengli() {
                return fengli;
            }

            public void setFengli(String fengli) {
                this.fengli = fengli;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getFengxiang() {
                return fengxiang;
            }

            public void setFengxiang(String fengxiang) {
                this.fengxiang = fengxiang;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }
}
