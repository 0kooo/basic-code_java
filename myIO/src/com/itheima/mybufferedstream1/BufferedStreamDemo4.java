package com.itheima.mybufferedstream1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamDemo4 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("myIO\\b.txt"));
        //newLine()方法是可以跨平台的换行
        bw.write("123");
        bw.newLine();
        bw.write("456");
        bw.close();
    }
}
