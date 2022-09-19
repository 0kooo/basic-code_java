package com.itheima.work4;


public class Outer{

    public static void method(){
        Iner hello_world = new Iner() {

            @Override
            public void show() {
                System.out.println("Hello World");
            }
        };
    }
}
