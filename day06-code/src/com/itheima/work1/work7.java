package com.itheima.work1;

public class work7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int value = 0;
        fill(arr, value);
    }

    public static void fill(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
