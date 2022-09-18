package com.itheima.a02polymorphism2;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的猫眯着眼睛侧着头" + something);
    }

    public static void catchMouse() {
        System.out.println("猫正在抓老鼠");
    }
}
