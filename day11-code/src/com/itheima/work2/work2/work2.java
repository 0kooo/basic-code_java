package com.itheima.work2.work2;

import java.util.ArrayList;

public class work2 {
    public static void main(String[] args) {
        ArrayList<Teacher> list = new ArrayList<>();

        Teacher teacher1 = new Teacher("赵老师", "java");
        Teacher teacher2 = new Teacher("钱老师", "javaee");
        Teacher teacher3 = new Teacher("孙老师", "php");
        Teacher teacher4 = new Teacher("李老师", "python");

        list.add(teacher1);
        list.add(teacher2);
        list.add(teacher3);
        list.add(teacher4);

        for (int i = 0; i < list.size(); i++) {
            Teacher teacher = list.get(i);
            System.out.println("姓名: " + teacher.getName() + ", " + "专业: " + teacher.getMajor());
        }
    }
}
