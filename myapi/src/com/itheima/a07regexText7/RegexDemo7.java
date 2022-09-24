package com.itheima.a07regexText7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo7 {
    public static void main(String[] args) {
        String s = "Java自从95年问世以来,经历了很多版本,abbbbbbbbbbaaaaaaaaaaaaaaaaa,目前企业中用的最多的是Java8和Java11,"+
                "因为这两个是长期支持版本, 下一个长期支持版本是Java17, 相信在未来不久JAVA17也会逐渐登上历史舞台";

        //贪婪爬取: 在爬取数据时候尽可能的多获取数据
        //非贪婪爬取:在爬取数据时候尽可能的少获取数据

        //贪婪爬取
        String regex1 = "ab+";

        //非贪婪爬取
        String regex2 = "ab+?";
        Pattern p = Pattern.compile(regex1);
        Matcher m = p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
