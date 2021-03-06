package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 夜寻忆 on 2020/6/20.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;//市
    private int cityCode;//市的代号
    private int provinceId;//所属省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
