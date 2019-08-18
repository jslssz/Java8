package com.hx.java8.lambda;

import java.util.function.Consumer;

/**
 *  有一个参数
 * @author jxlgcmh
 * @date 2019-08-15 15:23
 */
public class Demo2 {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("谎言和誓言!");
    }
}
