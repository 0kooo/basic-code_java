package com.itheima.Text;

import java.util.ArrayList;
import java.util.Scanner;

public class Text1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(sum < 200){
            System.out.println("请输入一个整数");
            String s = sc.nextLine();
            int num = Integer.parseInt(s);
            if(num >= 1 && num <= 100){
                list.add(num);
                sum = 0;
                for (int i = 0; i < list.size(); i++) {
                    sum += list.get(i);
                }
            }
        }
        System.out.println(list);
    }
}
