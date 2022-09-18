package com.itheima.work1;

import java.util.Scanner;

public class work3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个整数");
        int num3 = sc.nextInt();
        getmax(num1, num2, num3);
    }

    public static void getmax(int num1, int num2, int num3) {
        int[] arr = new int[3];
        int tempmax = num1 > num2 ? num1 : num2;
        int max = tempmax > num3 ? tempmax : num3;
        arr[0] = max;
        int tempmin = num1 > num2 ? num2 : num1;
        int min = tempmin > num3 ? num3 : tempmin;
        arr[2] = min;
        int sum = num1 + num2 + num3;
        int mid = sum - max - min;
        arr[1] = mid;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
