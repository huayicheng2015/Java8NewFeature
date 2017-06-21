package com.hyc.java8.interf;

/**
 * Created on 2017/6/20 15:01
 *
 * @author Administrator
 */
public interface Defaulable {
    default String returnString() {
        return "It is default";
    }
}
