package com.itheima.test5;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread{
    ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class){
                if(list.size() == 0){
                    break;
                }else{
                    Collections.shuffle(list);
                    int prise = list.remove(0);
                    System.out.println(getName() + " 又产生了一个 "+ prise + " 元大奖");
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
