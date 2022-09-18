package com.itherima.text;

import java.util.Scanner;

public class text10 {
    public static void main(String[] args) {
        //1.键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入所需服务的编号");
        int number = sc.nextInt();
        //2.利用switch选择所需的服务
        switch (number) {
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预订");
            case 3 -> System.out.println("机票改签");
            default -> System.out.println("退出服务");
        }
    }
}
