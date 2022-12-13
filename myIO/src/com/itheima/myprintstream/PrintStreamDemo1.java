package com.itheima.myprintstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream("myIO\\a.txt"));

        ps.println(97);
        ps.print(true);
        ps.println();
        ps.printf("无忧无虑");
        ps.close();
    }
}
