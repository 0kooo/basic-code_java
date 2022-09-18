package com.itheima.work1;

public class cellphoneText {
    public static void main(String[] args) {
        Cellphone phone = new Cellphone();
        phone.setBrand("小米");
        phone.setPrice(3998);
        phone.setColor("黑色");
        int price = phone.getPrice();
        String brand = phone.getBrand();
        String color = phone.getColor();
        System.out.println("正在使用价格为" + price + "元" + color + "的"+ brand +"手机打电话");
        System.out.println("正在使用价格为" + price + "元" + color + "的"+ brand +"手机发短信");

    }

}
