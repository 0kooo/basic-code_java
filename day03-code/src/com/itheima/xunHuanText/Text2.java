package com.itheima.xunHuanText;

import java.util.Scanner;

public class Text2 {
    public static void main(String[] args) {
        //1.键盘输入两个数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入我们自己的衣服时髦度");
        int myFashion = sc.nextInt();
        System.out.println("请输入相亲对象衣服的时髦度");
        int girlFashion = sc.nextInt();

        //2.把我们的衣服时髦度和女孩的时髦的进行比较就可以了
        boolean result = myFashion > girlFashion;

        //3.打印结果
        System.out.println(result);
    }
}
