package com.itheima.a03polymorphism3;

public class PingPangAthlete extends Sporter implements speakEnglish{
    public PingPangAthlete() {
    }

    public PingPangAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("运动员正在学打乒乓球");
    }

    public void speakEnglish(){
        System.out.println("乒乓球运动员正在学说英语");
    }
}
