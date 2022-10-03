package com.itheima.myset;

import java.util.Comparator;
import java.util.TreeSet;

public class A05_TreeSetDemo3 {
    public static void main(String[] args) {
        //创建集合
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //按照长度排序
                int i = o1.length() - o2.length();
                //如果一样长则按照首字母排序
                i = i == 0 ? o1.compareTo(o2) : i;
                return i;
            }
        });

        //添加元素
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("pow");

        //打印集合
        System.out.println(ts);
    }
}
