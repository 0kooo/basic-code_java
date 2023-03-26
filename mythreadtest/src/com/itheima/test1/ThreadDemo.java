package com.itheima.test1;

public class ThreadDemo {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        w1.setName("窗口1");
        w2.setName("窗口2");
        w1.start();
        w2.start();
    }
}
