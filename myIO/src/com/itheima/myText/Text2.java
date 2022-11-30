package com.itheima.myText;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Text2 {
    public static void main(String[] args) throws IOException {
        //1.创建对象关联原始文件
        FileInputStream fis = new FileInputStream("myIO\\GBK规则.png");
        //2.创建对象关联加密文件
        FileOutputStream fos = new FileOutputStream("myIO\\copy.png");

        //3.加密处理
        int b;
        while((b = fis.read()) != -1){
            fos.write(b ^ 2);
        }

        //4.释放资源
        fos.close();
        fis.close();
    }
}
