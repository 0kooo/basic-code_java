package com.itheima.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simpleDateFormatText1 {
    public static void main(String[] args) throws ParseException {
        //1.定义一个字符串表示时间
        String str = "2023-11-11 11:11:11";
        //2.利用空参构造创建SimpleDateFormat对象
        //细节:
        //创建对象的格式要和字符串的格式完全一样
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf.parse(str);

        System.out.println(parse);
        System.out.println(parse.getTime());
    }

    public static void method(){
        {
            //1.利用空参构造创建SimpleDateFormat对象,默认格式
            SimpleDateFormat sdf1 = new SimpleDateFormat();
            Date d1 = new Date(0L);
            String str1 = sdf1.format(d1);
            System.out.println(str1);//1970/1/1 上午8:00

            //2.利用带参构造创建SimpleDateFormat对象, 指定格式
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            String str2 = sdf2.format(d1);
            System.out.println(str2);

            //课堂练习: yyyy年MM月dd日 HH:mm:ss 星期E

        }
    }
}
