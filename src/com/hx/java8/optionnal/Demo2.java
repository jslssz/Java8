package com.hx.java8.optionnal;

import java.util.Optional;

/**
 * @author jxlgcmh
 * @date 2019-08-15 21:34
 */
public class Demo2 {
    public static void main(String[] args) {
        String string ="hello world";
        Optional<String> optional = Optional.of(string);
        String s = optional.get();
        System.out.println(s);
    }
}
