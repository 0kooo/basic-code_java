package com.itheima.a01mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张无忌", "周芷若", "张三丰", "赵敏", "张强", "张三丰");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"张翠山","张良");

        //distinct 元素去重, 依赖(hashCode和equals方法)
        //list1.stream().distinct().forEach(s -> System.out.println(s));

        //concat 合并a和b两个流为一个流,两个流数据尽量保持一致
        Stream.concat(list1.stream(), list2.stream()).forEach(s -> System.out.println(s));
    }
}
