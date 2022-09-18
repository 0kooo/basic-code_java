package com.itherima.work;

import java.util.Scanner;

public class work4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("是否是会员(0表示不是,1表示是)");
        int vip = sc.nextInt();
        System.out.println("请输入您本次购物的总金额");
        int sum = sc.nextInt();
        double endsum = 0;
        if(sum > 0 ){
            if(vip == 0){
                if(sum < 100){
                    endsum = sum;
                }else{
                    endsum = sum * 0.9;
                }
            }else{
                if(sum < 200){
                    endsum = sum * 0.8;
                }else{
                    endsum = sum * 0.75;
                }
            }
        }else{
            System.out.println("输入数据有误");
        }
        System.out.println("本次消费的最终金额为" + endsum);
    }
}
