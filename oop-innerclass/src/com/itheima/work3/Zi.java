package com.itheima.work3;

public class Zi extends Fun implements IPlay{

    @Override
    public void fun() {
        System.out.println("fun");
    }

    @Override
    public void playGame() {
        System.out.println("玩游戏");
    }
}
