package com.itheima.myconvertstream;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*InputStreamReader isr = new InputStreamReader(new FileInputStream("myIO\\a.txt"), "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myIO\\b.txt"), "UTF-8");
        int b;
        while((b = isr.read()) != -1){
            osw.write(b);
        }
        osw.close();
        isr.close();*/

        FileReader fr = new FileReader("myIO\\a.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("myIO\\b.txt", Charset.forName("UTF-8"));
        int b;
        while((b = fr.read()) != -1){
            fw.write(b);
        }
        fw.close();
        fr.close();
    }
}
