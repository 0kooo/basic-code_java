package com.itheima.myiotest8;

import java.io.*;
import java.util.Scanner;

public class Test {
    /*
        需求：写一个登陆小案例（添加锁定账号功能）

        步骤：
        	将正确的用户名和密码手动保存在本地的userinfo.txt文件中。
        	保存格式为:username=zhangsan&password=123&count=0
        	让用户键盘录入用户名和密码
        	比较用户录入的和正确的用户名密码是否一致
        	如果一致则打印登陆成功
        	如果不一致则打印登陆失败，连续输错三次被锁定

    */
    public static void main(String[] args) throws IOException {
        //获取正确的数据和错误次数
        BufferedReader br = new BufferedReader(new FileReader("myIoText\\src\\com\\itheima\\myiotest8\\userinfo.txt"));
        String userInfo = br.readLine();
        br.close();
        String[] arr = userInfo.split("&");
        String rightUsername = arr[0].split("=")[1];
        String rightPassword = arr[1].split("=")[1];
        String count = arr[2].split("=")[1];

        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();

        //比较
        int num = Integer.parseInt(count);
        if(num >= 3){
            System.out.println("账号已锁定！");
            return;
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("myIoText\\src\\com\\itheima\\myiotest8\\userinfo.txt"));
        if(username.equals(rightUsername) && password.equals(rightPassword)){
            System.out.println("登录成功！");
            bw.write("username=" + rightUsername + "&password=" + rightPassword + "&count=" + "0");
        }else{
            System.out.println("登录失败！" + "还剩" + (3 - num - 1) + "次");
            bw.write("username=" + rightUsername + "&password=" + rightPassword + "&count=" + (num + 1));
        }
        bw.close();
    }
}
