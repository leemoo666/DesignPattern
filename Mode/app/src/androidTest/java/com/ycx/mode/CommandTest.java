package com.ycx.mode;

import android.support.test.runner.AndroidJUnit4;

import com.ycx.mode.chain.AndroidProgrammer;
import com.ycx.mode.chain.ILeader;
import com.ycx.mode.chain.LeaderBoss;
import com.ycx.mode.chain.LeaderDirector;
import com.ycx.mode.chain.LeaderGroup;
import com.ycx.mode.chain.LeaderManager;
import com.ycx.mode.command.Command;
import com.ycx.mode.command.Invoker;
import com.ycx.mode.command.MyCommand;
import com.ycx.mode.command.Receiver;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class CommandTest {

    /**
     * 責任鏈模式
     */
    @Test
    public void testSimple() throws Exception {

        Receiver receiver = new Receiver();

        Command command = new MyCommand(receiver);

        Invoker invoker = new Invoker(command);
        invoker.action();

    }

}
