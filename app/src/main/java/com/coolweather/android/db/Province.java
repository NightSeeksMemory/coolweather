package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 夜寻忆 on 2020/6/20.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;//省
    private int provinceCode;//代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
