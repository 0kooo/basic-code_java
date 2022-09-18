package com.itherima.text;

public class text14 {
    public static void main(String[] args) {
        //1.获取1~100之间的每一个数
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            //2.累加求和(先判断,再求和)
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
