package com.itheima.a01immutable;

import java.util.HashMap;
import java.util.Map;

public class ImmutableDemo4 {
    public static void main(String[] args) {
        //创建Map的不可变集合, 键值对的数量超过10个
        HashMap<String, String> hm = new HashMap<>();
        hm.put("张三", "南京");
        hm.put("李四", "北京");
        hm.put("王五", "上海");
        hm.put("赵六", "深圳");

        /*//获取到所以的键值对对象
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        //把entries变成一个数组
        Map.Entry[] arr1 = new Map.Entry[0];
        //toArray方法在底层会比较集合的长度跟数组的长度两者的大小
        //如果集合的长度 > 数组的长度 : 数据在数组中放不下, 此时会根据实际的数据的个数重新创建数组
        //如果集合长度 <= 数组长度 : 数据在数组中放的下, 此时 不会创建新的数组, 而是直接用
        Map.Entry[] arr2 = entries.toArray(arr1);
        //不可变集合
        Map map = Map.ofEntries(arr2);*/

        //Map<Object, Object> map = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));
        Map<String, String> map = Map.copyOf(hm);

    }
}
