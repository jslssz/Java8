package com.hx.java8.optionnal;

import java.util.Optional;

/**
 * @author jxlgcmh
 * @date 2019-08-15 21:34
 */
public class Demo3 {
    public static void main(String[] args) {
        String string = "hello world";
        // string =null;
        Optional<String> optional = Optional.ofNullable(string);
        // 如果空  则返回 'hello hi'  ,否则返回 'hello world'
        String s = optional.orElse("hello hi");
        System.out.println(s);
    }
}
