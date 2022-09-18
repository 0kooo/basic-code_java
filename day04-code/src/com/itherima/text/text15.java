package com.itherima.text;

import java.util.Scanner;

public class text15 {
    public static void main(String[] args) {
        //1.键盘录入两个数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字表示范围的开始");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数字表示范围的结束");
        int number2 = sc.nextInt();
        //2.利用循环获取这个范围中的每一个数字
        int count = 0;
        for(int i = number1 ; i <= number2 ; i++){
            //3.对每一个数字进行判断,统计有多少个满足要求的数字
            if(i % 3 == 0 && i % 5 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
