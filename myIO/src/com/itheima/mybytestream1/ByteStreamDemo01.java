package com.itheima.mybytestream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //1.创建对象
        /*
        * 字符输出流的细节:
        * 1.创建字节输出流对象
        *       细节1: 参数字符串表示的路径或者是File对象都是可以的
        *       细节2: 如果文件不存在会创建一个新的文件, 但是要保证父级路径是存在的
        *       细节3: 如果文件已经存在, 则会清空文件
        * 2.写数据
        *       细节: write方法的参数是整数, 但是实际上写到本地文件中的是整数的ASCLL上对应的字符
        * 3.释放资源
        *       每次使用完流之后都要释放资源
        * */
        FileOutputStream fos = new FileOutputStream("myIO\\a.txt");

        //2.写数据
        fos.write(97);

        //3.关闭文件
        fos.close();
    }
}
