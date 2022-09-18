package com.itheima.text2;

import java.util.ArrayList;
import java.util.Scanner;

public class userText {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        User user1 = new User("heima001","zhangsan","123456");
        User user2 = new User("heima002","lisi","1234567");
        User user3 = new User("heima003","wangwu","1234568");

        list.add(user1);
        list.add(user2);
        list.add(user3);

        System.out.println("请输入要查询的id");
        String id = sc.next();
        System.out.println(containt(list,id));
    }

    public static boolean containt(ArrayList<User> list, String id){
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if(uid.equals(id)){
                return true;
            }
        }
        return false;
    }
}
