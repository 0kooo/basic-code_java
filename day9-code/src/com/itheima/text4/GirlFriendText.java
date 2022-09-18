package com.itheima.text4;

public class GirlFriendText {
    public static void main(String[] args) {
        GirlFriend[] arr = new GirlFriend[4];

        GirlFriend gf1 = new GirlFriend("小诗诗", 18, "萌妹子", "睡觉");
        GirlFriend gf2 = new GirlFriend("小丹丹", 19, "萌妹子", "吃零食");
        GirlFriend gf3 = new GirlFriend("小慧慧", 20, "萌妹子", "玩游戏");
        GirlFriend gf4 = new GirlFriend("小莉莉", 21, "憨妹子", "做饭");

        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend girlFriend = arr[i];
            sum += girlFriend.getAge();
        }
        int avg = sum / arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend girlFriend = arr[i];
            if (avg > girlFriend.getAge()) {
                System.out.println("姓名:"+girlFriend.getName() + ",年龄:" + girlFriend.getAge() + ",性别:"
                        + girlFriend.getGender() + ",爱好:" + girlFriend.getHobby());
                count++;
            }
        }
        System.out.println("总共有" + count + "个比平均数小");
    }
}
