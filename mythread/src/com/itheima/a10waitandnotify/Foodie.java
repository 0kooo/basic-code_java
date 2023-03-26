package com.itheima.a10waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{
    ArrayBlockingQueue queue;

    public Foodie(ArrayBlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                Object food = queue.take();
                System.out.println(food);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
