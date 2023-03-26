package com.itheima.test2;

public class MyThread extends Thread{
    static int count = 100;

    @Override
    public void run() {
        while (true){
            synchronized (MyThread.class){
                if(count < 10){
                    break;
                }else{
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    count--;
                    System.out.println(getName() + "再送" +(100 - count)+ "个礼物，还剩"+ count +"个礼物！！");
                }
            }
        }
    }
}
