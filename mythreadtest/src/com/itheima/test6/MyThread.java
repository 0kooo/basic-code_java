package com.itheima.test6;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread{
    ArrayList<Integer> list;

    //static ArrayList<Integer> list1 = new ArrayList<>();
    //static ArrayList<Integer> list2 = new ArrayList<>();

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        ArrayList<Integer> listBox = new ArrayList<>();
        while (true) {
            synchronized (com.itheima.test5.MyThread.class){
                if(list.size() == 0){
                    /*if(getName().equals("抽奖箱1")){
                        System.out.println("在此次抽奖过程中，"+ getName() +"总共产生了6个奖项。\n" +
                                "分别为：" + list1 + "最高奖项为" + getMax(list1) + "元，总计额为"+getSum(list1)+"元");
                    }else{
                        System.out.println("在此次抽奖过程中，"+ getName() +"总共产生了6个奖项。\n" +
                                "分别为：" + list2 + "最高奖项为" + getMax(list2) + "元，总计额为"+getSum(list2)+"元");
                    }*/
                    System.out.println("在此次抽奖过程中，"+ getName() +"总共产生了6个奖项。\n" +
                            "分别为：" + listBox + "最高奖项为" + getMax(listBox) + "元，总计额为"+getSum(listBox)+"元");
                    break;
                }else{
                    Collections.shuffle(list);
                    int prise = list.remove(0);
                    listBox.add(prise);
                    /*if(getName().equals("抽奖箱1")){
                        list1.add(prise);
                    }else{
                        list2.add(prise);
                    }*/
                    //System.out.println(getName() + " 又产生了一个 "+ prise + " 元大奖");
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
