package com.itheima.ArrayListText;

import java.util.ArrayList;

public class text1 {
    public static void main(String[] args) {
        //创建
        ArrayList<String> list = new ArrayList<>();

        //添加
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //删除
        boolean result1 = list.remove("aaa");
        System.out.println(result1);

        /*boolean result2 = list.remove("ddd");
        System.out.println(result2);

        String str = list.remove(2);
        System.out.println(str);*/

        //修改
        String result = list.set(1,"ddd");
        System.out.println(result);

        //查询
        String s = list.get(0);
        System.out.println(s);

        //遍历
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }
    }
}
