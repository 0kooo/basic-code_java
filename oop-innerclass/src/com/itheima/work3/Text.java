package com.itheima.work3;

public class Text {
    public static void main(String[] args) {
        IPlay ip = new IPlay() {
            @Override
            public void playGame() {
                System.out.println("正在玩游戏");
            }
        };
        ip.playGame();
        Zi z = new Zi();
        z.playGame();

        Fun f = new Fun() {
            @Override
            public void fun() {
                System.out.println("fun");
            }
        };

        f.fun();
        z.fun();
    }
}
