package com.itheima.mybytestream2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo06 {
    public static void main(String[] args) throws FileNotFoundException {
        /*
         * JDK7: IO流中捕获异常的写法
         *
         * try后面的小括号中写创建对象的代码,
         *   注意: 只有实现了AutoCloseable接口的类, 才能在括号中创建对象.
         * try(){
         *
         * }catch(){
         *
         * }
         * */

        /*try (FileInputStream fis = new FileInputStream("E:\\a.txt");
             FileOutputStream fos = new FileOutputStream("myIO\\a.txt")) {
            int len;
            byte[] bytes = new byte[1024 * 1024 * 5];
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        /*
        * JDK9:IO流中捕获异常的写法
        * */
        FileInputStream fis = new FileInputStream("E:\\a.txt");
        FileOutputStream fos = new FileOutputStream("myIO\\a.txt");
        try(fis;fos) {
            int len;
            byte[] bytes = new byte[1024 * 1024 * 5];
            while((len = fis.read(bytes)) != -1){
                fos.write(bytes,0,len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
