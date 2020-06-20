package com.coolweather.android.gson;

/**
 * Created by 夜寻忆 on 2020/6/20.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
