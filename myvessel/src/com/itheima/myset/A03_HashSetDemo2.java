package com.itheima.myset;

import java.util.HashSet;

public class A03_HashSetDemo2 {
    public static void main(String[] args) {
        //1.创建学生对象
        Student s1 = new Student("zhangsan", 20);
        Student s2 = new Student("lisi", 21);
        Student s3 = new Student("wangwu", 22);
        Student s4 = new Student("zhangsan", 20);

        //创建集合用来添加学生对象
        HashSet<Student> hs = new HashSet<>();

        //添加元素
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));

        //打印集合
        System.out.print(hs);
    }
}
