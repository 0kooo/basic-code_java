package com.itheima.test7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    ArrayList<Integer> list;

    public MyCallable(ArrayList<Integer> list) {
        this.list = list;
    }

    private int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        return sum;
    }

    @Override
    public Integer call() throws Exception {
        ArrayList<Integer> listBox = new ArrayList<>();
        while (true) {
            synchronized (com.itheima.test5.MyThread.class){
                if(list.size() == 0){
                    System.out.println("在此次抽奖过程中，"+ Thread.currentThread().getName() +"总共产生了6个奖项。\n" +
                            "分别为：" + listBox + "最高奖项为" + Collections.max(listBox) + "元，总计额为"+getSum(listBox)+"元");
                    break;
                }else{
                    Collections.shuffle(list);
                    int prise = list.remove(0);
                    listBox.add(prise);
                }
            }
            Thread.sleep(10);
        }
        if(listBox.size() == 0){
            return null;
        }else{
            return Collections.max(listBox);
        }
    }
}
