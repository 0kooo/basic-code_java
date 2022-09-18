package com.itheima.shuzuText;

public class text1 {
    public static void main(String[] args) {
        //1.
        int[] x = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
            System.out.println(x[i]);
        }
        System.out.println(sum);
    }
}
