package com.sheng.factory.abstr;

/**
 * Created by sheng on 14/11/2018
 *
 * @author sheng
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactoryImpl abstractFactory = new AbstractFactoryImpl();

        System.out.println(abstractFactory.getMengniu());
    }
}
