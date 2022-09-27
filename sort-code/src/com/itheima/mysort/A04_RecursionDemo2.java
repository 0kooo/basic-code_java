package com.itheima.mysort;

public class A04_RecursionDemo2 {
    public static void main(String[] args) {
        int sum = getSum(100);
        System.out.println(sum);
    }

    public static int getSum(int number){
        if(number == 1){
            return 1;
        }
        return number + getSum(number - 1);
    }
}
