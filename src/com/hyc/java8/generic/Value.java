package com.hyc.java8.generic;

/**
 * Created on 2017/6/20 16:42
 *
 * @author Administrator
 */
public class Value<T> {
    public static <T> T defaultValue() {
        return null;
    }

    public T getOrDefault(T value, T defaultValue) {
        return value == null ? defaultValue : value;
    }
}
