package com.sheng.singleton.hungry;

/**
 * Created by sheng on 16/11/2018
 *
 * @author sheng
 */
public class SingletonHungry {

    private SingletonHungry() {}

    private static final SingletonHungry singletonHungry = new SingletonHungry();

    public static SingletonHungry getInstance() {
        return singletonHungry;
    }
}
