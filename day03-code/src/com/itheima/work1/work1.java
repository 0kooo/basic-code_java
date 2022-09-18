package com.itheima.work1;

public class work1 {
    public static void main(String[] args) {
        int fatherHeight = 177;
        int motherHeight = 165;
        double sonHeight = (fatherHeight + motherHeight) * 1.08 / 2;
        double daughterHeight = (fatherHeight * 0.923 + motherHeight) / 2;

        System.out.println("儿子身高:" + sonHeight);
        System.out.println("女儿身高:" + daughterHeight);
    }
}
