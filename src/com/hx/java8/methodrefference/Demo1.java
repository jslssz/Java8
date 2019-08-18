package com.hx.java8.methodrefference;

import com.hx.java8.model.Apple;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author jxlgcmh
 * @date 2019-08-15 16:06
 */
public class Demo1 {
    public static void main(String[] args) {
        List<Apple> list =new ArrayList<>();
        list.add(new Apple(5,"red1"));
        list.add(new Apple(6,"red2"));
        list.add(new Apple(7,"red3"));
        list.add(new Apple(8,"red4"));

        for (Apple apple : list) {
            Supplier<String> supplier = apple::getColor;
            System.out.println(supplier.get());
        }
    }
}
