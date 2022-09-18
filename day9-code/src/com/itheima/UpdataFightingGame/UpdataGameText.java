package com.itheima.UpdataFightingGame;

public class UpdataGameText {
    public static void main(String[] args) {
        UpDataRole role1 = new UpDataRole("张三", 100,'男');
        UpDataRole role2 = new UpDataRole("李四", 100,'男');
        while (true) {
            role1.attact(role2);
            if (role2.getBlood() == 0) {
                System.out.println(role1.getName() + "KO了," + role2.getName());
                break;
            }
            role2.attact(role1);
            if (role1.getBlood() == 0) {
                System.out.println(role2.getName() + "KO了," + role1.getName());
                break;
            }
        }
    }
}
