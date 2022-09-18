package com.itheima.a03polymorphism3;

public class basketballAthlete extends Sporter{
    public basketballAthlete() {
    }

    public basketballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study(){
        System.out.println("运动员正在学打篮球");
    }
}
