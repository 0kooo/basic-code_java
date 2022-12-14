package com.itheima.myobjectstream;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {
    //如果一个对象中的某个成员变量的值不想被序列化
    //我们可以个成员变量加transient关键字修饰, 该关键字标记的成员变量不参与序列化过程
    @Serial
    private static final long serialVersionUID = 3041890254222974140L;
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
}
