package com.itheima.text1;

import java.util.ArrayList;
import java.util.Scanner;

public class studentText2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Student s = new Student();

            System.out.println("请输入学生姓名");
            String name = sc.next();
            System.out.println("请输入学生年龄");
            int age = sc.nextInt();

            s.setAge(age);
            s.setName(name);

            list.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName() + ", " + s.getAge());
        }
    }
}
