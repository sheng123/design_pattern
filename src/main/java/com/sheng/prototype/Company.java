package com.sheng.prototype;

import lombok.*;

import java.io.Serializable;

/**
 * Created by sheng on 17/11/2018
 *
 * @author sheng
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Company implements Cloneable, Serializable {

    private String name;
    private String address;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
