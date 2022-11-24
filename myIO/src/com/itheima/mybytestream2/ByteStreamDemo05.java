package com.itheima.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo05 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            fis = new FileInputStream("E:\\a.txt");
            fos = new FileOutputStream("myIO\\a.txt");
            int len;
            byte[] bytes = new byte[1024 * 1024 * 5];
            while((len = fis.read(bytes)) != -1){
                fos.write(bytes,0,len);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fos != null){
                try{
                    fos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(fis != null){
                try {
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
