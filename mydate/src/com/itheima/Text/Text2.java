package com.itheima.Text;

import java.util.Scanner;

public class Text2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while(true){
            System.out.println("请输入你需要转换的数字");
            str = sc.nextLine();
            boolean flag = checkStr(str);
            //正则表达式
            //boolean matches = str.matches("[1-9]\\d{0,9}");
            if(flag){
                break;
            }
        }
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ge = (ch - '0');
            number = number * 10 + ge;
        }
        System.out.println(number);
    }

    public static boolean checkStr(String str){
        if(str == null){
            return false;
        }
        if(str.charAt(0) == '0'){
            return false;
        }
        if(str.length() > 10){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }
}
