package com.itheima.StringText;

import java.util.Scanner;

public class text5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        int n = str.length();
        int numberCount = 0;
        int greadCount = 0;
        int lowerCount = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if(ch >= '0'  && ch <= '9'){
                numberCount++;
            }else if(ch >= 'A' && ch <= 'Z'){
                greadCount++;
            }else if(ch >= 'a' && ch <= 'z'){
                lowerCount++;
            }
        }
        System.out.println("大写字母的个数是" + greadCount);
        System.out.println("小写字母的个数是" + lowerCount);
        System.out.println("数字的个数是" + numberCount);
    }
}
