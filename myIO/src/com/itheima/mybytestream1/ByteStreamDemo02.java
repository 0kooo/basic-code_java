package com.itheima.mybytestream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo02 {
    public static void main(String[] args) throws IOException {
        //1.创建对象
        FileOutputStream fos = new FileOutputStream("myIO\\a.txt");
        //2.写出数据
        //fos.write(97); //a
        //fos.write(98); //b
        byte[] bytes = {97,98,99,100,101};
        //fos.write(bytes);
        fos.write(bytes, 1, 2);
        //3.释放资源
        fos.close();
    }
}
