package com.itheima.mylist;

import java.util.ArrayList;
import java.util.List;

public class A01_ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");

        //1.在此集合中的指定位置插入指定的元素
        //细节:原来索引上的元素会依次往后移
        list.add(1,"qqq");

        //2.删除指定索引处的元素, 返回被删除的元素
        String remove = list.remove(1);
        System.out.println(remove);

        //3.修改指定索引处的元素, 返回被修改的元素
        String set = list.set(2, "bbb");
        System.out.println(set);

        //4.返回指定索引处的元素
        String s = list.get(0);
        System.out.println(s);

        System.out.println(list);
    }
}
