package com.itheima.mysort;

public class A02_SelectionDemo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 3, 1};
        selectionArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void selectionArr(int[] arr){
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if(arr[j] > arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
