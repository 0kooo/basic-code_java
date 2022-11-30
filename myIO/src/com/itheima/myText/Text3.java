package com.itheima.myText;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Text3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("myIO\\a.txt");
        StringBuilder sb = new StringBuilder();
        int b;
        while((b = fr.read()) != -1){
            sb.append((char)b);
        }
        fr.close();

        String str = sb.toString();
        String[] arrStr = str.split("-");
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : arrStr) {
            list.add(Integer.parseInt(s));
        }
        Collections.sort(list);

        FileWriter fw = new FileWriter("myIO\\a.txt");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1){
                fw.write(list.get(i) + "");
            }else{
                fw.write(list.get(i) + "-");
            }
        }
        fw.close();
    }
}
