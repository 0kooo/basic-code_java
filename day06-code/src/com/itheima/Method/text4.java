package com.itheima.Method;

import java.util.Scanner;

public class text4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入圆的半径");
        int r = sc.nextInt();
        getArea(r);
    }
    public static void getArea(int r){
        double area = 3.14 * r *r;
        System.out.println(area);
    }
}
