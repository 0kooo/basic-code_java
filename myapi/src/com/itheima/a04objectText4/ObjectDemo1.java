package com.itheima.a04objectText4;

public class ObjectDemo1 {
    public static void main(String[] args) {
        //1.toString    返回对象的字符串表示形式
        Object obj = new Object();
        String str1 = obj.toString();
        System.out.println(str1);

        //2.equals  比较两个对象是否相等
        //结论
        //1.如果没有重写equals方法, 那么默认使用Object中的方法进行比较,比较地址值是否相等
        //2.一般来讲地址值对我们意义不大,所以我们会重写,再比较对象内的属性值

        //3.clone   对象克隆
        //细节:
        //方法在底层会帮我们创建一个对象, 并把原对象中的数据拷贝过去
        //书写细节:
        //1.重写Object中的clone方法
        //2.让javabean类实现Cloneable接口
        //3.创建原对象并调用clone就可以了
    }
}
