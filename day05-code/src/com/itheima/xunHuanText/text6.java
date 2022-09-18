package com.itheima.xunHuanText;

import java.util.Random;
import java.util.Scanner;

public class text6 {
    public static void main(String[] args) {
        //1.获取一个随机数
        Random r = new Random();
        //判断技巧:
        //在小括号中,书写的生成随机数范围
        //这个范围一定是从0开始的
        //到这个数-1结束
        //口诀:包头不包尾,包左不包右
        int number = r.nextInt(100) + 1;
        //2.猜取这个随机数
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入你猜想的整数");
            int guessNumber = sc.nextInt();
            if(number > guessNumber){
                System.out.println("猜小了");
                continue;
            }else if(number < guessNumber){
                System.out.println("猜大了");
                continue;
            }else{
                flag = false;
                System.out.println("猜对了");
                break;
            }
        }
        if(flag){
            System.out.println("正确的随机数为" + number);
        }
    }
}
