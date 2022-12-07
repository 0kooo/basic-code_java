package com.itheima.myconvertstream;

import java.io.*;

public class ConvertStreamDemo4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("myIO\\a.txt")));
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}
