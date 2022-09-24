package com.itheima.a07regexText7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo6 {
    public static void main(String[] args) {
        String s = "Java自从95年问世以来,经历了很多版本,目前企业中用的最多的是Java8和Java11,"+
        "因为这两个是长期支持版本, 下一个长期支持版本是Java17, 相信在未来不久JAVA17也会逐渐登上历史舞台";

        //1.定义正则表达式
        //?理解为前面的数据Java
        //=表示在Java后面要跟随是数据
        //但是在获取的时候,只获取前半部分
        String regex1 = "((?i)Java)(?=8|11|17)";
        get(regex1,s);

        //需求2
        String regex2 = "((?i)Java)\\d{1,2}";
        String regex4 = "((?i)Java)(?:8|11|17)";
        get(regex2,s);

        //需求3
        String regex3 = "((?i)Java)(?!8|11|17)";
        get(regex3,s);
    }
    public static void get(String regex, String s){
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
