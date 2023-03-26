package com.itheima.test3;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();
        m1.setName("线程1");
        m2.setName("线程2");
        m1.start();
        m2.start();
    }
}
