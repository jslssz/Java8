package com.hx.java8.finished;

import com.hx.java8.model.Apple;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author jxlgcmh
 * @date 2019-08-15 21:17
 */
public class Demo3 {
    public static void main(String[] args) {
        List<Apple> list =new ArrayList<>();
        list.add(new Apple(5,"red1"));
        list.add(new Apple(6,"red2"));
        list.add(new Apple(7,"red3"));
        list.add(new Apple(8,"red4"));

        Optional<Double> result = list.stream().map(Apple::getM).reduce(Double::sum);
        System.out.println(result);

        Optional<Double> reduce = list.stream().map(Apple::getM).reduce((e1, e2) -> e1 + e2);
        System.out.println(reduce);
    }
}
