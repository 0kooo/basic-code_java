package com.itheima.myset;

public class A02_HashSetDemo1 {
    public static void main(String[] args) {
        //1.创建对象
        Student s1 = new Student("zhangsan",20);
        Student s2 = new Student("zhangsan",20);

        //2.如果没有重写hashCode方法, 不同对象计算出的哈希值是不同的
        //  如果已经重写hashCode方法, 不同的对象只要属性值不同, 计算出的哈希值就是一样的
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //哈希碰撞
        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());
    }
}
