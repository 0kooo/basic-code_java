package com.itheima.mysort;

public class A01_BubbleDemo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 3, 1};
        getArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void getArr(int[] arr) {
        for (int j = 1; j <= arr.length - 1; j++) {
            for (int i = 0; i < arr.length - j; i++) {
                if(arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
