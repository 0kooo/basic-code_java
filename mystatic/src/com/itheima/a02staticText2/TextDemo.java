package com.itheima.a02staticText2;

public class TextDemo {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String result = ArrayUtil.pirntArr(arr1);
        System.out.println(result);

        double[] arr2 = {1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9};
        double avg = ArrayUtil.getAverage(arr2);
        System.out.println(avg);
    }
}
