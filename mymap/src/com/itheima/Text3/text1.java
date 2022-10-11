package com.itheima.Text3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class text1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "范闲","范建","范统","杜子藤","宋合泛","候笼藤");
        //方法一
        Random r = new Random();
        int index = r.nextInt(list.size());
        System.out.println(list.get(index));

        //方法二
        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
