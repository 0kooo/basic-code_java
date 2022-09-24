package com.itheima.a07regexText7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {
    public static void main(String[] args) {
        String str = "Java自从95年问世以来,经历了很多版本,目前企业中用的最多的是Java8和Java11,"+
                "因为这两个是长期支持版本, 下一个长期支持版本是Java17";

        //Pattern: 表示正则表达式
        //Matcher: 文本匹配器, 作用按照正则表达式的规则去读取字符串,从头开始读取.
        //          在大串的字符串中去找符合匹配规则的字串

        //method1(str);

        //1.获取正则表达式的对象
        Pattern p = Pattern.compile("Java\\d{0,2}");
        //2.获取文本匹配器的对象
        //拿着m去读取str, 找寻符合p规律的子串
        Matcher m = p.matcher(str);

        //3.利用循环获取
        while(m.find()){
            String s = m.group();
            System.out.println(s);
        }



    }

    private static void method1(String str) {
        //获取正则表达式的对象
        Pattern p = Pattern.compile("Java\\d{0,2}");
        //获得文本匹配器
        //m: 文本匹配器的对象
        //str: 大串
        //p: 规则
        //m要在str中寻找符合p规律的小串
        Matcher m = p.matcher(str);

        //拿着文本匹配器从头开始读取,寻找是否有满足规律的子串
        //如果没有, 方法返回false
        //如果有, 返回true 在底层记录子串的起始索引和结束索引 + 1
        boolean b = m.find();

        //方法底层会根据find方法记录的索引进行字符串的截取
        //subString(起始索引, 结束索引); 包头不包尾
        //(0,4) 但不包含4索引
        //会把截取的小串返回
        String s1 = m.group();
        System.out.println(s1);
    }
}
