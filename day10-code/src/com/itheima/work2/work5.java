package com.itheima.work2;

import java.util.Scanner;

public class work5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证");
        String str = sc.next();
        boolean result = checkId(str);
        System.out.println(result);
    }
    public static boolean checkId(String str){
        if(str.length() != 18){
            return false;
        }
        char[] strArr = str.toCharArray();
        if(strArr[0] == '0'){
            return false;
        }
        for (int i = 1; i < strArr.length; i++) {
            if(strArr[i] < '0' || strArr[i] > '9'){
                return false;
            }
        }
        if((strArr[strArr.length] > '0' && strArr[strArr.length] < '9') || strArr[strArr.length] == 'X' ){
            return true;
        }
        return false;
    }
}
