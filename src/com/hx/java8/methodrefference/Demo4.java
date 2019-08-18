package com.hx.java8.methodrefference;
import com.hx.java8.model.Apple;
import java.util.function.Function;

/**
 * 通过类来调用实例方法  getColor是Apple实例的方法,可以这样调用Apple::getColor
 *
 * @author jxlgcmh
 * @date 2019-08-15 16:25
 */
public class Demo4 {
    public static void main(String[] args) {
        Apple apple =new Apple(1,"red");
        Function<Apple,String> function = Apple::getColor;
        String apply = function.apply(apple);
        System.out.println(apply);
    }
}
