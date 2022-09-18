package com.itheima.work2;

import java.util.Random;

public class work2 {
    public static void main(String[] args) {
        Random r = new Random();
        char[] arr = new char[58];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char)(65 + i);
        }
        int count = 0;
        String result = "";
        while(count < 4){
            int index = r.nextInt(58);
            if(index < 26 || index > 31){
                result += arr[index];
                count++;
            }
        }
        int number = r.nextInt(10);
        result += number;
        char[] resultArr = result.toCharArray();
        int index = r.nextInt(4);
        char temp = resultArr[index];
        resultArr[index] = resultArr[resultArr.length - 1];
        resultArr[resultArr.length - 1] = temp;
        String reslutStr = new String(resultArr);
        System.out.println(reslutStr);
    }
}
