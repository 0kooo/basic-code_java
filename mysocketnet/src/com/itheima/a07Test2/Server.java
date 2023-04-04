package com.itheima.a07Test2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //客户端：发送一条数据，接收服务反馈的信息并打印
        //服务器：接收数据并打印，在给客户端反馈消息


        ServerSocket ss = new ServerSocket(20000);

        Socket s = ss.accept();
        InputStreamReader isr = new InputStreamReader(s.getInputStream());

        int b;
        while ((b = isr.read()) != -1){
            System.out.print((char)b);

        }
        String str = "me too! ! ";
        OutputStream os = s.getOutputStream();
        os.write(str.getBytes());


        s.close();
        ss.close();
    }
}
