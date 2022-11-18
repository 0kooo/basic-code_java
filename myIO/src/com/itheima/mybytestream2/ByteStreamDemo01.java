package com.itheima.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //1.创建对象
        FileInputStream fis = new FileInputStream("myIO\\a.txt");

        //2.读取数据
        int read = fis.read();
        System.out.println((char)read);

        //3.关闭文件
        fis.close();
    }
}
