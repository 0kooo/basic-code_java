package com.itheima.StringText;

import java.util.Scanner;

public class text3 {
    public static void main(String[] args) {
        String userName = "itheima";
        String password = "abc123";
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String getUserName = sc.next();
            System.out.println("请输入用户密码");
            String getUserPassword = sc.next();
            if(userName.equalsIgnoreCase(getUserName) && password.equalsIgnoreCase(getUserPassword)){
                System.out.println("登录成功");
                break;
            }else{
                if(i == 2){
                    System.out.println("账号" + userName + "被锁定,请联系某某官方客服:");
                }else{
                    System.out.println("用户登录失败,用户名或密码不正确,您还剩下"+(2 - i)+"次机会");

                }
            }
        }
    }
}
