package com.itherima.work;

import java.util.Scanner;

public class work7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int number2 = sc.nextInt();
        int sum = 0;
        if(number1 > number2){
            for(int i = number2 + 1 ; i < number1 ; i++){
                sum += i;
            }
        }else{
            for(int i = number1 + 1 ; i < number2 ; i++){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
