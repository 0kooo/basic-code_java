package com.itheima.work5;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something){
        System.out.println("猫正在吃" + something);
    }

    public static void catchMouse(){
        System.out.println("猫正在抓老鼠");
    }
}
