package com.itheima.work1;

public class work1 {
    public static void main(String[] args) {
        double num1 = 1.1;
        double num2 = 1.2;
        double min = getmin(num1, num2);
        System.out.println(min);
    }

    public static double getmin(double num1, double num2) {
        double res = num1 > num2 ? num2 : num1;
        return res;
    }
}
