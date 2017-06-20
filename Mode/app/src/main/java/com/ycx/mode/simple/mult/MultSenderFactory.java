package com.ycx.mode.simple.mult;


import com.ycx.mode.simple.MailSendImpl;
import com.ycx.mode.simple.Sender;
import com.ycx.mode.simple.SmsSendImpl;

/**
 * Created by 李小明 on 17/6/8.
 * 邮箱:287907160@qq.com
 */

public class MultSenderFactory {


    public Sender prduceMail() {
        return new MailSendImpl();
    }

    public Sender produceSms() {
        return new SmsSendImpl();
    }

}
