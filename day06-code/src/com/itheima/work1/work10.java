package com.itheima.work1;

public class work10 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int from = 3;
        int to = 7;
        int[] copy = copy(arr, from, to);
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
    }

    public static int[] copy(int[] arr, int from, int to) {
        int[] brr = new int[to - from];
        for (int i = from, j = 0; i < to; i++, j++) {
            brr[j] = arr[i];
        }
        return brr;
    }
}
