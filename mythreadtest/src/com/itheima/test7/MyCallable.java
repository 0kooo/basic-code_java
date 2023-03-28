package com.itheima.test7;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread{
    ArrayList<Integer> list;
    
    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        ArrayList<Integer> listBox = new ArrayList<>();
        while (true) {
            synchronized (com.itheima.test5.MyThread.class){
                if(list.size() == 0){
                    System.out.println("在此次抽奖过程中，"+ getName() +"总共产生了6个奖项。\n" +
                            "分别为：" + listBox + "最高奖项为" + getMax(listBox) + "元，总计额为"+getSum(listBox)+"元");
                    break;
                }else{
                    Collections.shuffle(list);
                    int prise = list.remove(0);
                    listBox.add(prise);
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        return sum;
    }

    private int getMax(ArrayList<Integer> list) {
        int res = 0;
        for (Integer i : list) {
            if(res < i) res = i;
        }
        return res;
    }
}
