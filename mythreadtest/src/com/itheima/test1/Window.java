package com.itheima.test1;

public class Window extends Thread{
    static int count = 0;
    @Override
    public void run() {
        while(true){
            synchronized (Window.class){
                if(count == 1000){
                    break;
                }else{
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    count++;
                    System.out.println(getName() + "正在卖第" + count + "张票！！");
                }
            }
        }
    }
}
