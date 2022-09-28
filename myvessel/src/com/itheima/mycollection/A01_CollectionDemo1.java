package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A01_CollectionDemo1 {
    public static void main(String[] args) {
        //注意点:
        //Collection是一个接口,我们不能直接创建对象,所以现在我们学习他的方法时,只能创建他实现的对象
        //实现类:ArrayList

        Collection<String> coll = new ArrayList<>();

        //1.添加元素
        //细节1: 如果我们要往List系列集合中添加数据, 那么方法永远返回true, 因为List系列的是允许元素重复
        //细节2: 如果我们要往Set系列集合中添加数据,如果元素不存在,返回true,如果元素存在,返回false.因为Set系列的集合不允许重复

        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);

        //2.清理元素
        /*coll.clear();
        System.out.println(coll);*/

        //3.删除
        //细节1: 因为Collection里面定义的是共性方法, 所以此时不能通过索引进行删除, 只能通过元素的对象进行删除
        //细节2: 方法会有一个返回值,如果元素存在,返回true删除成功,否则返回false删除失败
        coll.remove("aaa");
        System.out.println(coll);

        //4.判断元素是否包含
        boolean result1 = coll.contains("bbb");
        System.out.println(result1);

        //5.判断集合是否为空
        boolean result2 = coll.isEmpty();
        System.out.println(result2);

        //6.获取集合的长度
        int size = coll.size();
        System.out.println(size);
    }
}
