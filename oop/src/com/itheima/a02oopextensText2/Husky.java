package com.itheima.a02oopextensText2;

public class Husky extends Dog{
    @Override
    public void eat(){
        System.out.println("吃饭(吃狗粮)");
    }

    public static void destroryHome(){
        System.out.println("拆家");
    }
}
