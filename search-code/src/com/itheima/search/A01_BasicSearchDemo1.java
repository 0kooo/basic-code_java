package com.itheima.search;

public class A01_BasicSearchDemo1 {
    public static void main(String[] args) {
        //基本查找
        //核心:
        //从0 索引开始挨个往后查找
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79};
        int target = 8;
        boolean b = basicSearch(arr, target);
        System.out.println(b);
    }

    public static boolean basicSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if(num == target){
                return true;
            }
        }
        return false;
    }
}
