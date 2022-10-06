package com.itheima.A01map1;

import java.util.TreeMap;

public class A07_LinkedHashMapDemo7 {
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap<>();
        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 19);
        Student s3 = new Student("wangwu", 20);
        tm.put(s1,"黑龙江");
        tm.put(s2,"吉宁");
        tm.put(s3,"辽宁");
        System.out.println(tm);
    }
}
