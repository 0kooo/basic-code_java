package com.itherima.text;

public class text16 {
    public static void main(String[] args) {
        //1.定义一个变量用来记录山峰的高度
        double mount = 8844430;
        //2.定义一个变量用来记录纸张的初始厚度
        double height = 0.1;
        //3.定义一个变量用来统计次数
        int count = 0;
        //4.循环折叠纸张,只要纸张的厚度小于山峰的高度,那么循环就继续
        //每折叠一次,统计次数就++
        while (height <= mount) {
            height *= 2;
            count++;
        }
        System.out.println(count);
    }
}
