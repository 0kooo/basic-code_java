package com.itheima.StringText;

public class text6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        String reslut = arrToString(arr);
        System.out.println(reslut);
    }

    public static String arrToString(int[] arr){
        if(arr == null){
            return "";
        }
        if(arr.length == 0){
            return "[]";
        }
        String reslut = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                reslut += arr[i];
            }else{
                reslut += arr[i] + ", ";
            }
        }
        reslut += "]";
        return reslut;
    }
}
