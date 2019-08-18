package com.hx.java8.constructorrefference;

import com.hx.java8.model.Apple;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author jxlgcmh
 * @date 2019-08-15 16:48
 */
public class Demo1 {
    public static void main(String[] args) {
        // 用来构造对象
        Supplier<Apple> supplier = Apple::new;
        Apple apple = supplier.get();
        /**
         * 多个参数时需要使用BiFunction,注意参数间不会隐试转换
         */
        BiFunction<Double,String,Apple> supplier1 = Apple::new;
        Apple apple1 = supplier1.apply(1.0, "blue");
        System.out.println(apple);

        Function<Integer,String []> function = length -> new String[length];
        // 由此构造了一个数组
        String[] apply = function.apply(5);
    }
}
