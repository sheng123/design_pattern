package com.sheng.factory.simple;

/**
 * Created by sheng on 14/11/2018
 *
 * @author sheng
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        System.out.println(simpleFactory.getMilk("蒙牛"));
    }
}
