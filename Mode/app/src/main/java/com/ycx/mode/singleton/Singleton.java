package com.ycx.mode.singleton;

/**
 * Created by 李小明 on 17/6/9.
 * 邮箱:287907160@qq.com
 * <p>
 * <p>
 * 这个类可以满足基本要求,但是毫无线程安全
 *
 *
 * 在Java指令中创建对象和赋值操作是分开进行的
 *
 */

public class Singleton {

    //持有私有静态实例,防止被引用
    private static Singleton instance = null;

    //私有化构造方法,防止被实例化
    private Singleton() {
    }

    //静态工程方法,创建实例

    public static Singleton getInstance() {

        if (instance == null) {
            synchronized (instance) {
                instance = new Singleton();
            }
        }
        return instance;

    }


}
