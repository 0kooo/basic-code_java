package com.itheima.a01myfile;

import java.io.File;

public class FileDemo5 {
    public static void main(String[] args) {
        File f = new File("E:\\aaa");
        //2.listFile方法
        //作用: 获取aaa文件夹里面的所以内容, 把所有的内容放到数组中返回
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
