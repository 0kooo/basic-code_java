package com.itheima.a01myfunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FunctionDemo7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张志若,15","张三丰,100","张良,35");
        /*List<Student> newList = list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                String[] arr = s.split(",");
                return new Student(arr[0], Integer.parseInt(arr[1]));
            }
        }).collect(Collectors.toList());*/
        Student[] studentArr = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(studentArr));

    }
}
