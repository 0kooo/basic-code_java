package com.itheima.work2;

public class GirlFriendText {
    public static void main(String[] args) {
        GirlFriend gf = new GirlFriend("凤姐", 155.0, 130.0);
        System.out.println("我的女朋友是" + gf.getName() + ",身高为" + gf.getHeight() + "厘米,体重为" + gf.getWeight() + "斤");
        gf.wash();
        gf.cook();
    }
}
