package com.itheima.a11Test6;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //客户端：将本地文件上传的服务器，接收服务器的反馈。
        //服务器：接收客户端上传的文件，上传完毕之后给出反馈。


        Socket socket = new Socket("127.0.0.1", 20000);

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("mysocketnet\\clientdir\\a.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes, 0, len);
        }

        socket.shutdownOutput();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str = br.readLine();
        System.out.println(str);

        socket.close();
    }
}
