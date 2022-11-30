package com.itheima.myText;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Text1 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("E:\\str");

        File f2 = new File("D:\\dest");

        fileCopy(f1,f2);
    }

    public static void fileCopy(File f1, File f2) throws IOException {
        f2.mkdir();
        File[] files = f1.listFiles();
        if(files != null){
            for (File file : files) {
                if(file.isFile()){
                    FileInputStream fis = new FileInputStream(file);
                    FileOutputStream fos = new FileOutputStream(new File(f2, file.getName()));
                    byte[] bytes = new byte[1024];
                    int len;
                    while((len = fis.read(bytes)) != -1){
                        fos.write(bytes, 0, len);
                    }
                    fos.close();
                    fis.close();
                }else{
                    fileCopy(file, new File(f2,file.getName()));
                }
            }
        }
    }
}
