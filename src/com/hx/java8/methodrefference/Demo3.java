package com.hx.java8.methodrefference;

import java.util.function.Function;

/**
 *
 * @author jxlgcmh
 * @date 2019-08-15 16:25
 */
public class Demo3 {
    public static void main(String[] args) {

        /**
         *  @param <T> the type of the input to the function
         *  @param <R> the type of the result of the function
         */

        // 四舍五入
        Function<Double, Long> function = Math::round;
        Long apply = function.apply(15.6);
        System.out.println(apply);
    }
}
