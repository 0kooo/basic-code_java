package com.itheima.xunHuanText;

import java.util.Scanner;

public class Text4 {
    public static void main(String[] args) {
        //1.键盘录入两只老虎的体重
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重");
        int tigerweight1 = sc.nextInt();
        System.out.println("请输入第二只老虎的体重");
        int tigherweight2 = sc.nextInt();

        //2.比较
        //boolean reslut = tigerweight1== tigherweight2 ? true :false;
        String reslut = tigerweight1 == tigherweight2 ? "相同" :"不同";
        System.out.println(reslut);
    }
}
