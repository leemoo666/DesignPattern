package com.ycx.mode.observer;

import android.util.Log;

/**
 * Created by 李小明 on 17/6/9.
 * 邮箱:287907160@qq.com
 */

public class ObserverTwo implements Observer {
    @Override
    public void update() {
        Log.i("lxm", "ObserverTwo update");
    }
}
