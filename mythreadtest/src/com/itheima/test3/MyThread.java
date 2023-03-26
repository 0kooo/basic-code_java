package com.itheima.test3;

public class MyThread extends Thread{
    static int count = 0;
    @Override
    public void run() {
        while (true){
            synchronized (MyThread.class){
                if(count > 100){
                    break;
                }else{
                    if(count % 2 == 1){
                        System.out.println(getName() + "获取到了" + count);
                    }
                    count++;
                }
            }
        }
    }
}
