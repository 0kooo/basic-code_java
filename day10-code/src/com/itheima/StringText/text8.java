package com.itheima.StringText;

import java.util.Scanner;

public class text8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个金额");
        int money;
        while(true){
            money = sc.nextInt();
            if(money >= 0 && money <= 9999999){
                break;
            }else{
                System.out.println("金额错误");
            }
        }

        String moneyString = "";
        while(money > 0){
            int ge = money % 10;
            moneyString = getCapitalNumber(ge) + moneyString;
            money = money / 10;
        }

        int count = 7 - moneyString.length();
        for(int i = 0 ; i < count ; i++){
            moneyString = "零" + moneyString;
        }

        String[] arr = {"佰","仟","万","仟","佰","拾","元"};
        String result = "";
        for (int i = 0; i < moneyString.length(); i++) {
            char c = moneyString.charAt(i);
            result = result + c + arr[i];
        }
        System.out.println(result);

    }
    public static String getCapitalNumber(int number){
        String[] bigNumber = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return bigNumber[number];
    }
}
