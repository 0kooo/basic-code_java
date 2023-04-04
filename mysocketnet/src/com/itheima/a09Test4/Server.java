package com.itheima.a08Test3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //客户端：将本地文件上传的服务器，接收服务器的反馈。
        //服务器：接收客户端上传的文件，上传完毕之后给出反馈。


        ServerSocket ss = new ServerSocket(20000);

        Socket socket = ss.accept();

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("mysocketnet\\serverdir\\a.jpg"));
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes, 0, len);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("接收成功！");
        bw.newLine();
        bw.flush();

        socket.close();
        ss.close();
    }
}
