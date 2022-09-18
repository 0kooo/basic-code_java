package com.itheima.StringBuilder;

public class text2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String result = arrToString(arr);
        System.out.println(result);
    }

    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i] + ", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
