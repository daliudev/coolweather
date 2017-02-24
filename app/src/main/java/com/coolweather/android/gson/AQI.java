package com.coolweather.android.gson;

/**
 * Created by liujian2014 on 2017/2/23.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
