package com.itheima.a04threadmethod1;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        /*
            String getName()                返回此线程的名称
            void setName(String name)       设置线程的名字（构造方法也可以设置名字）
            细节：
                1、如果我们没有给线程设置名字，线程也是有默认的名字的
                    格式：Thread-X（序号，从0开始）
                2、如果我们要给线程设置名字，可以用set方法进行设置，也可以构造方法设置
            static Thread currentThread()   获取当前线程的对象
            细节：
                当JVM虚拟机启动之后，会自动的启动多线程
                其中有一条线程就叫main线程
                他的作用就是调用main方法，并执行里面的代码
                在以前，我们写的所以的代码，其实都是运行在main线程当中
            static void sleep(long time)    让线程休眠指定的时间，单位为毫秒
            细节：
                1、哪缇欧线程执行到这个方法，那么哪条线程就会在这里停留对应的时间
                2、方法的参数：就表示休眠的世界，单位为毫秒
                    1秒 = 1000毫秒
                3、当时间到了之后，线程会自动的醒来，继续执行下面的其他代码
        */

        /*MyThread t1 = new MyThread("飞机");
        MyThread t2 = new MyThread("坦克");

        t1.start();
        t2.start();*/

        //
        /*Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println(name);*/

        System.out.println("111");
        Thread.sleep(5000);
        System.out.println("222");
    }
}
