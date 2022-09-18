package com.itherima.text;

import java.util.Scanner;

public class text17 {
    public static void main(String[] args) {
        //1.定义数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();
        int temp = 0;
        int turnNumber = 0;
        int number1 = number;
        //2.利用循环开始从右向左获取每一个数字
        while (number != 0) {
            //从右往左获取每一位数字
            temp = number % 10;
            //修改number记录值
            number = number / 10;
            //拼接回文数
            turnNumber = turnNumber * 10 + temp;
        }
        //判断是否是回文数
        if (turnNumber == number1) {
            System.out.println(number1 + "是回文数");
        } else {
            System.out.println(number1 + "不是回文数");
        }
    }
}
