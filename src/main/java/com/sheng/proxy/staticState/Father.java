package com.sheng.proxy.staticState;

/**
 * Created by sheng on 22/11/2018
 *
 * @author sheng
 */
public class Father implements Person {

    private Son son = new Son();

    public void findLove() {
        System.out.println("匹配家庭条件");
        son.findLove();
        System.out.println("匹配成功");

    }
}
