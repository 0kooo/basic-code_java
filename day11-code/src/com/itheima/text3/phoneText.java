package com.itheima.text3;

import java.util.ArrayList;
import java.util.Scanner;

public class phoneText {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        Phone phone1 = new Phone("小米",1999);
        Phone phone2 = new Phone("华为",8000);
        Phone phone3 = new Phone("锤子",2999);

        list.add(phone1);
        list.add(phone2);
        list.add(phone3);

        ArrayList<Phone> result = getPhoneInfor(list, 3000);
        for (int i = 0; i < result.size(); i++) {
            Phone p = result.get(i);
            System.out.println(p.getName() +", " + p.getPrice());
        }
    }

    //小技巧:如果要返回多个值,可以将数据打包成集合或者数组
    public static ArrayList<Phone>  getPhoneInfor(ArrayList<Phone> list, int targetPrice) {
        ArrayList<Phone> resultPhone = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone ph = list.get(i);
            int price = ph.getPrice();
            if(price < targetPrice){
                resultPhone.add(ph);
            }
        }
        return resultPhone;
    }
}
