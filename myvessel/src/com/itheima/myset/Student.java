package com.itheima.myset;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    //this: 表示当前要添加的元素
    //o:表示已经在红黑数存在的元素

    //返回值
    //负数: 表示当前要添加的元素是小的, 存左边
    //正数: 表示当前要添加的元素是大的, 存右边
    //0: 表示当前要添加的元素已存在, 舍弃
    public int compareTo(Student o) {
        int result = this.getAge() - o.getAge();
        return result;
    }
}
