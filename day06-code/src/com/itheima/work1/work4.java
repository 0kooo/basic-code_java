package com.itheima.work1;

public class work4 {
    public static void main(String[] args) {
        double num = -3.14;
        double res = getpositive(num);
        System.out.println(res);
    }

    public static double getpositive(double num) {
        double res = 0;
        if(num < 0){
            res = num * num - num;
        }else{
            res = num;
        }
        return res;
    }
}
