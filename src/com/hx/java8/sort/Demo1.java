package com.hx.java8.sort;
import com.hx.java8.model.Apple;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author jxlgcmh
 * @date 2019-08-15 20:42
 */
public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 2, 6, 7);
        list.stream().sorted().forEach(System.out::println);

        List<Apple> list2 =new ArrayList<>();
        list2.add(new Apple(55,"red1"));
        list2.add(new Apple(65,"red2"));
        list2.add(new Apple(47,"red3"));
        list2.add(new Apple(83,"red4"));
//        list2.stream().sorted((e1,e2) -> Double.compare(e1.getM(),e2.getM())).forEach(System.out::println);
        list2.stream().sorted(Comparator.comparingDouble(Apple::getM)).forEach(System.out::println);


    }
}
