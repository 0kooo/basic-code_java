package com.itheima.Text2;

import java.util.*;

public class text {
    public static void main(String[] args) {
        //1.需要先让同学们投票
        //定义一个数组, 存储4个景点
        String[] arr = {"A", "B", "C", "D"};
        //利用随机数模拟80个同学投票, 并把投票的结果存储起来
        Random r = new Random();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }
        //2.如果要统计的东西比较多, 不方便使用计数器思想
        //我们可以定义map集合, 利用集合进行统计
        HashMap<String,Integer> hm = new HashMap<>();
        for (String name : list) {
            if(hm.containsKey(name)){
                int count = hm.get(name);
                count++;
                hm.put(name,count);
            }else{
                hm.put(name, 1);
            }
        }
        System.out.println(hm);
        //找出投票人数最多的票数
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if(max < count){
                max = count;
            }
        }
        System.out.println(max);
        //打印票数最多的景点
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if(max == count){
                System.out.println(entry.getKey());
            }
        }
    }
}
