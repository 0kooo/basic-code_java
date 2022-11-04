package com.itheima.a01myfile;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        //1.根据字符串表示的路径, 变成File对象
        String s = "C:\\User\\alienware\\Desktop\\a.txt";
        File f1 = new File(s);
        System.out.println(f1);

        //2.父级路径:
        //子级路径:
        String parent = "C:\\User\\alienware\\Desktop";
        String child = "a.txt";
        File f2 = new File(parent,child);
        System.out.println(f2);

        File f3 = new File(parent + "\\" + child);
        System.out.println(f3);
        //3.把一个File表示的路径和String表示路径进行拼接
        File parent2 = new File(child + parent);
    }
}
