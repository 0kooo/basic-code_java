package com.itheima.mysort;

public class A04_RecursionDemo3 {
    public static void main(String[] args) {
        int result = getFactorial(5);
        System.out.println(result);
    }

    public static int getFactorial(int number){
        if(number == 1){
            return 1;
        }
        return number * getFactorial(number - 1);
    }
}
