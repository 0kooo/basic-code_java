package com.itheima.myprintstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintStreamDemo2 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("myIO\\a.txt"), true);

        pw.println("nihao,nihao");
        pw.print("你好你好");
        pw.printf("%s1%s", "0", "2");

        pw.close();
    }
}
