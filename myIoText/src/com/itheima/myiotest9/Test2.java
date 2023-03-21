package com.itheima.myiotest9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //Properties跟IO流结合的操作

        Properties prop = new Properties();
        prop.put("aaa", "bbb");
        prop.put("bbb", "ccc");
        FileOutputStream fos = new FileOutputStream("myIoText\\a.properties");
        prop.store(fos,"test");
        fos.close();
    }
}
