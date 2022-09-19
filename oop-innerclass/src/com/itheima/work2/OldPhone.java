package com.itheima.work2;

public class OldPhone extends Phone{
    public OldPhone() {
    }

    @Override
    public void call() {
        System.out.println("正在用旧手机打电话");
    }

    @Override
    public void send() {
        System.out.println("正在用旧手机发短信");
    }
}
