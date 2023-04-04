package com.itheima.a06Test1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //客户端：多次发送数据
        //服务端：接收多次接收数据，并打印


        Socket s = new Socket("127.0.0.1", 20000);

        OutputStream os = s.getOutputStream();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你想说的话：");
            String str = sc.nextLine();
            if("886".equals(str)){
                break;
            }
            os.write(str.getBytes());
        }

        s.close();
    }
}
