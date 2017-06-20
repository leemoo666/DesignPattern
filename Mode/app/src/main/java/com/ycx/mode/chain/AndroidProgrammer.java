package com.ycx.mode.chain;

/**
 * Created by 李小明 on 17/6/9.
 * 邮箱:287907160@qq.com
 */

public class AndroidProgrammer implements IProgrammer{

    private int price;
    public AndroidProgrammer(int price){
        this.price = price;
    }

    @Override
    public int getExpenses() {
        return price;
    }

    @Override
    public String getApply() {
        return "批复了";
    }
}
