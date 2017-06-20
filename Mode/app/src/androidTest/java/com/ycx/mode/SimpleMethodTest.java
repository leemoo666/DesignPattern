package com.ycx.mode;

import android.support.test.runner.AndroidJUnit4;

import com.ycx.mode.simplemethod.Factory;
import com.ycx.mode.simplemethod.Sender;
import com.ycx.mode.simplemethod.factory.MailFactory;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class SimpleMethodTest {

    /**
     * 简单工厂方法
     */
    @Test
    public void testSimple() throws Exception {
        Factory factory = new MailFactory();
        Sender sender = factory.produce();
        sender.send("哈哈");
    }

}
