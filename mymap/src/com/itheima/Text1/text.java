package com.itheima.Text1;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class text {
    public static void main(String[] args) {
        //核心点:
        //HashMap的键位置如果存储的是自定义对象, 需要重写hashCode和equals方法
        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 19);
        Student s3 = new Student("wangwu", 20);
        HashMap<Student, String> map = new HashMap<>();
        map.put(s1,"黑龙江");
        map.put(s2,"吉林");
        map.put(s3,"辽宁");

        map.forEach(new BiConsumer<Student, String>() {
            @Override
            public void accept(Student student, String s) {
                System.out.println(student + " = " + s);
            }
        });
        System.out.println(map);
    }
}
