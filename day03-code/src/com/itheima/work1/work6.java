package com.itheima.work1;

import java.util.Scanner;

public class work6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int number2 = sc.nextInt();
        boolean reslut = number1 == 6 || number2 == 6 || (number1 + number2) % 6 == 0 ;
        System.out.println(reslut);
    }
}
