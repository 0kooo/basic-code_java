package com.itheima.myconvertstream;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConvertStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myIO\\a.txt"), "GBK");
        osw.write("你好你好");
        osw.close();*/

        FileWriter fw = new FileWriter("myIO\\a.txt", Charset.forName("GBK"));
        fw.write("你好你好");
        fw.close();
    }
}
