package com.itheima.A01map1;

import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class A08_TreeMapDemo8 {
    public static void main(String[] args) {
        //新统计思想: 利用map集合进行统计
        //如果题目中没有要求对结果进行排序, 默认使用HashMap
        //如果题目中要求对结果进行排序, 请使用TreeMap
        TreeMap<Character, Integer> tm = new TreeMap<>();
        String s = "aababcabcdabcde";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(tm.containsKey(c)){
                int count = tm.get(c);
                count++;
                tm.put(c,count);
            }else{
                tm.put(c,1);
            }
        }
        System.out.println(tm);
        //遍历集合, 并按照指定的格式进行拼接
        /*StringBuilder sb = new StringBuilder();
        tm.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character key, Integer value) {
                sb.append(key).append("(").append(value).append(")");
            }
        });*/

        StringJoiner sj = new StringJoiner("","","");
        tm.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character key, Integer value) {
                sj.add(key +"").add("(").add(value + "").add(")");
            }
        });
        System.out.println(sj);
    }
}
