package com.itheima.StringText;

public class text10 {
    public static void main(String[] args) {
        String idNumber = "000000199909110090";
        String year = idNumber.substring(6,10);
        String month = idNumber.substring(10,12);
        String day = idNumber.substring(12,14);
        char gender = idNumber.charAt(16);
        System.out.println("人物信息为:");
        System.out.println("出生年月日:" + year + "年" + month +"月" + day +"日");
        int d = (int)gender - 48;
        if(d % 2 == 0){
            System.out.println("性别为:女");
        }else{
            System.out.println("性别为:男");
        }
    }
}
