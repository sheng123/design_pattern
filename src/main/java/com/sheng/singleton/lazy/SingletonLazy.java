package com.sheng.singleton.lazy;

/**
 * Created by sheng on 16/11/2018
 *
 * @author sheng
 */
public class SingletonLazy {

    private SingletonLazy() {}

    private static SingletonLazy singletonLazy;

    public static  SingletonLazy getInstance() {
        if (singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }

        return singletonLazy;
    }
}
