package com.itherima.work;

import java.util.Scanner;

public class work5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数表示你的税前工资");
        int salary = sc.nextInt();
        double taxsalary = 0;
        double temp = 0;
        double tax = 0;
        if(salary > 5000){
            temp = salary - (salary * 0.1) - 5000;
            if(temp < 3000){
                tax = temp * 0.03;
            }
            else if(temp < 12000 && temp > 3000){
                tax = (3000 * 0.03) + ((temp - 3000) * 0.1);
            }
            else if(temp < 25000 && temp > 12000){
                tax = (3000 * 0.03) + (9000 * 0.1) + ((temp - 15000) * 0.2);
            }else if(temp > 12000 && temp <=25000){
                taxsalary = 3000*0.03 + 9000*0.1 +  (temp-12000)*0.2;
            }else if(temp > 25000 && temp <=35000){
                taxsalary = 3000*0.03 + 9000*0.1 + 13000*0.2 + (temp-25000)*0.25;
            }else if(temp > 35000 && temp <=55000){
                taxsalary = 3000*0.03 + 9000*0.1 + 13000*0.2 + 10000*0.25 + (temp-35000)*0.3;
            }else if(temp > 55000 && temp <=80000){
                taxsalary = 3000*0.03 + 9000*0.1 + 13000*0.2 + 10000*0.25 + 20000*0.3 + (temp-55000)*0.35;
            }else if(temp > 80000){
                taxsalary = 3000*0.03 + 9000*0.1 + 13000*0.2 + 10000*0.25 + 20000*0.3 + 25000*0.35 + (temp-80000)*0.45;
            }
            taxsalary = salary - tax - (salary * 0.1);
        }else{
            taxsalary = salary;
        }
        System.out.println("个人所得税" + tax);
        System.out.println("最后所得工资为" + taxsalary);
    }
}
