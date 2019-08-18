package com.hx.java8.methodrefference;

import java.util.Comparator;

/**
 * 通过类名调用方法引用
 * @author jxlgcmh
 * @date 2019-08-15 16:25
 */
public class Demo2 {
    public static void main(String[] args) {
        Comparator<Integer> comparator = Integer::compareTo;
    }
}
