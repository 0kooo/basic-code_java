package com.itheima.mycommonsio;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CommonsIODemo1 {
    public static void main(String[] args) throws IOException {
        File src = new File("myIO\\a.txt");
        File dest = new File("myIO\\copy.txt");
        FileUtils.copyFile(src, dest);
    }
}
