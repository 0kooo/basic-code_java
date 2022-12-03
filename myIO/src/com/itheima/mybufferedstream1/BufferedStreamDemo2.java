package com.itheima.mybufferedstream1;

import java.io.*;

public class BufferedStreamDemo2 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myIO\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myIO\\copy.txt"));
        byte[] bytes = new byte[1024];
        int len;
        while((len = bis.read(bytes)) != -1){
            bos.write(bytes,0, len);
        }
        bos.close();
        bis.close();
    }
}
