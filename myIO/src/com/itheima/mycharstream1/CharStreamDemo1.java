package com.itheima.mycharstream1;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //1.创建对象并关联本地文件
        FileReader fr = new FileReader("myIO\\a.txt");

        //2.读取数据read()
        //字符流的底层也是字节流, 默认也是一个字节一个字节的读取的.
        //如果遇到中文就会一次读取多个, GBK一次读取两字节, UTF-8一次2读取是三个字节

        //read()细节:
        //1.read(): 默认也是一个字节一个字节的读取的, 如果遇到中文就会一次读取多个
        //2.在读取之后, 方法的地层还会进行解码并转出十进制.
        //  最终把这个十进制作为返回值
        //  这个十进制的数据也表示在字符集的数字
        //  英文: 文件里面二进制数据 0110 0001
        //      read方法进行读取, 解码并转成十进制97
        //  中文: 文件里面的二进制数据 11100110 10110001 10001001
        //      read方法进行读取, 解码并转成十进制27721
        //我想看到中文汉字, 就需要将这些十进制数再进行强转
        int ch;
        while((ch = fr.read()) != -1){
            System.out.print((char)ch);
        }

        //3.释放资源
        fr.close();
    }
}
