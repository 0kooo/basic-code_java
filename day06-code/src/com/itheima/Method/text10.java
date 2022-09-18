package com.itheima.Method;

public class text10 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] copy = copyOfRange(arr, 3, 7);
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] brr = new int[to - from];
        for (int i = from, j = 0; i < to; i++, j++) {
            brr[j] = arr[i];
        }
        return brr;
    }
}
