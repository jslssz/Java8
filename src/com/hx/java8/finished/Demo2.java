package com.hx.java8.finished;


import com.hx.java8.model.Apple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author jxlgcmh
 * @date 2019-08-15 20:50
 */
public class Demo2 {
    public static void main(String[] args) {
        List<Apple> list =new ArrayList<>();
        list.add(new Apple(5,"red1"));
        list.add(new Apple(6,"red2"));
        list.add(new Apple(7,"red3"));
        list.add(new Apple(8,"red4"));
        // 统计记录数
        long sum = list.stream().filter(apple -> apple.getM() > 3).count();
        System.out.println(sum);
        // max  获取最大值
        Stream<Double> doubleStream = list.stream().map(apple -> apple.getM());
        Optional<Double> max = doubleStream.max(Double::compareTo);
        System.out.println(max);
        // 返回最小的  此时返回的是对象
        Optional<Apple> min = list.stream().min(Comparator.comparingDouble(Apple::getM));
        System.out.println(min);

        // forEach是内部迭代
    }
}
