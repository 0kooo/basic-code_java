package com.itheima.work1;

import java.util.Scanner;

public class work6 {
    public static void main(String[] args) {
        int[] arr = {12,14,23,45,66,68,70,77,90,91};
        int[] brr = new int[11];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你所要添加的整数");
        int number = sc.nextInt();
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > number || arr[i] == number){
                flag = i;
                break;
            }
        }
        for (int i = 0, j = 0; i < brr.length; i++) {
            if(i == flag){
                brr[i] = number;
                continue;
            }
            brr[i] = arr[j];
            j++;
        }
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }
}
