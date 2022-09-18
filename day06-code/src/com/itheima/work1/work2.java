package com.itheima.work1;

public class work2 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int max = getMax(num1, num2, num3);
        System.out.println(max);
    }

    public static int getMax(int num1, int num2, int num3) {
        int temp = num1 > num2 ? num1 : num2;
        int max = temp > num3 ? temp : num3;
        return max;
    }
}
