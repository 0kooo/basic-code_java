package com.itherima.work;

import java.util.Scanner;

public class work3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入所要存入的金额(1000起)");
        int money = sc.nextInt();
        System.out.println("请输入要存入的年限");
        int year = sc.nextInt();
        double endmoney = 0;
        switch (year){
            case 1 -> endmoney = money + (money * 0.0225 * year);
            case 2 -> endmoney = money + (money * 0.027 * year);
            case 3 -> endmoney = money + (money * 0.0325 * year);
            case 5 -> endmoney = money + (money * 0.036 * year);
            default -> System.out.println("请输入正确的年限");
        }
        System.out.println("本息为" + endmoney);
    }
}
