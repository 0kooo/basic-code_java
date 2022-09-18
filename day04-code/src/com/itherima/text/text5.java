package com.itherima.text;

import java.util.Scanner;

public class text5 {
    public static void main(String[] args) {
        //1.键盘录入一个整数表示电影票的票号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入座位编号");
        int ticket = sc.nextInt();
        //2.判断票号是奇数还是偶数,和票号是否在1到100之间
        if(ticket <= 100 || ticket >= 1){
            if(ticket % 2 == 1){
                System.out.println("坐左边");
            }else{
                System.out.println("坐右边");
            }
        }

    }
}
