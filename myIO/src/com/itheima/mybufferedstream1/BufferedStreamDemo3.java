package com.itheima.mybufferedstream1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStreamDemo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myIO\\a.txt"));
        String line;
        //细节:
        //readLine()方法在读取的时候, 一次读取一整行, 当遇到回车换行符结束
        //          但是不会把回车换行读到内存当中
        while(( line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}
