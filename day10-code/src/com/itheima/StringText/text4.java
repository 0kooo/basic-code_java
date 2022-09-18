package com.itheima.StringText;

import java.util.Scanner;

public class text4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            System.out.print(ch + " ");
        }
    }
}
