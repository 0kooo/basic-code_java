package com.itherima.work;

import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个整数");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int temp = num1 > num2 ? num2 : num1;
        int end = temp > num3 ? num3 : temp;
        System.out.println("最小的数字是" + end);
    }
}
