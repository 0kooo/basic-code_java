package com.itheima.A01map1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A02_mapDemo2 {
    public static void main(String[] args) {
        //1.创建Map对象
        Map<String, String> m = new HashMap<>();

        //2.添加元素
        m.put("郭靖","黄蓉");
        m.put("尹志平","小龙女");
        m.put("欧阳克","穆念慈");

        //3.通过键找值
        //3.1获取所以的键, 把这些键放在一个单列表集合中
        Set<String> keys = m.keySet();

        //3.2遍历单列集合, 得到每一个键值对
        //增强for
        /*for (String key : keys) {
            String value = m.get(key);
            System.out.println(key + " = " + value);
        }*/
        //迭代器
        /*Iterator<String> iterator = keys.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            String value = m.get(key);
            System.out.println(key + " = " + value);
        }*/
        //lambda表达式
        keys.forEach(s -> {
                String value = m.get(s);
                System.out.println(s + " = " + value);
        });
    }
}
