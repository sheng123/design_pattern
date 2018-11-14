package com.sheng.factory.simple;

import com.sheng.factory.Mengniu;
import com.sheng.factory.Milk;
import com.sheng.factory.Yili;

/**
 * Created by sheng on 14/11/2018
 *
 * @author sheng
 */
public class SimpleFactory {

    public Milk getMilk(String type) {
        if ("蒙牛".equals(type)) {
            return new Mengniu();
        } else if ("伊利".equals(type)) {
            return new Yili();
        } else {
            System.out.println("不支持的产品");
            return null;
        }
    }
}
