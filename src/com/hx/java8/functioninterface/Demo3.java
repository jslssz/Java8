package com.hx.java8.functioninterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author jxlgcmh
 * @date 2019-08-15 15:50
 */
public class Demo3 {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("hello");
        list.add("how");
        list.add("are");
        List<String> filter = filter(list, item -> item.contains("h"));
        System.out.println(filter);
    }

    public static List<String> filter(List<String> arrayList, Predicate<String> predicate) {
        List<String> list =new ArrayList<>();
        for (String item : arrayList) {
            if (predicate.test(item)) {
                list.add(item);
            }
        }
        return list;
    }
}
