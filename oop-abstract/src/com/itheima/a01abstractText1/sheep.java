package com.itheima.a01abstractText1;

public class sheep extends Animal{
    public sheep() {
    }

    public sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("羊正在吃草");
    }
}
