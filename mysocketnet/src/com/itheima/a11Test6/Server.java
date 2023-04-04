package com.itheima.a11Test6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class Server {
    public static void main(String[] args) throws IOException {
        //客户端：将本地文件上传的服务器，接收服务器的反馈。
        //服务器：接收客户端上传的文件，上传完毕之后给出反馈。

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,
                16,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        ServerSocket ss = new ServerSocket(20000);

        while (true) {
            Socket socket = ss.accept();

            //new Thread(new MyRunnable(socket)).start();
            pool.submit(new MyRunnable(socket));
        }
    }
}
