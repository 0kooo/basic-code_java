package com.itheima.work2;

import java.util.ArrayList;

public class work1 {
    public static void main(String[] args) {
        String[] StrArr = {"aaa", "bbb", "aaa", "aaa", "ccc", "bbb"};
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < StrArr.length; i++) {
            list.add(StrArr[i]);
        }
        System.out.println(list);
    }
}
