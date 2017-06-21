package com.hyc.java8.interf;

import java.util.function.Supplier;

/**
 * Created on 2017/6/20 15:06
 *
 * @author Administrator
 */
public interface DefaulableFactory {
    static Defaulable create(Supplier<Defaulable> supplier) {
        return supplier.get();
    }
}
