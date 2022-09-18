package com.itheima.text;

import java.util.Scanner;

public class text1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while(true){
            System.out.println("请输入一个字符串");
            str = sc.next();
            boolean flag = checkStr(str);
            if(flag){
                break;
            }else{
                continue;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = c - 48;
            sb.append(changeLuoMa(number));
        }
        String result = sb.toString();
        System.out.println(result);

    }

    public static boolean checkStr(String str){
        if(str.length() > 9){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c < '0' || c > '9'){
                return false;
            }
        }
        return true;
    }

    public static String changeLuoMa(int number){
        String[] arr = {"", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        return arr[number];
    }
}
