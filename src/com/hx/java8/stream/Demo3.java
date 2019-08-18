package com.hx.java8.stream;

import com.hx.java8.model.Apple;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 映射操作
 *
 * @author jxlgcmh
 * @date 2019-08-15 18:51
 */
public class Demo3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.stream().map(s -> s.toUpperCase()).forEach(System.out::println);

        List<Apple> apples =new ArrayList<>();
        apples.add(new Apple(5,"red1"));
        apples.add(new Apple(6,"red2"));
        apples.add(new Apple(7,"red3"));
        apples.add(new Apple(8,"red4"));
        apples.add(new Apple(8,"red4"));
        //Stream<String> stringStream = apples.stream().map(Apple::getColor);
        Stream<Double> doubleStream = apples.stream().map(apple -> apple.getM());
        doubleStream.filter(w -> w > 7).forEach(System.out::println);

        // flatMap相当于addAll  map相当于add

       // Character[] characters ={'a','b','c'};
        List<String> stringList = Arrays.asList("a","b");
        String s ="hello";
        Stream<Character> characterStream = stringList.stream().flatMap(Demo3::getCharStream);
        characterStream.forEach(System.out::println);


    }

    public static Stream<Character> getCharStream(String string) {
        List<Character> list =new ArrayList<>();
        char[] chars = string.toCharArray();
        for (char item : chars) {
            list.add(item);
        }
        return  list.stream();
    }
}
