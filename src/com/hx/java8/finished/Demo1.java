package com.hx.java8.finished;

import com.hx.java8.model.Apple;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 终止操作
 *
 * @author jxlgcmh
 * @date 2019-08-15 20:50
 */
public class Demo1 {
    public static void main(String[] args) {
        // AllMatch  所有的都匹配
        List<Apple> list =new ArrayList<>();
        list.add(new Apple(5,"red1"));
        list.add(new Apple(6,"red2"));
        list.add(new Apple(7,"red3"));
        list.add(new Apple(8,"red4"));
        // 全部匹配
        boolean b = list.stream().allMatch(apple -> apple.getM() > 10);
        System.out.println(b);
        // 至少有一个匹配
        boolean b2 = list.stream().anyMatch(apple -> apple.getM() > 10);
        System.out.println(b2);

        // startWith  没有一个以r开头的颜色
        boolean r = list.stream().noneMatch(apple -> apple.getColor().startsWith("r"));
        System.out.println(r);

        // 返回第一个元素
        Optional<Apple> first = list.stream().findFirst();
        System.out.println(first);

        // 返回的还是第一个
        Optional<Apple> any = list.stream().findAny();
        System.out.println(any);
        // 使用并行流
        Optional<Apple> any2 = list.parallelStream().findAny();
        System.out.println(any2);

    }
}
