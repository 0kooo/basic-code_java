package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A04_CollectionDemo4 {
    public static void main(String[] args) {
        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

        //2.利用匿名内部类的形式
        //底层原理:
        //其实也会自己遍历集合,依次得到每一个元素
        //把得到的每个元素,传递给下面的sccept方法
        //s依次表示集合中的每一个数据
        /*coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        //lambda表达式
        coll.forEach( s -> System.out.println(s));
    }
}
