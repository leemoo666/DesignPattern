package com.ycx.mode.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by 李小明 on 17/6/9.
 * 邮箱:287907160@qq.com
 */

public abstract class AbsSubject implements Subject {

    private Vector<Observer> vector = new Vector<>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObserver() {
        Enumeration<Observer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            enumeration.nextElement().update();
        }
    }

}
