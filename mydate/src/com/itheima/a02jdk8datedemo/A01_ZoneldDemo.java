package com.itheima.a02jdk8datedemo;

import java.time.ZoneId;
import java.util.Set;

public class A01_ZoneldDemo {
    public static void main(String[] args) {
        //1.获取所以的时区名称
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());
        System.out.println(zoneIds);

        //2.获取当前系统的默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);//Asia/Shanghai

        //获取一个指定的时区
        ZoneId zoneId1 = ZoneId.of("Asia/Pontianak");
        System.out.println(zoneId1);

    }
}
