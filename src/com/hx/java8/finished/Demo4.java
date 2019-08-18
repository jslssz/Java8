package com.hx.java8.finished;

import com.hx.java8.model.Apple;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author jxlgcmh
 * @date 2019-08-15 21:29
 */
public class Demo4 {
    public static void main(String[] args) {
        List<Apple> list =new ArrayList<>();
        list.add(new Apple(5,"red1"));
        list.add(new Apple(6,"red2"));
        list.add(new Apple(7,"red3"));
        list.add(new Apple(8,"red4"));

        List<Apple> collect = list.stream().filter(apple -> apple.getM() > 6).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
