package com.itheima.a03staticText3;

import java.util.ArrayList;

public class Text {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("zhangsan",23,"男");
        Student stu2 = new Student("lisi",24,"男");
        Student stu3 = new Student("wangwu",25,"女");

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int maxStudentAge = StudentUtil.getMaxStudentAge(list);
        System.out.println(maxStudentAge);
    }
}
