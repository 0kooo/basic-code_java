package com.itheima.a02threadpool2;

public class MyThreadPoolDemo2 {
    public static void main(String[] args) {
        int count = Runtime.getRuntime().availableProcessors();
        System.out.println(count);
    }
}
