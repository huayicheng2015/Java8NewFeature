package com.hyc.java8.annotation;

import java.lang.annotation.*;

/**
 * Created on 2017/6/20 16:20
 *
 * @author Administrator
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Filters.class)
public @interface Filter {
    String value();
}
