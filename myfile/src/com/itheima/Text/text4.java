package com.itheima.Text;

import java.io.File;

public class text4 {
    public static void main(String[] args) {
        File f = new File("E:\\aaa");
        delete(f);
    }

    public static void delete(File file){
        File[] files = file.listFiles();
        for (File f : files) {
            if(f.isFile()){
                f.delete();
            }else{
                delete(f);
            }
        }
        file.delete();
    }
}
