package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A03_CollectionDemo3 {
    public static void main(String[] args) {
        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

        //2.增强for遍历
        for (String s : coll) {
            System.out.println(s);
        }
    }
}
