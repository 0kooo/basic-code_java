package com.itheima.work1;

public class work3 {
    public static void main(String[] args) {
        int yxrs = 24;
        int yzhsm = 8;
        int rise = 3;
        int end1 = yxrs + yzhsm + rise - 8;
        int end2 = yxrs / 3 * 2 + yzhsm + rise;
        int min = (end1 >= end2 ? end2 : end1);
        System.out.println(min);
    }
}
