package com.itheima.work1;

public class work9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,};
        int newLength = 5;
        int[] res = copy(arr, newLength);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] copy(int[] arr, int newLength) {
        int[] brr = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            brr[i] = arr[i];
        }
        return brr;
    }
}
