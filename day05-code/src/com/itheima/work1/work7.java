package com.itheima.work1;

public class work7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] brr = new int[10];
        int l = 0;
        int r = 5;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                brr[r] = arr[i];
                r++;
            }else{
                brr[l] = arr[i];
                l++;
            }
        }
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }
}
