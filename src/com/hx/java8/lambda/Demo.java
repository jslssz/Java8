package com.hx.java8.lambda;

import java.util.Comparator;

/**
 * @author jxlgcmh
 * @date 2019-08-15 15:08
 */
public class Demo {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("hhhh");
        runnable.run();
        /**
         * 这种事方法引用
         */
        Comparator<Integer> comparator  = Integer::compare;
        int compare = comparator.compare(1, 2);
        System.out.println(compare);


    }
}
