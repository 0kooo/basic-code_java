package com.itheima.a01myfunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FunctionDemo9 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list, new Student("zhangsan",23),new Student("lisi",24), new Student("wangwu",25));
        /*String[] arr = list.stream().map(new Function<Student, String>() {
            @Override
            public String apply(Student) {
                String name = student.getName();
                int age = student.getAge();
                return name + "-" + age;
            }
        }).toArray(String[]::new);*/

        String[] arr = list.stream().map(Student::newSize).toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
