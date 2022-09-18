package com.itheima.text1;

import java.util.Scanner;

public class text1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价");
        int price = sc.nextInt();
        System.out.println("请输入当前月份");
        int month = sc.nextInt();
        System.out.println("请输入您是经济舱还是头等舱(1:表示经济舱,0:表示头等舱)");
        int flag = sc.nextInt();
        double endPrice = getPrice(price, month, flag);
        System.out.println("最后需要支付的金额为" + endPrice);
    }

    public static double getPrice(double price, int moth, int grade) {
        if(price > 0 || moth < 12 || moth > 0){
            if(moth >= 5 && moth <= 10){
                price = count(price, moth, grade,0.9,0.85);
            }else{
                price = count(price, moth, grade,0.7,0.65);
            }
        }else{
            System.out.println("输入数据有误");
            return price;
        }
        return price;
    }

    public static double count(double price, int month, int grade, double v0, double v1) {
        if(grade == 1){
            price = price * v1;
        }else{
            price = price * v0;
        }
        return price;
    }
}
