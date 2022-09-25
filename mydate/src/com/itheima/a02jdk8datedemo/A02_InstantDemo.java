package com.itheima.a02jdk8datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class A02_InstantDemo {
    public static void main(String[] args) {
        //1.获取当前时间的Instant对象(标准时间)
        //Instant now = Instant.now();
        //System.out.println(now);

        //2.根据(秒/毫秒/纳秒)获取Instant对象
        Instant instant1 = Instant.ofEpochMilli(0L);
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochSecond(1L);
        System.out.println(instant2);

        Instant instant3 = Instant.ofEpochSecond(1L,1000000000L);
        System.out.println(instant3);

        //3.指定时区
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);

        //4.isXXX 判断
        Instant instant4 = Instant.ofEpochMilli(0L);
        Instant instant5 = Instant.ofEpochMilli(1000L);

        //5.用于时间的判断
        //isBefore: 判断调用者代表的时间是否在参数表示的时间的前面
        boolean result1 = instant4.isBefore(instant5);
        System.out.println(result1);

        //isAfter: 判断调用者代表的时间是否在参数表示的时间的后面
        boolean result2 = instant4.isAfter(instant5);
        System.out.println(result2);

        //6.minusSeconds 减少时间系数的方法
        Instant instant6 = Instant.ofEpochMilli(3000L);
        System.out.println(instant6);

        Instant instant7 = instant6.minusSeconds(1);
        System.out.println(instant7);
    }
}
