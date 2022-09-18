package com.itheima.work2;

import java.util.Random;
import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("请输入一个字符串");
        String str = sc.next();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[number];
            arr[number] = temp;
        }
        String result = new String(arr);
        System.out.println(arr);
    }
}
