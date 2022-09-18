package com.itherima.text;

import java.util.Scanner;

public class text3 {
    public static void main(String[] args) {
        //1.键盘录入一个整数,表示身上的钱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int money = sc.nextInt();
        //2.对身上的钱进行判断
        if(money >= 100){
            System.out.println("吃网红餐厅");
        }else{
            System.out.println("吃经济实惠的沙县小吃");
        }
    }
}
