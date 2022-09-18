package com.itheima.a01polymorphism1;

public class Manager extends Person{
    public Manager() {
    }

    public Manager(String name, int age) {
        super(name, age);
    }

    @Override
    public void show() {
        System.out.println("管理员的信息为: " + getName() + ", " + getAge());
    }
}
