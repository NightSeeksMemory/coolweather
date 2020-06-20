package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
/**
 * Created by 夜寻忆 on 2020/6/20.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
