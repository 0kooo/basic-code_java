package com.itheima.work1;

import java.util.Scanner;

public class work7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number = sc.nextInt();
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;
        int total = ge + shi + bai;
        System.out.println(total);
    }
}
