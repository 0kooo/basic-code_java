package com.itheima.a09Test4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {
        //客户端：将本地文件上传的服务器，接收服务器的反馈。
        //服务器：接收客户端上传的文件，上传完毕之后给出反馈。


        ServerSocket ss = new ServerSocket(20000);

        Socket socket = ss.accept();
        //生成随机名字（不重复）
        String name = UUID.randomUUID().toString().replace("-", "");

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("mysocketnet\\serverdir\\" + name + ".jpg"));
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
