package com.itheima.work2;

import java.util.Scanner;

public class work3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        char[] strArr = str.toCharArray();
        int letterCount = 0;
        int numberCount = 0;
        int other = 0;
        for (int i = 0; i < strArr.length; i++) {
            if((strArr[i] >= 65 && strArr[i] <= 90) || (strArr[i] >= 97 && strArr[i] <= 122)){
                letterCount++;
            }else if(strArr[i] >= 48 && strArr[i] <= 57){
                numberCount++;
            }else{
                other++;
            }
        }
        System.out.println(letterCount);
        System.out.println(numberCount);
        System.out.println(other);
    }
}
