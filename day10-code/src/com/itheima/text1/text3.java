package com.itheima.text1;

import java.util.Scanner;

public class text3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        String num1 = sc.next();
        System.out.println("请输入第二个数字");
        String num2 = sc.next();
        int result = StrToInt(num1) * StrToInt(num2);
        System.out.println(result);

    }
    public static int StrToInt(String num){
        char[] strArr = num.toCharArray();
        int number = 0;
        for (int i = 0; i < strArr.length; i++) {
            int temp = (int) strArr[i] - 48;
            number = number * 10 + temp;
        }
        return number;
    }
}
