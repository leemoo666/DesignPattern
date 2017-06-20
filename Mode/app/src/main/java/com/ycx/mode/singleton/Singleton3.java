package com.ycx.mode.singleton;

/**
 * Created by 李小明 on 17/6/9.
 * 邮箱:287907160@qq.com
 *
 * 静态内部类
 *
 * JVM 内部机制能够保证当一个类被加载的时候,这个类的加载过程是互斥的.
 * 这样当我们第一次调用getInstance的时候,JVM能帮我们保证instance只被创建一次.
 * 并且会保证把赋值给instance的内存初始化完毕
 *
 */

public class Singleton3 {

    //持有私有静态实例,防止被引用
    private static Singleton3 instance;

    //私有化构造方法,防止被实例化
    private Singleton3() {
    }

    //静态工程方法,创建实例
    public static Singleton3 getInstance() {
        return SingletonFactory.singleton3;
    }


    private static class SingletonFactory{
        private static Singleton3 singleton3 = new Singleton3();
    }

}
