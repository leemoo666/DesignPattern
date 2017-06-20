package com.ycx.mode.adapter.clazz;

import android.util.Log;

import com.ycx.mode.adapter.Source;
import com.ycx.mode.adapter.Target;

/**
 * Created by 李小明 on 17/6/9.
 * 邮箱:287907160@qq.com
 */

public class Adapter extends Source implements Target {
    @Override
    public void method2() {
        Log.i("lxm", "adapter method2");
    }
}
