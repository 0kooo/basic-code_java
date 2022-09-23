package com.itheima.a01mathText1;

public class MathDemo2 {
    public static void main(String[] args) {
        double sum = 0;
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            sum = Math.pow(ge,3) + Math.pow(shi,3) + Math.pow(bai,3);
            if(sum == i){
                count++;
            }
        }
        System.out.println(count);
    }
}
