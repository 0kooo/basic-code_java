package com.itheima.a01immutable;

import java.util.Map;
import java.util.Set;

public class ImmutableDemo3 {
    public static void main(String[] args) {
        //细节1:
        //键是不能重复的
        //细节2:
        //Map里面的of方法, 参数是有上线的, 最多只能传递20个参数, 10个键值对
        //细节3:
        //如果我们要传递对个键值对对象, 数量大于10个, 在Map接口中还有一个方法
        Map<String, String> map = Map.of("张三","南京","李四","北京","王五","上海");

        Set<String> strings = map.keySet();
        for (String string : strings) {
            String s = map.get(string);
            System.out.println(s);
        }
        System.out.println("----------------------------");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("----------------------------");


    }
}
