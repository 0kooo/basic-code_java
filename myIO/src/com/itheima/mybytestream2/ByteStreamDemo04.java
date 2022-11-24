package com.itheima.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo04 {
    public static void main(String[] args) throws IOException {
        //一次读入多个字节并输出

        //创建对象
        FileInputStream fis = new FileInputStream("myIO\\a.txt");
        //读取数据
        byte[] bytes = new byte[2];
        //一次读取多个字节数据, 具体读多少, 跟数组的长度有关
        //返回值: 本次读取了多少个字节数据
        int len1 = fis.read(bytes);
        System.out.println(len1);
        System.out.println(new String(bytes, 0, len1));

        int len2 = fis.read(bytes);
        System.out.println(len2);
        System.out.println(new String(bytes, 0, len2));

        //释放资源
        fis.close();
    }
}
