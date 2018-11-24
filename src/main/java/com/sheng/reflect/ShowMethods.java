package com.sheng.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * Created by sheng on 24/11/2018
 *
 * @author sheng
 */
public class ShowMethods  {
    private static String usage = "usage:\n" + "ShowMethods qualified.class.name\n"
            + "To show all methods in class or:\n" + "ShowMethods qualified.class.name word\n"
            + "To search for methods involving word";

    private static Pattern p = Pattern.compile("\\w+\\.");

    public static void main(String[] args) {
        /*if (args.length < 1) {
            System.out.println(usage);
            System.exit(0);
        }*/

        int lines = 0;

        try {
            Class<?> clazz = Class.forName(args[0]);
            Method[] methods = clazz.getMethods();
            Constructor[] constructors = clazz.getConstructors();

            if (args.length == 1) {
                for (Method method : methods) {
                    System.out.println(p.matcher(method.toString()).replaceAll(""));
                }

                for (Constructor constructor : constructors) {
                    System.out.println(p.matcher(constructor.toString()).replaceAll(""));
                }

                lines = methods.length + constructors.length;
            } else {
                for (Method method : methods) {
                    if (method.toString().indexOf(args[1]) != -1) {
                        System.out.println(p.matcher(method.toString()).replaceAll(""));
                        lines ++;
                    }
                }

                for (Constructor constructor : constructors) {
                    if (constructor.toString().indexOf(args[1]) != -1) {
                        System.out.println(p.matcher(constructor.toString()).replaceAll(""));
                        lines ++;
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
