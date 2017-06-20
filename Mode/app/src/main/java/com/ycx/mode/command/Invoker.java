package com.ycx.mode.command;

/**
 * Created by 李小明 on 17/6/9.
 * 邮箱:287907160@qq.com
 */

public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.exe();
    }
}
