package com.itheima.search;

public class A02_BinarySearchDemo1 {
    public static void main(String[] args) {
        //二分查找/折半查找
        //核心:
        //每次排除一半的查找范围

        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int target = 103;
        int index = binarySearch(arr, target);
        System.out.println(index);

    }

    public static int binarySearch(int[] arr, int target){
        int min = 0;
        int max = arr.length - 1;
        while(min <= max){
            int mid = (min + max) / 2;
            if(arr[mid] > target){
                max = mid - 1;
            }else if(arr[mid] < target){
                min = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
