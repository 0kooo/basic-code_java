package com.itheima.Method;

public class text7 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        getarr(arr);
    }
    public static void getarr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1]);
        System.out.println("]");
    }
}
