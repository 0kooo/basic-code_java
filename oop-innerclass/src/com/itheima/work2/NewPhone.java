package com.itheima.work2;

public class NewPhone extends OldPhone implements IPlay{

    public NewPhone() {
    }

    @Override
    public void call() {
        System.out.println("正在用新手机打电话");
    }

    @Override
    public void send() {
        System.out.println("正在用新手机发短信");
    }

    @Override
    public void PlayGame() {
        System.out.println("正在用新手机玩游戏");
    }
}
