package com.itherima.text;

import java.util.Scanner;

public class text9 {
    public static void main(String[] args) {
        //1.键盘录入星期数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个星期数");
        int week = sc.nextInt();
        //2.利用switch语句进行筛选
        switch(week){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("输入信息有误");
        }
    }
}
