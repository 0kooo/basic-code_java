package com.itheima.myzipstream;

import java.io.File;

public class ZipStreamDemo1 {
    public static void main(String[] args) {
        //1.创建一个File表示要解压的压缩包
        File src = new File("E:\\计科2103-21412030311-罗振邦.zip");
        //2.创建一个File表示解压的目的地
        File dest = new File("E:\\");

        unzip(src, dest);
    }

    public static void unzip(File src, File dest){

    }
}
