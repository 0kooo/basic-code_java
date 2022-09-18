package com.itheima.work1;

import java.util.Scanner;

public class work5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        int count = getCount(num);
        System.out.println(num + "是" + count + "为数字");
    }

    public static int getCount(int num) {
        int count = 0;
        while(num != 0){
            int temp = num % 10;
            num = (num - temp) / 10;
            count++;
        }
        return count;
    }
}
