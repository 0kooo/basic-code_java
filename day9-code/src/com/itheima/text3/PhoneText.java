package com.itheima.text3;

public class PhoneText {
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];

        Phone p1 = new Phone("小米",1999,"黑");
        Phone p2 = new Phone("华为",4999,"白");
        Phone p3 = new Phone("vivo",3999,"彩色");
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum += phone.getPrice();
        }
        double avg = sum * 1.0 / arr.length;
        System.out.println(avg);
    }
}
