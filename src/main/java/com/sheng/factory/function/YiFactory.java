package com.sheng.factory.function;

import com.sheng.factory.Milk;
import com.sheng.factory.Yili;

/**
 * Created by sheng on 14/11/2018
 *
 * @author sheng
 */
public class YiFactory implements Factory {
    public Yili getMilk() {
        return new Yili();
    }
}
