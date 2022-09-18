package com.itheima.text1;

public class text5 {
    public static void main(String[] args) {
        int num = 1983;
        int numTemp = num;
        int i = 0;
        while(num != 0){
            int temp1 = num % 10;
            num = (num - temp1) / 10;
            i++;
        }
        int[] arr = new int[i];
        int count = 0;
        while(numTemp != 0){
            int temp2 = numTemp % 10;
            arr[count] = temp2;
            numTemp = (numTemp - temp2) / 10;
            count++;
        }
        for (int j = 0; j < arr.length; j++) {
            arr[j] += 5;
            arr[j] %= 10;
        }
        int number = 0;
        for (int j = 0; j < arr.length; j++) {
            number = number * 10 + arr[j];
        }
        System.out.println(number);
    }
}
