package com.sheng.factory.function;

import com.sheng.factory.Mengniu;

/**
 * Created by sheng on 14/11/2018
 *
 * @author sheng
 */
public class MengniuFactory implements Factory {
    public Mengniu getMilk() {
        return new Mengniu();
    }
}
