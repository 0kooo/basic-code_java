package com.itheima.mybufferedstream1;

import java.io.*;

public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myIO\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myIO\\copy.txt"));
        int b;
        while((b = bis.read()) != -1){
            bos.write(b);
        }

        bos.close();
        bis.close();
    }
}
