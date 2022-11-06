package com.itheima.Text;

import java.io.File;

public class text2 {
    public static void main(String[] args) {
        File f = new File("E:\\aaa");
        boolean b = havaAVI(f);
        System.out.println(b);
    }
    public static boolean havaAVI(File file){
        File[] files = file.listFiles();
        for (File f : files) {
            if(f.isFile() && f.getName().endsWith(".avi")){
                return true;
            }
        }
        return false;
    }
}
