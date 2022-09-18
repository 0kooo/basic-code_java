package com.itheima.a03polymorphism3;

public class PingpangCoach extends Coach implements speakEnglish{
    @Override
    public void teach() {
        System.out.println("乒乓球教练正在教的乒乓球");
    }
    @Override
    public void speakEnglish(){
        System.out.println("乒乓球教练正在学英语");
    }
}
