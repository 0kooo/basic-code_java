package com.itheima.text1;

import java.util.Random;
import java.util.Scanner;

public class text8 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Random r = new Random();
        for (int i = 0; i < 6; ) {
            int redNum = r.nextInt(33) + 1;
            if (contains(arr, redNum)) {
                arr[i] = redNum;
                i++;
            }
        }
        arr[arr.length - 1] = r.nextInt(16) + 1;
        /*System.out.println("输出了中奖号码");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/
        int[] priceNum = userInputNumber(arr.length);
        int redCount = 0;
        int bluecount = 0;
        for (int i = 0; i < priceNum.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] == priceNum[i]){
                    redCount++;
                    break;
                }
            }
        }
        if (arr[arr.length - 1] == priceNum[priceNum.length - 1]) {
            bluecount++;
        }
        /*System.out.println(redCount);
        System.out.println(bluecount);*/
        getprice(redCount, bluecount);
    }

    //判断数组中是否有重复数据
    public static boolean contains(int[] arr, int redNum) {
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == redNum) {
                flag = false;
            }
        }
        return flag;
    }

    //获得用户的奖号
    public static int[] userInputNumber(int arrlenght) {
        int[] priceNum = new int[arrlenght];
        Scanner sc = new Scanner(System.in);
        for (int i = 0, j = 1; i < priceNum.length - 1; ) {
            System.out.println("请输入您所选择的第" + j + "红色球号码");
            int redNum = sc.nextInt();
            if (redNum >= 1 && redNum <= 33) {
                if (contains(priceNum, redNum)) {
                    priceNum[i] = redNum;
                    i++;
                    j++;
                } else {
                    System.out.println("输入数据重复");
                }
            }else{
                System.out.println("输入数据错误");
            }
        }
        boolean flag = true;
        while (flag) {
            System.out.println("请输入您所选择的蓝色球号码");
            int blueNum = sc.nextInt();
            if (blueNum >= 1 && blueNum <= 16) {
                priceNum[priceNum.length - 1] = blueNum;
                flag = false;
            }
        }

        return priceNum;
    }

    //判断是否中奖
    public static void getprice(int redCount, int blueCount) {
        if ((redCount == 0 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 2 && blueCount == 1)) {
            System.out.println("恭喜你中了5元");
        } else if ((redCount == 3 && blueCount == 1) || (redCount == 4 && blueCount == 0)) {
            System.out.println("恭喜你中了10元");
        } else if ((redCount == 4 && blueCount == 1) || (redCount == 5 && blueCount == 0)) {
            System.out.println("恭喜你中了200元");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜你中了3000元");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜你中了500万元");
        } else if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜你中了1000万元");
        } else {
            System.out.println("很遗憾你没有中奖");
        }
    }
}
