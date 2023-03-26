package com.itheima.a10waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{
    ArrayBlockingQueue queue;

    public Cook(ArrayBlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                queue.put("面条");
                System.out.println("厨师做了一碗面条");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
