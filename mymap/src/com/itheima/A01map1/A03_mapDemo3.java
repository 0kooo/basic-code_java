package com.itheima.A01map1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A03_mapDemo3 {
    public static void main(String[] args) {
        //创建Map集合的对象
        Map<String, String> map = new HashMap<>();

        //添加元素
        map.put("标枪选手", "马超");
        map.put("人物挂件", "明世隐");
        map.put("御龙骑士", "尹志平");

        //3.Map集合的第二种遍历方式
        //通过键值对对象进行遍历
        //3.1通过一个方法获取所以的键值对对象, 返回一个Set集合
        Set<Map.Entry<String, String>> entries = map.entrySet();

        //3.2遍历entries这个集合, 去得到里面的每一个键值对对象
        /*for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }*/
        //迭代器
        /*Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            String key = next.getKey();
            String value = next.getValue();
            System.out.println(key + " = " + value);
        }*/
        //lambda表达式
        entries.forEach(stringStringEntry -> {
            String key = stringStringEntry.getKey();
            String value = stringStringEntry.getValue();
            System.out.println(key + " = " + value);
        });

    }
}
