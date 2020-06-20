package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 夜寻忆 on 2020/6/20.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More mroe;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
