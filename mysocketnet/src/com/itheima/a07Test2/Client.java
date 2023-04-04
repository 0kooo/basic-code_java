package com.itheima.a07Test2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //客户端：发送一条数据，接收服务反馈的信息并打印
        //服务器：接收数据并打印，在给客户端反馈消息


        Socket socket = new Socket("127.0.0.1", 20000);

        OutputStream os = socket.getOutputStream();
        String str = "见到你很高兴！！";
        os.write(str.getBytes());

        socket.shutdownOutput();

        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        int b;
        while ((b = isr.read()) != -1){
            System.out.print((char)b);
        }

        socket.close();
    }
}
