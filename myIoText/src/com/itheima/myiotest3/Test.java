package com.itheima.myiotest3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws IOException {
        /*需求：
            一个文件里面存储了班级同学的信息，格式为：张三-男-23
            每一个学生信息占一行。
            要求通过程序实现随机点名器。
            70%的概率随机到男生
            30%的概率随机到女生
            随机100万次，统计结果。看生成男生和女生的比例是不是接近于7：3
        */


        ArrayList<String> boyName = new ArrayList<>();
        ArrayList<String> girlName = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("E:\\cod\\basic-code\\myIoText\\names.txt"));
        String c;
        while((c = br.readLine()) != null){
            String[] arr = c.split("-");
            if (Objects.equals(arr[1], "男")) {
                boyName.add(c);
            }else{
                girlName.add(c);
            }
        }
        br.close();

        int[] arr = {1, 1, 1, 1, 1, 1, 1, 0, 0, 0};
        Random r = new Random();
        int countBoy = 0, countGirl = 0;
        for (int i = 0; i < 1000; i++) {
            int index = r.nextInt(10);
            if(arr[index] == 1){
                Collections.shuffle(boyName);
                countBoy++;
                System.out.println(boyName.get(0));
            }else{
                Collections.shuffle(girlName);
                countGirl++;
                System.out.println(girlName.get(0));
            }
        }
        System.out.println("输出男生的次数" + countBoy);
        System.out.println("输出女生的次数" + countGirl);
    }
}
