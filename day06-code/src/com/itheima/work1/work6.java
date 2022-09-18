package com.itheima.work1;

public class work6 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,4};
        equals(arr1, arr2);
    }

    public static void equals(int[] arr1, int[] arr2) {
        boolean flag = true;
        if(arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i] != arr2[i]){
                    flag = false;
                }
            }
        }else{
            flag = false;
        }
        System.out.println(flag);
    }
}
