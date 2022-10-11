package com.itheima.A03mycollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Integer> list = new ArrayList<>();

        //添加元素
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100);

        //排序
        Collections.sort(list);
        System.out.println(list);
        System.out.println("------------------------------------");

        //根据指定的规律进行排序
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(list);
        System.out.println("------------------------------------");

        //以二分查找法查找元素
        int index = Collections.binarySearch(list, 1);
        System.out.println(index);//-1 我有疑问
        System.out.println("------------------------------------");

        //拷贝集合中的元素
        ArrayList<Integer> listCpy = new ArrayList<>();
        Collections.addAll(listCpy, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Collections.copy(listCpy, list);
        System.out.println(listCpy);
        System.out.println("------------------------------------");

        //使用指定的元素填充集合
        //Collections.fill(list,2);
        System.out.println(list);
        System.out.println("------------------------------------");

        //根据默认的自然排序获取最大/小
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println("------------------------------------");

        //交换集合中指定位置的元素
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 1, 2, 3);
        Collections.swap(list2, 0, 1);
        System.out.println(list2);
    }
}
