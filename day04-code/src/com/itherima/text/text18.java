package com.itherima.text;

import java.util.Scanner;

public class text18 {
    public static void main(String[] args) {
        //1.键盘录入被除数和除数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数");
        int number1 = sc.nextInt();
        System.out.println("请输入除数");
        int number2 = sc.nextInt();
        //2.循环while
        //再循环中,不断的用被除数 - 除数
        //只要被除数 是大于等于除数的,那么就一直循环
        int count = 0;
        while (number1 >= number2) {
            number1 -= number2;
            //循环结束时,count记录就是商
            count++;
        }
        System.out.println("两数相除所得的商为" + count);
        System.out.println("两数相除所得的余数为" + number1);
    }
}
