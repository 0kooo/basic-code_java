package com.itheima.mylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class A02_ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //1.迭代器
        /*Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }*/
        System.out.println("------------------");

        //2.列表迭代器
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            String str = it.next();
            if("bbb".equals(str)){
                list.add("qqq");
            }
        }
        System.out.println(list);
        System.out.println("------------------");
        //3.增强for
        /*for (String s : list) {
            System.out.println(s);
        }
        System.out.println("------------------");*/

        //4.Lambda表示式
        /*list.forEach( s -> System.out.println(s));
        System.out.println("------------------");*/

        //5.普通for循环
        /*for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }*/
    }
}
