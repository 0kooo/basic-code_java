package com.itheima.work1;

import java.util.Random;

public class work11 {
    public static void main(String[] args) {
        int[] arr = {2,588,888,1000,10000};
        getnum(arr);
    }
    //我自己写的,但是没有方法停下来
    /*public static void getnum(int[] arr) {
        Random r = new Random();
        while(true){
            int ran = r.nextInt(5);
            if(arr[ran] != 0){
                System.out.println(arr[ran] + "元的奖金被抽出");
                arr[ran] = 0;
            }
        }
    }*/

    //初始代码
    /*public static void getnum(int[] arr){
        int[] brr = new int[arr.length];
        int index = 0;
        Random r = new Random();
        while(index < arr.length){
            boolean flag = true;
            int ran = r.nextInt(5);
            for (int i = 0; i < brr.length; i++) {
                if(brr[i] == arr[ran]){
                    flag = false;
                }
            }
            if(flag){
                System.out.println(arr[ran] + "的奖金被抽出");
                brr[index] = arr[ran];
                index++;
            }
        }
    }*/

    //最终改进的代码
    public static void getnum(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int Randomnum = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[Randomnum];
            arr[Randomnum] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "的奖金被抽取");
        }
    }
}
