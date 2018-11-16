package com.sheng.singleton;

import com.sheng.singleton.hungry.SingletonHungry;
import com.sheng.singleton.lazy.SingletonLazy;

import java.util.concurrent.CountDownLatch;

/**
 * Created by sheng on 16/11/2018
 *
 * @author sheng
 */
public class SingletonTest {

    public static void main(String[] args) {
        int count = 20;

        final CountDownLatch latch = new CountDownLatch(count);

        for (int i = 0 ; i < 100; i++) {
            new Thread() {

                @Override
                public void run() {
                    try {
                        latch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    SingletonLazy singletonLazy = SingletonLazy.getInstance();
                    System.out.println(singletonLazy);
                }
            }.start();

            latch.countDown();
        }
    }
}
