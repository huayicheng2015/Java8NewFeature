package com.hyc.java8.interf.impl;

import com.hyc.java8.interf.Defaulable;

/**
 * Created on 2017/6/20 15:03
 *
 * @author Administrator
 */
public class OverrideDefaulable implements Defaulable {
    @Override
    public String returnString() {
        return "It is overridden";
    }
}
