package com.itheima.a02Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Text3 {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>();
        ArrayList<String> ladyList= new ArrayList<>();
        Collections.addAll(manList,"蔡坤坤,24","叶齁咸,23","刘不甜,22","伍仟,24","谷家,30","肖亮亮,27");
        Collections.addAll(ladyList,"赵小颖,35","杨颖,36","高媛媛,43","张天天,31","刘诗,35","杨小米,33");

        Stream<String> man = manList.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2);
        Stream<String> lady = ladyList.stream()
                .filter(s -> s.split(",")[0].startsWith("杨"))
                .skip(1);
        /*Stream.concat(man, lady).map(new Function<String, Actor>() {
            @Override
            public Actor apply(String s) {
                String name = s.split(",")[0];
                int age = Integer.parseInt(s.split(",")[1]);
                return new Actor(name, age);
            }
        }).forEach(s -> System.out.println(s));*/
        List<Actor> actorList = Stream.concat(man, lady)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());
        System.out.println(actorList);
    }
}
