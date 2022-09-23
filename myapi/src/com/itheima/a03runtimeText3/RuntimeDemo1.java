package com.itheima.a03runtimeText3;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        //获取Runtime的对象
        Runtime r1 = Runtime.getRuntime();

        //exit 停止虚拟机
        //Runtime.getRuntime().exit(0);

        //获取CPU的线程数
        System.out.println(Runtime.getRuntime().availableProcessors());

        //JVM总内存大小,单位byte字节
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);

        //JVM已经获取的内存大小,单位byte字节
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);

        //JVM剩余内存大小,单位byte字节
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);

        //运行cmd命令
        Runtime.getRuntime().exec("notepad");

        //shutdown : 关机
        //加上参数才能运行
        //-s : 默认在一分钟之后关机
        //-s -t 指定时间: 指定关机时间,单位(秒)
        //-a : 取消关机操作
        //-r : 关机并重启
    }
}
