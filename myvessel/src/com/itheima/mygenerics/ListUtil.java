package com.itheima.mygenerics;

import java.util.ArrayList;

public class ListUtil {
    //类定义一个静态方法addAll, 用来添加多个集合的元素

    public static<E> void addAll(ArrayList<E> list, E e1, E e2){
        list.add(e1);
        list.add(e2);
    }
    public static<E> void addAll2(ArrayList<E> list, E...e){
        for (E element : e) {
            list.add(element);
        }
    }
}
