package com.itheima.text1;

public class girlFriendText {
    public static void main(String[] args) {
        girlFriend gf1 = new girlFriend();
        gf1.setName("小诗诗");
        gf1.setAge(18);
        gf1.setGender("萌妹子");

        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());

        gf1.eat();
        gf1.sleep();
    }
}
