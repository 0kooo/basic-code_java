package com.itherima.work;

import java.util.Scanner;

public class work6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int number2 = sc.nextInt();
        System.out.println("请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法)");
        int sign = sc.nextInt();
        int end = 0;
        switch(sign){
            case 1:
                System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                break;
            case 2:
                System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                break;
            case 3:
                System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
                break;
            case 4:
                System.out.println(number1 + " / " + number2 + " = " + (number1 * 1.0 / number2));
                break;
            default:
                System.out.println("您输入的运算类别有误");
                break;
        }
    }
}
