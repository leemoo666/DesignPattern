package com.ycx.mode.adapter.object;

import android.util.Log;

import com.ycx.mode.adapter.Source;
import com.ycx.mode.adapter.Target;

/**
 * Created by 李小明 on 17/6/9.
 * 邮箱:287907160@qq.com
 */

public class Adapter implements Target {
    @Override
    public void method1() {
        new Source().method1();
    }

    @Override
    public void method2() {
        Log.i("lxm", "adapter method2");
    }
}
