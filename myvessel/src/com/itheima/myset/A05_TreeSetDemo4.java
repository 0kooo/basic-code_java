package com.itheima.myset;

import java.util.TreeSet;

public class A05_TreeSetDemo4 {
    public static void main(String[] args) {
        //创建学生对象
        Student2 s1 = new Student2("zhangsan",20,70,71,72);
        Student2 s2 = new Student2("lisi",21,80,71,72);
        Student2 s3 = new Student2("wangwu",23,70,81,72);

        //创建集合对象
        TreeSet<Student2> ts = new TreeSet<>();

        //添加集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        //打印集合
        for (Student2 t : ts) {
            System.out.println(t);
        }
    }
}
