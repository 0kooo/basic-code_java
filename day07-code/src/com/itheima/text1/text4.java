package com.itheima.text1;

import java.util.Scanner;

public class text4 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        /*Random r = new Random();//表示录入随机的初始数据
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(101);
            arr[i] = num;
        }*/
        //表示手动录入初始数据
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(count < arr.length){
            System.out.println("请输入一个整数表示你的评分");
            int num = sc.nextInt();
            if(num > 100 || num < 0){
                System.out.println("请输入正确的评分");
                continue;
            }else{
                arr[count] = num;
                count++;
            }
        }
        //获得最大值
        int max = getmax(arr);
        //获得最小值
        int min = getmin(arr);
        //获得平均值
        double avg = getavg(arr, max, min);
        System.out.println(avg);
    }
    //获得最大值
    public static int getmax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    //获得最小值
    public static int getmin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    //获得平均值
    public static double getavg(int[] arr, int max, int min) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (sum - max -min) / (arr.length -2);
        return avg;
    }
}
