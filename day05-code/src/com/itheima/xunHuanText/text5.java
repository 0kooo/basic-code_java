package com.itheima.xunHuanText;

import java.util.Scanner;

public class text5 {
    public static void main(String[] args) {
        //1.键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();
        //2.判断是否为质数
        //条件:只能被1和本身整除
        int flag = 0;
        for (int i = 1; i <= number; i++) {
            if(number % i == 0){
                flag++;
            }
        }
        if(flag == 2){
            System.out.println(number + "是质数");
        }else{
            System.out.println(number + "不是质数");
        }
    }
}
