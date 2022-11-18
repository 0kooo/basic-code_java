package com.itheima.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo03 {
    public static void main(String[] args) throws IOException {
        long bigan = System.nanoTime();
        FileInputStream fis = new FileInputStream("E:\\a.txt");
        FileOutputStream fos = new FileOutputStream("myIO\\a.txt");

        int b;
         while((b = fis.read()) != -1){
             fos.write(b);
         }

         fos.close();
         fis.close();
        long end = System.nanoTime();
        System.out.println(bigan - end);
    }
}
