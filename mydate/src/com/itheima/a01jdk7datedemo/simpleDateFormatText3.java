package com.itheima.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simpleDateFormatText3 {
    public static void main(String[] args) throws ParseException {
        String start1 = "2023年11月11日 00:00:00";
        String end1 = "2023年11月11日 00:10:00";
        String s1 = "2023年11月11日 00:01:00";
        String s2 = "2023年11月11日 00:11:00";

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = sdf1.parse(start1);
        Date endDate = sdf1.parse(end1);
        Date s1Date = sdf1.parse(s1);
        Date s2Date = sdf1.parse(s2);

        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long s1Time = s1Date.getTime();
        long s2Time = s2Date.getTime();

        if(startTime <= s1Time && endTime > s1Time){
            System.out.println("抢购成功");
        }else{
            System.out.println("抢购失败");
        }

        if(startTime < s2Time && endTime > s2Time){
            System.out.println("抢购成功");
        }else{
            System.out.println("抢购失败");
        }
    }
}
