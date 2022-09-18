package com.itheima.StringBuilder;

import java.util.Scanner;

public class text1 {
    public static void main(String[] args) {
        //使用StringBuilder的场景:
        //1.字符串的拼接
        //2.字符串的反转
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        String str = sc.next();
        String result = new StringBuilder().append(str).reverse().toString();
        if(str.equalsIgnoreCase(result)){
            System.out.println(str + "是对称字符");
        }else{
            System.out.println(str + "不是对称字符");
        }
    }
}
