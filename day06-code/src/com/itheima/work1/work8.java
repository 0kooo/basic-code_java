package com.itheima.work1;

public class work8 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int fromIndex = 3;
        int toIndex = 7;
        int value = 0;
        fill(arr, fromIndex, toIndex, value);
    }
    public static void fill(int[] arr, int fromIndx, int toIndex, int value){
        for (int i = fromIndx; i < toIndex; i++) {
            arr[i] = value;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
