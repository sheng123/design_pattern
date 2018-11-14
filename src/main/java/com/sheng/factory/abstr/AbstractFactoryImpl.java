package com.sheng.factory.abstr;

import com.sheng.factory.Mengniu;
import com.sheng.factory.Milk;
import com.sheng.factory.Yili;
import com.sheng.factory.function.MengniuFactory;
import com.sheng.factory.function.YiFactory;

/**
 * Created by sheng on 14/11/2018
 *
 * @author sheng
 */
public class AbstractFactoryImpl extends AbstractFactory {
    Milk getMengniu() {
        return new MengniuFactory().getMilk();
    }

    Milk getYili() {
        return new YiFactory().getMilk();
    }
}
