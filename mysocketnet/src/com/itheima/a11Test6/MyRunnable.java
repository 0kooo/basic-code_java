package com.itheima.a11Test6;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MyRunnable implements Runnable{

    Socket socket;

    public MyRunnable(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
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


        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(socket != null){
                try {
                    socket.close();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
