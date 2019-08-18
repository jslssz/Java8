package com.hx.java8.lambda;

/**
 * 情况1:无参无返回值
 * @author jxlgcmh
 * @date 2019-08-15 15:21
 */
public class Demo1 {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("hash");
        runnable.run();
    }
}
