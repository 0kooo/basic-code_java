package com.itheima.a01mystream;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo2 {
    public static void main(String[] args) {
        //1.单列集合获取Stream流
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e");
        /*//获取到一个流水线,并把集合中的数据放到流水线上
        Stream<String> stream1 = list.stream();
        //使用终结方法打印一下流水线上的所以数据
        stream1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                //s:依次表示流水线的每一个数据
                System.out.println(s);
            }
        });*/
        list.stream().forEach(System.out::println);
    }
}
