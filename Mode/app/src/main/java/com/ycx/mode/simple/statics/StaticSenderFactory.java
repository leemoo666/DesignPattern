package com.ycx.mode.simple.statics;


import com.ycx.mode.simple.MailSendImpl;
import com.ycx.mode.simple.Sender;
import com.ycx.mode.simple.SmsSendImpl;

/**
 * Created by 李小明 on 17/6/8.
 * 邮箱:287907160@qq.com
 */

public class StaticSenderFactory {


    public static Sender prduceMail() {
        return new MailSendImpl();
    }

    public static Sender produceSms() {
        return new SmsSendImpl();
    }

}
