package com.itheima.a01threadpool1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPoolDemo {
    public static void main(String[] args) {
        /*
            public static ExecutorService newCachedThreadPool()             创建一个没有上限的线程池
            public static ExecutorService newFixedThreadPool (int nThreads) 创建有上限的线程池
        */
        /*ExecutorService pool1 = Executors.newCachedThreadPool();

        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());

        pool1.shutdownNow();*/

        ExecutorService pool1 = Executors.newFixedThreadPool(3);
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());


    }
}
