package com.itherima.text;

import java.util.Scanner;

public class text6 {
    public static void main(String[] args) {
        //1.键盘录入小明的考试成绩
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的考试成绩");
        int score = sc.nextInt();
        //2.根据不同分数做出判断
        if(score >= 0 && score <= 100){
            if(score >= 95 && score <= 100){
                System.out.println("送自行车一辆");
            }else if(score >= 90 && score <= 94){
                System.out.println("游乐场玩一天");
            }else if(score >= 80 && score <= 89){
                System.out.println("送变形金刚一个");
            }else{
                System.out.println("挨一顿打");
            }
        }else{
            System.out.println("当前录入成绩不合法");
        }
    }
}
