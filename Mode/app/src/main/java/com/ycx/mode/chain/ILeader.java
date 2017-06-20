package com.ycx.mode.chain;

/**
 * Created by 李小明 on 17/6/9.
 * 邮箱:287907160@qq.com
 */

public abstract class ILeader {
    private int price;// 当前领导能批复的金额
    private ILeader mSuperiorILeader;// 上级领导

    public ILeader(int price) {
        this.price = price;
    }

    /**
     * 为当前领导设置一个上级领导
     *
     * @param superiorILeader
     *            上级领导
     */
    public void setLeader(ILeader superiorILeader) {
        this.mSuperiorILeader = superiorILeader;
    }


    /**
     * 回应程序猿
     *
     * @param ape 具体的程序猿
     */
    protected abstract void reply(IProgrammer ape);

    /**
     * 处理请求
     *
     * @param ape 具体的程序猿
     */
    public void handleRequest(IProgrammer ape) {
        if (ape.getExpenses() <= price) {
            // 那么就由当前领导批复即可
            reply(ape);
        } else {
            if (null != mSuperiorILeader) {
                mSuperiorILeader.handleRequest(ape);
            } else {
                // 没有上级的话就批复不了老……不过在这个场景中总会有领导批复的淡定
                System.out.println("Goodbye my money......");
            }
        }
    }
}
