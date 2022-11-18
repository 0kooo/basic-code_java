package com.itheima.mybytestream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo03 {
    public static void main(String[] args) throws IOException {

        /*
        * 换行写:
        *       再次写出一个换行符就可以了
        *       Windows: \r\n
        *       Linux: \n
        *       Mac:        \r
        *       细节:
        *           在Windows操作系统当中, java对回车换行进行了优化.
        *           虽然完整的是\r\n, 但是我们写其中一个\r或者\n.
        *           java也可以实现换行,因为java在底层会补全.
        *       建议:不要省, 还是写全.
        *续写:
        *       如果想要续写, 打开续写开关即可
        *       开关位置: 创建对象的第二个参数
        *
        *
        * */
        //1.创建对象
        FileOutputStream fos = new FileOutputStream("myIO\\a.txt",true);
        //2.写出数据
        String str1 = "kankelaoyezuishuai";
        byte[] bytes1 = str1.getBytes();
        fos.write(bytes1);

        String str2 = "\r\n";
        byte[] bytes2 = str2.getBytes();
        fos.write(bytes2);

        String str3 = "666";
        byte[] bytes3 = str3.getBytes();
        fos.write(bytes3);

        //3.关闭文件
        fos.close();
    }
}
