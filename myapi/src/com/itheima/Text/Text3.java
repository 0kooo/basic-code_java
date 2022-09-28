package com.itheima.Text;

public class Text3 {
    public static void main(String[] args) {
        System.out.println(getSum(1));
    }

    public static int getSum(int day){
        if(day == 10){
            return 1;
        }else{
            return (getSum(day + 1) + 1) * 2;
        }
    }
}
