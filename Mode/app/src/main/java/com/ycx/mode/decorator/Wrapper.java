package com.ycx.mode.decorator;

import android.util.Log;

/**
 * Created by 李小明 on 17/6/9.
 * 邮箱:287907160@qq.com
 */

public class Wrapper implements Sourceable {

    private Source source;

    public Wrapper(Source source) {
        this.source = source;
    }

    @Override
    public void method() {
        Log.i("lxm", "before");
        source.method();
        Log.i("lxm", "after");
    }
}
