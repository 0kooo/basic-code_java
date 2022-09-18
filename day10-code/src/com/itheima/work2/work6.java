package com.itheima.work2;

import java.util.StringJoiner;

public class work6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        String result = getNewString(arr);
        System.out.println(result);
    }
    public static String getNewString(int[] arr){
        if(arr == null){
            return null;
        }
        if(arr.length == 0){
            return "[]";
        }
        StringJoiner sj = new StringJoiner(", ","[","]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i] + "");
        }
        String result = sj.toString();
        return result;
    }
}
