package com.itheima.Text;

import java.io.File;

public class text5 {
    public static void main(String[] args) {
        File f = new File("E:\\aaa");
    }

    public static long getLen(File f){
        long len = 0;
        File[] files = f.listFiles();
        for (File file : files) {
            if(file.isFile()){
                len += file.length();
            }else{
                len += getLen(file);
            }
        }
        return len;
    }
}
