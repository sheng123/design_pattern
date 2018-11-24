package com.sheng.proxy.dynamicProxy;

import com.sheng.proxy.staticProxy.Person;
import com.sheng.proxy.staticProxy.Son;

import java.lang.reflect.Proxy;

/**
 * Created by sheng on 24/11/2018
 *
 * @author sheng
 */
public class SimpleDynamicProxy {

    private static void consumer(Person person) {
        person.findLove();
    }

    public static void main(String[] args) {

        Person person = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class[]{Person.class}, new DynamicProxyHandler(new Son()));
        consumer(person);
    }
}
