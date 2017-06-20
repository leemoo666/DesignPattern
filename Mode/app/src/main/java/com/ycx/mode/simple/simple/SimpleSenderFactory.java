package com.ycx.mode.simple.simple;

import com.ycx.mode.simple.MailSendImpl;
import com.ycx.mode.simple.Sender;
import com.ycx.mode.simple.SmsSendImpl;

/**
 * Created by 李小明 on 17/6/8.
 * 邮箱:287907160@qq.com
 */

public class SimpleSenderFactory {

    public static final int MAIL_TYPE = 0;
    public static final int SMS_TYPE = 1;

    public Sender produce(int type) {
        switch (type) {
            case MAIL_TYPE:
                return new MailSendImpl();
            case SMS_TYPE:
                return new SmsSendImpl();
        }

        return null;
    }

}
