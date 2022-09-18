package com.itheima.xunHuanText;

import java.util.Scanner;

public class text4 {
    public static void main(String[] args) {
        //1.键盘录入一个大于等于2的整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于等于2的整数");
        int x = sc.nextInt();
        //2.计算并返回整数的平方根
        boolean  falge = true;
        int i = 1;
        int target = 0;
        while(falge){
            if(i * i > x && (i - 1) * (i - 1) < x){
                target = i - 1;
                falge = false;
            }else if(i * i == x){
                target = i;
                falge = false;
            }
            i++;
        }
        System.out.println(x + "的平方根为" + target);
    }
}
