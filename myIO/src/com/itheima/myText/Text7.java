package com.itheima.myText;

import java.io.*;

public class Text7 {
    public static void main(String[] args) throws IOException {
        //原则:
        //IO: 随用随创建
        //     什么时候不用什么时候关闭
        BufferedReader br = new BufferedReader(new FileReader("myIO\\a.txt"));
        String s = br.readLine();
        br.close();
        int count = Integer.parseInt(s);
        count++;
        if(count <= 3){
            System.out.println("欢迎使用本软件, 第"+ count +"次使用免费~");
        }else{
            System.out.println("本软件只能免费使用3次, 欢迎您注册会员后继续使用~");
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("myIo\\a.txt"));
        bw.write(count + "");
        bw.close();
    }
}
