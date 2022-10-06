package com.itheima.A01map1;

import java.util.HashMap;
import java.util.Map;

public class A04_mapDemo4 {
    public static void main(String[] args) {
        //创建map集合
        Map<String, String> map = new HashMap<>();

        //添加元素
        map.put("鲁迅", "这句话是我说的");
        map.put("曹操", "不可能绝对不可能");
        map.put("刘备", "接着奏乐接着舞");
        map.put("柯镇恶", "看我眼色行事");

        //利用lambda表达式进行遍历
        //底层:
        //forEach其实就是利用第二种方式进行遍历, 依次得到每一个键和值
        //再调用accept方法
        map.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}
