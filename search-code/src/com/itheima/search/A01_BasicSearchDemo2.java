package com.itheima.search;

import java.util.ArrayList;

public class A01_BasicSearchDemo2 {
    public static void main(String[] args) {
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79, 81};
        int target = 81;
        ArrayList<Integer> integers = basicSearch(arr, target);
        System.out.println(integers);

    }

    public static ArrayList<Integer> basicSearch(int[] arr, int target){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if(num == target){
                list.add(i);
            }
        }
        return list;
    }
}
