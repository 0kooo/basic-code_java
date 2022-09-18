package com.itherima.work;

public class work1 {
    public static void main(String[] args) {
        int price = 7988;
        int ers = 1500;
        double discount = 7988 * 0.8;
        if((price - 1500) > discount){
            System.out.println("以旧换新");
        }else{
            System.out.println("不要以旧换新");
        }
    }
}
