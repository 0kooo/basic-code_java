package com.itheima.work2;

public class Text {
    public static void main(String[] args) {
        Phone.size = 6;
        Phone ph1 = new Phone("小米", 1999);
        System.out.println(ph1.getBrand() + ", " + ph1.getPrice() + ", " + ph1.size);

        Phone ph2 = new Phone("华为", 3999);
        System.out.println(ph2.getBrand() + ", " + ph2.getPrice() + ", " + ph2.size);
    }
}
