package com.itheima.charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharsetDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //1.编码
        String str = "AI人工";
        byte[] bytes1 = str.getBytes();
        System.out.println(Arrays.toString(bytes1));

        byte[] bytes2 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));

        //2.解码
        String str2 = new String(bytes1);
        System.out.println(str2);

        String str3 = new String(bytes1, "GBK");
        System.out.println(str3);
    }
}
