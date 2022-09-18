package com.itheima.StringText;

public class text2 {
    public static void main(String[] args) {
        //1.使用直接赋值的方式获取一个字符串数组
        String s1 = "abc";
        System.out.println(s1);

        //2.使用new到方式来获取一个字符串对象
        //空参构造:可以获取一个空白的字符串对象
        String s2 = new String();
        System.out.println("@" + s2 + "!");

        //传递一个字符串,根据传递的字符串内容再创建一个新的字符串对象
        String s3 = new String("abc");
        System.out.println(s3);

        //传递一个字符串,根据传递的字符串内容再创建一个新的字符串对象
        //应用场景:我要修改字符串的内容
        char[] chs = {'a', 'b', 'c', 'd'};
        String s4 = new String(chs);
        System.out.println(s4);

        //传递一个字符串,根据传递的字符串内容再创建一个新的字符串对象
        //应用场景:以后在网络当中传输的数据其实是字节信息
        byte[] bytes = {97,98,99,100};
        String s5 = new String(bytes);
        System.out.println(s5);
    }
}
