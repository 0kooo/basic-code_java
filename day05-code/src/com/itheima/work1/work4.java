package com.itheima.work1;

import java.util.Random;

public class work4 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
        }
        /*int[] arr = {2,1,3,5,4}
         */
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println("这个随机数组表示的整数为" + number);
    }
}
