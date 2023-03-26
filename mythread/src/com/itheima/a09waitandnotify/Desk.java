package com.itheima.a09waitandnotify;

public class Desk {
    //总个事
    public static int count = 10;
    //锁对象
    public static Object lock = new Object();
    //标记是否有面条：0：表示没有，1：表示有
    public static int foodFlag = 0;
}
