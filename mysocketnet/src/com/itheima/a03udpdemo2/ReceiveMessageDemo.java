package com.itheima.a03udpdemo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveMessageDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        while (true) {
            ds.receive(dp);
            byte[] data = dp.getData();
            int len = data.length;
            String ip = dp.getAddress().getHostAddress();
            String hostName = dp.getAddress().getHostName();

            System.out.println("ip为：" + ip + ", 主机名为：" + hostName + "的人，发送了数据：" + new String(data, 0, len));
        }
    }
}
