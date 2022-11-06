package com.itheima.Text;

import java.io.File;
import java.io.IOException;

public class text1  {
    public static void main(String[] args) throws IOException {
        File f1 = new File("E:\\cod\\basic-code\\myfile\\aaa");
        boolean b = f1.mkdir();
        System.out.println(b);
        File f2 = new File("E:\\cod\\basic-code\\myfile\\aaa\\a.txt");
        boolean newFile = f2.createNewFile();
        System.out.println(newFile);
    }
}
