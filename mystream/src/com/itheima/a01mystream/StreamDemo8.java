package com.itheima.a01mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class StreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌-1", "周芷若-2", "张三丰-3", "赵敏-4");
        //需求: 只读获取里面的年龄并进行打印
        //String -> int
        //第一个类型: 类型原本的数据类型
        //第二个类型: 要装成之后的类型

        //apply的形参s:依次表示里面的每一个数据
        //返回值: 表示转换之后的数据

        //当map方法执行完毕之后, 流上的数据就变成了整数
        //所以在下面forEach当中, s依次表示里面的每一个数据, 这个数据现在就是整数了
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] arr = s.split("-");
                String ageString = arr[1];
                int age = Integer.parseInt(ageString);
                return age;
            }
        }).forEach(s -> System.out.println(s));

        list.stream()
                .map(s -> Integer.parseInt(s.split("-")[1]))
                .forEach(s-> System.out.println(s));
    }
}
