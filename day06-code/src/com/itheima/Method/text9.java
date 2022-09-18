package com.itheima.Method;

import java.util.Scanner;

public class text9 {
    public static void main(String[] args) {
        int[] arr = {1,6,5,3,9,4,2};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入目标数");
        int target = sc.nextInt();
        boolean res = getTrue(arr, target);
        if(res){
            System.out.println("数组中存在目标数");
        }else{
            System.out.println("数组中不存在目标数");
        }
    }
    public static boolean getTrue(int[] arr, int target){
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                flag = true;
            }
        }
        return flag;
    }
}
