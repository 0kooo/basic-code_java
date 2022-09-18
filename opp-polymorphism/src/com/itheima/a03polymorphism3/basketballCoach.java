package com.itheima.a03polymorphism3;

public class basketballCoach extends Coach{
    public basketballCoach() {
    }

    public basketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练正在教打篮球");
    }
}
