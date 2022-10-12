package com.itheima.Text3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class text3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 =new ArrayList<>();
        Collections.addAll(list1,"范闲","范建","范统","杜子藤","宋合泛","候笼藤");
        int size = list1.size();
        Random r = new Random();
        for (int i = 0; i < 2; i++) {
            System.out.println("-------------------------------------");
            for (int j = 0; j < size; j++) {
                int index = r.nextInt(list1.size());
                String name = list1.remove(index);
                list2.add(name);
                System.out.println(name);
            }
            list1.addAll(list2);
            list2.clear();
        }
    }
}
