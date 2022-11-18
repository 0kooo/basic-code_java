package com.itheima.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo02 {
    public static void main(String[] args) throws IOException {
        //1.创建对象
        FileInputStream fis = new FileInputStream("myIO\\a.txt");

        //2.循环读取
        int b;
        while((b = fis.read()) != -1){
            System.out.println((char)b);
        }

        //3.释放资源
        fis.close();
    }
}
