package com.hx.java8.stream;

import com.hx.java8.model.Apple;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 创建流的方式:
 * @author jxlgcmh
 * @date 2019-08-15 17:19
 */
public class Demo1 {
    public static void main(String[] args) {
        List<Apple> list =new ArrayList<>();
        list.add(new Apple(5,"red1"));
        list.add(new Apple(6,"red2"));
        list.add(new Apple(7,"red3"));
        list.add(new Apple(8,"red4"));
        // 返回顺序流
        Stream<Apple> stream = list.stream();

        //返回并行流
        Stream<Apple> appleStream = list.parallelStream();

        // 同样返回一个流
        IntStream stream1 = Arrays.stream(new int[]{1, 3, 5, 7, 9});

        // 通过调用静态方法的方式调用
        Stream<Integer> stream2 = Stream.of(1,3,5,7,9);

        //迭代的方式,无限流,通过添加limit的方式限流
        Stream.iterate(0,t -> t+2).limit(10).forEach(System.out::println);

        // 生成的方式
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }
}
