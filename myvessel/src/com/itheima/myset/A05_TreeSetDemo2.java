package com.itheima.myset;

import java.util.TreeSet;

public class A05_TreeSetDemo2 {
    public static void main(String[] args) {
        //创建学生对象
        Student s1 = new Student("zhangsan",20);
        Student s2 = new Student("lisi",21);
        Student s3 = new Student("wangwu",22);

        //创建集合对象
        TreeSet<Student> ts = new TreeSet<>();

        //添加元素
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        //打印集合
        System.out.println(ts);
    }
}
