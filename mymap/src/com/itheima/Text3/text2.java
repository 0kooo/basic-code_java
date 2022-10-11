package com.itheima.Text3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class text2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> listBoy = new ArrayList<>();
        ArrayList<String> listGirl = new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);
        Collections.addAll(listBoy, "范闲","范建","范统");
        Collections.addAll(listGirl, "杜子藤","宋合泛","候笼藤");
        Collections.shuffle(list);
        Random r = new Random();
        int index = r.nextInt(list.size());
        int number = list.get(index);
        if(number == 1){
            int boy = r.nextInt(listBoy.size());
            System.out.println(listBoy.get(boy));
        }else{
            int girl = r.nextInt(listGirl.size());
            System.out.println(listGirl.get(girl));
        }
    }
}
