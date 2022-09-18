package com.itheima.a03polymorphism3;

public class Text {
    public static void main(String[] args) {
        PingPangAthlete ppa = new PingPangAthlete("刘诗雯", 23);
        System.out.println(ppa.getName() + ", " + ppa.getAge());
        ppa.study();
        ppa.speakEnglish();
    }
}
