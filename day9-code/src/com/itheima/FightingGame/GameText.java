package com.itheima.FightingGame;

public class GameText {
    public static void main(String[] args) {
        Role role1 = new Role("张三", 100);
        Role role2 = new Role("李四", 100);
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
