package com.itheima.text1;

public class text2 {
    public static void main(String[] args) {
        int i = 101;
        int count = 0;
        while(i<=200){
            boolean flag = true;
            for(int j = 2; j <= i - 1; j++){
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
                System.out.println(i + "是素数");
            }
            i++;
        }
        System.out.println(count);
    }
}
