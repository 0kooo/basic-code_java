package com.itheima.myset;

import java.util.LinkedHashSet;

public class A04_LinkedHashSetDemo {
    public static void main(String[] args) {
        //1.创建学生对象
        Student s1 = new Student("zhangsan", 20);
        Student s2 = new Student("lisi", 21);
        Student s3 = new Student("wangwu", 22);
        Student s4 = new Student("zhangsan", 20);

        //创建集合的对象
        LinkedHashSet<Student> lhs = new LinkedHashSet<>();

        //添加元素
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));

        //打印集合
        System.out.println(lhs);
    }
}
