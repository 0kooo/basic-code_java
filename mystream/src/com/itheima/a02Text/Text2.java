package com.itheima.a02Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Text2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"zhangsna,23","lisi,24","wangwu,25");
        Map<String, Integer> newList = list.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {

                        return s.split(",")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split(",")[1]);
                    }
                }));
        System.out.println(newList);
    }
}
