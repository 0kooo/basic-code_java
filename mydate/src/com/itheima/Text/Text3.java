package com.itheima.Text;

public class Text3 {
    public static void main(String[] args) {
        int num = 100;
        StringBuilder sb = new StringBuilder();
        while(num != 0){
            int yu = num % 2;
            num = num / 2;
            sb.insert(0,yu);
        }
        System.out.println(sb);
    }
}
