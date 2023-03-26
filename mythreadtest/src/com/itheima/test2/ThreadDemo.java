package com.itheima.test2;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        mt1.setName("小红");
        mt2.setName("小敏");
        mt1.start();
        mt2.start();
    }
}
