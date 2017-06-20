package com.ycx.mode;

import android.support.test.runner.AndroidJUnit4;

import com.ycx.mode.chain.AndroidProgrammer;
import com.ycx.mode.chain.ILeader;
import com.ycx.mode.chain.LeaderBoss;
import com.ycx.mode.chain.LeaderDirector;
import com.ycx.mode.chain.LeaderGroup;
import com.ycx.mode.chain.LeaderManager;
import com.ycx.mode.simple.Sender;
import com.ycx.mode.simple.mult.MultSenderFactory;
import com.ycx.mode.simple.simple.SimpleSenderFactory;
import com.ycx.mode.simple.statics.StaticSenderFactory;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ChainTest {

    /**
     * 責任鏈模式
     */
    @Test
    public void testSimple() throws Exception {
        AndroidProgrammer programApe = new AndroidProgrammer(6000);
        //小组长
        ILeader group = new LeaderGroup();
        //项目主管
        ILeader director = new LeaderDirector();
        //项目经理
        ILeader manager = new LeaderManager();
        //大老板
        ILeader boss = new LeaderBoss();


        group.setLeader(director);
        director.setLeader(manager);
        manager.setLeader(boss);

        // 处理申请
        group.handleRequest(programApe);

    }

}
