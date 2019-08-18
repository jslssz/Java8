package com.hx.java8.optionnal;

import java.util.Optional;

/**
 * @author jxlgcmh
 * @date 2019-08-15 21:34
 */
public class Demo1 {
    public static void main(String[] args) {
        Object o =new Object();
        o=null;
        Optional<Object> o1 = Optional.of(o);
        Object o2 = o1.orElse(new Object());
        System.out.println(o2);
    }
}
