package com.itheima.myiotest4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) throws IOException {
        /*需求：
            一个文件里面存储了班级同学的姓名，每一个姓名占一行。
            要求通过程序实现随机点名器。
            第三次必定是张三同学

          运行效果：
            第一次运行程序：随机同学姓名1
            第二次运行程序：随机同学姓名2
            第三次运行程序：张三
            …
        */

        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("E:\\cod\\basic-code\\myIoText\\names.txt"));
        String c;
        while ((c = br.readLine()) != null) {
            list.add(c);
        }
        br.close();

        BufferedReader br2 = new BufferedReader(new FileReader("E:\\cod\\basic-code\\myIoText\\src\\com\\itheima\\myiotest4\\count.txt"));
        String countStr = br2.readLine();
        int count = Integer.parseInt(countStr);
        br2.close();
        count++;
        if(count == 3){
            System.out.println("第" + count + "次运行程序" + "张三");

        }else{
            Collections.shuffle(list);
            System.out.println("第" + count + "次运行程序" + list.get(0).split("-")[0]);
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\cod\\basic-code\\myIoText\\src\\com\\itheima\\myiotest4\\count.txt"));
        bw.write(count + "");
        bw.close();

    }
}
