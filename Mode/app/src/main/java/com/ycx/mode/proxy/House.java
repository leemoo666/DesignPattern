package com.ycx.mode.proxy;

import android.util.Log;

/**
 * Created by 李小明 on 17/6/9.
 * 邮箱:287907160@qq.com
 */

public class House implements IHouse {

    private String name;
    private double price;

    public House(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void getHouseInfo() {
        Log.i("lxm","name = "+name);
    }

    @Override
    public void singConstract() {
        Log.i("lxm","房子信息 = "+name+"..價格 = "+price);
    }

    @Override
    public void payFees() {
        Log.i("lxm","price = "+price);
    }
}
