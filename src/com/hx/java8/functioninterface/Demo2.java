package com.hx.java8.functioninterface;

import java.util.function.Supplier;

/**
 * @author jxlgcmh
 * @date 2019-08-15 15:50
 */
public class Demo2 {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "hello";
    }
}
