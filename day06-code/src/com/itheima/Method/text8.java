package com.itheima.Method;

public class text8 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        int max = getMax(arr);
        System.out.println("这个数组的最大值为" + max);
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
