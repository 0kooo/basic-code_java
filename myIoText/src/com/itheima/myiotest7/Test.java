package com.itheima.myiotest7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    /*
    * 需求：写一个登录小案例。
    *
    * 步骤：
    *       将正确的用户名和密码手动保存在本地的userinfo.txt文件中。
    *       保存格式为：username=zhangsan&password=123
    * */
    public static void main(String[] args) throws IOException {

        //1.读取正确的用户名和密码

        BufferedReader br = new BufferedReader(new FileReader("myIoText\\src\\com\\itheima\\myiotest7\\userinfo.txt"));
        String s = br.readLine();
        br.close();
        String[] userIfno = s.split("&");
        String rightUsername = userIfno[0].split("=")[1];
        String rightPassword = userIfno[1].split("=")[1];

        //2.键盘录入用户名和数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();

        //3.比较
        if(username.equals(rightUsername) && password.equals(rightPassword)){
            System.out.println("登陆成功！");
        }else{
            System.out.println("登录失败！");
        }
    }
}
