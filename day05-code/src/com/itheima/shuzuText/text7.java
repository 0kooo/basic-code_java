package com.itheima.shuzuText;

import java.util.Random;

public class text7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Random r = new Random();
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            int randomNuber = r.nextInt(arr.length);
            temp = arr[i];
            arr[i] = arr[randomNuber];
            arr[randomNuber] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
