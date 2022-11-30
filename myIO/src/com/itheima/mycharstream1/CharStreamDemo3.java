package com.itheima.mycharstream1;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
        void write(int c)                        写出一个字符
        void write(String str)                   写出一个字符串
        void write(String str, int off, int len) 写出一个字符串的一部分
        void write(char[] cbuf)                  写出一个字符数组
        void write(char[] cbuf, int off, int len)写出字符数组的一部分
        */

        FileWriter fw = new FileWriter("myIO\\a.txt");

        //fw.write(25105);
        //fw.write("你好!");
        char[] chars = {'a', 'b', 'c', '我'};
        fw.write(chars);

        fw.close();
    }
}
