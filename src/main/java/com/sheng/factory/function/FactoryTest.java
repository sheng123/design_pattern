package com.sheng.factory.function;

/**
 * Created by sheng on 14/11/2018
 *
 * @author sheng
 */
public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new MengniuFactory();

        System.out.println(factory.getMilk());
    }
}
