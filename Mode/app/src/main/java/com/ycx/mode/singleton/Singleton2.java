package com.ycx.mode.singleton;

/**
 * Created by 李小明 on 17/6/9.
 * 邮箱:287907160@qq.com
 */

public class Singleton2 {

    //持有私有静态实例,防止被引用
    private static Singleton2 instance = new Singleton2();

    //私有化构造方法,防止被实例化
    private Singleton2() {
    }

    //静态工程方法,创建实例
    public static Singleton2 getInstance() {
        return instance;
    }


}
