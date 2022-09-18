package com.itheima.Method;

import java.util.Scanner;

public class text3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入长方形的长");
        int c = sc.nextInt();
        System.out.println("请输入长方形的宽");
        int k = sc.nextInt();
        getLength(c,k);
    }
    public static void getLength(int c, int k){
        int S = (c + k) * 2;
        System.out.println(S);
    }
}
