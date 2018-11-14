package com.sheng.factory.abstr;

import com.sheng.factory.Mengniu;
import com.sheng.factory.Milk;
import com.sheng.factory.Yili;

/**
 * Created by sheng on 14/11/2018
 *
 * @author sheng
 */
public abstract class AbstractFactory {

    abstract Milk getMengniu();

    abstract Milk getYili();
}
