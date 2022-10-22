package com.itheima.a01mystream;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山","张良");
        //filter 过滤 把长开头的留下, 其余数据过滤不要
        /*list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张");
            }
        }).forEach(s -> System.out.println(s));*/

        //注意1: 中间方法, 返回新的Stream流, 原来的Stream流只能使用一次, 建议使用链式编程
        /*list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(s -> System.out.println(s));*/

        //注意2: 修改Stream流中的数据, 不会影响集合或者数组中的数据

        //limit 获取前几个元素
        //skip 跳过前几个元素

        /*list.stream().limit(3)
                .forEach(s -> System.out.println(s));

        list.stream().skip(4)
                .forEach(s -> System.out.println(s));*/
        //课堂练习:
        //只打印 "张强","张三丰",",张翠山"
        list.stream().skip(3).limit(3).forEach(s -> System.out.println(s));

    }
}
