package com.hyc.java8;

import com.hyc.java8.annotation.Filter;
import com.hyc.java8.generic.Value;
import com.hyc.java8.interf.Defaulable;
import com.hyc.java8.interf.DefaulableFactory;
import com.hyc.java8.interf.Filtable;
import com.hyc.java8.interf.impl.NoOverrideDefaulable;
import com.hyc.java8.interf.impl.OverrideDefaulable;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Optional;

/**
 * Created on 2017/6/20 14:37
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        Arrays.asList("Hello", " ", "World").forEach(System.out::print);
        System.out.println();
        Defaulable defaulable = DefaulableFactory.create(NoOverrideDefaulable::new);
        System.out.println(defaulable.returnString());
        defaulable = DefaulableFactory.create(OverrideDefaulable::new);
        System.out.println(defaulable.returnString());
        Arrays.asList(Filtable.class.getAnnotationsByType(Filter.class)).forEach(item -> System.out.println(item.value()));
        final Value<String> strValue = new Value<>();
        System.out.println(strValue.getOrDefault("23", Value.defaultValue()));
        System.out.println(strValue.getOrDefault(null, Value.defaultValue()));
        Optional<String> name = Optional.of("Tom");
        System.out.println(name.isPresent());
        System.out.println(name.map(item -> "Hey " + name.get()).orElse("Hey Nothing"));
        final Clock clock = Clock.offset(Clock.systemDefaultZone(), Duration.ofHours(8L));
        System.out.println(clock.getZone() + " " + clock.instant());
        final LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
