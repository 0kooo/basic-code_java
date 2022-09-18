package com.itheima.StringText;

public class text9 {
    public static void main(String[] args) {
        String phoneNumber = "15273311350";
        String start = phoneNumber.substring(0,3);
        String end = phoneNumber.substring(7);
        String result = start + "****" + end;
        System.out.println(result);
    }
}
