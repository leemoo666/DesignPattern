package com.ycx.mode;

import android.support.test.runner.AndroidJUnit4;

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
public class SimpleTest {

    /**
     * 简单工厂方法
     */
    @Test
    public void testSimple() throws Exception {
        SimpleSenderFactory factory = new SimpleSenderFactory();
        Sender sender = factory.produce(SimpleSenderFactory.MAIL_TYPE);
        sender.send("simple");
    }

    /**
     * 多方法的简单工厂方法
     */
    @Test
    public void testMultSimple() throws Exception {
        MultSenderFactory factory = new MultSenderFactory();
        Sender sender = factory.prduceMail();
        sender.send("mult");
    }

    /**
     * 多静态方法的简单工厂方法
     */
    @Test
    public void testStaticSimple() throws Exception {
        Sender sender = StaticSenderFactory.prduceMail();
        sender.send("static");
    }

}
