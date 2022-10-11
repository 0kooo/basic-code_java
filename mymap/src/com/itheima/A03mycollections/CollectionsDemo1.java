package com.itheima.A03mycollections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        //addAll 批量添加元素
        //1.创建集合对象
        ArrayList<String> list = new ArrayList<>();
        //2.批量添加元素
        Collections.addAll(list,"123","456","abc");
        //3.打印集合
        System.out.println(list);

        //shuffle 打乱
        Collections.shuffle(list);
        System.out.println(list);
    }
}
