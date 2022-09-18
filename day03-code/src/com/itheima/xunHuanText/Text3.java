package com.itheima.xunHuanText;

import java.util.Scanner;

public class Text3 {
    public static void main(String[] args) {
        //1.键盘录入两个整数

        //2.a == 6 || b == 6 || (a + b) % 6 == 0

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number1 = sc.nextInt();
        System.out.println("请输入一个整数");
        int number2 = sc.nextInt();

        //可以短路逻辑运算符去连接三个判断
        boolean reslut = number1 == 6 || number2 == 6 || (number1 + number2) % 6 ==0;

        System.out.println(reslut);
    }
}
