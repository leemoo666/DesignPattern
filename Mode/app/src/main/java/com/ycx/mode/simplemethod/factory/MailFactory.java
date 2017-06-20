package com.ycx.mode.simplemethod.factory;

import com.ycx.mode.simplemethod.Factory;
import com.ycx.mode.simplemethod.MailSendImpl;
import com.ycx.mode.simplemethod.Sender;

/**
 * Created by 李小明 on 17/6/9.
 * 邮箱:287907160@qq.com
 */

public class MailFactory implements Factory {
    @Override
    public Sender produce() {
        return new MailSendImpl();
    }
}
