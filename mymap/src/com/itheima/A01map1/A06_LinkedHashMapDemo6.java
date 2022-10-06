package com.itheima.A01map1;

import java.util.Comparator;
import java.util.TreeMap;

public class A06_LinkedHashMapDemo6 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        tm.put(1,"a");
        tm.put(2,"b");
        tm.put(3,"c");
        System.out.println(tm);
    }
}
