package com.itheima.A01map1;

import java.util.HashMap;
import java.util.Map;

public class A01_mapDemo1 {
    public static void main(String[] args) {
        //创建map对象
        Map<String, String> m = new HashMap<>();

        //添加元素
        //put方法的细节:
        //添加和覆盖
        //在添加数据的时候, 如果键不存在, 那么直接把键值对对象添加到map集合当中, 方法返回null
        //在添加数据的时候, 如果键存在, 那么会把原有的键值对对象覆盖, 会把覆盖的值进行返回
        m.put("郭靖", "黄蓉");
        m.put("韦小宝", "沐剑屏");
        m.put("尹志平", "小龙女");

        //根据键删除键值对应元素
        String result = m.remove("郭靖");
        System.out.println(result);
        
        //移除所有的键值对应元素
        //m.clear();
        
        //判断集合是否包含指定的键
        boolean keyResult = m.containsKey("郭靖");
        System.out.println(keyResult);

        //判断集合是否包含指定的值
        boolean valueResult = m.containsValue("小龙女");
        System.out.println(valueResult);

        //判断集合是否为空
        boolean empty = m.isEmpty();
        System.out.println(empty);

        //集合的长度, 也就是集合中的键值
        int size = m.size();
        System.out.println(size);
    }
}
