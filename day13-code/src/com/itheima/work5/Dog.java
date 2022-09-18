package com.itheima.work5;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something){
        System.out.println("狗正在吃" + something);
    }

    public static void lookHome(){
        System.out.println("狗正在看家");
    }
}
