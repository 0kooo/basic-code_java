package com.itheima.text1;

import java.util.Random;

public class text3 {
    public static void main(String[] args) {
        Random r = new Random();
        char[] arr = new char[58];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char)(65 + i);
        }
        int count = 0;
        String reslut = "";
        while(count < 4){
            int numRan = r.nextInt(58);
            if(numRan < 26 || numRan > 31){
                reslut = reslut + arr[numRan];
                count++;
            }
        }
        int num = r.nextInt(10);
        reslut = reslut + num;
        System.out.println(reslut);
    }
}
