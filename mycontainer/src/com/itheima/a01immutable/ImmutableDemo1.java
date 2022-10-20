package com.itheima.a01immutable;

import java.util.Iterator;
import java.util.List;

public class ImmutableDemo1 {
    public static void main(String[] args) {
        //创建不可变的List集合
        //一旦创建就无法修改,只能在后面进行访问
        List<String> list = List.of("张三", "李四", "王五", "赵六");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-------------------------------");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("-------------------------------");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
