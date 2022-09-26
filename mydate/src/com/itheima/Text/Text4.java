package com.itheima.Text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Text4 {
    public static void main(String[] args) throws ParseException {
        //JDK7
        //规则: 只要对时间进行计算或者判断, 都需要先获取当前时间的毫秒值
        //1.计算出生年月日的毫秒值
        String birthday = "2003年11月25日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(birthday);
        long birthdayTime = date.getTime();

        //2.获取当前时间的毫秒值
        long newTime = System.currentTimeMillis();

        //3.计算间隔多少天
        long time = newTime - birthdayTime;
        System.out.println(time / 1000 / 3600 / 24);

        //JDK8
        LocalDate ld1 = LocalDate.of(2003,11,25);
        LocalDate ld2 = LocalDate.now();

        long days = ChronoUnit.DAYS.between(ld1, ld2);
        System.out.println(days);
    }
}
