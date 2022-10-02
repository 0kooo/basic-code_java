package com.itheima.mygenerics;

import java.util.ArrayList;

public class GenericsDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ListUtil.addAll(list1,"aaa", "bbb");
        System.out.println(list1);

    }
}
