package com.itherima.text;

public class text2 {
    public static void main(String[] args) {
        //1.定义三个变量表示灯的状态
        boolean isLinghtGreen = false;
        boolean isLinghtYellow = false;
        boolean isLinghtRed  = true;
        //2.判断
        if(isLinghtGreen){
            System.out.println("GoGOGo!");
        }
        if(isLinghtYellow){
            System.out.println("slow!!!");
        }
        if(isLinghtRed){
            System.out.println("stop!!!");
        }
    }
}
