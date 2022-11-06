package com.itheima.Text;

import java.io.File;
//寻找所以盘符里的AVI视频
public class text3 {
    public static void main(String[] args) {
        FindAVi();
    }


    public static void FindAVi(){
        File[] files = File.listRoots();
        for (File f : files) {
            FindAVi(f);
        }
    }
    public static void FindAVi(File f){
        File[] files = f.listFiles();
        if(files != null){
            for (File file : files) {
                if(file.isFile()){
                    if(file.getName().endsWith(".avi")){
                        System.out.println(file);
                    }
                }else{
                    FindAVi(file);
                }
            }
        }
    }
}
