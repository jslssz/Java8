package com.hx.java8.lambda;

import java.util.Comparator;

/**
 *  省略参数
 * @author jxlgcmh
 * @date 2019-08-15 15:23
 */
public class Demo5 {
    public static void main(String[] args) {
        Comparator<Integer> comparator  = Integer::compare;
    }
}
