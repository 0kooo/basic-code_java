package com.itheima.Text;

public class Text4 {
    public static void main(String[] args) {
        System.out.println(getSum(20));
    }

    public static int getSum(int num){
        if(num == 1){
            return 1;
        }
        if(num == 2){
            return 2;
        }
        if(num == 3){
            return 4;
        }
        return getSum(num - 1) + getSum(num - 2) + getSum(num - 3);
    }
}
