package com.itheima.myset;

import java.util.TreeSet;

public class A05_TreeSetDemo1 {
    public static void main(String[] args) {
        //创建TreeSet集合对象
        TreeSet<Integer> ts = new TreeSet<>();

        //添加元素
        ts.add(2);
        ts.add(3);
        ts.add(1);

        //打印集合
        System.out.println(ts);

        //遍历集合
        for (Integer str : ts) {
            System.out.println(str);
        }
    }
}
