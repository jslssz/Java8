package com.hx.java8.stream;

import com.hx.java8.model.Apple;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 中间操作
 * @author jxlgcmh
 * @date 2019-08-15 17:39
 */
public class Demo2 {
    public static void main(String[] args) {
        List<Apple> list =new ArrayList<>();
        list.add(new Apple(5,"red1"));
        list.add(new Apple(6,"red2"));
        list.add(new Apple(7,"red3"));
        list.add(new Apple(8,"red4"));
        list.add(new Apple(8,"red4"));
        // 返回顺序流
        Stream<Apple> stream = list.stream();
        //
       // stream.filter(apple -> apple.getM() <7).forEach(System.out::println);
        // 特别的,一旦截断,将不能再使用这个流做其他操作,否则报非法
        // 截断
//        stream.limit(3).forEach(System.out::println);
        // 跳过前三个
//        stream.skip(3).forEach(System.out::println);
        // 筛选,自动去重,重写hashcode方法
        //stream.distinct().forEach(System.out::println);



    }
}
