package com.ycx.mode.simplemethod.factory;

import com.ycx.mode.simplemethod.Factory;
import com.ycx.mode.simplemethod.MailSendImpl;
import com.ycx.mode.simplemethod.Sender;
import com.ycx.mode.simplemethod.SmsSendImpl;

/**
 * Created by 李小明 on 17/6/9.
 * 邮箱:287907160@qq.com
 */

public class SmsFactory implements Factory {
    @Override
    public Sender produce() {
        return new SmsSendImpl();
    }
}
