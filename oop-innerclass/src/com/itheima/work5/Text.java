package com.itheima.work5;

public class Text {
    public static void main(String[] args) {
        A a = new A();
        InterA a2 = new InterA() {

            @Override
            public void show() {
                System.out.println("执行了吗");
            }
        };
        a.methodA(a2);
    }
}
