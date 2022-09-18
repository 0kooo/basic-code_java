package com.itheima.work2;

import java.util.Scanner;

public class work4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        boolean result = StringBuilder(str);
        System.out.println(result);
    }
    public static boolean StringBuilder(String str){
        char[] strArr = str.toCharArray();
        int l = 0;
        int r = strArr.length - 1;
        while(l <= r){
            char temp = strArr[r];
            strArr[r] = strArr[l];
            strArr[l] = temp;
            l++;
            r--;
        }
        String result = new String(strArr);
        return str.equals(result);
    }
}
