package com.itheima.a06Test1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Serves {
    public static void main(String[] args) throws IOException {
        //客户端：多次发送数据
        //服务端：接收多次接收数据，并打印


        ServerSocket ss = new ServerSocket(20000);

        Socket a = ss.accept();

        InputStreamReader ist = new InputStreamReader(a.getInputStream());
        int b;
        while ((b = ist.read()) != -1){
            System.out.print((char)b);
        }

        a.close();
        ss.close();
    }
}
