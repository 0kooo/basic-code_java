package com.itheima.a04innerclass4;

public class Text {
    public static void main(String[] args) {
        new Swim(){

            @Override
            public void Swim() {
                System.out.println("重写了接口里面的Swim方法");
            }
        };
    }
}
