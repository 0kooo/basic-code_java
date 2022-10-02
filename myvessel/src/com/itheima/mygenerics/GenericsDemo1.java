package com.itheima.mygenerics;

public class GenericsDemo1 {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        Integer i = list.get(1);
        System.out.println(i);

        System.out.println(list);
    }
}
