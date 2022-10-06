package com.itheima.A01map1;

import java.util.LinkedHashMap;

public class A05_LinkedHashMapDemo5 {
    public static void main(String[] args) {
        //1.创建集合
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        //添加元素
        lhm.put("a", 123);
        lhm.put("c", 456);
        lhm.put("d", 789);

        //打印集合
        System.out.println(lhm);
    }
}
