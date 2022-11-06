package com.itheima.a01myfile;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        //1.对一个文件的路径进行判断
        File f1 = new File("E:\\aaa\\a.txt");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());
        System.out.println("-----------------------");

        //2.对一个文件夹的路径进行判断
        File f2 = new File("E:\\aaa\\bbb");
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.exists());
        System.out.println("-----------------------");

        //3.对一个不存在的路径进行判断
        File f3 = new File("E:\\aaa\\c.txt");
        System.out.println(f3.isDirectory());
        System.out.println(f3.isFile());
        System.out.println(f3.exists());
    }
}
