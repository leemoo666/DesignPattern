package com.ycx.mode.chain;

/**
 * Created by 李小明 on 17/6/9.
 * 邮箱:287907160@qq.com
 */

public interface IProgrammer {

    /**
     * 获取程序员具体的差旅费用
     *
     * @return 要多少钱
     */
    int getExpenses();

    /**
     * 获取差旅费申请
     *
     * @return Just a request
     */
    String getApply();

}
