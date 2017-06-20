package com.ycx.mode.chain;

import android.util.Log;

/**
 * Created by 李小明 on 17/6/9.
 * 邮箱:287907160@qq.com
 */

public class LeaderBoss extends ILeader {
    public LeaderBoss() {
        super(40000);
    }

    @Override
    protected void reply(IProgrammer ape) {
        Log.i("lxm",ape.getApply());
        Log.i("lxm","Boss: Of course Yes!");
    }

}
