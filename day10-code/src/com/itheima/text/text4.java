package com.itheima.text;

public class text4 {
    public static void main(String[] args) {
        String str = "Hello World";
        char[] strArr = str.toCharArray();
        int count = 0;
        for (int i = strArr.length - 1; i >= 0; i--) {
            if(strArr[i] == ' '){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
