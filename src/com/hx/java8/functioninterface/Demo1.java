package com.hx.java8.functioninterface;

import java.util.function.Consumer;

/**
 * @author jxlgcmh
 * @date 2019-08-15 15:48
 */
public class Demo1 {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
    }
}
