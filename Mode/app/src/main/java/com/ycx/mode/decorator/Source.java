package com.ycx.mode.decorator;

import android.util.Log;

/**
 * Created by 李小明 on 17/6/9.
 * 邮箱:287907160@qq.com
 */

public class Source implements Sourceable {
    @Override
    public void method() {
        Log.i("lxm", "source method");
    }
}
