package com.ycx.mode.proxy;

/**
 * Created by 李小明 on 17/6/9.
 * 邮箱:287907160@qq.com
 */

public class HouseProxy implements IHouse {

    private IHouse iHouse;

    public HouseProxy(IHouse house) {
        this.iHouse = house;
    }

    @Override
    public void getHouseInfo() {
        iHouse.getHouseInfo();
    }

    @Override
    public void singConstract() {
        iHouse.singConstract();
    }

    @Override
    public void payFees() {
        iHouse.payFees();
    }
}
