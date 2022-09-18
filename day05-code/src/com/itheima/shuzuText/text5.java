package com.itheima.shuzuText;

import java.util.Random;

public class text5 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        //获取10个随机数
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }
        //求出所有数据的和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        //求所有数据的平均值
        double average = sum / arr.length;

        //统计有多少个数据比平均值小
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average) {
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("所有数据的和为" + sum);
        System.out.println("所有数据的平均值为" + average);
        System.out.println("有" + count + "个数据比平均数小");
    }
}
