package com.itherima.text;

import java.util.Scanner;

public class text7 {
    public static void main(String[] args) {
        //1.定义变量记录总价
        int price = 1000;
        //2.键盘录入会员的级别
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入会员的级别");
        int garde = sc.nextInt();
        if (garde == 1) {
            System.out.println("实践支付的钱为" + (price * 0.9));
        } else if (garde == 2) {
            System.out.println("实践支付的钱为" + (price * 0.8));
        } else if (garde == 3) {
            System.out.println("实践支付的钱为" + (price * 0.7));
        } else {
            System.out.println("实践支付的钱为" + price);
        }
    }
}

